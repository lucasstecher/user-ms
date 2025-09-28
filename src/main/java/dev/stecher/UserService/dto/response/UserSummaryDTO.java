package dev.stecher.UserService.dto.response;

import dev.stecher.UserService.dto.Role;

import java.time.Instant;
import java.util.UUID;


public record UserSummaryDTO(
        UUID id,
        String name,
        String email,
        Role role,
        Instant createdAt
) {}
