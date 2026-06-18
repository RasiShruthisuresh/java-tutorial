public class Main {

    public static void main(String[] args){
        // This is my first java program
        /* THIS IS A MULTI LINE COMMENT */
        System.out.println("I like pizza!");
        System.out.println("It's really good!");
        System.out.println("Buy me pizza!");
        //sout tab space

        //variable  = a reusable for a value
        //              a  vatiablr brhavrs as if it was the value it contains
        // primtive  = simple value stored in the memory (stack)
        //reference = memory address(stack) that points to the (heap)
        // primitive vs refernce
        // .........   .........
        // int         string
        // double      array
        // char        object
        //boolean
        // 2 steps to creating a varianle
        // 1. declaration
        //2. assignment
// primitive data type
        int age = 30;
        int year = 2025;
        int quantity = 1;
        System.out.println("The year is " +year);
        // o/p :java: variable age might not have been initialized
        //o/p if float:java: incompatible types: possible lossy conversion from double to int
        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;
        System.out.println("$ " +price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(currency);

        boolean isStudent = true;//(two words is Student first letter to be lower and second to be upper case)
        boolean forSale = false;
        boolean isOnline = true;

        if(isStudent) {
            System.out.println("You are a Student!");
        }
        else{
            System.out.println(" You are Not a student!");

        }
        // reference data types
        String name = "Bro code";
        String food = " Pizza";
        String email = "fake123@gmail.com";// numbers are treated as characters not actual numbers
        String car = "Mustang";
        String color = "red";
        System.out.println("My fav food is " +food);
        System.out.println("Your email is " +email);
        System.out.println("fav color " +color);
        System.out.println("hello  " +name);
        System.out.println("you are " + age + " Years old ");
        System.out.println("Your gpa is : " +gpa);
        System.out.println("Your avg letter grade is " +grade);
        System.out.println(" Your choice is a " +color + " " + year + " " + car );
        System.out.println("The price is: " + currency + price);

        if (forSale){
            System.out.println("There is a " +car + " for sale");
        }
        else{
            System.out.println("There is a " +car + " not for sale");
        }
    }
}
