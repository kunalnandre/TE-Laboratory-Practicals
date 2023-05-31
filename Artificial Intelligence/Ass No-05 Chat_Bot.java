import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Welcome to MET-BKC----\n");
        System.out.println("How can I assist you today?");

        while (true) {
            System.out.print("User: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot: Goodbye! Have a nice day!");
                break;
            }

            String response = getBotResponse(userInput);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

    public static String getBotResponse(String userInput) {
        if (userInput.contains("courses")) {
            return "We offer a variety of courses including \n \t-Engineering \n \t-Pharma \n \t-Management \n \t-C-DAC  \n MCA \n-Please visit our website for more details.";
        } else if (userInput.contains("fees")) {
            return "The fee structure varies for each course. Please visit our website or contact our admissions department for detailed information.";
        } else if (userInput.contains("faculty")) {
            return "We have a highly qualified and experienced faculty who are experts in their respective fields.";
        } else if (userInput.contains("features")) {
            return "Our courses are designed to provide comprehensive knowledge and practical skills. They include hands-on projects, interactive learning materials, and experienced faculty guidance.";
        } else if (userInput.contains("contact")) {
            return "For further assistance, please contact our Website";
        } else {
            return "I'm sorry, I didn't understand. Could you please rephrase or ask another question?";
        }
    }
}


// Output:

// ----Welcome to MET-BKC----

// How can I assist you today?
// User: courses
// Chatbot: We offer a variety of courses including 
//         -Engineering 
//         -Pharma 
//         -Management 
//         -C-DAC  
//  MCA 
// -Please visit our website for more details.
// User: fees
// Chatbot: The fee structure varies for each course. Please visit our website or contact our admissions department for detailed information.
// User: bye
// Chatbot: Goodbye! Have a nice day!
