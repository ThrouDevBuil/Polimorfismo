package br.com.guacom.oop.polimorfismo;

/*
Contrato Autenticavel
    Quem assina esse contrato precisa implementar
        Metodo setSenha
        Metodo autentica
*/

/*

           Classes interfaces

Ela tem um contrato onde quem assina se responsabiliza por
implementar esses métodos (cumprir o contrato).

Todos os métodos de uma interface são abstratos,
os de uma classe abstrata podem não ser.

Podemos estender apenas uma classe abstrata,
mas podemos implementar várias interfaces.

Temos polimorfismo quando uma classe extende de outra ou
também quando uma classe implementa uma interface.

O polimorfismo é a capacidade de um objeto ser referenciado por vários tipos.
 - Interfaces tem como pilar o polimorfismo.
 - Herança possui como pilar o polimorfismo e reutilização de código.
 -
*/
public interface Autenticavel {

    void setSenha(int senha);
    boolean autentica(int senha);
}


