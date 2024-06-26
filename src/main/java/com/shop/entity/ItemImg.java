package com.shop.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="item_img")
@Getter
@Setter
public class ItemImg extends BaseEntity{

    @Id
    @Column(name="item_img_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imgName;

    private String oriImageName;

    private String imgUrl;

    private String repimgYn;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    public void updateItemImg(String oriImageName, String imgName, String imgUrl){
        System.out.println(imgName+"이거");
        System.out.println(oriImageName+"이거");
        System.out.println(imgUrl+"이거");
        this.oriImageName = oriImageName;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }

}
