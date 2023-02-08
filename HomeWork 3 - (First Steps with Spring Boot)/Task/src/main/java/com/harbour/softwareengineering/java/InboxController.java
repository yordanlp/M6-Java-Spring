package com.harbour.softwareengineering.java;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class InboxController {
    private final List<Item> Items = List.of(new Item(1, "Book", "Alice in Wonderland"), new Item(2, "Toothpaste", "Colgate"));
    @GetMapping("/inbox/items")
    public List<Item> items(){
        return  Items;
    }
    @PostMapping("/inbox/items/{id}")
    public ResponseEntity<Item> item(@PathVariable("id")  int id, @RequestBody ItemDTO body ){
        var items = Items.stream().filter(item -> item.getId() == id).collect(Collectors.toList());
        Item item = null;
        if( items.size() > 0 )
            item = items.stream().findFirst().get();
        if( item == null )
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        if( item.getId() != body.Id )
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        item.update(body);
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }
}
