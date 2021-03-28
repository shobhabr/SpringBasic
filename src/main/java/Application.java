import com.shobha.service.SpeakerService;
import com.shobha.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        //SpeakerService service= new SpeakerServiceImpl();
        //System.out.println(service.findAll().get(0).getFirstName());
        // use Spring Java Configuration
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service= applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
