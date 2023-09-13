package VendaProdutos;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos produtos deseja adicionar? ");
        int quantidadeProdutos = scanner.nextInt();

        List<Produto> listaDeProdutos = new ArrayList<>();

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Produto " + (i + 1));
            System.out.print("codigo: ");
            int codigo = scanner.nextInt();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("quantidade: ");
            int quantidade = scanner.nextInt();

            Produto produto = new Produto(codigo, nome, quantidade);
            listaDeProdutos.add(produto);
        }
        System.out.println("\nLista de produtos:");
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

        int opcao;
        do {
            System.out.println("\n1 - Remover Produto");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Código do produto que deseja excluir: ");
                    int excluir = scanner.nextInt();

                    List<Produto> produtosParaExcluir = new ArrayList<>();

                    for (Produto produto : listaDeProdutos) {
                        if (produto.getCodigo() == excluir) {
                            produtosParaExcluir.add(produto);
                        }
                    }

                    listaDeProdutos.removeAll(produtosParaExcluir);

                    System.out.println("\nProduto(s) removido(s).");
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);
        System.out.println("\nLista atualizada:");
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }
    }
}