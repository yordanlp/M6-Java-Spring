package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpellChecker implements ISpellChecker {

    private final IDictionary dictionary;
    @Autowired
    SpellChecker( IDictionary dictionary ){
        this.dictionary = dictionary;
    }
    @Override
    public boolean checkSpelling(String word) {
        System.out.println("Spell checking was done using " + this.dictionary.getName());
        return false;
    }
}
