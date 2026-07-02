package hexagonal.developer.categoria.domain.exception;

import hexagonal.developer.shared.domain.exception.NotFoundException;

//Captura error del usuario
public class CategoriaNotFoundException extends NotFoundException {
    public CategoriaNotFoundException(Long id) {
        super("Categoria no encontrada con id: " + id);
    }


}