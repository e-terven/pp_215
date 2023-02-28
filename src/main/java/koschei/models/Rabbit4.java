package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 duck;
    @Autowired
    public void setDuck(Duck5 duck) {    // через сеттер 2
        this.duck = duck;
    }  //сеттер 2

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
