package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
        String pizzaType = "Pepperoni";
        int numOfSlices = 8;
        int numOfPeople = 4;

        int slicesForEach= numOfSlices / numOfPeople;
        int slicesLeftOver = numOfSlices - (numOfPeople * slicesForEach);



    }
}
