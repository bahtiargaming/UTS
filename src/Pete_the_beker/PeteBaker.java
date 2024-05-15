package Pete_the_beker;
import java.util.Map;
import java.util.HashMap;

public class PeteBaker {

  /**
   * Calculates the maximum number of cakes that can be baked with the available ingredients.
   * 
   * @param recipe a Map representing the recipe, where the key is the ingredient name and the value is the required amount
   * @param available a Map representing the available ingredients, where the key is the ingredient name and the value is the available amount
   * @return the maximum number of cakes that can be baked
   */
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
    int minCakes = Integer.MAX_VALUE;
    
    for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
      String ingredient = entry.getKey();
      int requiredAmount = entry.getValue();
      
      if (!available.containsKey(ingredient)) {
        // If an ingredient is missing, we cannot make any cakes
        return 0;
      }
      
      int availableAmount = available.get(ingredient);
      int possibleCakes = availableAmount / requiredAmount;
      
      if (possibleCakes < minCakes) {
        minCakes = possibleCakes;
      }
    }
    
    return minCakes;
  }

  public static void main(String[] args) {
    // Example recipe and available ingredients
    Map<String, Integer> recipe = new HashMap<>();
    recipe.put("flour", 500);
    recipe.put("sugar", 200);
    recipe.put("eggs", 1);
    
    Map<String, Integer> available = new HashMap<>();
    available.put("flour", 1200);
    available.put("sugar", 1200);
    available.put("eggs", 5);
    available.put("milk", 200); // Extra ingredient not needed in the recipe
    
    // Calculate and print the number of cakes that can be made
    int numberOfCakes = cakes(recipe, available);
    System.out.println("Maximum number of cakes that can be made: " + numberOfCakes);
  }
}
