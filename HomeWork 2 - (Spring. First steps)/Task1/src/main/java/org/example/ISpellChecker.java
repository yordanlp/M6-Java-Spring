package org.example;

import org.springframework.stereotype.Component;

@Component
public interface ISpellChecker {
    public boolean checkSpelling( String word );
}
