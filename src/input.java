import java.util.Scanner; 

public class input
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);       
// Get and store the user's name. (Store as text)
    String name; 
    System.out.print("Enter your name: ");
    name = scanner.nextLine();

// Get and store the user's age. (Store as a whole number)
    int age;
    System.out.print("Enter your age: ");
    age = scanner.nextInt();
// Get and store the user's weight. (Store it as a real number)
    float weight;
    System.out.print("Enter your weight: ");
    weight = scanner.nextFloat();
// Get and store if the user is a smoker. (Store it as either true or false)
    boolean smoker;
    System.out.print("Are you a smoker? (true/false): ");
    smoker = scanner.nextBoolean();
// Output all of the information back to the user.
    System.out.println("\nAll of the info you provided ");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Weight: " + weight);
    System.out.println("Smoker: " + smoker);

    }
}
