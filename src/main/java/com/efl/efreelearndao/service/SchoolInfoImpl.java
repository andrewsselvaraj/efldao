package com.efl.efreelearndao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.SchoolInfo;
import com.efl.efreelearndao.repository.SchoolInfoRepository;

public class SchoolInfoImpl implements SchoolInfoService{

	@Autowired
	SchoolInfoRepository schoolInfoRepository;
	
	@Override
	public List<SchoolInfo> getAllSchoolInfos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<SchoolInfo> getSchoolInfoById(Long SchoolInfoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchoolInfo createSchoolInfo(SchoolInfo schoolInfo) {
		return this.schoolInfoRepository.save(schoolInfo);
	
	 	
	}

	@Override
	public SchoolInfo updateSchoolInfo(SchoolInfo SchoolInfoDetails) {
		// TODO Auto-generated method stub
		return null;
		}

	@Override
	public void deleteSchoolInfo(SchoolInfo SchoolInfo) {
		// TODO Auto-generated method stub
		
	}

}
