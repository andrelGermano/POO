package visao;

import java.util.Scanner;

import aplicacao.Aluno;
import aplicacao.Disciplina;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        int codigoDisciplina = 0;

        Disciplina disciplina = new Disciplina(codigoDisciplina);

        do {
            System.out.println("-------------- Menu --------------");
            System.out.println("1 - Inserir Disciplina"            );
            System.out.println("2 - Inserir Aluno"                 );
            System.out.println("3 - Consultar Aluno por Matrícula" );
            System.out.println("4 - Melhor Aluno da Disciplina"    );
            System.out.println("5 - Média da Disciplina"           );
            System.out.println("6 - Alterar Professor"             );
            System.out.println("7 - Sair"                          );
            System.out.println(" --------------------------------" );
            System.out.println("Escolha uma opção: "               );
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Informe o título da disciplina: ");
                    String tituloDisciplina = scanner.nextLine();
                    System.out.print("Informe a carga horária da disciplina: ");
                    int cargaHorariaDisciplina = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o nome do professor: ");
                    String nomeProfessor = scanner.nextLine();
                    disciplina.inserirDisciplina(tituloDisciplina, cargaHorariaDisciplina, nomeProfessor);
                    codigoDisciplina++;
                    disciplina = new Disciplina(codigoDisciplina);
                    break;
                case 2:
                    System.out.print("Informe a matrícula do aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Informe a nota 1 do aluno: ");
                    float nota1 = scanner.nextFloat();
                    System.out.print("Informe a nota 2 do aluno: ");
                    float nota2 = scanner.nextFloat();
                    System.out.print("Informe a nota do trabalho do aluno: ");
                    float notaTrabalho = scanner.nextFloat();
                    Aluno aluno = new Aluno(matricula, nomeAluno, nota1, nota2, notaTrabalho);
                    disciplina.inserirAluno(aluno);
                    break;
                case 3:
                    System.out.print("Informe a matrícula do aluno a ser consultado: ");
                    int matriculaConsulta = scanner.nextInt();
                    String infoAluno = disciplina.consultarAluno(matriculaConsulta);
                    if (infoAluno != null) {
                        System.out.println(infoAluno);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    String melhorAluno = disciplina.melhorAluno();
                    System.out.println("Melhor aluno da disciplina: " + melhorAluno);
                    break;
                case 5:
                    float mediaDisciplina = disciplina.media();
                    System.out.println("Média da disciplina: " + mediaDisciplina);
                    break;
                case 6:
                    System.out.print("Informe o novo nome do professor: ");
                    String novoNomeProfessor = scanner.nextLine();
                    disciplina.alterarProfessor(novoNomeProfessor);
                    break;
                case 7:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 7);

        scanner.close();
    }
}

