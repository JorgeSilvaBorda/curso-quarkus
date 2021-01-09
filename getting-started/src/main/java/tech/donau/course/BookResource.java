package tech.donau.course;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import tech.donau.course.data.Book;

@Path("/book")
public class BookResource {
    
    private static List<Book> books = new ArrayList<>();
    
    static{
        books.add(new Book("The freelancer's bible", "IDK", 10));
    }
    
    /*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Book> getBooks(){
        return books;
    }
    */
    /*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBooks(){
        return Response.ok(books).build();
    }
    */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Book> getBooks(){
        return books;
    }
    
    /*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBooks(){
        return Response.status(202)
                .entity(books)
                .build();
    }
    */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addBook(@Valid Book book){
        if(books.size() > 5){
            return Response.status(400).entity("No more than 5 books allowed").build();
        }
        books.add(book);
        return Response.ok(book).build();
    }
    
    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book updateBook(@PathParam("id") Integer index, Book book){
        books.remove((int)index);
        books.add(index, book);
        return book;
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book deleteBook(@PathParam("id") Integer index){
        return books.remove((int)index);
    }
}
