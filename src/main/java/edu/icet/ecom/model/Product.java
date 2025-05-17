package edu.icet.ecom.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {
    private String name;
    private String price;
    private String description;
}
