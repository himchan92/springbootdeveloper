package me.wonjun.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.wonjun.springbootdeveloper.domain.Article;
import me.wonjun.springbootdeveloper.dto.AddArticleRequest;
import me.wonjun.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //final 혹은 @NotNull 붙은 필드 생성자 DI
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
