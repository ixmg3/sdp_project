abstract class EUser {
    String name;
    public abstract void displayRole();
}

class ECustomer extends EUser {
    public ECustomer(String name) {
        this.name = name;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Customer.");
    }
}

class ESeller extends EUser {
    public ESeller(String name) {
        this.name = name;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Seller.");
    }
}

class EAdmin extends EUser {
    public EAdmin(String name) {
        this.name = name;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is an Admin.");
    }
}

class UserFactory {
    public static EUser createUser(String type, String name) {
        switch (type) {
            case "Customer":
                return new ECustomer(name);
            case "Seller":
                return new ESeller(name);
            case "Admin":
                return new EAdmin(name);
            default:
                throw new IllegalArgumentException("Unknown user type.");
        }
    }
}
