package org.innsight.reservation_api.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.innsight.reservation_api.models.RestaurantModel;
import org.innsight.reservation_api.models.RoomModel;
import org.innsight.reservation_api.models.TableModel;
import org.innsight.reservation_api.repositories.RestaurantRepository;
import org.innsight.reservation_api.repositories.RoomsRepository;
import org.innsight.reservation_api.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.InputStream;
import java.util.List;

@Configuration
public class DataLoader {

    @Autowired
    private RoomsRepository roomRepository;
    @Autowired
    private TableRepository tableRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Bean
     CommandLineRunner initDatabase() {
        return args -> {
            // Chargez votre fichier JSON ici
            ObjectMapper objectMapper = new ObjectMapper();
            try (InputStream inputStream = new ClassPathResource("data.json").getInputStream()) {
                JsonNode jsonNode = objectMapper.readTree(inputStream);

                // Désérialisez et enregistrez les chambres
                if (jsonNode.has("rooms")) {
                    TypeReference<List<RoomModel>> typeRef = new TypeReference<List<RoomModel>>() {
                    };
                    List<RoomModel> rooms = objectMapper.readValue(jsonNode.get("rooms").toString(), typeRef);
                    roomRepository.saveAll(rooms);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        };
    }
}