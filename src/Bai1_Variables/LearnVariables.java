package Bai1_Variables;

public class LearnVariables {
    static int VAT = 10;

    private void getInfo() {
        System.out.println(DemoBien.phone);
    }

    public static void main(String[] args) {
        //Khai báo biến họ tên, kiểu chuỗi
        String name = "Cao Thành Phát";
        System.out.println("Họ tên: " + name);

        String Name = "Phương";
        System.out.println(Name);

        //Comment trong code
        //Ctrl + Alt + L  để format code cho ngay ngắn

        int age = 0;
        System.out.println(age);

        String address = "Can Tho"; //Khai báo biến địa chỉ
        System.out.println(address);

        System.out.println(VAT);
        System.out.println(DemoBien.phone);
    }

}

