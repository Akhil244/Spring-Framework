package coderarmy.in;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public UserService(){
        System.out.println("User service constructor called");
    }

    // we are implementing aware interface by overriding one of the methods of aware interfaces
//    @Override
//    public void setBeanName(String name) {
//        System.out.println("Bean name is"+name);
//    }


}
