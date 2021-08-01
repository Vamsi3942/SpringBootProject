package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Products_Tbl_Entity;

public interface Products_Tbl_Repo extends CrudRepository<Products_Tbl_Entity, Serializable>
{

}
