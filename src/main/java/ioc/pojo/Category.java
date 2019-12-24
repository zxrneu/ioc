package ioc.pojo;

import org.springframework.stereotype.Component;

@Component("c")
public class Category {
	 
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
    
    @Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

	private int id;
    private String name="ccccccccccccccccc";
}
