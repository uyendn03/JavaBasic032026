package Bai1_Static;

public class TestCases {
    public void testAddNewProject(){
        System.out.println(DataConstants.browser);
    }

    public static void testLoginSuccess() {
        System.out.println("Open browser " + DataConstants.browser);
        System.out.println("Navigate to url " + DataConstants.url);
        System.out.println("Enter email and password...");
        System.out.println("Click login button");
        System.out.println("Verify...");
    }

    public static void testAddNewCustomer() {
        testLoginSuccess();
        System.out.println("Click menu Customer");
        System.out.println("Click button Add New Customer");
        System.out.println("Input data on form add new customer");
        System.out.println("Click Save button");
        System.out.println("Verify...");
    }

    public static void testAddNewTask(){
        testLoginSuccess();
        //testAddNewProject(); //Không thể gọi Biến/Hàm non-static vào hàm static
        DataConstants.clickElement("Menu Task");
        DataConstants.clickElement("Add New Task");
        System.out.println("Input data for task");
        DataConstants.clickElement("Button Save Task");
        System.out.println("Verify...");
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        //testCases.testLoginSuccess();

        testLoginSuccess();
        System.out.println("===============================");
        testAddNewCustomer();

        testCases.testAddNewProject();

        System.out.println(DataConstants.browser);
        System.out.println("===============================");
        testAddNewTask();

        System.out.println("===============================");
        KhoiStatic.getInfo();
    }
}


