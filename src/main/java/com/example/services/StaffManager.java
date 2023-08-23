package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Staff;

public interface StaffManager {
	 List<Staff> getStaff();
	 void addStaff(Staff s1);
	 void delete(int id);
	 Optional<Staff> getStaff(int staff_id);
	 void updatestaff(Staff staff,int id);
}
