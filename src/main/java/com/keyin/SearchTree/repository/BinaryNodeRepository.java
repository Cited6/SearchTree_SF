package com.keyin.SearchTree.repository;

import com.keyin.SearchTree.model.BinaryNodeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinaryNodeRepository extends CrudRepository<BinaryNodeEntity, Long> {
    // Define custom queries if needed
}
