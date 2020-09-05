package com.zi;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4089774959576058932L;
    private int id;
    private String name;
    
}
