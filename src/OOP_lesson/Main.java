package OOP_lesson;

//Создайте класс BankAccount, представляющий банковский счет, кото-
//рый содержит следующие поля:
//• accountNumber - номер счета
//• balance - баланс на счете
//• ownerName - имя владельца счета
//• interestRate - процентная ставка по счету
//Также реализуйте следующие методы:
//• deposit(double amount) - метод для пополнения счета на заданную сум-
//му
//• withdraw(double amount) - метод для снятия со счета заданной суммы
//• addInterest() - метод для начисления процентов на счет в соответствии
//с процентной ставкой
//Напишите программу, которая создает объект класса BankAccount, по-
//полняет его на некоторую сумму, снимает с него некоторую сумму, а затем
//начисляет проценты на оставшуюся сумму.

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 0, "John␣Doe", 0.1);

        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.getBalance());
    }
}
