package com.example.navigationdrawer;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void insertUsuario(Usuario usuario);

    @Query("select *from usuarios")
    public List<Usuario> listarUsuarios();

    @Update
    public void updateUsuario(Usuario usuario);

    @Delete
    public void deletarUsuario(Usuario usuario);

}
