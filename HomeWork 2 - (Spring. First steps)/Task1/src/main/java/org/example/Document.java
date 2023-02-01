package org.example;

import org.springframework.stereotype.Component;

@Component
public class Document {

    private final ISpellChecker spellChecker;
    Document( ISpellChecker spellChecker ){
        this.spellChecker = spellChecker;
        System.out.println("Document is created");
    }

}
