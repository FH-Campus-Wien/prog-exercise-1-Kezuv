package at.ac.fhcampuswien;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import sun.tools.jstat.Literal;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                "  _(\\    |@@|" + System.lineSeparator() +
                "(\\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h =  99.9;
        int sum = a + b+ c+(int) d+(int) e+ (int) f+(int) g+(int) h;
        System.out.println(sum);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println(c);
        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x ;
        x=scanner.nextInt();
        System.out.print("y: ");
        int y;
        y = scanner.nextInt();
        x = x+y;
        y = x-y;
        x= x-y;
        System.out.println("After Swap:" + System.lineSeparator()+
                "x: " + x + System.lineSeparator() +
                "y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;

        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
        n2 = scanner.nextInt();

        if (n1>n2) {
            System.out.println("n1 > n2");
        }

        if (n2>n1) {
            System.out.println("n2 > n1");
        }

        if (n1 == n2) {
            System.out.println("n1 == n2");
        }
        // Auch hier sagt AppTest.java es sei falsch, obwohl die Wiedergabe der Angabe entsprich..

        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int rev = scanner.nextInt();

        if (rev<0 || rev >= 100000){
            System.out.println("Invalid Revenue");
        }

        if (rev < 20000){
            System.out.println("Poor Sales Revenue");
        }

        if (rev>20000 && rev<50000){
            System.out.println("Average Sales Revenue");
        }

        if (rev>50000 && rev<80000){
            System.out.println("Good Sales Revenue");
        }

        if (rev>80000 && rev<100000){
            System.out.println("Excellent Sales Revenue");
        }
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int com = scanner.nextInt();
        if (com > 0 && com < 5){
            switch (com) {
                case 1: System.out.println("Your Commission Rate was set to 0.01");
                    break;
                case 2: System.out.println("Your Commission Rate was set to 0.02");
                    break;
                case 3: System.out.println("Your Commission Rate was set to 0.03");
                    break;
                case 4: System.out.println("Your Commission Rate was set to 0.04");
                    break;
            }
        } else {
            System.out.println("Your Commission Rate was set to 0.0");
        }

        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int y = scanner.nextInt();

        if (y%4==0){
            if (y%100==0 && y%400!=0){
                System.out.println("Not a Leapyear");
            } else {
                System.out.println("Leapyear");}
        } else {
            System.out.println("Not a Leapyear");
        }


        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int dez = scanner.nextInt();
        int dez100 = dez/100;
        int dez10=(dez%100)/10;
        int dez1= (dez%100)%10;
        int dezfertig = (dez1*100)+(dez10*10)+(dez100);
        System.out.println(dezfertig);
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}