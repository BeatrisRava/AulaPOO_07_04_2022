//se inscrever no java copilot
import java.util.Random;
public class jogo {
 public static void main(String[] args) throws Exception {
    //CRIAR PERSONAGEM
       //Personagem p = new Personagem();
       //p.nome = "João";
       // p.cacar();
       // p.dormir();
       // p.comer();
      Personagem cacador = new Personagem();
      cacador.nome = "Caçador";
      Random gerador = new Random();

          //1: caçar
          //2: comer
          //3: dormir 

      while (true) {
          int oQueFazer = gerador.nextInt(3)+ 1;
          switch (oQueFazer) { 
              case 1:
              cacador.cacar();
                break;
              case 2:
              cacador.comer();
               break;
              case 3:
              cacador.dormir();
               break;

          }
          System.out.println("---------------------------------------");
          Thread.sleep(2000);
      }
        
    }
    
}
