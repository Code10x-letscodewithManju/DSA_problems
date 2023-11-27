package DSA_projects;

import java.util.ArrayList;
import java.util.List;

class Expense {
    private String date;
    private String description;
    private String category;
    private double amount;

    public Expense(String date, String description, String category, double amount) {
        this.date = date;
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    // Getters and setters

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void deleteExpense(int index) {
        expenses.remove(index);
    }

    public void editExpense(int index, Expense expense) {
        expenses.set(index, expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();

        // Example usage
        Expense expense1 = new Expense("2023-06-01", "Groceries", "Food", 50.0);
        Expense expense2 = new Expense("2023-06-02", "Gas", "Transportation", 30.0);

        tracker.addExpense(expense1);
        tracker.addExpense(expense2);

        List<Expense> expenses = tracker.getExpenses();
        for (Expense expense : expenses) {
            System.out.println("Date: " + expense.getDate());
            System.out.println("Description: " + expense.getDescription());
            System.out.println("Category: " + expense.getCategory());
            System.out.println("Amount: " + expense.getAmount());
            System.out.println("-----------------------");
        }
    }
}





