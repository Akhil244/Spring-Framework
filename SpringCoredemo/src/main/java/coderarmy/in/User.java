package coderarmy.in;

// we cant use @Component on this because we didn't create or pass these fields to spring yet
// so we need to define it inside our config class
import org.springframework.stereotype.Component;

public class User {

    private String name;
    private int rno;

    public User(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public int getRno() {
        return rno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }
}
