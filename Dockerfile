FROM openjdk:11-jdk-slim

WORKDIR /app

# Copy the built JAR file
COPY build/libs/orchestration-project-1.0-SNAPSHOT.jar /app/app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]