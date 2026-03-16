package Bai1_Static;

public class KhoiStatic {
    //Khối static dùng để chạy trước hàm main hoặc trước nhất trong class này
    //Tự động chạy, không gọi lại sử dụng được
    static {
        System.out.println("Setup môi trường.");
    }

    public static void getInfo() {
        System.out.println("Name: Anh Tester");
    }

    public static void main(String[] args) {
        System.out.println("Login Test.");
    }

}
