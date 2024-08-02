package com.vti.kshop.Controller;

import com.vti.kshop.Dto.AccessoryDto;
import com.vti.kshop.Form.AccessoryCreateForm;
import com.vti.kshop.Form.AccessoryUpdateForm;
import com.vti.kshop.Service.AccessoryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@AllArgsConstructor
//@CrossOrigin("http://127.0.0.1:5500/")
@CrossOrigin("https://khieunv05.github.io/")
public class AccessoryController {
    private final AccessoryService accessoryService;

    @PostMapping("/api/v1/accessories")
    public AccessoryDto create(@RequestBody @Valid AccessoryCreateForm form){
        return accessoryService.create(form);
    }

    @GetMapping("/api/v1/accessories")
    public Page<AccessoryDto> findAll(Pageable pageable){
        return accessoryService.findAll(pageable);
    }

    @PutMapping("/api/v1/accessories/{id}")
    public AccessoryDto update(@RequestBody @Valid AccessoryUpdateForm form,@PathVariable("id") Long id){
        return accessoryService.update(form,id);
    }

    @DeleteMapping("/api/v1/accessories/{id}")
    public void delete(@PathVariable("id") Long id){
        accessoryService.delete(id);
    }
}
