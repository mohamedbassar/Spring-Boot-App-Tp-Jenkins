package com.tpjenkins.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record MessageRequest(
        @NotBlank(message = "Le message est obligatoire")
        @Size(max = 2000, message = "Le message ne doit pas dépasser 2000 caractères")
        String message
) {}
