package com.vti.kshop.Form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
@Getter
@Setter
public class AccessoryUpdateForm {
    @NotBlank
    @Length(max = 10)
    private String licensePlate;

    @NotNull
    @PastOrPresent
    private LocalDate repairDate;

    @NotBlank
    @Length(max = 50)
    private String name;

    @NotNull
    private Long price;

    @NotBlank
    @Length(max = 50)
    private String statusDamaged;

    @NotBlank
    @Length(max = 50)
    private String repairStatus;
}
