package pkg;

/**
 * Created by jeffgoes on 6/13/16.
 */
public class userThread extends Thread{
    ContaBancaria C;

    public userThread(ContaBancaria c) {
        C = c;
    }

    public void run (){
        for (int i=0; i<5000; i++){
            C.Deposita(100);
        }

        System.out.println("Procedimento bank thread ocorreu com sucesso");

    }
}
