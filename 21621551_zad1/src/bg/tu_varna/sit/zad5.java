package bg.tu_varna.sit;

public class zad5 {
    public static void main(String[] args) {
        zad5_func(2);
        zad5_func(3);
        zad5_func(6);
        zad5_func(1);
        zad5_func(7);
        zad5_func(5);
        zad5_func(4);
    }

    public static void zad5_func(int day) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Working hours:");
        if(day == 6 || day == 7){
            System.out.println(weekdays[day-1] + ": Out of office");
        }
        else if(day == 1 || day== 3 || day == 5){
            System.out.println(weekdays[day-1] + ": 13:30 - 18:00");
        }
        else{
            System.out.println(weekdays[day-1] + ": 8:00 - 12:30");
        }
    }
}
