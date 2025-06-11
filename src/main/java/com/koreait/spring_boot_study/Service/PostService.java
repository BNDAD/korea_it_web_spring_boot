package com.koreait.spring_boot_study.Service;

import com.koreait.spring_boot_study.Repository.PostRepository;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public String getPost() {
        String result = postRepository.getPost();
        return result;
    }
}
