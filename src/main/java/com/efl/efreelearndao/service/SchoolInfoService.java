package com.efl.efreelearndao.service;

import java.util.List;
import java.util.Optional;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.SchoolInfo;



public interface SchoolInfoService {
	
	List<SchoolInfo> getAllSchoolInfos();

	Optional<SchoolInfo> getSchoolInfoById(Long SchoolInfoId);

	SchoolInfo createSchoolInfo(SchoolInfo SchoolInfo);	

	SchoolInfo updateSchoolInfo(SchoolInfo SchoolInfoDetails);

	void deleteSchoolInfo(SchoolInfo SchoolInfo);
}
