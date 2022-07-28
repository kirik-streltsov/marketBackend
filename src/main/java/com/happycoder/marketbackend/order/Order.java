package com.happycoder.marketbackend.order;


import javax.persistence.*;

@Entity
@Table
public class Order {

    @Id
    @SequenceGenerator(
            name = "order_id_sequence_generator",
            sequenceName = "order_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "order_id_sequence_generator",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column(
            name = "product_name",
            nullable = false
    )
    private String productName;

    @Column(
            name = "quantity",
            nullable = false
    )
    private int quantity;

    @Column(
            name = "comment"
    )
    private String comment;

    public Order() {}

    public Order(String productName, int quantity, String comment) {
        this.productName = productName;
        this.quantity = quantity;
        this.comment = comment;
    }

}
