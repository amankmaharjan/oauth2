package com.example.CRUDDemo.controller;

import com.example.CRUDDemo.domain.OauthClient;
import com.example.CRUDDemo.services.OauthClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by aman on 7/7/17.
 */
@RestController
public class OauthClientController {
    @Autowired
    OauthClientService oauthClientService;

    @GetMapping("/client/")
    public ResponseEntity<?> display() {
        List<OauthClient> oauthClientList = oauthClientService.findAll();
        return new ResponseEntity<>(oauthClientList, HttpStatus.OK);
    }

    @PostMapping("/client/")
    public ResponseEntity<?> insert(@RequestBody OauthClient oauthClient) {
        oauthClientService.insert(oauthClient);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/client/{id}")
    public ResponseEntity<?> update(@RequestBody OauthClient oauthClient) {
        oauthClientService.update(oauthClient);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/client/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        oauthClientService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
