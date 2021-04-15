package com.ibm.bts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bts.entity.Bugs;
import com.ibm.bts.repo.BugRepository;
@Service
public class BugService {
	@Autowired
	BugRepository bugRepository;
	
	public String createBug(Bugs bug) {
		Bugs savedBug = bugRepository.save(bug);
		return savedBug.getId();
	}
	public List<Bugs> getBug(){
		return bugRepository.findAll();
	}
    public String getBug(Bugs bug) {
		return "bug1";
    }
	public void updateBug(Bugs bug) {
		bugRepository.save(bug);

	}
	public Optional<Bugs> getBug(String bugId) {
		return bugRepository.findById(bugId);
	}
	public void deleteBug(String bugId) {
		// TODO Auto-generated method stub
		bugRepository.deleteById(bugId);
	}
}
