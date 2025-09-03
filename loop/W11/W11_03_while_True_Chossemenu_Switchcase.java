package W11;

import java.util.Scanner;

public class W11_03_while_True_Chossemenu_Switchcase {
    public static void main(String[] args) {
        Scanner  kb = new Scanner(System.in);
        //โจทย์ คือเขียนโปรแกรมเลือกเมนู
        // ถ้าเลือก 1 ให้ + เลข 2จำนวน
        // เลือก 2 ให้ - เลข 2จำนวนง
        // เลือก 3 ออกจากโปรแกรม
 //======================================================
    // แสดงข้อความรับตัวเลข 2จำนวน
    System.out.print("Enter your Nubmber 1=  ");
    int Nub1 = kb.nextInt();
    System.out.print("Enter your Nubmber 2=  ");
    int Nub2 = kb.nextInt();
//=======================================================

    // แสดงMENU
       System.out.println("==================");
       System.out.println("Menu: ");
       System.out.println("1. Addition");
       System.out.println("2. Subtraction");
       System.out.println("3. Exit");
       System.out.println("==================");

       while (true) {
        System.out.print("Enter your choince:  ");
        int Choice = kb.nextInt();
        System.out.println("==================");//(เพิ่มเติมจากของอาจาร)
       
        // if (Choice == 1){
        //     
        // }else if (Choice == 2){ 
        //     
        // }else if (Choice == 3){
        //    
        // }else {
        //     System.out.println("Does not match the available Choice");
        // }
         
        switch(Choice){
             case 1:
                    System.out.println("Ad  dition Result= "+(Nub1+Nub2));
                    
             break;
            

             case 2:
                    System.out.println("Subtraction Result = "+(Nub1-Nub2));
                    
             break;
             

             case 3:
                    System.out.println("Exiting the program. bye bye bye bye bye bye bye ");
                    
             break;
            

             default:
                     System.out.println("Does not match the available Choice");
                    }
                    if (Choice == 1){
                     break;
                     }else if (Choice == 2){
                     break;
                     }else if (Choice == 3){
                         break;
                     }else {
                         System.out.println("Does not match the available Choice");
                     }
        }

    }
}
