package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.CombinedDto;
import jokefetcher.JokeFetcher;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * REST Web Service
 *
 * @author lam
 */
@Path("jokes")
public class JokeResource {

    @Context
    private UriInfo context;
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJokes() throws IOException {
        JokeFetcher jokeFetcher = new JokeFetcher();

        return jokeFetcher.fetchJokes();
    }

   
}
