package aluno;

public class alunoTestar {
    public static void main(String[] args) {
        aluno aluno1 = new aluno();
        aluno1.setNome("Fernando");
        aluno1.setIdade(25);

        System.out.println(aluno1.getIdade());
        System.out.println(aluno1.getNome());

    }

}
