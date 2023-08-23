package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Staff;
import com.example.repository.StaffRepository;

@Service
public class StaffManagerImpl implements StaffManager{
	@Autowired
	StaffRepository repository;
	@Override
	public void addStaff(Staff s1) {
		repository.save(s1);
	}
	@Override
	public List<Staff> getStaff() {
			// TODO Auto-generated method stub
		return repository.findAll();
			
	}
	@Override
	public Optional<Staff> getStaff(int staff_id) {
		// TODO Auto-generated method stub
		return repository.findById(staff_id);
	}
	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}
	@Override
	public void updatestaff(Staff staff,int id) {
		// TODO Auto-generated method stub
		System.out.println("inside update method of service layer");
		repository.updateStaff(id,staff.getStaff_name(),staff.getStaff_role());
	}
	

}
