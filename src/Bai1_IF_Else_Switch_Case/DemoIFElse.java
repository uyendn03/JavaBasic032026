package Bai1_IF_Else_Switch_Case;

public class DemoIFElse {
    static int c = 20;

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        String expected = "Customer Summary";

        //Mệnh đề IF
        if ((a < b) || (expected.equals("Customer"))) {
            System.out.println("a < b");
            System.out.println("TC passed");
        }

        if (expected.equals("Customer Summary")) {
            System.out.println("Passed");
        }

        //Mệnh đề IF ELSE
        if (a > b) {
            System.out.println("A > B");
        } else {
            System.out.println("A < B");
        }


        int marks = 65;

        if (marks < 50) {
            System.out.println("Tạch!");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Xếp loại D");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Xếp loại C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Xếp loại B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Xếp loại A");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("Xếp loại A+");
        } else {
            System.out.println("Giá trị không hợp lệ!");
        }

        if(c > 10){
            System.out.println("C > 10");
        }

    }

}
