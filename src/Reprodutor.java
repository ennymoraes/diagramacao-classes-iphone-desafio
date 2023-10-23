package reprodutor;

public class Reprodutor extends Funcionalidades{
  public class SelecionandoMusica {
    public static void main (String[] args) {
      System.out.printIn("Selecione a música desejada.")
    }
  }
  public class Reprodutor {
  boolean tocando=true;
  String musica="1";

    public void tocar(){
      tocando=true;
      System.out.printIn("A música está tocando!")
    }
    public void pausar(){
      tocando=false;
      System.out.printIn("A música está pausada!");
    }
  }
}