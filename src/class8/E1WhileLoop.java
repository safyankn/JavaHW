package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting and ending point");
        int start= scanner.nextInt();
        int end=scanner.nextInt();


        int counter=start;

        while (counter<=end){
            System.out.print(counter+" ");
            counter++;

        }
    }
}
