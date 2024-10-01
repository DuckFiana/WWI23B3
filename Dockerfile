FROM amazoncorretto:17-alpine3.20

WORKDIR /app

COPY target/*.jar app.jar

# Step 4: Expose the port that the Spring Boot application runs on
EXPOSE 8080

# Step 5: Run the jar file using Java
ENTRYPOINT ["java", "-jar", "app.jar"]