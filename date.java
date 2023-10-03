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
        setMonthString(this.month);
    }

    //first date print
    public void print(){
        System.out.println(month + "/" + day + "/" + year);
    }

    //second date print
    public void print2(){
        System.out.println(monthString + " " + day + ", " + year);
    }

    //third date print
    public void print3(){
        System.out.println(day + " " + monthString + " " + year);
    }

    //set up class to figure out month in string
    public void setMonthString(int month){
        //switch that goes through every day of the month
        //honesetly i can optimize it
        switch (month){
            case 1: 
                this.monthString="January";
                break;

            case 2:
                this.monthString="Feburary";
                break;
            
            case 3:
                this.monthString="March";
                break;

            case 4:
                this.monthString="April";
                break;

            case 5:
                this.monthString="May";
                break;

            case 6:
                this.monthString="June";
                break;
            
            case 7:
                this.monthString="July";
                break;

            case 8: 
                this.monthString="August";
                break;
            
            case 9:
                this.monthString="September";
                break;

            case 10:
                this.monthString="October";
                break;

            case 11:
                this.monthString="November";
                break;

            case 12:
                this.monthString="December";
                break;
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
