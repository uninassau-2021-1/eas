package com.rafdev.fpdd.services.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.domain.filters.model.IFilter;

@Service
public abstract class AbstractCommonService<T extends AbstractBackingEntity<K>, K>
		extends AbstractBackingService<T, K, JpaRepository<T, K>, IFilter<T>> {

}
