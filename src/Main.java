import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Opret en have
        Garden garden = new Garden();

        // Tilføj træer og frugttræer
        Plant tree1 = new Tree("Eg", LocalDate.of(1908, 1, 1), 10);
        FruitTree fruitTree1 = new FruitTree("Æble", LocalDate.of(2000, 5, 10), 5);
        FruitTree fruitTree2 = new FruitTree("Pære", LocalDate.of(2005, 3, 15), 4);

        fruitTree1.registerYield(2.5f);
        fruitTree1.registerYield(3.0f);
        fruitTree1.registerYield(2.8f);

        fruitTree2.registerYield(1.2f);
        fruitTree2.registerYield(1.5f);
        fruitTree2.registerYield(1.3f);

        garden.addPlant(tree1);
        garden.addPlant(fruitTree1);
        garden.addPlant(fruitTree2);

        // Tilføj blomster
        Flower flower1 = new Flower("Rose", LocalDate.of(2010, 9, 1), "Rød");
        Flower flower2 = new Flower("Tulipan", LocalDate.of(2010, 11, 1), "Rød");
        Flower flower3 = new Flower("Påskelilje", LocalDate.of(2011, 4, 20), "Gul");

        garden.addPlant(flower1);
        garden.addPlant(flower2);
        garden.addPlant(flower3);

        // Vis den samlede udbytte af alle frugttræer
        System.out.println("Den samlede udbytte af alle frugttræer i haven er: " + garden.getTotalYield() + "kg");

        // Vis blomster af farven rød
        garden.displayFlowersOfColor("Rød");
    }
}


























        /* Vis planter højere end 3 meter
        System.out.println("Planter højere end 3 meter:");
        for (Plant plant : garden.getHigherThan(3)) {
            System.out.println(plant);
        }

        // Vis den ældste plante
        Plant oldestPlant = garden.getOldestPlant();
        System.out.println("Den ældste plante i haven er: " + oldestPlant);
    }
}*/