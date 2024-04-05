/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 * Comparator da classe municipio
 * @author evand
 */
public class MunicipioEstadoComparator implements Comparator<Municipio> {

    @Override
    public int compare(Municipio o1, Municipio o2) {
        // Compara o nome dos estados, usando o compareTO que já existe na classe String
        int retorno = o1.getEstado().compareTo(o2.getEstado());
        // Se o resutlado do compereTo for 0, isso significa que as Strings são iguais pela ordenação natural
        // nesse caso, um empate
        if (retorno == 0) {
            // Dai usamos o nome do municipio como critério de desempate
            return o1.getNome().compareTo(o2.getNome());
        }
        return retorno;
    }
    
}
