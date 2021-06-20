import com.itou86.bookmarket.domain.Books;
import com.itou86.bookmarket.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>测试单元</p>
 *
 * @author : Itou86
 * @version : 1.0.0
 * @date : 2021-06-20 14:45
 **/
public class MyTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.selectAllBook()) {
            System.out.println(books);
        }
    }
}
