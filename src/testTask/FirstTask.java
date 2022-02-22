package testTask;

public class FirstTask {


    public static void main(String[] args) {
        WorkingMassive workingMassive = new WorkingMassive();
        int amount = workingMassive.getAmountOfWords();
        if(amount == -1){
            System.out.println(Utils.getString("Sorry, we cannot find the most repeated string"));
        }
        System.out.printf(Utils.getString("The most repeated string has %d%n"), amount);
    }
}
