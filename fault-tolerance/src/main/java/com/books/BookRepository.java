package com.books;

import com.books.data.Book;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.jboss.logging.Logger;

@Path("/book")
public class BookRepository {
    public static Logger LOGGER = Logger.getLogger(BookRepository.class.getName());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Retry(maxRetries = 4, delay = 1000L)
    public List<Book> getBooks(){
        final boolean b = new Random().nextBoolean();
        if(b){
            LOGGER.info("No se pudo obtener el listado de libros");
            throw new RuntimeException("No se pudo obtener el listado de libros");
        }
        return Arrays.asList(
                new Book("1", "Book1", "Autor1"),
                new Book("2", "Book2", "Autor2"),
                new Book("3", "Book3", "Autor3")
                
        );
    }
}