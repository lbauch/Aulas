/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01.model;

/**
 *
 * @author evand
 */
public class Municipio {

    private String codigoIBGE;
    private String nome;
    private String estado;
    private int populacao;

    public Municipio(String codigoIBGE, String nome, String estado, int populacao) {
        setCodigoIBGE(codigoIBGE);
        setNome(nome);
        setEstado(estado);
        setPopulacao(populacao);
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return nome + " ( " + codigoIBGE + " , " + estado 
                + ") Populacao: " + populacao; 
    }
    
    

}
