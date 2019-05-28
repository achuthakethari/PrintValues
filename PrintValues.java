// Copyright @ SanKir Technologies, 2018 - Java Programming - Basic Datatypes
package printvalues;

public class PrintValues {

    public static void main(String args[]) {

        System.out.println("Hello World");
        int i = 15;
        double d = 25.5;
        char c = 'z';
        String company = "Welcome to SanKir Technologies";
        boolean b1 = true;

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(company);
        System.out.println();

        System.out.println("Integer Value is - " + i + ", " + "Char vaue is - " + c + ", " + "Double vaue is - " + d + ", " + "Boolean value is - " + b1 + "." + "\n" + "Company name is - " + company + ".");

        System.out.println("\n");

        // Assigning or Copying values to different variables
        int j = i + 10;
        int sum = i + j;
        System.out.println("The sum of i & j is - " + sum);

        String name;
        name = company;

        System.out.println("After copying  string - " + name);

        System.out.println();

        // Another print format - printf
        System.out.printf("Formatted Printing thru Printf - \n%d, %.2f, %c, %s.", i, d, c, company);
        System.out.println();

    }
}

//Assignment:
// Print Alphabets using printf method in 3 lines of code only.
