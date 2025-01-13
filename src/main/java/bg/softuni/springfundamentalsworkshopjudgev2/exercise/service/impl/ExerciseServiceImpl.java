package bg.softuni.springfundamentalsworkshopjudgev2.exercise.service.impl;

import bg.softuni.springfundamentalsworkshopjudgev2.exercise.repository.ExerciseRepository;
import bg.softuni.springfundamentalsworkshopjudgev2.exercise.service.ExerciseService;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseServiceImpl(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

}
