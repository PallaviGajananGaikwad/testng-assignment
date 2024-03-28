package test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

    String env = "";

    // DataProvider
    @DataProvider(name = "test1-data")
    public Object[][] data(){
        Object[][] arr = new Object[5][2];
        arr[0][0] = "Username 1"; arr[0][1] = "Password 1";
        arr[1][0] = "Username 2"; arr[1][1] = "Password 2";
        arr[2][0] = "Username 3"; arr[2][1] = "Password 3";
        arr[3][0] = "Username 4"; arr[3][1] = "Password 4";
        arr[4][0] = "Username 5"; arr[4][1] = "Password 5";
        return arr;
    }


    @BeforeMethod
    public void setup(){
       System.out.println("Setup");
    }

    @Test(dataProvider = "test1-data")
    public void test1(String col1, String col2){
        System.out.println(env+" env url");
        System.out.println("test1" + col1 + " - " + col2);
    }


    @Test
    void login()
    {
        System.out.println(env + "env");
        System.out.println("Login");
    }

    @AfterMethod
    public void close()
    {
        System.out.println("Close browser");
    }


}
