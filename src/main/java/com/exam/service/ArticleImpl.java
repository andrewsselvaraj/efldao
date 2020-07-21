package com.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.Article;
import com.exam.repository.ArticleRepository;
@Service
public class ArticleImpl implements ArticleService{

	@Autowired
	ArticleRepository articleInfoRepository;
	
	@Override
	public List<Article> getAllArticleInfos() {
		// TODO Auto-generated method stubgetAllSchoolInfos
		return this.articleInfoRepository.findAll();
	}



	@Override
	public Article createArticleInfo(Article schoolInfo) {
		return this.articleInfoRepository.save(schoolInfo);
	
	 	
	}

	@Override
	public Article updateArticleInfo(Article SchoolInfoDetails) {
		// TODO Auto-generated method stub
		return this.articleInfoRepository.save(SchoolInfoDetails);
		}

	@Override
	public void deleteArticleInfo(Article SchoolInfo) {
		 this.articleInfoRepository.delete(SchoolInfo);
		
	}



	@Override
	public Optional<Article> getArticlelInfoById(Long SchoolInfoId) {
		
		int sid= SchoolInfoId.intValue();
			return this.articleInfoRepository.findById(sid);
		
		
	}

}
