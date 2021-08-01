package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS_TBL")
public class Products_Tbl_Entity 
{
	@Id
	@Column(name="PRODUCT_ID")
	private Integer pid;
	@Column(name="Product_NUMBER")
	private String pname;
	@Override
	public String toString() {
		return "Products_Tbl_Entity [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPcost() {
		return pcost;
	}
	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}
	@Column(name="PRODUCT_PRICE")
	private Double pcost;
	
}
