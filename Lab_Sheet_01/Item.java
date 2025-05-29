import java.util.*;
class Item{
    private String description;
    private String name;
    private int unitPrice;
    private int quantityAvailable;

    Item(String description, String name, int unitPrice, int quantityAvailable){
        this.description=description;
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantityAvailable=quantityAvailable;
    }

    void PrintDetails(){
        System.out.println("Description of the Item: "+description+" Name of the Item: "+name+" Price of unit: "+unitPrice+" Available Quantity: "+quantityAvailable);
    }
}

class Customer{
    private String name;
    private String contactDetails;
}

class DataBase{
    ArrayList<Item> items=new ArrayList<>();
    ArrayList<Customer> customers=new ArrayList<>();

}

class App{
    public static void main(String[] args){
        Scanner sc=new Scanner();
        Item item=new Item();

        System.out.println("-----Inventory Management-----");
        System.out.println("1.Add Item");
        System.out.println("2.Remove Item");
        System.out.println("3.Update Item Quantity");
        System.out.println("4.List All Items");
        System.out.println("5.Add Customer");
        System.out.println("List All Customers");
        System.out.println("Search Item by Name");
        System.out.println("0.Exit");
        System.out.println("----------------------------");
        System.out.println("Enter Your Choice");

        String input=sc.nextLine();

        switch(input){
            case "1":
            System.out.println("Enter the item name: ");
            sc.nextLine();
            item.PrintDetails();
        }
    }
}