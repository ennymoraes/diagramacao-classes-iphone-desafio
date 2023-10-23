package aparelho;

public class Aparelho extends Funcionalidades {
  public static void main (String[] args) {
    boolean tocando=true;
    boolean atender=true;
  }
    public void aparelhoTocando() {
      tocando=true;
      System.out.printIn("PRIM PRIM Seu aparelho está tocando!");
    }
    public void atenderAparelho() {
      if (atender=true) {
        System.out.printIn("Você atendeu essa ligação...sinto muito!");
      } else {
        System.out.printIn("Whoops, você rejeitou alguém");
        System.out.printIn("Essa ligação foi redirecionada para o correio de voz. Bye!");
      }
    }
}