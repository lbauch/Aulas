package questao03;

public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome) {
        // Exemplo de uma forma de fazer validação quando o set não for final
        validarValorString(nome);
        this.nome = nome;
    }
    
    protected final void validarValorString(String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("Valor do campo invalido");
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarValorString(nome);
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        validarValorString(endereco);
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        validarValorString(telefone);
        this.telefone = telefone;
    }
    
}
