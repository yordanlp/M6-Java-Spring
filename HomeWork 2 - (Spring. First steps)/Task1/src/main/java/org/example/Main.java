package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var document = context.getBean(Document.class);

        var spellChecker = context.getBean(SpellChecker.class);

        spellChecker.checkSpelling("bla bla bla");
    }
}