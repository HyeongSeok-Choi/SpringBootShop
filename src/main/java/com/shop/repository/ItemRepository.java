package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ItemRepository extends JpaRepository<Item,Long> {

    List<Item> findByItemNm(String itemNm);
    List<Item> findByPrice(int itemPrice);

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);



}