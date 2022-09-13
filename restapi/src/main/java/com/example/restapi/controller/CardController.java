package com.example.restapi.controller;

import com.example.restapi.service.CardService;
import com.example.restapi.user.Card;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
@SecurityRequirement(name = "techgeeknext-api")
public class CardController {

    //Создаем экземпляр бина UserService c помощью аннотации @Autowired
    @Autowired
    CardService cardService;

    @GetMapping("/getcard/{id}")
    public Card getCard(@PathVariable Integer id) {
        cardService.getCard(id);
        return cardService.getCard(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCardById(@PathVariable Integer id) {
        return cardService.deleteCard(id);
    }

    @GetMapping("/getallcards")
    public List<Card> getAllCard() {
        return cardService.getAllCards();
    }

    @PostMapping("/postcard")
    public Card addCard(Card card) {
        return cardService.addCard(card);
    }

    @PutMapping("/putcard/{id}")
    public Card putCardById(@PathVariable Integer id, @RequestBody Card card) {
        return cardService.putCard(id, card);
    }

    @GetMapping("/sql")
    public List<Card> getListCard() {
        return cardService.getListCard();
    }
}
