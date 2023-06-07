package employye;

public class Main {
    public static void main(String[] args) {
        // Example usage
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first name of the new employee: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the last name of the new employee: ");
        String lastName = scanner.nextLine();

        Employee newEmployee = new Employee(firstName, lastName);
        CredentialService credentialService = new CredentialService(newEmployee);
        credentialService.showCredentials();
    }
}