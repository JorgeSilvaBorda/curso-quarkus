package tech.donau.datasource;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    
    @Inject
    @DataSource("hello")
    AgroalDataSource helloDatasource;
    
    @Inject
    @DataSource("users")
    AgroalDataSource usersDatasource;

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Greeting> hello() throws SQLException {
        List<Greeting> greetings = new ArrayList<>();
        final CallableStatement call = helloDatasource.getConnection().prepareCall("SELECT * FROM GREETING");
        call.execute();
        final ResultSet resultset = call.getResultSet();
        while (resultset.next()) {
            greetings.add(new Greeting(resultset.getInt("ID"), resultset.getString("GREETING")));
        }

        return greetings;
    }
    
    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<User> users() throws SQLException {
        List<User> users = new ArrayList<>();
        final CallableStatement call = usersDatasource.getConnection().prepareCall("SELECT * FROM USER");
        call.execute();
        final ResultSet resultset = call.getResultSet();
        while (resultset.next()) {
            users.add(new User(resultset.getInt("ID"), resultset.getString("USER")));
        }

        return users;
    }
}
