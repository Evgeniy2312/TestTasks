package testTask;

public class FillingMassive {

    private final TestData testData = new TestData();

    public String[] fillingMas(){
        String[] strings = new String[testData.testInt()];
        for(int i = 0; i < strings.length; i++ ){
            strings[i] = testData.testString();
        }
        return strings;
    }
}
