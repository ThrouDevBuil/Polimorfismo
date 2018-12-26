package br.com.guacom.oop.polimorfismo;

/*
Uma classe abstrata representa um conceito, algo abstrato,
e o compilador não permite instanciar um objeto dessa classe.
Para instanciar é preciso criar primeiro uma classe filha não abstrata.

Sumarizando, quando temos que definir variáveis,
constantes, regras, e pequenas ações definidas devemos
usar classes abstratas. Mas, se formos apenas criar a forma
como objetos devem realizar determinadas ações (métodos)
devemos optar por interfaces.
As classes abstratas servem de base (template) para codificação de uma classe inteira,
diferentemente das interfaces que são apenas assinaturas dos métodos.
*/

public abstract class Funcionario {
    //O modificador de visibilidade Protected - É
    //Visível dentro da classe, pacote e também para as classes filhas
    protected String nome;
    protected float salario;

    //Code Smells - Mal cheiro no código

    public Funcionario(String Nome, float salaRio) {
        nome = Nome;
        salario = salaRio;
    }
    public Funcionario() {
    }

    /*
    Sobrecarga de construtores
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        nome = Nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salaRio) {
        salario = salaRio;
    }

    //Os métodos abstratos não possuem corpo (implementação),
    //apenas definem a assinatura (visibilidade, retorno, nome do método e parâmetros).
    public abstract double getBonificacao();

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalário  atual - R$" + salario;
    }
}