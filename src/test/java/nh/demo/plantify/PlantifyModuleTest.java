package nh.demo.plantify;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.core.Violation;
import org.springframework.modulith.docs.Documenter;

import static java.util.function.Predicate.not;

public class PlantifyModuleTest {
    @Test
    void write_documentation() {
        var modules = ApplicationModules
            .of(PlantifyApplication.class);

        new Documenter(modules).writeDocumentation();
    }

    @Test
    void test_architecture() {
        var modules = ApplicationModules
            .of(PlantifyApplication.class);

//        modules.verify();

        modules.detectViolations()
//            .filter(not(this::isPlantCareModuleCycle))
            .throwIfPresent();
    }

//    private boolean isPlantCareModuleCycle(Violation violation) {
//        return violation.hasMessageContaining("Cycle detected")
//               && violation.hasMessageContaining("Slice plant")
//               && violation.hasMessageContaining("Slice care");
//    }
}
