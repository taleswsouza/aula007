# Aula 007

## Prática

### Classes abstratas e concretas (item 7.14  na pág.129)

#### Introdução

A classe abstrata é um tipo especial de classe que NÃO PERMITE a criação de objetos (instâncias) a partir dela, ou seja,  
não se consegue usar o operador **```new```** nesta classe, com isso, não permite que sejam criados objetos; já uma classe concreta permite a criação de instâncias (o operador **```new```**).

```java
// Classe concreta
class ClasseConcreta { }
ClasseConcreta objetoInstancia = new ClasseConcreta();
...
// Classe abstrata
abstract class ClasseAbstrata { }
ClasseAbstrata objetoInstancia = new ClasseAbstrata();  // ERRO DE COMPILAÇÃO, por causa do uso do operador new.
```

#### Pontos importantes sobre o uso das classes abstratas

Apesar de não ser possível criar objetos a partir de uma classe abstrata, estas podem ser usadas em:

1. Herança com o uso de abstrações (este será o seu uso básico)

**Exemplo:**
```java
abstract class Animal { }
class Cachorro extends Animal { }
...
Cachorro cachorro = new Cachorro();
```

2. Criando e usando abstrações

**Exemplo:**
```java
abstract class Animal { }
class Cachorro extends Animal { }
class Cavalo extends Animal { }
...
Animal animal;
animal = new Cachorro();
animal = new Cavalo();
```

3. Criando métodos comuns às classes filhas

**Exemplo:**
```java
abstract class Animal {
	public void imprime() {
		System.out.println("Sou um animal!!");
	}
}
class Cachorro extends Animal { }
class Cavalo extends Animal { }
...
Animal animal;
animal = new Cachorro();
animal.imprime();
animal = new Cavalo();
animal.imprime();
```

4. Criando métodos ABSTRATOS que DEVERÃO ser implementados nas classes filhas

* Métodos abstratos não tem corpo, ou seja, não tem código (significa que termina com "**;**" após os parêntesis da função - ```abstract void func();```).
* Métodos abstratos não só podem existir em classes abstratas.
* Métodos abstratos em classes que não são abstratas (sem a palavra reservada ```abstract```) gera erro de compilação.

**Exemplo:**
```java
abstract class Animal {
	public abstract void imprime();
}
class Cachorro extends Animal { 
	public void imprime() {
		System.out.println("Sou um cachorro!!");
	}
}
class Cavalo extends Animal {
	public void imprime() {
		System.out.println("Sou um cavalo!!");
	}
}
...
Animal animal;
animal = new Cachorro();
animal.imprime();
animal = new Cavalo();
animal.imprime();
```

#### Classe Pessoa

Vamos ajustar as classes do exemplo do pacote ```com.aula.heranca.pessoa``` das aulas anteriores e ajustar a classe pessoa para abstrata.

#### Exercício com o exemplo do **livro** (parte final da página 130 até página 132)

Siga os procedimentos do livro, começando na parte final da página 130 (penúltimo parágrafo da página 130 - "Uma classe abstrata pode ser usada ...") até o início da página 132 (último parágrafo do item 7.14 na página 132 - "Como você viu, uma classe abstrata funciona como um modelo ...")

