package Bai1_DataTypes;

public class DemoDataType {

    public static void main(String[] args) {
        String customer_name = "FPT Software";
        String customerName = "Viettel VTCC";
        String CUSTOMER_NAME = "VNPT IT";
        System.out.println(customer_name);

        char kitu = 'A';
        System.out.println(kitu);

        int soNguyenDuong = 2147483647;
        int soNguyenAm = -2147483648;

        System.out.println(soNguyenDuong);
        System.out.println(soNguyenAm);

        long soNguyenDuongLong = 10147483648L;
        System.out.println(soNguyenDuongLong);

        float soThucFloat = 10.58356F;
        double soThucDouble = 2956.12845982754D;
        System.out.println(soThucFloat);
        System.out.println(soThucDouble);

    }

}
