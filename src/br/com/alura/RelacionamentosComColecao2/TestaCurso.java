package br.com.alura.RelacionamentosComColecao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.collections.Aula;
import br.com.alura.collections.Curso;

public class TestaCurso {

  public static void main(String[] args) {

    Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

    javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
    javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
    javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

    List<Aula> aulas = javaColecoes.getAulas();
    System.out.println(aulas);

    List<Aula> aulasSort = new ArrayList<>(aulas);
    Collections.sort(aulasSort);

    System.out.println(aulasSort);

    System.out.println(javaColecoes);
  }
}
