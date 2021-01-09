mvn io.quarkus:quarkus-maven-plugin:1.4.2.Final:create \
-DprojectGroupId=tech.donau.course \
-DprojectArtifactId=getting-started-kotlin \
-DclassName="tech.donau.course.GreetingResource" \
-Dpath="/hello" \
-Dextensions="kotlin,resteasy-jsonb"
