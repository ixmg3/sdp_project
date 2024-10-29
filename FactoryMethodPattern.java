interface User {
    void access();
}

class AdminUser implements User {
    public void access() {
        System.out.println("Admin access granted.");
    }
}

class GuestUser implements User {
    public void access() {
        System.out.println("Guest access granted.");
    }
}

class UserFactory {
    public User createUser(String userType) {
        if (userType.equalsIgnoreCase("admin")) {
            return new AdminUser();
        } else if (userType.equalsIgnoreCase("guest")) {
            return new GuestUser();
        }
        return null;
    }
}
