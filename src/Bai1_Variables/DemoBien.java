package Bai1_Variables;

public class DemoBien {
    String address = "Hà Nội"; //Biến toàn cục
    int zip_code = 12345; //Biến toàn cục

    public static String phone = "0939206009"; //Biến static

    public void sayHello() {
        int number = 100; //Biến cục bộ
        int a = 5;
        int b;
        b = a + number;
        System.out.println(b);

        System.out.println(address);
        System.out.println(zip_code);

        System.out.println(DemoBien.phone); //Biến static được gọi thông qua tên class
    }

    public void getInfo() {
        //System.out.println(number);

        System.out.println(address);
        System.out.println(zip_code);

        System.out.println(phone);

    }

    public static void main(String[] args) {
        System.out.println("Selenium Java");
        String cccd = "01748325876";
        System.out.println(cccd);

        //System.out.println(number); //Không thể gọi biến cục bộ từ hàm sayHello()

        DemoBien demoBien = new DemoBien(); //Khai báo đối tượng class

        demoBien.zip_code = demoBien.zip_code + 5;

        System.out.println(demoBien.address);
        System.out.println(demoBien.zip_code);

        System.out.println(phone);

        String address = "Đà Nẵng";
        System.out.println(address);
    }

}

