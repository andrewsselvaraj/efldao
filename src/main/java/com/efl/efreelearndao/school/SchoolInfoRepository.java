package com.efl.efreelearndao.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
@Repository
public interface SchoolInfoRepository extends JpaRepository<SchoolInfoDTO,Integer>{
	

  
}
