package tech.donau.course

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService{
    fun greet(name: SHellotring){
        return "Hello $name";
    }
}