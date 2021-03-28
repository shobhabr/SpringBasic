import com.xmlconfig.service.SpeakerService;
import com.xmlconfig.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService service= applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName() +' '+service.findAll().get(0).getLastName());

    }
}
