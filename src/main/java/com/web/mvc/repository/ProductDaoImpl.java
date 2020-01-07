
package com.web.mvc.repository;

import com.web.mvc.entity.DiscountCode;
import com.web.mvc.entity.Product;
import com.web.mvc.entity.ProductCode;
import com.web.mvc.repository.spec.ProductDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "productrDao")
public class ProductDaoImpl  implements ProductDao {

      @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<ProductCode> queryProduct() {
            String sql = "SELECT * FROM PRODUCT_CODE";
        return jdbcTemplate.query(sql, RM.productCode);

    }

    @Override
    public Product getProduct(Integer id) {
       String sql = "SELECT * FROM DISCOUNT_CODE WHERE DISCOUNT_CODE = ?";
        DiscountCode dc = jdbcTemplate.queryForObject(sql, new Object[]{code}, RM.discountCode);
        return dc;
    }

    @Override
    public void saveProduct(Product p) {
       String sql = "INSERT INTO DISCOUNT_CODE(DISCOUNT_CODE, RATE) VALUES(?, ?)";
        jdbcTemplate.update(sql, dc.getDiscountCode(), dc.getRate());
    }

    @Override
    public void updateProduct(Product p) {
      String sql = "UPDATE DISCOUNT_CODE SET RATE = ? WHERE DISCOUNT_CODE = ?";
        jdbcTemplate.update(sql, dc.getRate(), dc.getDiscountCode());
    }

    @Override
    public void deleteProduct(Integer id) {
        String sql = "DELETE FROM DISCOUNT_CODE WHERE DISCOUNT_CODE = ?";
        jdbcTemplate.update(sql, code);
    }
    
}