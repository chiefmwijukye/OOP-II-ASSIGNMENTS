// Abstract base class for all account types, providing core functionality.
public abstract class Account {
    protected int accountId;
    protected String accountHolder; 
    private DataOperator myTask; 

    // Executes a specified task 
    public void executeTask(DataOperator task) {
        myTask = task;
        myTask.runTask();
    }
}

// Represents an admin with elevated privileges 
public class AdminMaster extends Account {
    private String accessKey; 

    // Constructor to initialize admin details.
    public AdminMaster(int id, String name, String key) {
        accountId = id;
        accountHolder = name;
        accessKey = key;
    }
}

// Interface 
public interface DataOperator {
    void runTask();
}


public class ModifyData implements DataOperator {
    @Override
    public void runTask() {
        System.out.println("Your data has been uniquely modified!");
    }
}

// Main program 
public class MainProgram {
    public static void main(String[] args) {
        AdminMaster leadAdmin = new AdminMaster(4321, "Ian", "Jaggernaut2025");
      
        Account casualUser = new User(8765, "Llama");
        // Admin performs a data modification task
        leadAdmin.executeTask(new ModifyData());
        // User performs a data glance task
        casualUser.executeTask(new GlanceData());
    }
}

/
public class User extends Account {
    public User(int id, String name) {
        accountId = id;
        accountHolder = name;
    }
}

/
public class GlanceData implements DataOperator {
    @Override
    public void runTask() {
        System.out.println("Enjoy a personalized glimpse of your info!");
    }
}
