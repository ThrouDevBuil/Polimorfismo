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
implementar esses m�todos (cumprir o contrato).

Todos os m�todos de uma interface s�o abstratos,
os de uma classe abstrata podem n�o ser.

Podemos estender apenas uma classe abstrata,
mas podemos implementar v�rias interfaces.

Temos polimorfismo quando uma classe extende de outra ou
tamb�m quando uma classe implementa uma interface.

O polimorfismo � a capacidade de um objeto ser referenciado por v�rios tipos.
 - Interfaces tem como pilar o polimorfismo.
 - Heran�a possui como pilar o polimorfismo e reutiliza��o de c�digo.
 -
*/
public interface Autenticavel {

    void setSenha(int senha);
    boolean autentica(int senha);
}


