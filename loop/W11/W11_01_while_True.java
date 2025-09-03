package W11;

import java.util.Scanner;

public class W11_01_while_True {
    
    public static void main(String[] args) {
     
        Scanner kb = new Scanner(System.in);
        while (true) {
            //NO.1  // เขียนโปรแกรมรับตัวเลขจากคีย์บอร์ดไปเรื่อยๆ จนกระทั้งกด9 จึงจะหยุด
            // System.out.print("ENTER Nubber  ");
            // int num = kb.nextInt();

            // if (num == 9){ //ตัวคำสั่งที่ใช้ตรวจสอบการการออกจากลูป
            //  break;  // เป็นคำสั่งใช้ในการออกจากลูป
            // }

            //No.2 เขียนโปรแกรมรับตัวอักษรจากคีย์บอร์ดไปเรื่อยๆ จนกระทั้งกดตัอักษร
            System.out.print("ENTER alphabet  ");
            String alphabet = kb.nextLine();

            if (alphabet.equals("E")){ 
                break;  
            }











        }
        
    }
}
