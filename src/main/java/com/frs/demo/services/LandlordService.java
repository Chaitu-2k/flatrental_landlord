package com.frs.demo.services;

import java.util.List;


import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frs.demo.entity.Landlord;
import com.frs.demo.exceptions.LandlordNotFoundException;
import com.frs.demo.repository.ILandlordRepository;


@Service
public class LandlordService implements ILandlordService{
	@Autowired
	ILandlordRepository landlordRepository;
	
	@Override
	public Landlord addLandlord(Landlord landlord) {
		return landlordRepository.save(landlord);
	}

	@Override
	public Landlord updateLandlord(Landlord landlord) {
		return landlordRepository.save(landlord);
	}
	
	@Override
	public Landlord deleteLandlord(int landlordId) {
		Landlord landlord =landlordRepository.findById(landlordId);
		landlordRepository.delete(landlord);
		return landlord;
	}
	
	@Override
	public Landlord viewLandlord(int landlordId) throws LandlordNotFoundException{
		try {
			Landlord landlord =landlordRepository.findById(landlordId);
			if(landlord!=null)
			{
				return landlord;
			}
		}catch (NoSuchElementException e) {
			throw new LandlordNotFoundException("landlord Id" +landlordId+"not found");
		}
		return null;
	};		
	
	@Override
	public List<Landlord> viewAllLandlord() {
		return landlordRepository.findAll();
	}		

}