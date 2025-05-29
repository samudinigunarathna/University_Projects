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

}

class App{
    public static void main(String[] args){
        System.out.println("-----Inventory Management-----");

    }
}