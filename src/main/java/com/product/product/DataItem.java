package com.product.product;

// import org.springframework.stereotype.Component;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

// public class DataItem {

//     private int number;
//     private String name;
//     private String status;

//     public DataItem(int number, String name, String status) {
//         this.name = name;
//         this.number = number;
//         this.status = status;
//     }

//     public int getNumber() {
//         return number;
//     }

//     public void setNumber(int number) {
//         this.number = number;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) { 
//         this.name = name;
//     }

//     public String getStatus() {
//         return status;
//     }

//     public void setStatus(String status) {
//         this.status = status;
//     }

// }

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DataItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;
    private String name;
    private String status;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
