import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        System.out.println("process #1");
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("No such account exists");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account has an account in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (Exception exception) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank for using our service");
        }

        System.out.println("process #2");
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("No such account exists");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account has an account in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (Exception exception) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank for using our service");
        }

        System.out.println("process #3");
        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("No such account exists");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account has an account in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (Exception exception) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank for using our service");
        }

        System.out.println("process #4");
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("No such account exists");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account has an account in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (Exception exception) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank for using our service");
        }

        System.out.println("process #5");
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("No such account exists");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account has an account in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (Exception exception) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank for using our service");
        }

    }
}
