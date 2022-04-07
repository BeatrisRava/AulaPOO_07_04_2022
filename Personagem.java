public class Personagem{
String nome;
private int energia = 10;
private int fome = 0;
private int sono = 0;
final static int LIMITE_SUPERIOR = 10;

public Personagem(int energia, int fome, int sono) {
    if(energia >= 0 && energia <=10)
        this.energia = energia;
    if(fome >= 0 && fome <=10)
        this.fome = fome;
    if(sono >= 0 && sono <=10)
        this.sono = sono;
}

public Personagem(String nome, int energia, int fome, int sono) {
    this(energia,fome,sono);
    this.nome = nome;
    
}

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

void cacar(){
    //this é instancia e não existe no método estatico (static)
    if(this.energia >= 2){
  System.out.printf(nome + " está caçando...\n");
  this.energia = this.energia - 2;
    }
    else{
        System.out.printf("Sem energia para caçar...");
    }
}
    
void comer(){
    if(this.fome >= 1){
        System.out.println(nome + "está comendo...");
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
            " %s dormindo...", this.nome));
            this.sono -= 1;
            this.energia = this.energia + 1 <= 10 ? this.energia + 1 : this.energia;
    }

    else{
        System.out.printf("Sem sono para dormir...");
    }
        
}

}