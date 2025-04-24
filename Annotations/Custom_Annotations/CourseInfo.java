package Annotations.Custom_Annotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface CourseInfo {
    String courseName() default "Spring Boot";
    int duration() default 120;

}
