public class PrimeiraClasse extends Pessoa {
    public static void main(String[] args){
        /**
         * Você pode <b>Gerar</b> alguma <i>LIST</i> neste comentário
         * <ol>
         *     <li>elemento 1</li>
         *     <li>elemento 2</li>
         *     <li>elemento 3</li>
         * </ol>
         * <br/>
         * @see <a>l1nq.com/arneylink</a>
         */
        Cliente cliente = new Cliente();
        cliente.setNome("Mário");
        cliente.cadastrarEndereco("Rua: CSL Ramalho");
        System.out.println("Nome: "+ cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
    }
}
