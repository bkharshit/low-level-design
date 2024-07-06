package designpatterns.factorymethod.demo.client;

import designpatterns.factorymethod.demo.coursefactory.CourseFactory;
import designpatterns.factorymethod.demo.courses.Course;

public class Demo {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse != null;
        System.out.println("HLD Modules : ");
        System.out.println(hldCourse.getModules());
        System.out.println("LLD Modules : ");
        System.out.println(lldCourse.getModules());
    }
}
