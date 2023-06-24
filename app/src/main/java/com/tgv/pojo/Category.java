package com.tgv.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category implements Serializable{
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private int Id;
    private String name;
}
