package pkg;

/**
 * Created by jeffgoes on 6/13/16.
 */
public class bankThread extends Thread{
    ContaBancaria C;

    public bankThread(ContaBancaria c) {
        C = c;
    }

    public void run (){
        for (int i=0; i<5000; i++){
            C.Saca(50);
        }
        System.out.println("Procedimento bank thread ocorreu com sucesso");
    }
}
