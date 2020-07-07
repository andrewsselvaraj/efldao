package com.efl.efreelearndao.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efl.efreelearndao.model.SchoolInfo;
@Repository
public interface SchoolInfoRepository extends JpaRepository<SchoolInfo,Integer>{
	

  
}
