package goodbye.annotation;

//import com.example.singlemodule.service.SingleModuleConfiguration;
//import org.springframework.context.annotation.Import;

import goodbye.service.SecondServiceConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(SecondServiceConfiguration.class)
public @interface UseSecondService {



}
