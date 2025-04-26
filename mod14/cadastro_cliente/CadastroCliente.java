package mod14.cadastro_cliente;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        // Criar cliente
        Cliente cliente1 = new Cliente("Jonathan", 29);
        clientes.add(cliente1);

        // Listar clientes
        for (Cliente c : clientes) {
            System.out.println("Cliente: " + c.getNome() + ", Idade: " + c.getIdade());
        }

        // Atualizar cliente
        clientes.get(0).setNome("Jonathan Atualizado");

        // Deletar cliente
        clientes.remove(0);
    }
}
