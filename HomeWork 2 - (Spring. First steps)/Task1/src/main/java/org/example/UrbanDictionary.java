package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class UrbanDictionary implements IDictionary {

    public final String NAME = "Urban Dictionary";

    @Override
    public String loopUp(String word) {
        return "bla bla bla";
    }

    @Override
    public String getName() {
        return this.NAME;
    }

}
