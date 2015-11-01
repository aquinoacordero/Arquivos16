package arquivos16;

public class Producto {
    
    private String code;
    private String descripcion;
    private int price;

    public Producto() {
    }

    public Producto(String code, String descripcion, int price) {
        this.code = code;
        this.descripcion = descripcion;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Producto{" + "code=" + code + ", descripcion=" + descripcion + ", price=" + price + '}';
    }
    
}
