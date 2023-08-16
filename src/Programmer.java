

        public class Programmer extends Person {

            private String companyName;

            public Programmer(String name, String designation, String companyName) {
                super(name, designation);
                this.companyName = companyName;
            }

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public void coding(){
                System.out.println("Tyoe of programming: " + getDesignation());
            }

            @Override
            public void learn() {
                System.out.println("learn: Programmer");
            }

            @Override
            public void walk() {
                System.out.println("walk: home");
            }

            @Override
            public void eat() {
                System.out.println("eat: lalady, hotDog, Soft Drinks, Salads");
            }

            @Override
            public String toString() {
                return super.toString() +
                        "Profession: Programmer\n" +
                        "Company: " + companyName + "\n";
            }
        }


