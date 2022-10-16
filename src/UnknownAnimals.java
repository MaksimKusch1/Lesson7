public class UnknownAnimals extends Animals{

    public UnknownAnimals(String arr[]){
        super(arr);
        System.out.println("Create UnknownAnimals");
    }

    final Integer numberoflegs(Integer num){
        return num;
    }

    @Override
    public String getVoice(){
        return "Пш....";
    }
}
