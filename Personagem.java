public class Personagem{
String nome;
int energia;
int fome;
int sono;

void caçar(){
    System.out.printf(nome + "caçando...\n");
}
    
void comer(){
     System.out.printf("%s comendo...\n", nome);
}

void dormir(){
    System.out.println(String.format(
        "%s dormindo...", nome));
}

}