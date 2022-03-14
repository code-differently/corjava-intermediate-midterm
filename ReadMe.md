# Java Programming MidTerm Assessment

* Part A - Coding Challenge
* Part B - TDD Design Lab

## Part A Vowel Chop And Screw

You are given the function `vowelChopAndScrew()` :

* The function takes a input of type string
* Look at each word in the string
  * If the word has 4 or more vowels `{a,e,i,o,u}` reverse that word
  * If the word has less than 4 words leave it as is.

### Example 1

```
input = "I love chocolate";
expected = "I love I love etalocohc";
```

### Example 2

```
input = "America the brave";
expected = "Acirema the brave";
```

> Make sure to write comments for what you are working on, you can receive partial credit for commented code.

## Part B

You will be creating a Supermarket management program, in this lab you should use everything you learned up to this point to complete the project.

> Any public method including Getters and Setters must be tested!

The Supermarkets will sell:

`PerishableItem` and `NonPerishable`

They both will have the following properties:

* Long id;
* String name;
* Double price;


`PerishableItem` should have one child `RefridgeratedItem` 

It should have the following properties:

* Date expires;
* Double storageTemp;

Items will need to be placed on shelves with items of the same Type. There should be two types of shelves `RefrigeratedShelf` and `NonRefrigeratedShelf`.

The Shelf should only store one type of item so you will need to use a generic:

```
public abstract class Shelf<T> {}
```

Every shelf should have the following property:

* ArrayList<T> items;

Every Shelf should have the following methods:

```
public void addItem(T item)
```

```
public void sellItem(T item)
```

```
public void removeItem(Long id)
```

```
public Integer itemsLeft()
```

The `RefrigeratedShelf` should have the following properties:

* Double temp;

The `RefrigeratedShelf` should also have this additional method:

```
public ArrayList<T> removeExpiredItems(Date date)
```

Now of course we will need to SELL all these items so we will need to create a `Register`.

Let's also create three Interfaces `AcceptsCash`, `AcceptsCredit`

Here are the methods for each Interface:

* AcceptsCash
	* `Double takeCashPayment(ArrayList<Item> items, Double amount)`
		* returns change 
* AcceptsCredit
	* `Boolean paymentAccepted(ArrayList<Item> items, Double amount)`
		* returns false if payment fails

If the amount submitted is less that the amount of all the items an exception should be thrown.

```
public class NotEnoughFundsException extends Exception{
	public NotEnoughFundsException(String msg){
		super(msg);
	}
}
```

Create a `CashRegister` that should implement only `AcceptsCash`

Create a `CreditRegister` that should implement only `AcceptsCredit`

Create a `MultiRegister` that should implement both

Create a `TenItemsOrLess` that should accept both, and only make a sale if items is equal to or less than 10. If it is more throw this exception:

```
public class TooManyItemsException extends Exception{
	public TooManyItemsException(String msg){
		super(msg);
	}
}
```
