package Annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//This class deals with custom annotations 

//Read Sir's documentation 

@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@Target(ElementType.METHOD) // Can be used on methods

public @interface Info {
    String name();
    double version() default 1.0;
}
