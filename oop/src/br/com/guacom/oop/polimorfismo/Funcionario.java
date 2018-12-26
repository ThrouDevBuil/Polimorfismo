package br.com.guacom.oop.polimorfismo;

/*
Uma classe abstrata representa um conceito, algo abstrato,
e o compilador n�o permite instanciar um objeto dessa classe.
Para instanciar � preciso criar primeiro uma classe filha n�o abstrata.

Sumarizando, quando temos que definir vari�veis,
constantes, regras, e pequenas a��es definidas devemos
usar classes abstratas. Mas, se formos apenas criar a forma
como objetos devem realizar determinadas a��es (m�todos)
devemos optar por interfaces.
As classes abstratas servem de base (template) para codifica��o de uma classe inteira,
diferentemente das interfaces que s�o apenas assinaturas dos m�todos.
*/

public abstract class Funcionario {
    //O modificador de visibilidade Protected - �
    //Vis�vel dentro da classe, pacote e tamb�m para as classes filhas
    protected String nome;
    protected float salario;

    //Code Smells - Mal cheiro no c�digo

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

    //Os m�todos abstratos n�o possuem corpo (implementa��o),
    //apenas definem a assinatura (visibilidade, retorno, nome do m�todo e par�metros).
    public abstract double getBonificacao();

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSal�rio  atual - R$" + salario;
    }
}