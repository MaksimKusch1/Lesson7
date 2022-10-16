import java.util.Random;

public enum TypeOfAnimals {
    Mammals, Amphibians, Reptiles, Birds, Fish, Invertebrates;

    private static final Random RandomType = new Random();

    public static TypeOfAnimals randomTypes()  {
        TypeOfAnimals[] types = values();
        return types[RandomType.nextInt(types.length)];
    }


}
