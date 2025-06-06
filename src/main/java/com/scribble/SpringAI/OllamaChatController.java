package com.scribble.SpringAI;


import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaChatController {

    OllamaChatModel chatModel;

    public OllamaChatController(OllamaChatModel chatModel){
        this.chatModel=chatModel;
    }

    @PostMapping("/chat")
    public ResponseEntity<String> chatBot(@RequestBody String userQuery){

        String response=chatModel.call(userQuery);
        return ResponseEntity.ok(response);
    }
}
