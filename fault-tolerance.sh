mvn io.quarkus:quarkus-maven-plugin:1.2.1.Final:create \
-DprojectGroupId=com.books \
-DprojectArtifactId=fault-tolerance \
-DclassName="com.books.Bookrepository" \
-Dpath="/book" \
-Dextensions="smallrye-fault-tolerance, resteasy-jsonb"