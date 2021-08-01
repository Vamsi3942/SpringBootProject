package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.ContactsMasterEntity;

public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> 
{
	public ContactsMasterEntity findByContactName(String name);
}
