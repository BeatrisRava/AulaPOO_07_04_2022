public class Personagem{
String nome;
int energia;
int fome;
int sono;

final static int LIMITE_SUPERIOR = 10;

void cacar(){
    //this é instancia e não existe no método estatico (static)
    if(this.energia >= 2){
  System.out.printf(nome + "caçando...\n");
  this.energia = this.energia - 2;
    }
    else{
        System.out.printf("Sem energia para caçar...");
    }
}
    
void comer(){
    if(this.fome >= 1){
        System.out.println(this.nome + "comendo...");
        this.fome = this.fome - 1;
        this.energia = this.energia + 1 <= 10 ? this.energia + 1 : this.energia;
    }   
    else{
        System.out.printf("%s sem fome para comer...\n", nome);
    }
    this.fome = Math.min (this.fome + 1, 10);
    this.sono = Math.min (this.sono + 1, 10);
}

void dormir(){
    if(this.sono >= 1){
        System.out.println(String.format(
            "%s dormindo...", this.nome));
            this.sono -= 1;
            this.energia = this.energia + 1 <= 10 ? this.energia + 1 : this.energia;
    }
    
}

}