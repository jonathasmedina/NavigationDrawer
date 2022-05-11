package com.example.navigationdrawer;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "usuarios")
public class Usuario {

    @PrimaryKey
    private int id;

    private String nome;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
