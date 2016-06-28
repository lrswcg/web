import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by cnhhdn on 2016/6/24.
 */
public class SpringHibernateTest {
    private ApplicationContext context=null;
    {
        context=new ClassPathXmlApplicationContext("classpath:spring-hibernate.xml");
    }
    @Test
    public  void testDatasource(){
        DataSource dataSource =context.getBean(DataSource.class);
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
