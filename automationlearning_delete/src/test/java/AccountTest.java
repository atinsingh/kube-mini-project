import co.pragra.bank.Account;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    Account account ;

    @Before
    public void setUp(){
        account = new Account();
    }

    @Test
    public void depositTest1(){
       double newBal =  account.depositMoney(200);
        Assert.assertEquals(10200.0,newBal,0);
    }
}
