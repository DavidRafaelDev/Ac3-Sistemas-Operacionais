/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.first.projeto.tela.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Desktop
 */
public class App {

    public static void main(String[] args) {
        int delay = 5000;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();
        Monitoramento mon = new Monitoramento();
        Conexao con = new Conexao();
        JdbcTemplate template = new JdbcTemplate(con.getBanco());
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                Date data = new Date();
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                String today = formatador.format(data);

                System.out.println("Hora de inserir dados");
                System.out.println(mon.getTemperatura());
                System.out.println(mon.getQtdProcessos().toString());

                template.update("INSERT INTO dados (ram,temperatura,processador,dataDado,fkUsuario) VALUES (?,?,?,?,?)",
                        "1000", mon.getTemperatura(), mon.getQtdProcessos().toString(), today, 1);

                System.out.println("Dados inseridos");
            }
        }, delay, interval);
    }
}
