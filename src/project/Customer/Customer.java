package project.Customer;

public abstract class Customer {
        private String name;
        private String phone;
        private String email;
        private String address;

        public Customer(String name, String phone) {
                this.name = name;
                this.phone = phone;
        }

        public Customer(String name, String phone, String email, String address) {
                this.name = name;
                this.phone = phone;
                this.email = email;
                this.address = address;
        }

        public abstract String getName();

        public abstract String getPhone();

        public abstract String getStatus();

        public abstract double getDiscount();

}

