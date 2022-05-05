import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.Account;
import service.AccountService;
public class ConsoleApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext appCtx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService =
                (AccountService)appCtx.getBean("accountService");
        List<Account> delinquentAccounts=accountService.findDeliquentAccounts();
        for (Account a : delinquentAccounts) {
            System.out.println(a.getAccountNo());
        }
    }
}