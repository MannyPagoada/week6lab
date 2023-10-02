public class date {
    private int day, month, year;
    private String monthString;


    //first constructor
    public date(){
    }
 
    //second constructor
    public date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    //first date print
    public void print()){
        System.out.println(month + "/" + day + "/" + year);
    }

    //second date print
    public void print2(){
        System.out.println(null);

    }

    //set up class to figure out month in string
    public void setMonthString(int month){
        //switch that goes through every day of the month
        //honesetly i can optimize it
        switch (month){
            case 1: 


            case 2:
            
            case 3:

            case 4:

            case 5:

            case 6:
            
            case 7:

            case 8: 
            
            case 9:

            case 10:

            case 11:

            case 12:
        }
    }

    //setters all set up
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }

    //getters all set up
    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}

}
