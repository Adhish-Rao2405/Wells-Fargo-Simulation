package com.wellsfargo.task2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class SecurityCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(nullable = false, unique = true)
    private String category;

    @OneToMany(mappedBy = "category")
    private List<Security> securities;

    public SecurityCategory() {}

    public SecurityCategory(String category) {
        this.category = category;
    }

    // Getters and setters...
}