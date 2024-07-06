package designpatterns.factorymethod.demo.courses;

import designpatterns.factorymethod.demo.modules.*;

public class LLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ExerciseModule());
        modules.add(new ConceptModule());
    }
}

