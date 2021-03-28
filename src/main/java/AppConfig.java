import com.shobha.repository.HibernateSpeakerRepositoryImpl;
import com.shobha.repository.SpeakerRepository;
import com.shobha.service.SpeakerService;
import com.shobha.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    // Single
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    // for prototype
    //@Scope(value= BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService(){
        // example of setter injection setter pf bean
        //SpeakerServiceImpl service= new SpeakerServiceImpl();
        // constructor injection
        SpeakerServiceImpl service= new SpeakerServiceImpl(getSpeakerRepository());
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }



}
