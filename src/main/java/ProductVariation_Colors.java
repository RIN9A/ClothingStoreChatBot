public class ProductVariation {
    int id;
    Product product;
    String colors;
    String sizes;
    int quantity;
    boolean is_available;
    String img;

    public ProductVariation(int id, Product product, String colors, String sizes, int quantity, boolean is_available, String img) {
        this.id = id;
        this.product = product;
        this.colors = colors;
        this.sizes = sizes;
        this.quantity = quantity;
        this.is_available = is_available;
        this.img = img;
    }

    public ProductVariation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isIs_available() {
        return is_available;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void minusQuantity(){
        this.quantity--;
        if(this.quantity == 0){
            setIs_available(false);
        }
    }

}
