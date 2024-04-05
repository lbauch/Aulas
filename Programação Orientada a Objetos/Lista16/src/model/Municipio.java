/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author evand
 */
public class Municipio implements Comparable<Municipio>{

    private String codigoIBGE;
    private String nome;
    private String estado;
    private int populacao;

    public Municipio(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }
    
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Municipio) {
            Municipio outro = (Municipio) obj;
            
            return codigoIBGE.equals(outro.getCodigoIBGE());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigoIBGE);
        return hash;
    }

    @Override
    public int compareTo(Municipio o) {
        // Compara o nome dos municipios, usando o compareTO que já existe na classe String
        int retorno = nome.compareTo(o.getNome());
        // Se o resutlado do compereTo for 0, isso significa que as Strings são iguais pela ordenação natural
        // nesse caso, um empate
        if (retorno == 0) {
            // Dai usamos o estado como critério de desempate
            return estado.compareTo(o.getEstado());
        }
        return retorno;
    }
    
}
