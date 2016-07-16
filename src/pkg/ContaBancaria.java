package pkg;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by jeffgoes on 6/13/16.
 */
public class ContaBancaria{
    private int conta;
    private int ID;
    private int saldo;
    private String Nome;

    public ContaBancaria(int conta, int ID, int saldo, String nome) {
        this.conta = conta;
        this.ID = ID;
        this.saldo = saldo;
        Nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getName(){
        return Nome;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void Deposita (int n){
        int temp;
        temp = saldo + n;
        saldo = saldo + n;
        System.out.println("O seu valor temporario eh "+ temp);
    }

    public void Saca (int n){
        int temp;
        temp = saldo - n;
        saldo = saldo - n;
        System.out.println("O seu valor temporario eh "+ temp);
    }


}
