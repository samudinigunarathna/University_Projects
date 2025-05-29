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
}

class Customer{
    private String name;
    private String contactDetails;
}

class DataBase{
    ArrayList<Item>Items=new ArrayList<>();
    ArrayList<Customer>Customers=new ArrayList<>();

}

class App{
    public static void main(String[] args){
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
    }
}