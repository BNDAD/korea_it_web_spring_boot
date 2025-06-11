package com.koreait.spring_boot_study.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//controller 두가지 방식이 존재
//1. controller
//html(웹페이지) 반환하는 서버 사이드 렌더링 (SSR)
//2. RestController
// JSON, 무낮열 등 다양한 데이터를 반환=> REST API 서버 (웹서버)

//서버 사이드 렌더링은 서버측에서 프론트의 웹페이지까지 통째로 반환 그걸 브라우저에서 띄움
//그럼 해당 요청 경로에 따라서 웹페이지가 다 할당되어 있어서 느림

//하지만 우리가 하게 될 프론트(리액트) + 백엔드(스프링부트 웹서버)
//리액트는 클라이언트 사이드 렌더링(CSR) 즉 프론트엔드 쪽에서 웹페이지를 로드
//백엔드는 요청에 해당하는 데이터만 반환시켜줌
//이러한 조합 => Single Page Application(SPA) 방식

@RestController
public class PostController {

    @GetMapping("/get")
    public String getPost() {
        System.out.println("get으로 들어온 요청입니다.");
        return "어떤 게시물의 데이터";
    }
}
