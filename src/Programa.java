public class Programa {
    public static void main(String[] args) {
        pessoa_fisica pessoa = new pessoa_fisica();
        pessoa.setNome("Carlos Guilherme");
        pessoa.setIdade("28");
        pessoa.setCpf("08938405990");

        pessoa_juridica pessoaj = new pessoa_juridica();
        pessoaj.setNome("Gustavo");
        pessoaj.setIdade("27");
        pessoaj.setCnpj("18961896185961");

        System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade() + " Cpf: " + pessoa.getCpf());
        System.out.println("Nome: " + pessoaj.getNome() + " Idade: " + " Idade: " + pessoaj.getIdade() + " CNPJ: " + pessoaj.getCnpj());



    }



}
