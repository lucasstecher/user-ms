package dev.stecher.UserService.mapper;

import dev.stecher.UserService.dto.Role;
import dev.stecher.UserService.dto.request.UpdateUserRequestDTO;
import dev.stecher.UserService.dto.response.UserSummaryDTO;
import dev.stecher.UserService.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserSummaryDTO toSummary(UserEntity userEntity) {
        return new UserSummaryDTO(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getEmail(),
                Role.valueOf(userEntity.getRole().name()),
                userEntity.getCreatedAt()
        );
    }

    public void updateFromDTO(UpdateUserRequestDTO dto, UserEntity userEntity) {
        if (dto.getName() != null && !dto.getName().isBlank()) {
            userEntity.setName(dto.getName().trim());
        }
        if (dto.getEmail() != null && !dto.getEmail().isBlank()) {
            userEntity.setEmail(dto.getEmail().trim().toLowerCase());
        }
    }
}
