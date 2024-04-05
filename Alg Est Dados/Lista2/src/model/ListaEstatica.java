package model;

public class ListaEstatica<T> {

    private Object[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new Object[10];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    private void redimensionar() {
        Object[] novo = new Object[info.length + 10];

        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }

        info = novo;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(Object valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }

        return -1;
    }

    public void retirar(int valor) {
        int posicao = buscar(valor);

        if (posicao > -1) {
            for (int i = posicao + 1; i < tamanho; i++) {
                info[i - 1] = info[i];
            }

            tamanho--;
        }
    }

    public void liberar() {
        info = new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao >= 0 && (posicao < tamanho)) {
            return (T)info[posicao];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void inverter() {
        int esquerda = 0;
        int direita = tamanho - 1;

        int qtdTrocas = tamanho / 2;

        Object backup;

        while (qtdTrocas > 0) {
            backup = info[esquerda];
            info[esquerda] = info[direita];
            info[direita] = backup;

            esquerda++;
            direita--;

            qtdTrocas--;
        }
    }

    @Override
    public String toString() {
        String resultado = "";

        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                resultado += ",";
            }
            resultado += info[i].toString();
        }

        return resultado;
    }

    public void inserir(int posicao, T valor){
        if(posicao < 0 || posicao > tamanho + 1){
            throw new IndexOutOfBoundsException();
        }
        Object[] novo;
        if(tamanho == info.length){
            novo = new Object[info.length+10];
        }
        else{
            novo = new Object[info.length];
        }
        for(int i = 0; i< posicao; i ++){
            novo[i] = info[i];
        }
        novo[posicao] = valor;
        tamanho ++;
        for(int i = posicao; i < tamanho; i++){
            novo[posicao+1] = info[posicao];
        }
    }
    
}