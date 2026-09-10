package nh.demo.plantify.care.suggestions;

import nh.demo.plantify.plant.PlantType;
import org.springframework.modulith.NamedInterface;

import java.util.List;

@NamedInterface(name = "Suggestions")
public interface CareSuggestionFactory {

    List<CareSuggestion> createSuggestion(PlantType plantType, String location);

}

