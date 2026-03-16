package Bai1_Array;

public class DemoArrayForEach {
    public static void main(String[] args) {

        int mang[] = {3, 34, 24, 6, 1, 7, 24};

        for (int item : mang){
            System.out.println(item);
        }

        System.out.println("========================");
        for (int i = 4; i<= 6; i++){
            System.out.println(mang[i]);
        }

    }
}

