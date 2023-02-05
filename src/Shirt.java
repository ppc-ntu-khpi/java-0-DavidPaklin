public class Shirt {
  public int shirtID = 5; 
  public String description = "Cotton shirt"; 
  public String color = "green";
  public double price = 11.5;
  public int quantityInStock = 0;
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color: " + color);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } 
} 