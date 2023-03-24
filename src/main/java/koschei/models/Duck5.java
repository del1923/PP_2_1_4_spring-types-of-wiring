package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    private final Egg6 egg;
    @Autowired
    public Duck5(Egg6 egg) {
        this.egg = egg;
    }
    @Override
    public String toString() { return ", в утке яйцо " + egg.toString(); }
}
/*
    private final Rabbit4 rabbit;

    @Autowired
    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
 */