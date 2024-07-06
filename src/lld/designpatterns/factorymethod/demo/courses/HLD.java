package designpatterns.factorymethod.demo.courses;

import designpatterns.factorymethod.demo.modules.DemoModule;
import designpatterns.factorymethod.demo.modules.IntroModule;
import designpatterns.factorymethod.demo.modules.SummaryModule;

public class HLD extends Course{

    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new SummaryModule());
    }
}
