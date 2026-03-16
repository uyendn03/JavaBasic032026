package Bai1_XuLyChuoi;

public class DemoXuLyChuoi {
    public static void main(String[] args) {
        String str1 = "Java for Tester";
        String str2 = "Selenium";
        String str3 = " TestNG ";

        System.out.println("Cắt chuỗi:" + str1.substring(5));
        System.out.println("Cắt chuỗi:" + str1.substring(5, 8));

        System.out.println("Độ dài chuỗi: " + str1.length());
        System.out.println("Vị trí kí tự trong chuỗi: " + str1.indexOf("a"));
        System.out.println("Vị trí kí tự trong chuỗi: " + str1.indexOf("a", 2));

        System.out.println("-----------------------------");
        String tachChuoi[] = str1.split(" ");
        for (String item : tachChuoi) {
            System.out.println(item);
        }

        System.out.println("Chữ in hoa: " + str2.toUpperCase());

        String temp = str1.replace(" ", "-");
        System.out.println(temp);

        System.out.println("Kiểm tra rỗng: " + str2.isEmpty());

        //Chuyển chuỗi thành mảng ký tự
        char mangChar[] = str2.toCharArray();
        for (char item : mangChar) {
            System.out.println(item);
        }

        System.out.println("*************************");
        System.out.println(str3);
        System.out.println(str3.trim());

        //Chuyển kiểu dữ liệu khác sang dạng chuỗi
        System.out.println(String.valueOf(12345) + 5);

        //Chuyển kiểu dữ liệu chuỗi về dạng số
        System.out.println(Integer.parseInt("12345") + 5);

        // Tách số từ trong chuỗi
        String strTasks = "Tasks assigned to me: 78";
        System.out.println(strTasks.substring(strTasks.length() - 2));

        int itemTotal = strTasks.split(" ").length;

        System.out.println(itemTotal);

        String listItem[] = strTasks.split(" ");
        System.out.println(listItem[itemTotal - 1]);

    }
}

