package com.vti.kshop.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    AccessoryDto create(AccesoryCreateForm form);

    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto update(AccessoryUpdateForm form);
}
