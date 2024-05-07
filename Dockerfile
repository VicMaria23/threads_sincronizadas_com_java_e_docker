# Use a imagem oficial do OpenJDK com o JDK como base
FROM openjdk:11

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie os arquivos de código-fonte Java para o diretório de trabalho
COPY src /app/src

# Compile os arquivos .java para os arquivos .class
RUN javac src/main/*.java

CMD ["java", "-cp", "/app/src/main", "Main"]