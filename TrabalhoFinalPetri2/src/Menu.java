import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimples listaSimples = new ListaSimples();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir Elemento");
            System.out.println("2. Inserir Elemento em Índice");
            System.out.println("3. Inserir Sequência de Elementos");
            System.out.println("4. Remover Último Elemento");
            System.out.println("5. Remover Elemento por Índice");
            System.out.println("6. Remover Sequência de Elementos");
            System.out.println("7. Remover Todas as Ocorrências de um Elemento");
            System.out.println("8. Verificar se a Lista está Vazia");
            System.out.println("9. Buscar Elemento");
            System.out.println("10. Ordenar Crescente");
            System.out.println("11. Ordenar Decrescente");
            System.out.println("12. Editar Elemento");
            System.out.println("13. Exibir Lista");
            System.out.println("14. Limpar Lista");
            System.out.println("15. Obter Primeiro Elemento");
            System.out.println("16. Obter Último Elemento");
            System.out.println("17. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento para inserir: ");
                    Object elemento = scanner.nextLine();
                    listaSimples.inserirElemento(elemento);
                    break;

                case 2:
                    System.out.print("Digite o índice: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o elemento para inserir no índice " + indice + ": ");
                    Object elementoIndice = scanner.nextLine();
                    listaSimples.inserirElementoIndice(elementoIndice, indice);
                    break;

                case 3:
                    System.out.print("Digite os elementos (separados por vírgula): ");
                    String[] elementos = scanner.nextLine().split(",");
                    ArrayList<Object> listaSequencia = new ArrayList<>();
                    for (String elem : elementos) {
                        listaSequencia.add(elem.trim());
                    }
                    listaSimples.inserirSequencia(listaSequencia);
                    break;

                case 4:
                    listaSimples.removerElemento();
                    System.out.println("Último elemento removido.");
                    break;

                case 5:
                    System.out.print("Digite o índice para remover: ");
                    int indiceRemover = scanner.nextInt();
                    scanner.nextLine();
                    Object removido = listaSimples.removerIndice(indiceRemover);
                    if (removido != null) {
                        System.out.println("Elemento removido: " + removido);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 6:
                    System.out.print("Digite os elementos para remover (separados por vírgula): ");
                    String[] elementosRemover = scanner.nextLine().split(",");
                    ArrayList<Object> listaRemover = new ArrayList<>();
                    for (String elem : elementosRemover) {
                        listaRemover.add(elem.trim());
                    }
                    listaSimples.removerSequencia(listaRemover);
                    break;

                case 7:
                    System.out.print("Digite o elemento para remover todas as ocorrências: ");
                    Object elementoRemover = scanner.nextLine();
                    listaSimples.removerTodasOcorrencias(elementoRemover);
                    break;

                case 8:
                    if (listaSimples.estaVazia()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("A lista não está vazia.");
                    }
                    break;

                case 9:
                    System.out.print("Digite o elemento para buscar: ");
                    Object elementoBuscar = scanner.nextLine();
                    if (listaSimples.buscarElemento(elementoBuscar)) {
                        System.out.println("Elemento encontrado.");
                    } else {
                        System.out.println("Elemento não encontrado.");
                    }
                    break;

                case 10:
                    listaSimples.ordenarCrescente();
                    System.out.println("Lista ordenada de forma crescente.");
                    break;

                case 11:
                    listaSimples.ordenarDecrescente();
                    System.out.println("Lista ordenada de forma decrescente.");
                    break;

                case 12:
                    System.out.print("Digite o elemento antigo: ");
                    Object elementoAntigo = scanner.nextLine();
                    System.out.print("Digite o novo elemento: ");
                    Object elementoNovo = scanner.nextLine();
                    listaSimples.editarElemento(elementoAntigo, elementoNovo);
                    System.out.println("Elemento editado.");
                    break;

                case 13:
                    listaSimples.exibir();
                    break;

                case 14:
                    listaSimples.limpar();
                    System.out.println("Lista limpa.");
                    break;

                case 15:
                    Object primeiro = listaSimples.obterPrimeiroElemento();
                    System.out.println("Primeiro elemento: " + (primeiro != null ? primeiro : "Lista vazia"));
                    break;

                case 16:
                    Object ultimo = listaSimples.obterUltimoElemento();
                    System.out.println("Último elemento: " + (ultimo != null ? ultimo : "Lista vazia"));
                    break;

                case 17:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
