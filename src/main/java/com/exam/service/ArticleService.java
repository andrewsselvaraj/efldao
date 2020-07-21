package com.exam.service;

import java.util.List;
import java.util.Optional;

import com.exam.entity.Article;

public interface ArticleService {

	List<Article> getAllArticleInfos();

	Article createArticleInfo(Article schoolInfo);

	Article updateArticleInfo(Article SchoolInfoDetails);

	void deleteArticleInfo(Article SchoolInfo);

	Optional<Article> getArticlelInfoById(Long SchoolInfoId);

}
