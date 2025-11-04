package day1.builder;
import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import java.util.HashMap;
import java.util.Map;

// 서블릿 인터페이스
interface SimpleServlet {
    void service(InputStream in, OutputStream out) throws IOException;
}

// Hello 서블릿
class HelloServlet implements SimpleServlet {
    @Override
    public void service(InputStream in, OutputStream out) throws IOException {
        String threadName = Thread.currentThread().getName();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        writer.write("HTTP/1.1 200 OK\r\n");
        writer.write("Content-Type: text/plain\r\n");
        writer.write("\r\n");
        writer.write("Hello Servlet! Thread: " + threadName + "\n");
        writer.flush();
    }
}

// Goodbye 서블릿
class GoodbyeServlet implements SimpleServlet {
    @Override
    public void service(InputStream in, OutputStream out) throws IOException {
        String threadName = Thread.currentThread().getName();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        writer.write("HTTP/1.1 200 OK\r\n");
        writer.write("Content-Type: text/plain\r\n");
        writer.write("\r\n");
        writer.write("Goodbye Servlet! Thread: " + threadName + "\n");
        writer.flush();
    }
}

// 서버 클래스
public class MappedServletServer {

    private static final int PORT = 8080;
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(5);
    private static final Map<String, SimpleServlet> servletMapping = new HashMap<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started on port " + PORT);

        // URL 매핑
        servletMapping.put("/hello", new HelloServlet());
        servletMapping.put("/goodbye", new GoodbyeServlet());

        while (true) {
            Socket client = serverSocket.accept();
            threadPool.submit(() -> handleClient(client));
        }
    }

    private static void handleClient(Socket client) {
        try (InputStream in = client.getInputStream();
             OutputStream out = client.getOutputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {

            // 요청 첫 줄 읽기 (GET /hello HTTP/1.1)
            String line = reader.readLine();
            if (line == null || line.isEmpty()) return;

            String[] tokens = line.split(" ");
            String path = tokens[1];  // 요청 URL

            // 매핑된 서블릿 호출
            SimpleServlet servlet = servletMapping.get(path);
            if (servlet != null) {
                servlet.service(in, out);
            } else {
                // 404 처리
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
                writer.write("HTTP/1.1 404 Not Found\r\n");
                writer.write("Content-Type: text/plain\r\n");
                writer.write("\r\n");
                writer.write("404 Not Found: " + path);
                writer.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try { client.close(); } catch (IOException ignored) {}
        }
    }
}
