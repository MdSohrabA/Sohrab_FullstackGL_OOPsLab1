package employye;

import java.util.Random;

public class CredentialService {
    private Employee employee;

    public CredentialService(Employee employee) {
        this.employee = employee;
    }

    private String generatePassword() {
        int passwordLength = 8;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    private String generateEmailAddress(String department) {
        String email = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" +
                department.toLowerCase() + ".company.com";
        return email;
    }

    public void showCredentials() {
        String department = "Tech"; // Replace with appropriate logic to determine the department
        String password = generatePassword();
        String email = generateEmailAddress(department);

        System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are as follows:");
        System.out.println("Email ---> " + email);
        System.out.println("Password ---> " + password);
    }
}


