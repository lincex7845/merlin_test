package com.mera.bicis.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController()
public class BiciController {

    @Autowired
    private BiciRepository repository;

    @GetMapping(path = "/bici")
    public List<Bici> get(){
        return repository.findAll();
    }

    @GetMapping(path = "/bici/{id}")
    public ResponseEntity<Bici> getBiciById(@PathVariable("id") Long id){
        Optional<Bici> maybeB = repository.findById(id);
        if(maybeB.isPresent()){
            return ResponseEntity.ok(maybeB.get());
        }
        else{
            return new ResponseEntity<Bici>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> delete(Long id){
        Optional<Bici> maybeB = repository.findById(id);
        if(maybeB.isPresent()) {
            
            repository.deleteById(id);
            return ResponseEntity.ok("Deleted!");
        }
        else{
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }
}
