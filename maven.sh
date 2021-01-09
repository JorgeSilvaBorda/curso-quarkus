mvn io.quarkus:quarkus-maven-plugin:1.2.1.Final:create \
-DprojectGroupId=tech.donau \
-DprojectArtifactId=maven-example \
-DclassName="tech.donau.BookRepository" \
-Dpath="/book" \
-Dextension="smallrye-fault-tolerance,vertx-web,resteasy-jsonb"