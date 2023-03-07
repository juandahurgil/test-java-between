package com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model;


import com.between.testjavabetween.commerce.price.domain.*;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prices")
@Builder(setterPrefix = "with")
public class PriceEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price")
    private BigDecimal value;

    @Column(name = "curr")
    private String curr;

    @Column(name = "priority")
    private int priority;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    public static Price toPrice(PriceEntity priceEntity) {
        return Price.builder()
            .withId(new PriceId(priceEntity.id))
            .withBrand(Brand.builder().withId(new BrandId(priceEntity.brand.getId())).build())
            .withProduct(Product.builder().withId(new ProductId(priceEntity.product.getId())).build())
            .withCurr(priceEntity.curr)
            .withPriority(priceEntity.getPriority())
            .withValue(priceEntity.value)
            .withStartDate(priceEntity.startDate)
            .withEndDate(priceEntity.endDate)
            .build();
    }
}
