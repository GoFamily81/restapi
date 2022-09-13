package com.example.restapi.repository;

import com.example.restapi.user.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

    Card getById(Integer id);

    @Query(value = "SELECT c from Card c where c.id > 3 ")
    List<Card> getListCard();

    @Query(value = "SELECT c from Card c where c.id between 2 and 4")
    List<Card> getListCardBetween();
}
