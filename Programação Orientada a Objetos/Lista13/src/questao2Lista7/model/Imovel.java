package questao2Lista7.model;

/**
 *
 * @author evand
 */
public class Imovel {
    
    private String endereco;
    private int area;
    
    private Finalidade finalidade;
    private Bairro bairro;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Área não pode ser negativa");
        }
        this.area = area;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    public double calcularIptu() {
        if (getArea() <= 0
                || getBairro() == null || getBairro().getCoeficienteIptu() < 0
                || getFinalidade() == null) {
            throw new IllegalArgumentException("Falta dados para calcular o IPTU");
        }
        
        double valorIptu = 0;
        
        if (getFinalidade() == Finalidade.RESIDENCIAL) {
            valorIptu = getArea();
        } else if (getFinalidade() == Finalidade.COMERCIAL) {
            if (getArea() <= 100) {
                valorIptu = 500;
            } else if (getArea() <= 400) {
                valorIptu = 1000;
            } else {
                valorIptu = getArea() * 2.55;
            }
        } else if (getFinalidade() == Finalidade.INDUSTRIAL) {
            if (getArea() <= 2000) {
                valorIptu = 1000;
            } else {
                valorIptu = getArea() * 0.55;
            }
        } else {
            throw new IllegalArgumentException("Finalidade desconhecida");
        }
        
        return valorIptu * getBairro().getCoeficienteIptu();
    }
    
}
