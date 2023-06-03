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

        public  String getName() { return name;
        }


        public  String getPhone() {
                return phone;
        }

        public abstract String getStatus();

        public abstract double getDiscount();

        public void getDescribe()
        {
                System.out.println("---------------------------------------");
                System.out.println("Customer's name : " + getName() +
                        "\nPhone number : " + getPhone() +
                        "\nStatus : " + getStatus() +
                        "\nDiscount : " + (getDiscount()*100)+"%");
        }
        public void getCarTypeMenu()
        {
                System.out.println("---------------------------------------");
                System.out.println("What kind of car do you want? \n" +
                        "1.HiEnd Car \n" +
                        "2.Pickup Truck\n" +
                        "3.Normal Car\n" +
                        "4.Electric Vehicle\n" +
                        "Select number[1-4] :");
        }

}

