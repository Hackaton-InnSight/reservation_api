# Utilisation de l'image adoptopenjdk qui contient Java 17
FROM amazoncorretto:17

# Définition du répertoire de travail dans le conteneur
WORKDIR /app

# Copie du jar de l'application dans le conteneur
COPY target/reservation_api-0.0.1-SNAPSHOT.jar /app/reservation_api.jar

# Exposition du port sur lequel l'application écoute
EXPOSE 8080

# Commande pour démarrer l'application lorsque le conteneur démarre
CMD ["java", "-jar", "reservation_api.jar"]