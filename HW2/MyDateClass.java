public class MyDateClass {
    
    private int month;
    private int day;
    private int year;

    public void setDate(int assignedMonth, int assignedDay, int assignedYear) {
        this.month = assignedMonth;
        this.day = assignedDay;
        this.year = assignedYear;
    }

    public String getDate() {
        return String.format("%d/%d/%02d", month, day, year);
    }



    public static void main(String[] args) {
        //instantiate object
        MyDateClass obj = new MyDateClass();

        //set date values
        obj.setDate(12,28,02);

        //display date
        System.out.println(obj.getDate());

        //display name
        System.out.println("Erik Bobinski");
    }

}
