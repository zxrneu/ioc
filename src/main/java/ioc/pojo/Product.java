package ioc.pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ioc.pojo.Category;
@Component("p")
public class Product {
	 
    private int id;
    private String name="11111111111";
   @Autowired
    private Category category;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
    
}
