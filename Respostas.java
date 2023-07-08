//Questão 1:
package Att2;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = sc.nextLine();
		
		System.out.println("Qual é a sua idade?");
		int idade = sc.nextInt();
		
		System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
		
		sc.close();

	}

}

//Questão 2:
package Att;
public class Pessoa {
	//Atributos.
	String nome; 
	String cpf; 

  //Construtores.
  Pessoa(String nome, String cpf) {
      this.nome = nome;
      this.cpf = cpf;
  }
}

package Att;
class Aluno {
	//Atributos.
	Pessoa pessoa; 
	String tipo; 

  //Construtores.
  Aluno(Pessoa pessoa, String tipo) {
      this.pessoa = pessoa;
      this.tipo = tipo;
  }
}
package Att;
class Professor {
	//Atributos.
	Pessoa pessoa; 
	String tipo; 

  //Construtores.
  Professor(Pessoa pessoa, String tipo) {
      this.pessoa = pessoa;
      this.tipo = tipo;
  }
}

package Att;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();
        
        System.out.print("Digite o CPF da pessoa: ");
        String cpf = input.nextLine();
        
        Pessoa pessoa1 = new Pessoa(nome, cpf); //Instanciando um objeto Pessoa com as informações do usuário
        
        System.out.print("A pessoa é um aluno? (s/n): ");
        String resposta = input.nextLine();
        String tipo;
        if(resposta.equals("s")) {  //verifica se o conteúdo da variável resposta é igual a "s"
            tipo = "aluno";
        } else {
            tipo = "não aluno";
        } //Definindo o tipo de acordo com a resposta do usuário
        
        Aluno aluno1 = new Aluno(pessoa1, tipo); //Instanciando um objeto Aluno com as informações do usuário
        
        System.out.print("A pessoa é um professor? (s/n): ");
        resposta = input.nextLine();
        if(resposta.equals("s")) { //verifica se o conteúdo da variável resposta é igual a "s".
            tipo = "professor";
        } else {
            tipo = "não professor";
        } //Definindo o tipo de acordo com a resposta do usuário
        
        Professor professor1 = new Professor(pessoa1, tipo); //Instanciando um objeto Professor com as informações do usuário

        System.out.println(aluno1.pessoa.nome + " é " + aluno1.tipo); //Imprimindo informações do Aluno
        System.out.println(professor1.pessoa.nome + " é " + professor1.tipo); //Imprimindo informações do Professor
        
        input.close();
    }
}
