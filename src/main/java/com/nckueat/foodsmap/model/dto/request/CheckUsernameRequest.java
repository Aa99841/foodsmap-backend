package com.nckueat.foodsmap.model.dto.request;

import lombok.Data;
import lombok.NonNull;

@Data
public class CheckUsernameRequest {
    @NonNull
    private final String username;
}
