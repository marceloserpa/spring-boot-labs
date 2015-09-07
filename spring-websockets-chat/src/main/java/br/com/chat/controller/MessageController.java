
package br.com.chat.controller;

import br.com.chat.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public Message sendMessageForAllUsers(Message message){
        System.out.println("Message: " + message);
        return message;
    }
    
}
