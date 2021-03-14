package com.kafka.understanding.kafkapubsub.resources;

import com.kafka.understanding.kafkapubsub.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class TopicMessage {
   @Autowired
    KafkaTemplate kafkaTemplate;
   public UserModel user;

   @PostMapping(value = "/publish/",consumes = "application/json",produces =  "application/json")
   public String sendMessage(@RequestBody UserModel user){
       kafkaTemplate.send("test",user);
       return "message published:"+user;
   }
}
