
package carrinho;

import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import produto.Produto;

public class CarrinhoTest {
    
    Carrinho carrinho = new Carrinho();
        
    Produto produto1 = new Produto("produto1", 10);
    Produto produto2 = new Produto("produto2", 5);
    Produto produto3 = new Produto("produto3", 2);
    
    @Before
    public void zeraCarrinhos(){ 
        carrinho = new Carrinho();
    }
    

    @Test
    public void testaGetValorTotal(){
        carrinho.addItem(produto1);
        carrinho.addItem(produto2);
        assertEquals(15.00, carrinho.getValorTotal(), 0);
    }
    
    @Test
    public void testaAddItem(){
        ArrayList lista = new ArrayList();
        lista.add(produto1);
        lista.add(produto2);
        carrinho.addItem(produto1);
        carrinho.addItem(produto2);
        
        assertArrayEquals(lista.toArray(), carrinho.getItems().toArray());
    }
    
    @Test
    public void testaRemoveItem(){
        ArrayList lista = new ArrayList();
        lista.add(produto1);
        carrinho.addItem(produto1);
        carrinho.addItem(produto2);
        
        try{
            carrinho.removeItem(produto2);
            assertArrayEquals(lista.toArray(), carrinho.getItems().toArray());
        }
        catch(Exception e){
            
        }
    }
    
    @Test
    public void testaQtdeItems(){
        carrinho.addItem(produto3);
        assertEquals(1, carrinho.getQtdeItems());
        carrinho.addItem(produto2);
        assertEquals(2, carrinho.getQtdeItems());
        carrinho.addItem(produto1);
        assertEquals(3, carrinho.getQtdeItems());
    }
    
    @Test
    public void testaEsvazia(){
        ArrayList vazio = new ArrayList();
        carrinho.esvazia();
        assertArrayEquals(vazio.toArray(), carrinho.getItems().toArray());
    }
}
