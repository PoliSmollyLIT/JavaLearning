package bg.tu_varna.sit.task1;

public class Application {
    public static void main(String[] args){
        Child goshko = new Child("Gosho", 2, 6.3);
        Child pesho = new Child("Petar", 5, 12.4);
        Adult ivan = new Adult("Ivan", "21421523");
        Medical<Child> medical1 = new Medical<Child>(pesho, Condition.DAMAGED);
        Medical<Child> medical2 = new Medical<Child>(goshko, Condition.GOOD);
        Medical<Adult> medical3 = new Medical<Adult>(ivan, Condition.DAMAGED);

        System.out.println(medical1.getPrescription());
        System.out.println(medical2.getPrescription());
        System.out.println(medical3.getPrescription());

        System.out.println(medical1.getCoupon());
        System.out.println(medical2.getCoupon());
        System.out.println(medical3.getCoupon());

    }
}