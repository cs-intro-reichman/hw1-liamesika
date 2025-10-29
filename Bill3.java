import java.util.Scanner;
public class Bill3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// יוצר סורק (Scanner) שקורא קלט מהמקלדת/טרמינל. זו גישה של קלט אינטראקטיבי

        // קבלת 3 שמות מהמשתמש
        String[] names = new String[3]; //יצירת מערך של מחרוזות (String) באורך 3 לאחסון השמות.
        for (int i = 0; i < 3; i++) { //לולאה שרצה על האינדקסים 0,1,2 – שלושת המקומות במערך.
            System.out.print("Enter name #" + (i + 1) + ": "); //מדפיסה בקשה להזין שם מספר 1/2/3 (ללא ירידת שורה)
            names[i] = input.nextLine(); //קוראת שורה מלאה מהקונסול ושומרת אותה במערך בעמדה
        }

        // קבלת סכום החשבון
        System.out.print("Enter total bill amount: ");
        int bill = input.nextInt();

        // חישוב סכום לכל אחד (עם עיגול כלפי מעלה)
        double splitBill = Math.ceil((double) bill / 3);

        // הדפסת התוצאה
        System.out.println("\nEach person owes:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + " owes " + splitBill);
        }

        input.close();
    }
}