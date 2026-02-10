import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("basic calculator ....");


        boolean check = true;

        while(check){
            System.out.print("enter character operator :");
            char op = in.next().trim().charAt(0);
            System.out.print("enter num1 :");
            int num1 = in.nextInt();
            System.out.print("enter num2 :");
            int num2 = in.nextInt();
            if( op == '+' || op == '-'|| op == '*'|| op == '/' || op == '%'){

                if(op == '+' ){
                    System.out.println(num1+num2);
                }

                if(op == '-' ){
                    System.out.println(num1-num2);
                }

                if(op == '*' ){
                    System.out.println(num1*num2);
                }

                if(op == '/' ){
                    if(num1!=0){
                    System.out.println(num1/num2);
                }
                    else{
                        System.out.println("Error: Division by zero is not allowed !");
                    }
                }

                if(op == '%' ){
                    System.out.println(num1%num2);
                }

            }
            else{
                System.out.println("ENTER A VAILD OPERATOR");
                check = false;
            }

        }

    }
}
