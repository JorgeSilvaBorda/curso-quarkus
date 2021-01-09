mvn io.quarkus:quarkus-maven-plugin:1.3.1.Final:create \
-DprojectGroupId=tech.donau \
-DprojectArtifactId=reactive-routes \
-DclassName="tech.donau.GreetingResource" \
-Dpath="/book" \
-Dextensions="smallrye-fault-tolerance, resteasy-jsonb"