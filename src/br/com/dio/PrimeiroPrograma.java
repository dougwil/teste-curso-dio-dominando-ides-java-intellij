package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro = new Livro("O problema dos três corpos", numPaginas 300);
        System.out.println(livro1);
        //        int a = 5;
//        int b = 3;
//        System.out.println("Hello World! " + (a+b));

    }

    class Livro {
        private String nome;
        private Indeger numPaginas;

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Livro(String nome) {
            this.nome = nome;
        }
    }

}
