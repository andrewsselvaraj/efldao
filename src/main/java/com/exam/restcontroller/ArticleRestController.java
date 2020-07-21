package com.exam.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dto.ArticleDTO;
import com.exam.entity.Article;
import com.exam.exception.ResourceNotFoundException;
import com.exam.service.ArticleService;

import org.modelmapper.ModelMapper;


@RestController
@RequestMapping("/api/v1")
public class ArticleRestController {
	
	@Autowired
	private ArticleService articleInfoService;

	@Autowired
    private ModelMapper modelMapper;
	
	@PostMapping("/articles")
	public ArticleDTO createSchool(@Valid @RequestBody ArticleDTO articleInfoDTO) {
		Article articleInfo = convertToEntity(articleInfoDTO);
		return convertToDto(articleInfoService.createArticleInfo(articleInfo));
	}
	


	


	
	@GetMapping("/articles")
	public List<ArticleDTO> getAllSchoolInfos() {
		List<Article> articles = articleInfoService.getAllArticleInfos();
		return articles.stream()
        .map(this::convertToDto)
        .collect(Collectors.toList());
	}
	
	@GetMapping("/articles/{id}")
	public  ResponseEntity<ArticleDTO>  getSchoolInfoById(@PathVariable(value = "id") Long articleInfoId) {
		//Optional<SchoolInfo> articles = articleInfoService.getSchoolInfoById(articleInfoId);
		Optional<Article> articles = articleInfoService.getArticlelInfoById(articleInfoId);
		ArticleDTO dto =convertToDto(articles);
		return ResponseEntity.ok().body(dto);
	}
	

	
	private ArticleDTO convertToDto(Optional<Article> articles) {
		ArticleDTO SchoolInfoDTO = modelMapper.map(articles, ArticleDTO.class);
		
		return SchoolInfoDTO;
	}


@PutMapping("/articles/{id}")
	public ResponseEntity<Article> updateSchool(@PathVariable(value = "id") Long articleId,
			@Valid @RequestBody Article SchoolDetails) throws ResourceNotFoundException {
		Article article = articleInfoService.getArticlelInfoById(articleId)
				.orElseThrow(() -> new ResourceNotFoundException("article not found for this id :: " + articleId));

	

		final Article updatedSchool = articleInfoService.updateArticleInfo(SchoolDetails);
		return ResponseEntity.ok(updatedSchool);
	}

	@DeleteMapping("/articles/{id}")
	public Map<String, Boolean> deleteSchool(@PathVariable(value = "id") Long articleId)
			throws ResourceNotFoundException {
		Article School = articleInfoService.getArticlelInfoById(articleId)
				.orElseThrow(() -> new ResourceNotFoundException("article not found for this id :: " + articleId));

		articleInfoService.deleteArticleInfo(School);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}


	public ArticleDTO convertToDto(Article SchoolInfo) {
		ArticleDTO SchoolInfoDTO = modelMapper.map(SchoolInfo, ArticleDTO.class);
		
		return SchoolInfoDTO;
	}
	
	public Article convertToEntity(ArticleDTO articleInfoDTO) {
		Article SchoolInfo = modelMapper.map(articleInfoDTO, Article.class);
		return SchoolInfo;
	}
	
}

