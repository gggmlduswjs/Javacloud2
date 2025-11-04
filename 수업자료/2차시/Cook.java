package day2prac.람다.실습;

public class Cook {
	String name;
	String[] ingredients;
	String recipe;
	
	public Cook() { }
	
	public Cook(String name, String[] ingredients, String recipe) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.recipe = recipe;
	}
	
	@Override
	public String toString() {
		return "Cook [name=" + name + ", ingredients=" + ingredients + ", recipe=" + recipe + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getIngredients() {
		return ingredients;
	}
	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
}
