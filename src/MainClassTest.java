import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import java.net.PortUnreachableException;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("Fail. The value a != 14", getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("Fail. The value must be less than 45", getClassNumber()  > 45);
    }

    @Test
    public void testGetClassString()
    {
        Assert.assertTrue("Fail. The text does not contain the word \"Hello\" ", getClassString().contains("hello") || getClassString().contains("Hello"));
    }
}
