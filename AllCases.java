package test1;

import org.testng.annotations.Factory;

public class AllCases
{

    @Factory
    public Object[] allCases()
    {
        Object[] env = new Object[3];

        Test1 dev = new Test1();
        dev.env = "dev";

        Test1 qa = new Test1();
        qa.env  = "qa";

        Test1 uat = new Test1();
        uat.env  = "uat";



        env[0] = dev;
        env[1] = qa;
        env[2] =  uat;

        return env;

    }

}
