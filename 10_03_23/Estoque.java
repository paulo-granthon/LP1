import java.util.List;
import java.util.ArrayList;
public class Estoque {
    private List<Produto> produtos;

    public void addProduto (Produto produto) {
        produtos.add(produto);
    }
    public List<Produto> buscaProdutoNome (String nome) {
        List<Produto> result = new ArrayList<Produto>();
        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).getName() == nome) { 
                result.add(this.produtos.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
		
	}
}