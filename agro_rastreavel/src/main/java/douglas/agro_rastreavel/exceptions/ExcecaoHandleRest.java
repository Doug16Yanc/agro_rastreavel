package douglas.agro_rastreavel.exceptions;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

@RestControllerAdvice
public class ExcecaoHandleRest {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<DetalhesExceções> handleValidException(MethodArgumentNotValidException ex) {
        Map<String, String> erros = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((org.springframework.validation.FieldError) error).getField();
            String messageError = error.getDefaultMessage();
            erros.put(fieldName, messageError);
        });
        DetalhesExceções detalhesExcecoes = new DetalhesExceções(erros);
        return new ResponseEntity<>(detalhesExcecoes, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<DetalhesExceções> handleValidException(DataAccessException ex){
        Map<String, String> detalhes = new HashMap<>();
        detalhes.put(ex.getCause().toString(), ex.getMessage());
        DetalhesExceções detalhesExceções = new DetalhesExceções(
                "Bad request! Consult the documentation, please.\n",
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                ex.getClass().toString(),
                detalhes
        );
        return ResponseEntity.status(HttpStatus.CONFLICT).body(detalhesExceções);
    }
    @ExceptionHandler(ExcecaoNegocio.class)
    public ResponseEntity<DetalhesExceções> handleBusinessException(ExcecaoNegocio ex){
        DetalhesExceções detalhesExceções = new DetalhesExceções(
                "Bad request! Consult the documentation, please.",
                 LocalDateTime.now(),
                 HttpStatus.BAD_REQUEST.value(),
                ex.getClass().toString(),
                Collections.singletonMap(ex.getCause().toString(), ex.getMessage())
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(detalhesExceções);
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<DetalhesExceções> handleValidException(IllegalArgumentException ex){
        DetalhesExceções detalhesExceções = new DetalhesExceções(
                "Bad request! Consult the documentation, please.",
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                ex.getClass().toString(),
                Collections.singletonMap(ex.getCause().toString(), ex.getMessage())
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(detalhesExceções);
    }
}

