package designpatterns.factorymethod.demo.coursefactory;

import designpatterns.factorymethod.demo.courses.Course;
import designpatterns.factorymethod.demo.courses.HLD;
import designpatterns.factorymethod.demo.courses.LLD;

public class CourseFactory {
    public static Course getCourse(String courseType){
        switch (courseType) {
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default: return null;
        }
    }
}
