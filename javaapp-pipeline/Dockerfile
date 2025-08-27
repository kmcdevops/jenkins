# Use official OpenJDK 21 runtime image
FROM eclipse-temurin:21-jdk-jammy

# Set working directory inside container
WORKDIR /app

# Copy the jar built by Maven into container
COPY target/java-sample-21-1.0.0.jar app.jar

# Expose port (adjust if your app uses different port)
EXPOSE 7000

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]

