
package com.example.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")
public class MessageController {

    @Autowired
    private MessageRepository repository;

    @GetMapping
    public List<Message> getMessages() {
        return repository.findAll();
    }

    @PostMapping
    public Message postMessage(@RequestBody Message message) {
        return repository.save(message);
    }
}
