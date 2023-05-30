public class Basket_Item {
    int id_pr_vr;
    String color_name;
    String size_name;
    String img;
    int quantity_in_basket;
    ProductVariation_Colors colors;
    ProductVariation_Sizes sizes;

    public Basket_Item(ProductVariation_Colors colors, ProductVariation_Sizes sizes) {
        this.colors = colors;
        this.sizes = sizes;
        this.id_pr_vr = sizes.getId();
        this.color_name = colors.getName();
        this.size_name = sizes.getSize();
    }



    public int getId_pr_vr() {
        return id_pr_vr;
    }

    public void setId_pr_vr(int id_pr_vr) {
        this.id_pr_vr = id_pr_vr;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }

    public String getSize_name() {
        return size_name;
    }

    public void setSize_name(String size_name) {
        this.size_name = size_name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantity_in_basket() {
        return quantity_in_basket;
    }

    public void setQuantity_in_basket(int quantity_in_basket) {
        this.quantity_in_basket = quantity_in_basket;
    }

    public ProductVariation_Colors getColors() {
        return colors;
    }

    public void setColors(ProductVariation_Colors colors) {
        this.colors = colors;
    }

    public ProductVariation_Sizes getSizes() {
        return sizes;
    }

    public void setSizes(ProductVariation_Sizes sizes) {
        this.sizes = sizes;
    }
}
