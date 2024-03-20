public class Main {
    public static void main(String[] args) {
/**
 *
 * @param args
 */
            Carro carro = new Carro();
            carro.setCavalos(630);
            carro.setCor("Vermelho");
            carro.setModelo("maserati mc20");
            System.out.println(carro.getModelo());
            System.out.println(carro.getCor());
            System.out.println(carro.getCavalos());
    }
}