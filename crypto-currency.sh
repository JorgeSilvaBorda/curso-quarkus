mvn io.quarkus:quarkus-maven-plugin:1.2.1.Final:create \
    -DprojectGroupId=tech.donau \
    -DprojectArtifactId=crypto-price \
    -DclassName="tech.donau.crypto.CryptoCurrencyResource" \
    -Dpath="/crypto" \
    -Dextensions="rest-client, resteasy-jsonb"