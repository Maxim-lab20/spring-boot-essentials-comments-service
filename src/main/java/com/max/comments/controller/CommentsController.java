package com.max.comments.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
@Log4j2
public class CommentsController {

    @GetMapping("/{id}")
    public ResponseEntity<List<String>> getCommentsByAnnouncementId(@PathVariable Integer id) {
        log.info("Comments provided for announcement with id = {}", id);
        return ResponseEntity.ok(List.of("Comment1", "Comment2", "Comment3"));
    }

}
