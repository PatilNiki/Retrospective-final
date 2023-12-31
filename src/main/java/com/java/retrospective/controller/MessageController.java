package com.java.retrospective.controller;

import java.util.List;

import com.java.retrospective.dto.message.MessageInDto;
import com.java.retrospective.dto.message.MessageOutDto;
import com.java.retrospective.services.MessageService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/retrospectives/{retro_id}/messages")
@AllArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @GetMapping
    public List<MessageOutDto> getMessages(@PathVariable Integer retro_id){
        return messageService.getAllMessages(retro_id);
    }

    @PostMapping
    public String addMessages(@PathVariable Integer retro_id, @RequestBody @Valid MessageInDto message){
        return "Added: "+messageService.addMessage(retro_id, message);
    }

    @DeleteMapping(value = "/{msg_id}")//?user={user_id}")
    public String deleteUserMessage(@PathVariable Integer retro_id, @PathVariable Integer msg_id, @RequestParam Integer user_id){
        return "Deleted: "+messageService.deleteMessage(retro_id, msg_id);
    }

    @PutMapping(value = "/{msg_id}")//}?user={user_id}")
    public MessageOutDto updateUserMessage(@PathVariable Integer retro_id, @PathVariable Integer msg_id, @RequestParam Integer user_id, @RequestBody String message){
        return messageService.updateMessage(retro_id, msg_id, message);
    }

}
