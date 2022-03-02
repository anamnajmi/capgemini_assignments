package assignment5.user;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import assignment5.main.Trader;
import assignment5.main.Transaction;
import static java.util.Comparator.comparing;


public class Assignment5Q4 {

	public static void main(String[] args) {
	

		Trader John =	new Trader("John", "Mumbai");
		Trader Malik =	new Trader("Malik", "Pune");
		Trader Joe =	new Trader("Joe", "Delhi");
		Trader Shubh =	new Trader("Shubh", "Pune");
	
		List<Transaction> transactions = Arrays.asList(
					new Transaction(John, 2019, 3000), 
		            new Transaction(Malik, 2020, 1100),
		            new Transaction(Joe, 2019, 900),
		            new Transaction(Joe, 2019, 110),	
		            new Transaction(Shubh, 2020, 7500),
		            new Transaction(Shubh, 2020, 2550));
	
		sorTransactions(transactions);
		transactionsValuesDelhi(transactions);
		highestTransaction(transactions);
		smallestTransaction(transactions);
		
	}

	public static List<Transaction> sorTransactions(List<Transaction> transactions){
		 List<Transaction> tr2011 = transactions.stream()
                 .filter(transaction -> transaction.getYear() == 2011)
                 .sorted(comparing(Transaction::getValue))
                 .collect(toList());
		 return tr2011;	
	}

	public static List<Transaction> transactionsValuesDelhi(List<Transaction> transactions) {
		 List<Transaction> TrDelhi  = transactions.stream()
                 .filter(transaction -> transaction.getTrader().getCity()== "Delhi")
                 .sorted(comparing(Transaction::getValue))
                 .collect(toList());
		 return TrDelhi;
	}

	public static int highestTransaction(List<Transaction> transactions) {
	 int highestValue = 
            transactions.stream()
            .map(Transaction::getValue)
            .reduce(0, Integer::max);
	 return highestValue;
	}
	
	public static int smallestTransaction(List<Transaction> transactions) {
		 int minValue = 
		            transactions.stream()
		            .map(Transaction::getValue)
		            .reduce(0, Integer::min);
			 return minValue;
	}


}