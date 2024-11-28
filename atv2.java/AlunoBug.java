

public class AlunoBug {
    //Atributos
    private int matricula;  // número da matricula
    private String nome;  // nome do aluno
    private int idade; // idade do aluno
    private double nota1;  // primeira nota
    private double nota2;  // segunda nota
    private double media;  // média das notas

    //Construtor
    public AlunoBug (int matricula, String nome, int idade, double nota1, double nota2){
        this.matricula =matricula;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = calcularMedia(); //
    }

    //Método para calcular a média
    public double calcularMedia() {
        return nota1 + nota2 / 2; //
    }

    //Método para exibir informações do aluno
    public void exibirInfo(){
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade" + idade);
        System.out.println("Média: " + media); //
    }
  
    //Getters e Setters
    public int getMatricula(){
        return matricula;
    }

    public void setMatricula( int matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("Matrícula deve ser maior que zero."); //
        }
        this.matricula = matricula;
    }

    public String getNome(){
    return nome;
}

public void setNome (String nome){
    if (nome.length() < 3 ) {
        System.out.println("Nome muito curto."); //
    }
    this.nome = nome;
}

public double getNota1(){
    return nota1;
}

public void setNota1(double nota1) {
    if (nota1 < 0 || nota2 > 10) {
        throw new IllegalArgumentException("Nota 1 deve estar entre 0 e 10"); //
    }
    this.nota1 = nota1;
}

public double getNota2() {
    return nota2;
}

public void setNota2(double nota2) {
    if (nota2 < 0 || nota2 > 10) {
        throw new IllegalArgumentException("Nota 2 deve estar entre 0 e 10"); //
    }
    this.nota2 = nota2;
}

public double getMedia(){
    return media; //
}
}

//Classe Abstrata
//Uma classe abstrata é uma classe que não pode ser instanciada diretamente. Ela serve como uma base para outras classes, 
//fornecendo um modelo ou um esqueleto de funcionalidades comuns. 

// EX: 

// Classe Concreta
//Uma classe concreta é uma classe que pode ser instanciada diretamente. Ela contém a implementação completa dos métodos e pode 
//ser usada para criar objetos.

//EX

// Interfaces - é um tipo especial de classe que define um conjunto de métodos que uma classe deve implementar. Ela não contém implementação
// para os métodos, apenas suas assinaturas (nome do método, parâmetros e tipo de retorno). Uma interface define o que uma classe deve fazer, mas 
//não como fazer. Ou seja, ela define um contrato que as classes implementadoras devem seguir.

// EX:

//Construtor é um método especial de uma classe que é chamado automaticamente quando um objeto dessa classe é criado. O objetivo principal de um 
//construtor é iniciar os valores dos atributos do objeto ou realizar outras operações iniciais quando o objeto é instanciado.

//EX:


//Agregação é um conceito de associação entre classes onde um objeto de uma classe pode contêiner ou referenciar objetos de outra classe. É um tipo de
// relacionamento "tem um" que indica que uma classe contém ou usa objetos de outra classe, mas sem que haja dependência de vida entre elas.

// composição é um conceito fundamental da Programação Orientada a Objetos (POO) que se refere à prática de construir classes a partir de outras classes.
// Em vez de herdar comportamentos diretamente (como ocorre na herança), a composição permite criar objetos mais complexos combinando objetos de outras classes 
//dentro de uma classe maior. 

//s modificadores de acesso (ou access modifiers) são palavras-chave usadas para definir a visibilidade e o alcance de classes, métodos, atributos e construtores.
// Eles controlam o nível de acesso aos componentes de uma classe, estabelecendo limites sobre quais partes do código podem interagir com eles.

//public
//private
//protected

// sobrecarga ocorre quando uma classe possui múltiplos métodos com o mesmo nome, mas com diferentes assinaturas (parâmetros). Ela permite que um método seja chamado 
//com diferentes números ou tipos de argumentos.

//sobrescrita ocorre quando uma subclasse redefine um método que já está definido na superclasse (classe pai). É usada para implementar o polimorfismo, permitindo que 
//uma subclasse forneça sua própria implementação de um método herdado.