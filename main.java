import java.util.Scanner;

public class main{
    public static void main(String[] args){
        //gotta create a class that can take 3 diffrent integers for the date
        //there should be 3 diffrent methods 
        //it should also make sure you are only take valid inputs
        Scanner scanner=new Scanner(System.in);
        int day, month, year;

        do {
            System.out.println("Please enter the month (1-12): ");
            month=scanner.nextInt();}
            while (month > 13 || month < 0);
        
        
        do {
            System.out.println("Please enter day (0-31): ");
            day=scanner.nextInt();}
            while(day > 32 || day < 0);

        System.out.println("Please enter the year: ");
        year=scanner.nextInt();

        System.out.println("You entered: " + month + "/" + day + "/" + year);





        //good practice to close the scanner when done with the code
        scanner.close();
    }


}