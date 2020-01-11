package me.jinyoung.springdemo.web;

import me.jinyoung.springdemo.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/first")
    public String first() {
        return "first";
    }

    @GetMapping("/first/dto")
    public HelloResponseDto firstDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
