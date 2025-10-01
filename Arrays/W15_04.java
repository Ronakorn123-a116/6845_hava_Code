package Arrays;

public class W15_04 {
    public static void main(String[] args) {
        int x [] = { 7, 9, -1, 4, 12, 9, 3, 2, -7, 2, 1, 9, -15, 24, 11, 13 };
        int odd =0;
        int evene =0;

        for(int i=0;i< x.length ;i++){
            if (x[i] % 2 == 0) {
                evene++;
            }else{
                odd++;
            }
        }
        System.out.println("Odd "+  " " +odd);
        System.out.println("evene"+ " "  +evene);
    }
}
