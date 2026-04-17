import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double preco = sc.nextDouble();
        int estoque = sc.nextInt();
        int qtdVendida = sc.nextInt();

        Produto p = new Produto(nome, preco, estoque);

        System.out.println("Produto: " + p.nome);
        System.out.printf(Locale.US, "Preço: R$ %.2f\n", p.preco);
        System.out.println("Estoque antes da venda: " + p.estoque + " unidades");

        if (qtdVendida > p.estoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            System.out.println("Venda realizada: " + qtdVendida + " unidades");
            p.estoque = p.estoque - qtdVendida;
            System.out.println("Estoque atualizado: " + p.estoque + " unidades");
        }

        sc.close();
    }
}