package com.vti.kshop.Service;

import com.vti.kshop.Dto.AccessoryDto;
import com.vti.kshop.Form.AccessoryCreateForm;
import com.vti.kshop.Form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    AccessoryDto create(AccessoryCreateForm form);

    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto update(AccessoryUpdateForm form);
}
