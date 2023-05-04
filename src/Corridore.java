public class Corridore extends Thread{

    private String nome;

    public Corridore(String nome) {

        this.nome = nome;
    }

    @Override
    public void run() {

        for(int i = 0; i < 100; i++) {

            System.out.println(nome + " " + i);    
        }

        System.out.println(nome + " è arrivato");    

    }
    
}
