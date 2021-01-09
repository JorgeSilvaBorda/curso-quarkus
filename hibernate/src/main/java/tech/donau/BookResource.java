package tech.donau;

import tech.donau.data.Book;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class BookResource {
    @Inject
    EntityManager manager;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> hello() {
        return manager.createQuery("FROM " + Book.class.getName(), Book.class).getResultList();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Book saveBook(Book book){
        manager.persist(book);
        return book;
    }
    
    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Book updateBook(@PathParam("id") Long id, Book book){
        book.setId(id);
        manager.merge(book);
        return book;
    }
    
    @Path("/{id}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Book deleteBook(@PathParam("id") Long id){
        Book book = manager.find(Book.class, id);
        manager.remove(book);
        return book;
    }
}