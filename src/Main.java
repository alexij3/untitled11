public class Main {

    public static void main(String[] args) {
        Human human = new Human(80,1.52);
        System.out.println(HumanBodyMassIndexCalculator.getBodyMassIndexCategory(human));
    }

}

class Human {

    private double weight;
    private double height;

    public Human(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

class HumanBodyMassIndexCalculator {

    public static double getBodyMassIndex(Human human) {
        double height = human.getHeight();
        return human.getWeight() / (height * height);
    }

    public static String getBodyMassIndexCategory(Human human) {
        double currentBodyMassIndex = getBodyMassIndex(human);
        if (currentBodyMassIndex < 18.5) {
            return "Underweight";
        } else if (currentBodyMassIndex >= 18.5 & currentBodyMassIndex < 25) {
            return "Normal";
        } else if (currentBodyMassIndex >= 25 & currentBodyMassIndex < 30) {
            return "Overweight";
        }
        return "Obese";
    }

}