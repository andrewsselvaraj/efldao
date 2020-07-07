package com.efl.efreelearndao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.SchoolInfo;
@Repository
public interface SchoolInfoRepository extends JpaRepository<SchoolInfo,Integer>{
	

  
}
