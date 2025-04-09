# Usar imagem base com JDK
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR para o container
COPY target/todo-api-0.0.1-SNAPSHOT.jar app.jar

# Definir comando de execução
ENTRYPOINT ["java", "-jar", "app.jar"]
