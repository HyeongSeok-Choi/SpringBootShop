package com.shop.dto;


import com.shop.entity.OrderItem;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemDto {

    public OrderItemDto(OrderItem orderItem, String imgUrl){

        this.itemNm=orderItem.getItem().getItemNm();
        this.imgUrl=imgUrl;
        this.orderPrice= orderItem.getOrderPrice();
        this.count  =  orderItem.getCount();

    }

    private String itemNm;

    private int count;

    private String imgUrl;

    private int orderPrice;


}
