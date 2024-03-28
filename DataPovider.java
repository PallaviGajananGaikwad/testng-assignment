package test1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPovider
 {

    // Define a data provider method
    @DataProvider(name = "testdata")
    public Object[][] testData() {
        return new Object[][] {
                {"user1", "password1"},
                {"user2", "password2"},
                {"user3", "password3"}
        };
    }

    // Test method that uses the data provider
    @Test(dataProvider = "testdata")
    public void loginTest(String username, String password) {
        System.out.println("Logging in with username: " + username + " and password: " + password);
        // Add your test logic here
    }
}
