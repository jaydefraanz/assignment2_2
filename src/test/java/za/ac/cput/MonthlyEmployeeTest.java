package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonthlyEmployeeTest {

    @Test
    public void salary()
    {
        MonthlyEmployee month = new MonthlyEmployee();
        int result = month.salary(500,20);
        Assert.assertEquals("Multiply working days by daily rate", 10000, result);
    }
}