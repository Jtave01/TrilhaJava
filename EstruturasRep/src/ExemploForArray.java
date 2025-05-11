public class ExemploForArray {
    public static void main (String []args){
        //ARRAY
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        //x define a possição do aluno // length e respolsavel por saber qual e a possição do aluno
        for(int x=0; x < alunos.length; x++ ){

            System.out.println("O aluno no indice x=" + x + "é" + alunos [x]);
        }
    }
    
}
