import lab2.Customer;
import lab2.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class   Main {
    static List<Customer> createCustomerList() {
        List<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer(
                1,
                "Іваненко",
                "Іван",
                "Іванович",
                "м. Київ, вул. Шевченка, 1",
                "123456789",
                1500.75
        );

        Customer customer2 = new Customer(
                2,
                "Петрова",
                "Ольга",
                "Вікторівна",
                "м. Львів, вул. Лесі Українки, 5",
                "23456789",
                2300.50
        );

        Customer customer3 = new Customer(
                3,
                "Сидоров",
                "Андрій",
                "Андрійович",
                "м. Одеса, вул. Дерибасівська, 10",
                "34567890",
                1200.00
        );

        Customer customer4 = new Customer(
                4,
                "Коваленко",
                "Олег",
                "Ігорович",
                "м. Харків, вул. Свободи, 20",
                "45678901",
                -500.00
        );

        Customer customer5 = new Customer(
                5,
                "Гриценко",
                "Марія",
                "Юріївна",
                "м. Чернівці, вул. Головна, 12",
                "56789012",
                -300.25
        );

        Customer customer6 = new Customer(
                6,
                "Бондаренко",
                "Олег",
                "Анатолійович",
                "м. Запоріжжя, вул. Перемоги, 15",
                "67890123",
                750.10
        );

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        customerList.add(customer6);

        return customerList;
    }

    static void printCustomers(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    static List<Customer> getCustomersByName(List<Customer> customers, String selectedName) {
        List<Customer> filteredCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            String customerName = customer.getFirstName();
            if (customerName.equals(selectedName)) {
                filteredCustomers.add(customer);
            }
        }
        return filteredCustomers;
    }

    static List<Customer> getCustomersByCardNumber(List<Customer> customers, int rangeStart, int rangeEnd) {
        List<Customer> filteredCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            int cardNumber = Integer.parseInt(customer.getCardNumber());
            if (cardNumber > rangeStart && cardNumber <= rangeEnd) {
                filteredCustomers.add(customer);
            }
        }
        return filteredCustomers;
    }

    static List<Customer> getDebtors(List<Customer> customers) {
        List<Customer> filteredCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getBalance() < 0) {
                filteredCustomers.add(customer);
            }
        }
        return filteredCustomers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();

        List<Customer> customers = createCustomerList();

        System.out.println("Виберіть опцію:");
        System.out.println("а) список покупців із заданим іменем");
        System.out.println("б) список покупців, у яких номер кредитної картки знаходиться в заданому інтервалі");
        System.out.println("в) кількість та список покупців, які мають заборгованість");

        String choice = scanner.nextLine();
        while (!validator.validateOptionChoice(choice)) {
            choice = scanner.nextLine();
        }

        List<Customer> filteredCustomers = new ArrayList<>();
        switch (choice) {
            case "а":
                String chosenName = scanner.nextLine();
                while (!validator.validateName(chosenName)) {
                    System.out.println("Невірне ім'я. Спробуйте ще раз:");
                    chosenName = scanner.nextLine();
                }
                filteredCustomers = getCustomersByName(customers, chosenName);
                break;
            case "б":
                System.out.println("Введіть початок інтервалу:");
                String number1 = scanner.nextLine();
                System.out.println("Введіть кінець інтервалу:");
                String number2 = scanner.nextLine();
                while (!validator.validateRanges(number1, number2)) {
                    number1 = scanner.nextLine();
                    number2 = scanner.nextLine();
                }
                int rangeStart = Integer.parseInt(number1);
                int rangeEnd = Integer.parseInt(number2);
                filteredCustomers = getCustomersByCardNumber(customers, rangeStart, rangeEnd);
                break;
            case "в":
                filteredCustomers = getDebtors(customers);
                System.out.println("Number of debtors: " + filteredCustomers.size());
                break;
        }

        scanner.close();
        printCustomers(filteredCustomers);
    }
}