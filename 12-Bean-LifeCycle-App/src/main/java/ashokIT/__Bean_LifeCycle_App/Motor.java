package ashokIT.__Bean_LifeCycle_App;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean , DisposableBean {
    public Motor() {
        System.out.println("Motor :: 0-param constructor");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterpropertiesSet() method called......");
    }
    public void destroy() throws Exception {
        System.out.println("destroy() method called......");
    }


}
