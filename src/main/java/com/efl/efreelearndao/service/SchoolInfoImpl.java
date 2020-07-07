package com.efl.efreelearndao.service;

import java.util.List;
import java.util.Optional;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.SchoolInfo;

public class SchoolInfoImpl implements SchoolInfoService{

	@Override
	public List<SchoolInfoDTO> getAllSchoolInfos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<SchoolInfoDTO> getSchoolInfoById(Long SchoolInfoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchoolInfoDTO createSchoolInfo(SchoolInfo SchoolInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchoolInfoDTO updateSchoolInfo(SchoolInfo SchoolInfoDetails) {
		// TODO Auto-generated method stub
		this.employeeRepository.save(SchoolInfoDetails);
		}

	@Override
	public void deleteSchoolInfo(SchoolInfo SchoolInfo) {
		// TODO Auto-generated method stub
		
	}

}
