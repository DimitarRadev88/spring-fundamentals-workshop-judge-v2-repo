package bg.softuni.springfundamentalsworkshopjudgev2.comment.service.impl;

import bg.softuni.springfundamentalsworkshopjudgev2.comment.repository.CommentRepository;
import bg.softuni.springfundamentalsworkshopjudgev2.comment.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

}
