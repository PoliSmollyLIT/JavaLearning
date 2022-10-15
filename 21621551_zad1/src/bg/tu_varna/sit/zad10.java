package bg.tu_varna.sit;

public class zad10 {
    public static void main(String[] args) {
        char[] test1 = { 'a', 'a', 'b', 'c', 'a', 'c', 'a', 'b', 'a', 'b' };
        char[] test2 = { 'a', 'b', 'a', 'c', 'a', 'c', 'c', 'b', 'a', 'c' }; // <-- original key answers
        char[] test3 = { 'a', 'b', 'b', 'c', 'a', 'c', 'c', 'b', 'a', 'b' };
        char[] test4 = { 'a', 'a', 'b', 'a', 'a', 'c', 'a', 'c', 'a', 'b' };
        char[] test5 = { 'b', 'a', 'b', 'a', 'b', 'a', 'a', 'c', 'a', 'b' };
        zad10_func(test1);
        zad10_func(test2);
        zad10_func(test3);
        zad10_func(test4);
        zad10_func(test5);
    }

    public static void zad10_func(char[] answers) {
        char[] key = { 'a', 'b', 'a', 'c', 'a', 'c', 'c', 'b', 'a', 'c' };
        int right = 0;
        String[] marks = { "слаб 2", "среден 3", "добър 4", "много добър 5", "отличен 6" };
        int mark_index = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i] == key[i]) {
                right++;
            }
        }
        switch (right) {
            case 10:
            case 9:
                mark_index = 4;
                break;
            case 8:
            case 7:
                mark_index = 3;
                break;
            case 6:
            case 5:
                mark_index = 2;
                break;
            case 4:
            case 3:
                mark_index = 1;
                break;
            default:
                mark_index = 0;
                break;
        }
        System.out.println("Оценката e: " + marks[mark_index]);
    }
}
