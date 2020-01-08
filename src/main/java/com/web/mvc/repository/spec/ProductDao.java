package com.web.mvc.repository.spec;

import com.web.mvc.entity.Manufacturer;
import com.web.mvc.entity.Product;
import com.web.mvc.entity.ProductCode;
import java.util.List;

public interface ProductDao {
    List<Product> queryProduct();
    Product getProduct(Integer id);
    void saveProduct(Product p);
    void updateProduct(Product p);
    void deleteProduct(Integer id);

    public void saveManufacturer(Manufacturer mf);

    public Object queryManufacturer();

    public Object getManufacturer(Integer id);

    public void updateManufacturer(Manufacturer mf);

    public void deleteManufacturer(Integer id);

    public Object getProductCode(String code);

    public Object queryProductCode();

    public void saveProductCode(ProductCode pc);

    public void updateProductCode(ProductCode pc);

    public void deleteProductCode(String code);
    
}