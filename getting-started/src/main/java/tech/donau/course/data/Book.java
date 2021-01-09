
package tech.donau.course.data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Book {
    
    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;
    @NotBlank(message = "El Autor no puede estar vacío")
    private String author;
    @Min(value = 1, message = "El número de páginas no puede ser menor a 1")
    //@NotBlank(message = "El número de páginas no puede ser vacío")
    @NotNull(message = "El número de páginas no puede ser nulo")
    private Integer paginas;
    
    public Book() {
        
    }

    public Book(String name, String author, Integer paginas) {
        this.name = name;
        this.author = author;
        this.paginas = paginas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    
    
    
}
