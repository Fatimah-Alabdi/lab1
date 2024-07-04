import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input
      /*  Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("enter first number");
        num1 = scanner.nextInt();
        System.out.println("enter second number");
        num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

       */
        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
       /* Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Enter number: ");
        num = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));


        }


        */

        //3. Write a Java program to print the area and perimeter of a circle.
       /* Scanner scanner = new Scanner(System.in);
         float radius;
         float area=0;
         float perimeter=0;

        System.out.println("Enter the radius of the circle: ");
        radius = scanner.nextFloat();

        area = (float) (3.14 * (radius*radius));
        perimeter = (float) (2 * 3.14*radius);
        System.out.println("The perimeter of the circle is " + perimeter);
        System.out.println("The area of the circle is " + area);


        */

//4.Java program to find out the average of a set of integers

        /*Scanner scanner = new Scanner(System.in);
        int num;
        int integer;
        float average=0;
        int sum=0;
        System.out.println("Enter  the count of number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("enter an integer : ");
            integer = scanner.nextInt();
            sum += integer;
            average = sum/ num;

        }
        System.out.println("the average is : "+ average);

         */

        //5. Write a Java program that accepts three integers as input, adds the first two integer
        //together, and then determines whether the sum is equal to the third integer.

       /* Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.println("Enter the first number");
        n1 = scanner.nextInt();
        System.out.println("Enter the second number");
        n2 = scanner.nextInt();
        System.out.println("Enter the third number");
        n3 = scanner.nextInt();
        if(n1+n2==n3){
            System.out.println("True");
        }else
            System.out.println("false");


        */

        //6. Write a Java program to reverse a word.

       /* Scanner scanner = new Scanner(System.in);
        String text;
        String reverse="";

        System.out.println("enter text to reverse");
        text = scanner.nextLine();

        for(int i=text.length()-1;i>=0;i--){
            reverse=reverse+text.charAt(i);

        }
        System.out.println("reverse word :"+reverse);

        */

        //7 - Java program to check whether the given number is even or odd
        /*Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Enter number: ");
        num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        }else
            System.out.println("odd");


         */

//8 - Java program to convert the temperature in Centigrade to Fahrenheit

      /*  Scanner scanner = new Scanner(System.in);
        float Centigrade;
        float Fahrenheit=0;

        System.out.println("Enter temperature in Centigrade:");
        Centigrade = scanner.nextFloat();

        Fahrenheit= (float) ((Centigrade*1.8)+32);
        System.out.println("temperature in Fahrenheit: "+Fahrenheit);

       */
//9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
       /* Scanner scanner = new Scanner(System.in);
        String text;
        int n;
        System.out.println("input a String :");
        text = scanner.nextLine();
        System.out.println("input a number :");
        n = scanner.nextInt();
       if(n >= 0 && n < text.length()){

           System.out.println(text.charAt(n));
           }
        */


//10.Write a Java program to print the area and perimeter of a rectangle.
       /* Scanner scanner = new Scanner(System.in);
        float width ;
        float height ;
        float area=0;
        float perimeter=0;

        System.out.println("width : ");
        width = scanner.nextFloat();
        System.out.println("height : ");
        height = scanner.nextFloat();
        area = width * height;
        perimeter = 2*(width+height);
        System.out.println("area : " +area);
        System.out.println("perimeter : "+perimeter);

        */

        //11. Write a Java program to compare two numbers.
/*Scanner scanner = new Scanner(System.in);
int n1;
int n2;
        System.out.print("Input first integer: ");
         n1 = scanner.nextInt();

        System.out.print("Input second integer: ");
         n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println(n1 + " == " + n2);
        } else {
            System.out.println(n1 + " != " + n2);

            if (n1 < n2) {
                System.out.println(n1 + " < " + n2);
                System.out.println(n1 + " <= " + n2);
            } else {
                System.out.println(n1 + " > " + n2);
                System.out.println(n1 + " >= " + n2);
            }
        }

 */

        //12.Write a Java program to convert seconds to hours, minutes and seconds.
        /*Scanner scanner = new Scanner(System.in);
        int second;
        int hours;
        int minutes;

        System.out.print("Input seconds: ");
         second = scanner.nextInt();

         hours = second /3600;
         minutes = (second %3600)/60;
         second = second %60;

        System.out.println( hours+":"+ minutes+":"+ second);

         */

        //13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

       /* Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int n4;
        System.out.println("Enter the first number");
        n1 = scanner.nextInt();
        System.out.println("Enter the second number");
        n2 = scanner.nextInt();
        System.out.println("Enter the third number");
        n3 = scanner.nextInt();
        System.out.println("Enter the fourth number");
        n4 = scanner.nextInt();
        if(n1==n2 && n1==n3 && n1==n4){
            System.out.println("Numbers are equal");
        }
        else if(n2==n3 && n2==n4){
            System.out.println("Numbers are equal");
        }
        else if(n3==n4 ){
            System.out.println("Numbers are equal");
        }
else System.out.println("Numbers are not equal");

        */

        //14. Write a Java program that reads an integer and check whether it is negative, zero, or

       /* Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println(" input a number : ");
        n = scanner.nextInt();
        if (n>0){
            System.out.println(" number is positive :");
        }
        else if (n<0){
            System.out.println(" number is negative :");
        }
        else System.out.println("is Zero ");

        */
        //15.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
       /* Scanner scanner = new Scanner(System.in);
        int num=0;
        int p = 0;
        int n = 0;
        int z = 0;

        System.out.println("enter the number");

        while (num!=-1){
            num = scanner.nextInt();

            if(num==-1){
                break;

            } else if (num>0) {
                p++;

            } else if (num<0) {
                n++;

            }else
                z++;


        }
        System.out.println(p + " positives");
        System.out.println(z+ " zeros");
        System.out.println(n + " negatives");

        */

        //16 - Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        /* Scanner scanner = new Scanner(System.in);
        int num;
        int rev=0;

        System.out.println("enter an integer: ");
        num = scanner.nextInt();

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);

         */


        //17 - Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
       /* Scanner scanner = new Scanner(System.in);
        int num;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;




        System.out.println("Enter numbers ..-1 to stop:");


        while (true) {
            System.out.print("Enter the number: ");
             num = scanner.nextInt();



            if (num < min) {
                min = num;
            }
            else if (num > max) {
                max = num;
            }
            if (num == -1) {
                break;
            }

        }
        System.out.println("the largest number is " + max);
        System.out.println("the smallest number is " + min);


        */




        // 18 - Determine and print the number of times the character ‘a’ appears in the input entered by the user.
       /* Scanner scanner = new Scanner(System.in);
        String text;
        int c = 0;
        System.out.println("Enter text");
        text = scanner.nextLine();


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                c++;
            }

        }
        System.out.println("Number of a's: " + c);

        */
    }
}