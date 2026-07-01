package coderarmy.in;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Lazy // after we annotate with @Lazy that means IOC Container will no longer handle the beans

// the control shifts back to the client
// after initialization callback phase the control shifts back to user and bean turns into object

public class CartService /*implements InitializingBean*/ {

    // Initializing bean is one of the functional interfaces which can be used to initialize the beans
    /*
    * we can initialize with values which needs to be done before calling any other methods
    * before calling any business logic it calls the callback methods first
    * Spring calls this callback method automatically  */

    Map<Integer,String> mp;

    public CartService(){
        mp=new HashMap<>();
        System.out.println("cart constructor is called");
    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("init bean");
//        mp.put(1,"Aditya");
//        mp.put(55,"Akhil");
//    }

    // instead of all the implementation of functional interfaces
    // we can use simple annotation to define our callback methods
    // spring will call those callback methods automatically before any other methods
    // Annotation @PostConstruct which alows us to define our own callback methods

    @PostConstruct // spring calls this automatically
    public void init(){
        System.out.println("init bean");
        mp.put(1,"Aditya");
        mp.put(55,"Akhil");
    }


    public void add(){
        System.out.println("Added to cart");
    }

    public String Getvalue(int key){
        return mp.get(key);
    }

    // we can also excecute the destroy phase of the bean lifecycle using @PreDestroy

    @PreDestroy
    public void stop(){
        mp.clear(); // before the bean is destroyed we can implement the relevant ops inside this
        System.out.println("Bean Destroyed");
    }
}
