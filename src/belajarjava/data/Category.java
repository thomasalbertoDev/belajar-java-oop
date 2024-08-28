package belajarjava.data;

public class Category {

    // Encapsulation artinya memastikan data sensitif yang ada di dalam object tersembunyi dari akses luar hal ini bertujuan agar kita bisa menjada agar data sebuah object tetap baik dan valid
    private String id;
    private boolean expensive;

    // TODO: Getter merupakan function yang dibuat untuk mengambil data field nya
    public String getId() {
        return id;
    }


    // TODO: Setter merupakan function untuk mengubah data field nya    
    public void setId(String id) {
        this.id = id;
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

}
