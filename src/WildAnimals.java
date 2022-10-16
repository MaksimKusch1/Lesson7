public class WildAnimals extends Animals implements LeaveInForest,LeaveInWater{
    public int living;

    public WildAnimals(String[] arr) {
        super(arr);
        System.out.println("Create WildAnimals");
    }

    @Override
    public String WhereItLeave(){
        return "Не живе у воді";
    }

    public String WhereItLeave(String watertype){
        return "Водне середовище: " + watertype;
    }

    @Override
    public String WhatHeEat(String eattype){
        return "Харчується}: " + eattype;
    }

    @Override
    public String getVoice(){
        return "Р...";
    }
}
