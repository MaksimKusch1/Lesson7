import java.util.Random;
import java.util.Scanner;
//import java.lang.Object;


public class Main {
    //private static Animals animals1;

    public static void main(String[] args) {

        String [][] ArrAnimals = new String[][]{
                {"Єнот усурійський", "Nyctereutes procyonoides", "Gray", "1834", "Адвентивний вид.Зустрічається на всій території України, за виключенням Криму.У південних степових регіонах притрмується лісів, берегів річок та озер, сільськогосподарських угідь та приміських районів.", "0","Ліс"},
                {"Лисиця звичайна", "Vulpes vulpes", "Linnaeus", "1758", "В Україні лисиця руда зустрічається по всій території.", "0","Поле"},
                {"Кіт лісовий", "Felis silvestris", "Schreber", "1777", "Вразливий вид, занесений до Червоної книги України.Сучасний ареал кота лісового в Україні охоплює Карпатський регіон, західне Полісся(Волинська та Рівненська області), Поділля, а також дельти Дунаю та Дністра.", "0","Степ"},
                {"Рись євразійська", "Lynx lynx", "Linnaeus", "1758", "Рідкісний вид, занесений до Червоної книги України.В Україні номінативна форма поширена на території Полісся —окремі р -ни Волинської, Житомирської, Київської, Рівненської, Чернігівської областей.Карпатська форма трапляється в Карпатах на території Львівської, Закарпатської, Івано -Франківської, Чернівецької областей.До XIX ст.вид був поширений в Карпатах, Поліссі, Лісостепу і Степу.", "0", "Ліс"},
                {"Корова", "Korova", "Біла", "1000", "Звичайна домашня корова", "1", "Господарство"},
                {"Чупакабра", "Чупакабра", "Прозора", "1000", "Невідома тварина", "1","Скрізь"}
        };

        for(int i=1; i<=ArrAnimals.length; i++)
            System.out.println(i+" "+ArrAnimals[i-1][0]);

        System.out.println("Введіть номер тварини, яку ви хочете переглянути детальніше, або змінити");
        Scanner sc1 = new Scanner(System.in);
        Integer num = sc1.nextInt();

        //Хочу створити об'єкт в залежності від типу, але не виходить корректно ініціалізувати
        //
        Animals animals1 = CreateAnimals(ArrAnimals[num-1]);

        //WildAnimals animals1 = new WildAnimals(ArrAnimals[num-1]);
        animals1.Print("all");

        System.out.println("Тварина дає голос: "+ animals1.getVoice());

        System.out.println("Якщо хочете завершити, нажміть Enter, або ввдедіть новий колір для тварини");
        Scanner sc2 = new Scanner(System.in);
        String newcolor = sc2.nextLine();
        if (newcolor.length()>0)
        {
            animals1.ChangeColor(newcolor);
            animals1.Print();
        }

        Animals cloneOfanimals1 = (Animals) animals1.clone();
        Animals cloneOfanimals2 = (Animals) animals1.clone();


        Animals [] AllAnimals = {
                CreateAnimals(ArrAnimals[0]),
                CreateAnimals(ArrAnimals[1]),
                CreateAnimals(ArrAnimals[2]),
                CreateAnimals(ArrAnimals[3]),
                CreateAnimals(ArrAnimals[4]),
                CreateAnimals(ArrAnimals[5]),
                cloneOfanimals1,
                cloneOfanimals2
        };




        //System.out.println("Створено "+AllAnimals.length+" об'єктів в масиві AllAnimals");

        //Створено обїектів, цікаво, що не рахуються обїекти які були склоновані
        System.out.println("Всього створено об'єктів класу Animals"+ Animals.CounterClass.getCountAll()+" ");

//        for(int i=1; i<=AllAnimals.length; i++)
//            System.out.println(i+" "+AllAnimals[i-1].getName()+"("+AllAnimals[i-1].getYearOfFound()+")");

        for(Animals Allanimals : AllAnimals){
            System.out.println(Allanimals.getName()+" ("+Allanimals.getYearOfFound()+") ");
        }

        //Arrays.sort(AllAnimals);

        //for(Animals Allanimals : AllAnimals){
        //    System.out.println(Allanimals.getName()+" ("+Allanimals.getYearOfFound()+")");
        //}


        /*
        System.out.println("Після сортування Comparable interface");


        Arrays.sort(AllAnimals);
        for(int i=1; i<=AllAnimals.length; i++)
            System.out.println(i+" "+AllAnimals[i-1].getName()+"("+AllAnimals[i-1].getYearOfFound()+")");

        System.out.println("Після сортування Compare interface");
        */

        System.out.println("Перелік типів");
        TypeOfAnimals[] types = TypeOfAnimals.values();
        for (TypeOfAnimals s : types) { System.out.println(s); }

        System.out.println("Random тип: " + TypeOfAnimals.randomTypes());


        Random randomType = new Random();


    }

    public static Animals CreateAnimals(String[] ArrAnimals){

        if (ArrAnimals[5]=="0") {
            WildAnimals animals1 = new WildAnimals(ArrAnimals);
            return animals1;
        }
        else if (ArrAnimals[5]=="1") {
            HomeAnimals animals1 = new HomeAnimals(ArrAnimals);
            return animals1;
        }
        else {
            UnknownAnimals animals1 = new UnknownAnimals(ArrAnimals);
            return animals1;
        }

    }

}

