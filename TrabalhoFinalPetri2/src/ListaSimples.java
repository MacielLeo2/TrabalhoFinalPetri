import java.util.ArrayList;
import java.util.Collections;

public class ListaSimples implements IEstruturaSimples {

    private ArrayList<Object> lista;

    public ListaSimples() {
        lista = new ArrayList<>();
    }

    @Override
    public void inserirElemento(Object elemento) {
        lista.add(elemento);
    }

    @Override
    public void inserirElementoIndice(Object elemento, int indice) {
        if (indice >= 0 && indice <= lista.size()) {
            lista.add(indice, elemento);
        }
    }

    @Override
    public void inserirSequencia(Object elementos) {
        if (elementos instanceof ArrayList<?>) {
            lista.addAll((ArrayList<?>) elementos);
        }
    }

    @Override
    public boolean removerElemento() {
        if (!lista.isEmpty()) {
            lista.remove(lista.size() - 1);
            return true;
        }
        return false;
    }

    @Override
    public Object removerIndice(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            return lista.remove(indice);
        }
        return null;
    }

    @Override
    public void removerSequencia(Object elementos) {
        if (elementos instanceof ArrayList<?>) {
            lista.removeAll((ArrayList<?>) elementos);
        }
    }

    @Override
    public void removerTodasOcorrencias(Object elemento) {
        lista.removeIf(item -> item.equals(elemento));
    }

    @Override
    public boolean estaCheia() {
        return false;
    }

    @Override
    public boolean estaVazia() {
        return lista.isEmpty();
    }

    @Override
    public boolean buscarElemento(Object elemento) {
        return lista.contains(elemento);
    }

    @Override
    public Object buscarElementoIndice(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            return lista.get(indice);
        }
        return null;
    }

    @Override
    public void ordenarCrescente() {
        Collections.sort(lista, (a, b) -> ((Comparable) a).compareTo(b));
    }

    @Override
    public void ordenarDecrescente() {
        Collections.sort(lista, (a, b) -> ((Comparable) b).compareTo(a));
    }

    @Override
    public int quantidadeElementos() {
        return lista.size();
    }

    @Override
    public void dobrarCapacidade() {

    }

    @Override
    public void editarElemento(Object elementoAntigo, Object elementoNovo) {
        int index = lista.indexOf(elementoAntigo);
        if (index != -1) {
            lista.set(index, elementoNovo);
        }
    }

    @Override
    public void limpar() {
        lista.clear();
    }

    @Override
    public void exibir() {
        System.out.println(lista);
    }

    @Override
    public Object obterPrimeiroElemento() {
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }

    @Override
    public Object obterUltimoElemento() {
        if (!lista.isEmpty()) {
            return lista.get(lista.size() - 1);
        }
        return null;
    }
}
