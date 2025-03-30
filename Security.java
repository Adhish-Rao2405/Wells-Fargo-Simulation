package com.wellsfargo.task2.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private SecurityCategory category;

    @Column
    private LocalDate purchaseDate;

    @Column
    private double purchasePrice;

    @Column
    private int quantity;

    public Security() {}

    public Security(Portfolio portfolio, String name, SecurityCategory category,
                    LocalDate purchaseDate, double purchasePrice, int quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    // Getters and setters...
}