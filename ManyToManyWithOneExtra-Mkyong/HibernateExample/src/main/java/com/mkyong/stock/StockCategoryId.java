package com.mkyong.stock;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class StockCategoryId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Stock stock;

	@ManyToOne	
    private Category category;
	
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockCategoryId that = (StockCategoryId) o;

        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (stock != null ? stock.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }
    
}