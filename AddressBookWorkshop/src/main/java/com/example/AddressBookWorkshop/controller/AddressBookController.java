package com.example.AddressBookWorkshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @GetMapping("/all")
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Fetching all addresses...");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable int id) {
        return ResponseEntity.ok("Fetching address with ID: " + id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody AddressBookController address) {
        return ResponseEntity.ok("Address added successfully.");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody AddressBookController address) {
        return ResponseEntity.ok("Address updated successfully.");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return ResponseEntity.ok("Address deleted successfully.");
    }
}
