package com.efl.efreelearndao.restcontroller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.SchoolInfo;
import com.efl.efreelearndao.service.SchoolInfoService;


import org.modelmapper.ModelMapper;


@RestController
@RequestMapping("/api/v1")
public class SchoolInfoRestController {
	
	@Autowired
	private SchoolInfoService schoolInfoService;

	@Autowired
    private ModelMapper modelMapper;
	
	@PostMapping("/schools")
	public SchoolInfoDTO createSchool(@Valid @RequestBody SchoolInfoDTO schoolInfoDTO) {
		SchoolInfo schoolInfo = convertToEntity(schoolInfoDTO);
		return convertToDto(schoolInfoService.createSchoolInfo(schoolInfo));
	}
	
	@GetMapping("/schools")
	public List<SchoolInfoDTO> getAllSchoolInfos() {
		List<SchoolInfo> schools = schoolInfoService.getAllSchoolInfos();
		return schools.stream()
        .map(this::convertToDto)
        .collect(Collectors.toList());
	}
	
	public SchoolInfoDTO convertToDto(SchoolInfo SchoolInfo) {
		SchoolInfoDTO SchoolInfoDTO = modelMapper.map(SchoolInfo, SchoolInfoDTO.class);
		
		return SchoolInfoDTO;
	}
	
	public SchoolInfo convertToEntity(SchoolInfoDTO schoolInfoDTO) {
		SchoolInfo SchoolInfo = modelMapper.map(schoolInfoDTO, SchoolInfo.class);
		return SchoolInfo;
	}
	
}

