
package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();
        Funcionario p4 =new Funcionario();
        
        p1.setNome("pedro");
        p2.setNome("maria");
        p3.setNome("claudio");
        p4.setNome("fabiano");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p4.setSexo("M");
        p2.setIdade(18);
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("estoque");
        
        p3.ReceberAumento(550.20f);
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
                
        
      
    }
    
}
