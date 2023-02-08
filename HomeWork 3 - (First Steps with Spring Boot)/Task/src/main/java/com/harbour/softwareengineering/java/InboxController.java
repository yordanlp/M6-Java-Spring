package com.harbour.softwareengineering.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class InboxController {
    private final List<Item> Items = List.of(new Item(1, "Book", "Alice in Wonderland"), new Item(2, "Toothpaste", "Colgate"));
    @GetMapping("/inbox/items")
    public List<Item> items(){
        return  Items;
    }
    @GetMapping("/inbox/items/{id}")
    public Item item( @PathVariable("id")  int id ){
        var items = Items.stream().filter(item -> item.getId() == id).collect(Collectors.toList());
        if( items.size() > 0 )
            return items.stream().findFirst().get();
        return null;
    }
}
