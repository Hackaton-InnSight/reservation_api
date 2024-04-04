FROM maven:3.8.4-openjdk-17 as build

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src src

RUN mvn package -DskipTests


FROM amazoncorretto:17

WORKDIR /app

COPY --from=build /app/target/reservation_api-0.0.1-SNAPSHOT.jar /app/reservation_api.jar

CMD ["java", "-jar", "reservation_api.jar"]