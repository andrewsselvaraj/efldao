package com.efl.efreelearndao.service;

import java.util.List;
import java.util.Optional;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.SchoolInfo;



public interface SchoolInfoService {
	
	List<SchoolInfoDTO> getAllSchoolInfos();

	Optional<SchoolInfoDTO> getSchoolInfoById(Long SchoolInfoId);

	SchoolInfoDTO createSchoolInfo(SchoolInfo SchoolInfo);	

	SchoolInfoDTO updateSchoolInfo(SchoolInfo SchoolInfoDetails);

	void deleteSchoolInfo(SchoolInfo SchoolInfo);
}
