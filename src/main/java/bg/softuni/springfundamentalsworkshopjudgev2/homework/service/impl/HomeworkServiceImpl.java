package bg.softuni.springfundamentalsworkshopjudgev2.homework.service.impl;

import bg.softuni.springfundamentalsworkshopjudgev2.homework.repository.HomeworkRepository;
import bg.softuni.springfundamentalsworkshopjudgev2.homework.service.HomeworkService;
import org.springframework.stereotype.Service;

@Service
public class HomeworkServiceImpl implements HomeworkService {

    private final HomeworkRepository homeworkRepository;

    public HomeworkServiceImpl(HomeworkRepository homeworkRepository) {
        this.homeworkRepository = homeworkRepository;
    }
}
