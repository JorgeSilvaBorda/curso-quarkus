/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.donau.course;

import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;

@OpenAPIDefinition(info = @Info(title = "Api Getting Started", description = "Api de pruebas quarkus", version = "1.2"))

public class QuarkusApplication extends Application {
    
}
