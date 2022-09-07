package com.frs.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frs.demo.entity.Landlord;



@Repository
public interface ILandlordRepository extends CrudRepository<Landlord, Integer> {

	List<Landlord> findAll();

	Landlord findById(int landlordId);

	void delete(Landlord result);

	@SuppressWarnings("unchecked")
	public Landlord save(Landlord landlord);

}