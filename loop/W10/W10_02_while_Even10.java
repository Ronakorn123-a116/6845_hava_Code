package W10;

public class W10_02_while_Even10 {
    public static void main(String[] args) {
        
// loop while แสดงเลขคู่ 10 ตัวแรก โดยให้ค่าเริ่มต้นที่2

    int count = 2;
    int sum = 0; 
    while (count <=20) {
       sum=sum+count;
       if(count ==20){
        System.out.print(count+"  =  "+sum);
       }else{
        System.out.print(count+" + "); 
       }
       
       count = count +2 ;
    
    }
    
  }
}
