package pkg;

import java.util.Date;

/**
 * Created by jeffgoes on 6/13/16.
 */
public class main {
    public static void main (String args[]){
        long result, start, end;

        ContaBancaria Conta = new ContaBancaria(589678, 1234, 20000, "Jeff Julian Goes");
        Thread T1 = new userThread(Conta);
        Thread T2 = new bankThread(Conta);

        start = System.currentTimeMillis();
        T1.run();
        T2.run();

        end = System.currentTimeMillis();
        result = end - start;


        System.out.println("O saldo da conta de "+ Conta.getName()+ " é " + Conta.getSaldo()+" e o tempo de execução é: "+ result);

    }
}
