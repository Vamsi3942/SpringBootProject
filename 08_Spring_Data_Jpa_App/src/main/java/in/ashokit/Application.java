package in.ashokit;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.ContactsMasterEntity;
import in.ashokit.entity.Emp_Tbl_Entity;
import in.ashokit.entity.Products_Tbl_Entity;
import in.ashokit.repository.ContactsMasterRepo;
import in.ashokit.repository.Emp_Tbl_Repo;
import in.ashokit.repository.Products_Tbl_Repo;


@SpringBootApplication
public class Application 
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		ContactsMasterRepo bean = ctxt.getBean(ContactsMasterRepo.class);
		Emp_Tbl_Repo bean2 = ctxt.getBean(Emp_Tbl_Repo.class);
		/*Products_Tbl_Repo bean3 = ctxt.getBean(Products_Tbl_Repo.class);*/
		
		/*ContactsMasterEntity entity=new ContactsMasterEntity();
		entity.setContactId(103);
		entity.setContactName("madhu");
		entity.setContactNumber(918225678);
		bean.save(entity);
		System.out.println("***********Record Inserted***********");*/
		
		/*Emp_Tbl_Entity et=new Emp_Tbl_Entity();
		et.setEid(4239);
		et.setEname("Ramu");
		et.setEsal(2350.0);
		bean2.save(et);
		System.out.println("***********Record Inserted***********");*/
		
		/*Products_Tbl_Entity pe=new Products_Tbl_Entity();
		pe.setPid(501);
		pe.setPname("Laptop");
		pe.setPcost(45600.0);
		bean3.save(pe);
		System.out.println("***********Record Inserted***********");*/
		
		/* Code For saveAll()
		Emp_Tbl_Entity e1=new Emp_Tbl_Entity(1689,"Janu",34500.0);
		Emp_Tbl_Entity e2=new Emp_Tbl_Entity(1689,"Divya",32600.0);
		Emp_Tbl_Entity e3=new Emp_Tbl_Entity(1689,"Rama",23100.0);
		
		List<Emp_Tbl_Entity> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		
		bean2.saveAll(emps);
		*/
		
		/* CODE FOR FINDBYID() Method
		Optional<Emp_Tbl_Entity> findById = bean2.findById(1689);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
		else
		{
			System.out.println("Record Is Not Available");
		}
		*/
		
		/* FindAllById() With Multiple Primary Keys
		List<Serializable> empids=new ArrayList<>();
		empids.add(1689);
		empids.add(3942);
		empids.add(4239);
		
		Iterable<Emp_Tbl_Entity> emps=bean2.findAllById(empids);
		emps.forEach(emp->
		{
			System.out.println(emp);
		}); 
		*/
		
		/*
		Iterable<Emp_Tbl_Entity> findAll = bean2.findAll();
		findAll.forEach(emp->System.out.println(emp));
		*/
		
		/*
		long count = bean2.count();
		System.out.println("Total Records Available:::" + count);
		*/
		
		/*
		boolean isAvailable = bean2.existsById(3942);
		System.out.println("Emp Available :::"+ isAvailable);
		*/
		
		/*
		 bean2.deleteById(3942);
		 
		*/
		ContactsMasterEntity findByContactName = bean.findByContactName("vamsi");
		System.out.println(findByContactName);
		
		
		
		
	
		
		
		ctxt.close();
		
		
		
		
		
		
		
		
		
		
	}

}
