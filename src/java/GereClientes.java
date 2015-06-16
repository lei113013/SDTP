
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */

@Path("/chat")

public class GereClientes {
    private ArrayList<Clientes> Clientes = new ArrayList<Clientes>();//criação e inicialização de um array para os clientes

    public GereClientes() {
        Clientes.add(new Clientes("Teste"));
    }
    @GET
    @Path("/{username}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response iniciaSessao(@PathParam("username") String username){
     
        for(Clientes object : Clientes){//percorre o objecto 
            if(object.getUsername().equals(username)){//compara o username obtido por get e os do objecto
                        throw new WebApplicationException(Response.Status.NOT_ACCEPTABLE);//caso encontre um username igual
            }
        }
        Clientes.add(new Clientes(username));
        return Response.ok("Sessão iniciada com sucesso").build();

    }
    
    
    
    
    
}
