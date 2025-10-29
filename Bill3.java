public class Bill3 {
    public static void main(String[] args) {
        // קריאת 3 שמות מהארגומנטים
        String[] names = new String[3];
        names[0] = args[0];
        names[1] = args[1];
        names[2] = args[2];

        // קריאת סכום החשבון מהארגומנט הרביעי
        int bill = Integer.parseInt(args[3]);

        // חישוב סכום לכל אחד (עם עיגול כלפי מעלה)
        double splitBill = Math.ceil((double) bill / 3);

        // הדפסת התוצאה
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + " owes " + (int)splitBill);
        }
    }
}