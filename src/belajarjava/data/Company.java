package belajarjava.data;

// Outer Class
public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Inner Class (Merupakan class yang terdapat di dalam outer class nya/class luar)
    public class Employee {

        private String name;

        // Keuntungan menggunakan inner class adalah kita bisa menggunakan method milik outer class walaupun access modifier nya sudah di set menjadi private
        public String getCompany() {
            return Company.this.name;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
