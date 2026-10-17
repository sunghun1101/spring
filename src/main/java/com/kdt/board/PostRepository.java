package com.kdt.board;

import org.springframework.data.jpa.repository.JpaRepository;

// 저장·조회 메서드는 JpaRepository에 이미 있어서 추가 선언이 없습니다
public interface PostRepository extends JpaRepository<Post, Long> {
}
