package com.grupoe.recarga.recarga.repository;

import com.grupoe.recarga.recarga.domain.Classification;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClassificationRepository extends PagingAndSortingRepository<Classification, Long> {
    //Classification findByName (String name);
}
