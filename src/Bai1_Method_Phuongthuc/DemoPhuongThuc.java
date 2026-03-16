package Bai1_PhuongThuc;

public class DemoPhuongThuc {

    //Hàm không trả về kết quả
    public void login() {
        System.out.println("Set email");
        System.out.println("Set password");
        System.out.println("Click Login button");
        //Xử lý 100 dòng code
    }

    //Hàm có trả về kết quả
    public static String getHeaderPage() {
        System.out.println("Dùng Selenium lấy được cái Header page.");
        String header = "Customers Summary";

        return header;
    }

    //Hàm không trả về kết quả + có tham số
    public static void login(String email, String password) {
        System.out.println("Set email: " + email);
        System.out.println("Set password: " + password);
        System.out.println("Click Login button");
        //Phần quyền xử lý cho 15 cái roles
    }

    // Phương thức sum trả về kiểu int, là tổng của hai tham số
    public static int sum(int a, int b) {
        // phương thức kết thúc khi gặp return
        return a + b;
    }

    public static int getCustomerTotal() {
        //Dùng Selenium để get Customer Total
        int customerTotal = 350;
        return customerTotal;
    }

    public static int getCustomerDeActive() {
        //Dùng Selenium để get Customer Total
        int customerDeActive = 150;
        return customerDeActive;
    }

    public static void main(String[] args) {
        DemoPhuongThuc demoPhuongThuc = new DemoPhuongThuc();
        demoPhuongThuc.login();
        //login();
        String value2 = getHeaderPage();
        System.out.println(value2);

        login("admin@example.com", "123456");
        login("customer@example.com", "456789");

        int valueSum = sum(123, 456);
        System.out.println(valueSum);
        //System.out.println(sum(123, 456));

        System.out.println(getCustomerTotal() + getCustomerDeActive());
    }
}
