package hexagonal.developer.pedido.dominio.exception;

//Lógica centrada en el Global
public class PedidoNotFoundException extends RuntimeException{
    public PedidoNotFoundException(Long id){
        super("No encontrado por id: " + id);
    }
}
