package bg.tu_varna.sit;

public class zad5 {
    public static void main(String args[]) {
        String[] numbers = { "21621551", "20191817", "19824332", "21324354", "22154387", "22764554", "20985115",
                "20938475", "21912834", "19817227" };
        String[] currencies = { "BGN", "EUR", "USD", "BGN", "USD", "BGN", "BGN", "EUR", "USD", "USD" };
        String[] nalichnosti = { "20987", "320", "2345", "12000", "8765", "2345", "12345", "12345", "12345", "12345" };
        String[] types = { "Deposit", "Credit", "Deposit", "Card", "Card", "Deposit", "Credit", "Card", "Deposit",
                "Credit" };
        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(numbers[i], currencies[i], nalichnosti[i], types[i]);
        }
        int avgUSD = 0, avgBGN = 0, avgEUR = 0;
        int brUSD = 0, brBGN = 0, brEUR = 0;
        for (int i = 0; i < accounts.length; i++) {
            switch (accounts[i].getCurrency()) {
                case "USD":
                    brUSD++;
                    avgUSD += accounts[i].getNalichnost();
                    break;
                case "EUR":
                    brEUR++;
                    avgEUR += accounts[i].getNalichnost();
                    break;
                case "BGN":
                    brBGN++;
                    avgBGN += accounts[i].getNalichnost();
                    break;
            }
        }
        System.out.println("USD: " + brUSD + "\naverage is: "+ avgUSD/brUSD + "\n\nEUR: " + brEUR + "\naverage is: " + avgEUR/brEUR + "\n\nBGN: " + brBGN + "\naverage is: " + avgBGN/brBGN);
    }
}
