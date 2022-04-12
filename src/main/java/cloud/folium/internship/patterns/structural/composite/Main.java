package cloud.folium.internship.patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Meiram","CEO", 10000);

        Employee managerExecutive = new Employee("Meiram","Manager Executive", 6000);
        Employee managerProduction = new Employee("Ronaldo","Manager Production", 6000);
        Employee managerMarketing = new Employee("Messi","Manager Marketing", 6000);

        Employee eAssistant = new Employee("Ronald","Assistant: Executive", 4000);
        Employee pAssistant = new Employee("John","Assistant: Production", 4000);
        Employee mAssistant = new Employee("Trump","Assistant: Marketing", 4000);

        CEO.add(managerExecutive);
        CEO.add(managerProduction);
        CEO.add(managerMarketing);

        managerExecutive.add(eAssistant);
        managerProduction.add(pAssistant);
        managerMarketing.add(mAssistant);

        //Prints the CEO
        System.out.println(CEO);

        // Prints the remaining employees
        for (Employee managers : CEO.getSubordinates()) {
            System.out.println(managers);  // Prints the managers

            for (Employee assistants : managers.getSubordinates()) {
                System.out.println(assistants); // Prints the assistants
            }
        }
    }
}