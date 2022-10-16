//import java.util.Comparator;

public abstract class Animals implements Cloneable/*, Comparator, Comparable*/ {
    private String Name;
    private String NameLat;
    private int YearOfFound;
    private String color;
    private String Description;
    public CounterClass count= new CounterClass();
    private LeavingArea LeavingArea = new LeavingArea();
    private Owner owner = new Owner("Вільні","Немає");
    private TypeOfAnimals AnimalType;

    Animals(String[] arr){
        this.Name = arr[0];
        this.NameLat = arr[1];
        this.color = arr[2];
        this.YearOfFound = Integer.parseInt(arr[3]);
        this.Description = arr[4];
        this.LeavingArea.Leaving=arr[6];
    }

    public String getColor() {
        return color;
    }
    public String getName() {return Name;}
    public Integer getYearOfFound() {return YearOfFound;}
    //public CounterClass getCount(){return count;}

    public void Print(){
        System.out.println("Колір тварини "+Name+ " зараз став: " + getColor());
    }

    public final void Print(String all){
        System.out.println("Назва: "+Name);
        System.out.println("Назва латиною: "+NameLat);
        System.out.println("Рік відкриття: "+YearOfFound);
        System.out.println("Колір: "+color);
        System.out.println("Опис: "+Description);
        System.out.println("Проживає: "+ LeavingArea.getLeaving());
    }

    public void ChangeColor(String newColor){
        if (newColor.length()>0)
            this.color=newColor;
        // Print("All");
    }

    public abstract String getVoice();

    public Animals clone() {
        Animals animal1 = null;
        try {
            animal1 = (Animals) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return animal1;
    }


    private class LeavingArea{
        private String Leaving;
        public String getLeaving(){return Leaving;}
    }

    private class Owner{
        private String Owner;
        private String OwnerName;

        private Owner(String owner, String ownerName) {
            Owner = owner;
            OwnerName = ownerName;
        }

        public String getOwner() {
            return Owner;
        }

        public String getOwnerName() {
            return OwnerName;
        }
    }

    public static class CounterClass{
        private static int countAll=0;

        public CounterClass(){
            new Counter().SetCount();
        }

        public static int getCountAll(){
            return countAll;
        }

        private static class Counter{
            private void SetCount(){
                countAll=countAll+1;
            }
        }

    }

}