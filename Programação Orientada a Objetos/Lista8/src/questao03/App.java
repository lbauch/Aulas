package questao03;

public class App {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("João");
        funcionario.setSalarioBase(1000);
        funcionario.setPorcentageDesconto(0.1);
        
        System.out.println("O salario do funcionario é: " + funcionario.calcularSalario());
        
        Administrador administrador = new Administrador("João");
        administrador.setSalarioBase(5000);
        administrador.setPorcentageDesconto(0.1);
        administrador.setAjudaCusto(1000);
        
        System.out.println("O salário do administrador é: " + administrador.calcularSalario());
        
        
    }
    
}
