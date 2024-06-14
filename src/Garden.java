import java.util.ArrayList;
import java.util.List;

class Garden {
    // Liste over planter i haven
    private List<Plant> plants;

    // Konstruktør der initialiserer listen over planter
    public Garden() {
        this.plants = new ArrayList<>();
    }

    // Tilføjer en plante til haven
    public void addPlant(Plant plant) {
        this.plants.add(plant);
    }

    // Beregner og returnerer den samlede udbytte af frugttræer i haven
    public float getTotalYield() {
        float totalYield = 0;
        for (Plant plant : plants) {
            if (plant instanceof FruitTree) {
                totalYield += ((FruitTree) plant).getAverageYield();
            }
        }
        return totalYield;
    }

    // Viser blomster af en bestemt farve
    public void displayFlowersOfColor(String color) {
        System.out.println("Blomster af farven " + color + " er:");
        for (Plant plant : plants) {
            if (plant instanceof Flower) {
                Flower flower = (Flower) plant;
                if (flower.getColor().equalsIgnoreCase(color)) {
                    System.out.println("Blomst: " + flower.getSpecies() + " plantet den " + flower.getDatePlanted());
                }
            }
        }
    }
}

    // Returnerer en liste over planter, der er højere end en given højde













/*public List<Plant> getHigherThan(float meter) {
        List<Plant> result = new ArrayList<>();
        for (Plant plant : plants) {
            if (plant instanceof Tree) {
                Tree tree = (Tree) plant;
                if (tree.getHeight() > meter) {
                    result.add(tree);
                }
            }
        }
        return result;
    }

    // Returnerer den ældste plante i haven
    public Plant getOldestPlant() {
        if (plants.isEmpty()) {
            return null;
        }

        Plant oldestPlant = plants.get(0);
        for (Plant plant : plants) {
            if (plant.getDatePlanted().isBefore(oldestPlant.getDatePlanted())) {
                oldestPlant = plant;
            }
        }
        return oldestPlant;
    }
}*/