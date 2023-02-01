package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OxfordDictionary implements IDictionary{

    public final String NAME = "Oxford Dictionary";
    public String lookUp(String word) {
        return word;
    }

    @Override
    public String getName() {
        return this.NAME;
    }

}
