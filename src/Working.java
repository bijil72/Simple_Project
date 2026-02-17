
class Student{
    String name;
    int rno;
    Student(String name, int rno){
        this.name = name;
        this.rno = rno;
    }
}

class Laptop{
    String brand;
    int price;

    Laptop(){
         brand = "Unknow";
         price = 0;
    }

    Laptop (String brand , int price){
        this.brand = brand;
        this.price = price;
    }
}

class BankAccount {
    String accName;
    int initalBlance;

    BankAccount (String accName , int initalBlance){
        this.accName = accName;
        this.initalBlance = initalBlance;
    }

}

class Book{
    String title;
    String author;
    int price;

    Book(String title){
        this.title = title;
    }
    Book(String title, String author){
        this.title =title;
        this.author = author;
    }
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price ;
    }


    @Override
    public String toString() {
        return title + " | " +
         author + " | " +
         price ;
    }
}

class Product{
    static int idCounter = 1;
    int id;
    String name;
    int price;

    Product( String name, int price){
        this.name = name;
        this .price = price;
        this.id = idCounter++;
    }

   public int getId() { return id; }
}

public class Working {
    public static void main(String[] args) {

//        Student s1 = new Student("bijil" , 22);
//        System.out.println(s1.name);
//        System.out.println(s1.rno);

//        Laptop l1 = new Laptop();
//        Laptop l2 = new Laptop("Asus", 798798);
//        System.out.println(l1.brand);
//        System.out.println(l2.brand);

//        BankAccount b1 = new BankAccount("bijil" , 900);
//        System.out.println(b1.accName);
//        System.out.println(b1.initalBlance);

//        Book b2 = new Book("secret");
//        Book b3 = new Book("secret -111" , "palto");
//        Book b1 = new Book("secret - 2" ,"ravi ch" , 780);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);

        Product p1 =new Product("pencil" , 5);
        Product p2 =new Product("pen" , 10);
        Product p3 =new Product("scale" , 8);
        System.out.println(p1.getId() + "  " + p1.name + " " + p1.price);
        System.out.println(p2.getId() + "  " + p2.name + " " + p2.price);
        System.out.println(p3.getId() + "  " + p3.name + " " + p3.price);





    }
}
