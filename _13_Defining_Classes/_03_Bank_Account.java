package _13_Defining_Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Bank_Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*        Create
 Deposit {Id} {Amount}
 SetInterest {Interest}
 GetInterest {ID} {Years}

    */
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();
        String command = sc.nextLine();
        while(!command.equals("End")){
            String [] tokens = command.split("\\s+");
            String output = null;
            if(tokens[0].equals("Create")){
                BankAccount account = new BankAccount();
                bankAccounts.put(account.getId(), account);
                output = "Account ID " + account.getId() + " created";
            }else if(tokens[0].equals("Deposit")){
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);

                if(!bankAccounts.containsKey(id)){
                    output = "Account does not exist";
                }else{
                    bankAccounts.get(id).deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                }
            }else if(tokens[0].equals("SetInterest")){
                BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
            }else{
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);

                if(!bankAccounts.containsKey(id)){
                    output = "Account does not exist";
                }else{
                double interest = bankAccounts.get(id).getInterest(years);
                    output = String.format("%.2f", interest);
                }

            }
            if(output != null){
                System.out.println(output);
            }

            command = sc.nextLine();
        }

    }


}
