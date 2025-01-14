import com.spring.config.SpringConfig;
import com.spring.domain.Orders;
import com.spring.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)   //声明使用junit的依赖
@ContextConfiguration(classes = SpringConfig.class)   //声明spring的的环境，这样就可以使用ioc里面的bean了
public class JunitTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testMybatis(){
        Orders o1 = orderService.getOrderById(1);
        System.out.println(o1);
    }
}
