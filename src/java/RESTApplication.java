/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;

/**
 *
 * @author Tiago
 */

@ApplicationPath("/resources")
public class RESTApplication extends Application{
   private Set<Object> singletons = new HashSet<Object>();

   public RESTApplication() {
      singletons.add(new GereClientes());
   }

   @Override
   public Set<Object> getSingletons() {
      return singletons;
   }    
}
