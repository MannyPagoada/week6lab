import java.util.Scanner;

public class main{
    public static void menu(){
        //gotta create a class that can take 3 diffrent integers for the date
        //there should be 3 diffrent methods 
        //it should also make sure you are only take valid inputs
        Scanner scanner=new Scanner(System.in);
        int day, month, year;

        System.out.println("Please enter the month (1-12): ");
        do {month=scanner.nextInt();}
            while (month <= 12 && month >=12);
        
        System.out.println("Please enter day (0-31): ");
        do {day=scanner.nextInt();}
            while(day <= 31 && day >=1);

        System.out.println("Please enter the year: ");
        year=scanner.nextInt();
        


    }


}