/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.first.projeto.tela.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Desktop
 */
public class App {
    public static void main(String[] args) {
         Monitoramento mon = new Monitoramento();       
            Conexao con = new Conexao();
            JdbcTemplate template = new JdbcTemplate(con.getBanco());
            
            Date data = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); 
            String today = formatador.format(data);    
                  

            
             System.out.println("Hora de inserir dados");
                System.out.println(mon.getTemperatura());
                System.out.println(mon.getQtdProcessos().toString());
             
            template.update("INSERT INTO dados (ram,temperatura,processador,dataDado,fkUsuario) VALUES (?,?,?,?,?)", 
                    "1000",mon.getTemperatura(),mon.getQtdProcessos().toString(),today,1);           
            
          System.out.println("Dados inseridos");
    }
}
