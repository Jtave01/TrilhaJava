public class ForMaisAgradavel {
    public static void main (String []args){
        //ARRAY
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        //x define a possição do aluno // length e respolsavel por saber qual e a possição do aluno
        //for(int x=0; x < alunos.length; x++ ){

            //  System.out.println("O aluno no indice x=" + x + "é" + alunos [x]);
        //}
        //cria uma nova variavel 
        for(String aluno : alunos){
            System.out.println("O nome do aluno e: " + aluno);

        }
    }
    
}
