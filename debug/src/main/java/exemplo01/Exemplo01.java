package exemplo01;

public class Exemplo01 {

    public static void main(String[] args) {

        Alunos alunos = new Alunos();

        for (Aluno aluno : alunos.findAll())
            System.out.println(aluno.getMedia());

    }

}
