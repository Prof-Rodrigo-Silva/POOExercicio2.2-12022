package classeexecutavel;

import model.Funcionario;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("João");
		funcionario.setSobrenome("Silva");
		funcionario.setValorHora(40);
		funcionario.setHorasTrabalhadas(40);
		
		funcionario.nomeCompleto();
		
		System.out.println("Salário: "+funcionario.calcularSalario());
		System.out.println(funcionario.incrementarHoras(4));
		System.out.println("Salário Novo: "+funcionario.calcularSalario());
		System.out.println(funcionario.getHorasTrabalhadas());

	}

}
