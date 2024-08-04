import org.allen.RhinoBlogApplication;
import org.allen.entity.User;
import org.allen.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;

@SpringBootTest(classes = RhinoBlogApplication.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String x = new String(Base64.getDecoder().decode("dXNlcjp7bm9vcH1wYXNzd29yZA=="), "UTF-8");
        System.out.println(x);
    }
}
