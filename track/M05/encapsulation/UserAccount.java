public class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username) {
        this.username = username;
    }

    // Write-only: set password, but no getPassword() method exists
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }
    }

    // Check credentials without exposing the actual password string
    public boolean verifyPassword(String inputPassword) {
        return this.password != null && this.password.equals(inputPassword);
    }
}