import com.javaconfig.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApplication {
    public static void main(String[] args) {
        //SpeakerService service= new SpeakerServiceImpl();
        //System.out.println(service.findAll().get(0).getFirstName());
        // use Spring Java Configuration
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service= applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName() +' '+service.findAll().get(0).getLastName());

        // check for single

        SpeakerService service2= applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service2);
    }
}
