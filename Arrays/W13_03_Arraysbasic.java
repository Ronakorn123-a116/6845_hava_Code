package Arrays;

public class W13_03_Arraysbasic {
    public static void main(String[] args) {
        
   
    //การประกาศตัวแปล  Arrays ระบุแบบที่ 1 คือ ระบุสมาชิกในวงเล็บปีกกา
    //String []animl; 
    String animals[]  = {"Dog","Cat","Lion"};
    int dice[] = {1,2,3,4,5,6,};

    float avg [] ={3.54f,2.24f,3.99f};


    //หาขนาดของ Array
    System.out.println("Size of animals array:"+ animals.length);

    //การเข้าถึงสมาชิก Array
    System.out.println("animals at index 0:"+animals[0]);
    System.out.println("animals at index 2:"+animals[2]);

    //ใช่วยลูปแสดงสมาชิกใน Array avg
    System.out.println("show avg scores :");
    for (int i = 0 ; i < avg.length ; i++ ){
        System.err.println(avg[i]);
    }



//===========================================================================

    // การประกาศตัวแปลแบบ Array แบบที่ 2 ระบุขนาดของ  Array
    String colors[] = new String[4];
    colors[2] = "Red";
    colors[0] = "Green";
    colors[3] = "Blue";
    System.out.println("colors at index 0:"+colors[0]);
    System.out.println("colors at index 1:"+colors[1]);
    System.out.println("Size of colors array :"+ colors.length);
    
    int scores[] = new int [5];
    scores [0] = 50;
    System.out.println("Scores at index 4:"+scores[4]);

    int blox = 1;
    for(int x = 0 ;x < colors.length ;x++){
    System.out.println("blox"+blox++ +"  =  " +colors[x]);
    }
    }     
}
