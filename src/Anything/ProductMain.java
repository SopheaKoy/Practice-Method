package Method;
import java.util.Scanner;

import static java.lang.System.in;

public class ProductMain {
    public static void main(String[] args) {
        Scanner input= new Scanner(in);
        System.out.print("Enter size of Product : ");
        int n=Integer.parseInt(input.nextLine());
        // create array
        Product [] products = new Product[n];

        for (int i = 0 ;i< n ; i++) {
            products[i] = new Product();
            products[i].insert(input);
        }
        for (int i = 0 ;i< products.length ;++i){
            products[i].select();
            System.out.println("");
        }

        // foreach loop
        for (Product j : products) {
           j.select();
        }

    }
}
