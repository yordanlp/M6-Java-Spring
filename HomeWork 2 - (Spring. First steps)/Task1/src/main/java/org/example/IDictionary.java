package org.example;

import org.springframework.stereotype.Component;

@Component
public interface IDictionary {
    public String loopUp( String word );
    public String getName();
}
