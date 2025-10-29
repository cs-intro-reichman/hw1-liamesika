public class Bill3 {
    public static void main(String[] args) {
        // קריאת 3 שמות מהארגומנטים
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];

        // קריאת סכום החשבון מהארגומנט הרביעי
        int bill = Integer.parseInt(args[3]);

        // חישוב סכום לכל אחד (עם עיגול כלפי מעלה)
        double splitBill = Math.ceil((double) bill / 3);

        // הדפסת התוצאה בסדר הפוך
        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + splitBill + " Shekels each");
    }
}