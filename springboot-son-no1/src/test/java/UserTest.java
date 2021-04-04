import com.son.HelloSon;
import com.son.bean.Teacher;
import com.son.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName springboot-01-helloworld
 * @Author Songleen
 * @Date 2021/04/03/18:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSon.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {

    @Autowired
    private User user;
    @Autowired
    private Teacher teacher;

    @Test
    @RequestMapping("/getOne")
    @ResponseBody
    public void test01(){
        System.out.println("请求过来了");
        System.out.println(user.toString());
    }

    @Test
    public void test02(){
        System.out.println("请求又过来了");
        System.out.println(teacher.toString());
    }
}
