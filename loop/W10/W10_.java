package W10;
import java.util.Scanner;
public class W10_ {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("=======INPUT=======");
       System.out.print("Product name :");
        String Product = kb.nextLine();

        System.out.print("Unit Price(Baht) : ");
        int Price = kb.nextInt();

        System.out.print("Quantity :");
        int Quantity = kb.nextInt();
       
        System.out.println("=======OUTPUT=======");
        System.out.println("PRODUCT  :"+Product );

        double Unit_QTY = (Price * Quantity);
        System.out.println("UNIT x QTY  :" + Price +"X"+ Quantity);
        System.out.println("SUMBTOTAL  :"+Unit_QTY  +" baht");
        
        double Discount = Unit_QTY *7 /100;

        System.out.println("Discount 7.0%  :"+Discount );
        System.out.println("-----------");
        double Net_TOTAl = Unit_QTY - Discount;
        System.out.println("Net TOTAL :"+ Net_TOTAl+"Baht");

    }
}