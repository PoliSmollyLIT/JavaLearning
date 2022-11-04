package bg.tu_varna.sit;

public class zad10 {
    public static void main(String args[]) {
        String[] marka = { "samsung", "iphone", "redmi", "nokia", "huawei", "samsung", "iphone", "redmi", "nokia", "huawei" };
        String[] pamet = { "123", "123", "123", "123", "123", "123", "123", "123", "123", "123"};
        String[] teglo = { "500", "250", "550", "100", "150", "200", "500", "250", "330", "330" };
        String[] camera = { "34", "56", "76", "22", "23", "43", "54", "37", "69", "55" };
        MobilePhone[] mobilePhones = new MobilePhone[10];

        for (int i = 0; i < mobilePhones.length; i++) {
            mobilePhones[i] = new MobilePhone(marka[i], pamet[i], teglo[i], camera[i]);
        }
        int avgTeglo = 0;
        MobilePhone bestCamera = mobilePhones[0];
        for (int i = 0; i < mobilePhones.length; i++) {
            avgTeglo += mobilePhones[i].getTeglo();
            if(mobilePhones[i].getCamera()>bestCamera.getCamera()){
                bestCamera = mobilePhones[i];
            }
        }

        System.out.println("Average teglo in phones is: " + avgTeglo/10 + " and the phone with the best camera is: " + bestCamera.getMarka());
    }
}
