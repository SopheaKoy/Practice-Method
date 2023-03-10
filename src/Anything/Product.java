package Method;

import java.util.Scanner;
public class Product {
    static String company = "COCA COLA";
    // field , state , data member
    int id ;
    String name;
    double price;
    // method , behavior
    public void insert(Scanner input){
        // testing try catch
        try{
            System.out.print("Enter ID : ");
            id= Integer.parseInt(input.nextLine());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

        System.out.print("Enter NAME : ");
        name=input.nextLine();
        System.out.print("Enter PRICE : ");
        price=Double.parseDouble(input.nextLine());
    }
    public void select(){
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
        System.out.println("PEICE : "+price);
        System.out.println("COMPANY : "+ company);
    }
}
