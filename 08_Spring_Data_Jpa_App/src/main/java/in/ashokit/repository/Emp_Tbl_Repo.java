package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Emp_Tbl_Entity;

public interface Emp_Tbl_Repo extends CrudRepository<Emp_Tbl_Entity, Serializable> 
{
	
}
