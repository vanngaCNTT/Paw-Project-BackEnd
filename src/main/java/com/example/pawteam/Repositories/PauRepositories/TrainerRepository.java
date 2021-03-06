package com.example.pawteam.Repositories.PauRepositories;

import com.example.pawteam.Entities.PauEntities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;



public interface TrainerRepository extends JpaRepository<Trainer,Integer>, PagingAndSortingRepository<Trainer,Integer>, Repository<Trainer, Integer> {
    @Query(value = "select count(id_trainer) from trainer",nativeQuery = true)
    Long countTrainer();

    @Query(value = "SELECT image FROM trainer where id_trainer = :idTrainer", nativeQuery = true)
    String findImageTrainer(@Param("idTrainer") Integer idTrainer);
}
