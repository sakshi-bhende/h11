# Use an official OpenJDK runtime as a base image
FROM openjdk:latest

# Set the working directory in the container
WORKDIR /app

# Copy the local Java program into the container
COPY . /app

# Compile the Java program
RUN javac FactorialCalculator.java

# Set the default command to run the program
CMD ["java", "FactorialCalculator"]
