package com.rafdev.fpdd.resources.model;

import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@RestController
public abstract class AbstractCommonResource<T extends AbstractBackingEntity<K>, K>
		extends AbstractBackingResource<T, K, AbstractCommonService<T, K>, AbstractBackingDTO<T, K>> {

}
