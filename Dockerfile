# Use an official OpenJDK runtime as a parent image
FROM openjdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/demo1.jar demo1.jar

# Expose the application port
EXPOSE 8081

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "demo1.jar"]
