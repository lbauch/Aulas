package view;

import model.Empresa;
import model.Funcionario;
import model.Programador;
import model.Venda;
import model.Vendedor;

/**
 *
 * @author evand
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Minha Empresa");
        
        Vendedor v1 = new Vendedor("Luiz", 1000, 10);
        v1.incluirVenda(new Venda(200));
        v1.incluirVenda(new Venda(100));
        
        Vendedor v2 = new Vendedor("Paula", 1200, 7);
        v2.incluirVenda(new Venda(500));
        v2.incluirVenda(new Venda(350));
        v2.incluirVenda(new Venda(280));
        
        empresa.incluirFuncionario(v1);
        empresa.incluirFuncionario(v2);
        
        Programador p1 = new Programador("Julio", 1000);
        p1.incluirLinguagem("C");
        p1.incluirLinguagem("Java");
        
        empresa.incluirFuncionario(p1);
        
        Programador p2 = new Programador("Ana", 1000);
        p2.incluirLinguagem("Java");
        p2.incluirLinguagem("C#");
        
        empresa.incluirFuncionario(p2);
        
        Programador p3 = new Programador("Anderson", 1200);
        p3.incluirLinguagem("Phyton");
        
        empresa.incluirFuncionario(p3);
        
        empresa.incluirFuncionario(new Funcionario("José", 1000));
        empresa.incluirFuncionario(new Funcionario("Maria", 1400));
        
        System.out.println("Custo total de Salários: " 
                + empresa.calcularCustosSalarios());
        
        System.out.println("Listagem de funcionarios");
        for (Funcionario funcionario : empresa.getFuncionarios()) {
            System.out.println(funcionario);
        }
        
        System.out.println("Listagem de vendedores");
        for (Funcionario funcionario : empresa.getFuncionarios()) {
            if(funcionario instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) funcionario;
                System.out.println("Nome " + funcionario.getNome() 
                        + " Comissão: " + vendedor.getPercentualComissao());
            }
        }
        
        System.out.println("Listagem de programadores");
        for (Funcionario funcionario : empresa.getFuncionarios()) {
            if(funcionario instanceof Programador) {
                System.out.println("Nome " + funcionario.getNome() 
                        + " Linguagens: " + ((Programador) funcionario).getLinguagens());
            }
        }
        
    }
    
    
}
