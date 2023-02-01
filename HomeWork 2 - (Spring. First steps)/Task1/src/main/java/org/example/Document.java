package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Document {

    private final ISpellChecker spellChecker;
    @Autowired
    Document( ISpellChecker spellChecker ){
        this.spellChecker = spellChecker;
        System.out.println("Document is created");
    }

}
