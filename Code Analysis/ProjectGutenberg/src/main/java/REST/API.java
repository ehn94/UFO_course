package REST;

import DataAccess.PostgreSQLDataAccess;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api")
public class API {

    PostgreSQLDataAccess pgsql = new PostgreSQLDataAccess();

    public API() {
    }

    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
        return new Gson().toJson("Hej");
    }

    @GET
    @Path("byCity")
    @Produces(MediaType.APPLICATION_JSON)
    public String getBookAuthorByCity() throws SQLException {
        System.out.println("API GOT CALLED");
        
        HashMap rSet = pgsql.getBookAuthorByCity();
////       
//        Gson gson = new Gson();
//        String json = gson.toJson(rSet);
//        System.out.println("Json : " + json);
        return new Gson().toJson(rSet);
    }
}
