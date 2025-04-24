package Annotations.Custom_Annotations;

public class CourseDriver {
    public static void main(String[] args) {
        Course course = new Course();
        course.display();

        Class<?> cls = course.getClass();
        CourseInfo info = cls.getAnnotation(CourseInfo.class);
        System.out.println(info.courseName());
        System.out.println(info.duration());
        
    }
}
