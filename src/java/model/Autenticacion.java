/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

public class Autenticacion {

    public static  boolean autenticar(String login, String password) {
        boolean autenticado=true;
        try {

            ModeloConexion.conectarse(login, password);
            autenticado=true;
            System.out.println("malo");
        }catch (Exception e) {
            autenticado = false;
        }
        return autenticado;
    }

}
