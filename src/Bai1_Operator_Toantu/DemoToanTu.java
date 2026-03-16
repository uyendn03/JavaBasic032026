package Bai1_Operator_Toantu;

public class DemoToanTu {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Số học
        System.out.println("a % b = " + (a % b));
        //System.out.println(a++);
        //a++;
        int c = a;
        System.out.println(c);

        b++; //Chỉ nên ++ và -- cho 1 biến, không mang kết hợp trong phép toán
        c = a + b;
        System.out.println(c);

        //Quan hệ - So sánh
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        //Toán tử Logic - kết hợp nhiều điều kiện/ phép toán
        System.out.println("Logic &&: " + ((a < b) && (b > c)));
        System.out.println("Logic ||: " + ((a < b) || (b > c)));


        //Toán tử điều kiện
        int m = 20;
        int p = 2;

        String s = (m % p == 0) ? "m chia het cho p" : "m khong chia het cho p";
        System.out.println(s);

        //Toán tử gán
        int var = 20;
        int v, q, r, x;
        v = q = r = x = var;
        System.out.println(r);
        System.out.println(x);

        String actualHeader = "";//dùng Selenium get cái header ra dạng text

        String expectedHeader = "Login";

        //Dấu == nên dùng so sánh số
        boolean check = (actualHeader == expectedHeader);

        //So sánh chuỗi dùng 2 hàm này
        actualHeader.equals(expectedHeader);
        actualHeader.contains(expectedHeader);

    }

}

