package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Tbl")
public class Emp_Tbl_Entity
{
	@Id
	@Column(name="EMP_ID")
	private Integer eid;
	@Column(name="EMP_NAME")
	private String ename;
	
	
	@Column(name="EMP_SAL")
	private Double esal;
	/*public Integer getEid() 
	{
		return eid;
	}
	public void setEid(Integer eid) 
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	
	
	
	
	
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}*/
	public Emp_Tbl_Entity()
	{
		System.out.println("Emp_Tbl_Entity:::Constructor");
	}
	public Emp_Tbl_Entity(Integer eid, String ename, Double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Emp_Tbl_Entity [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
}
