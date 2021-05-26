package br.com.first.projeto.tela.java;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexao {
    private BasicDataSource banco;
    
    public Conexao() {
        this.banco = new BasicDataSource();
        banco.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        banco.setUrl("jdbc:sqlserver://omnitrx.database.windows.net;" +
                    "databaseName=omnitrx;");  
        banco.setUsername("omnitrx");
        banco.setPassword("#Gfgrupo6");
    }

    public BasicDataSource getBanco() {
        return banco;
    }
}
