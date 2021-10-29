package com.malbino;

import com.malbino.util.ConectorBD;

import java.sql.Connection;

public class Main {
    public static void main(String[] args){
        Connection connection = ConectorBD.getConnection();
    }
}
