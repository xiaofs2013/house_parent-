import com.kgc.house.mapper.DistrictMapper;
import com.kgc.house.pojo.DistrictExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    //测试的方法
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        DistrictMapper districtMapper = (DistrictMapper) ctx.getBean("districtMapper");
        System.out.println(districtMapper.selectByExample(new DistrictExample()));
    }

}
