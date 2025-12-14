package com.carddemo.api.service;

import com.carddemo.api.dto.UserDto;
import com.carddemo.core.domain.User;
import com.carddemo.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<UserDto> getUser(String userId) {
        return userRepository.findById(userId).map(this::toDto);
    }

    @Transactional
    public UserDto createUser(UserDto userDto, String password) {
        if (userRepository.existsById(userDto.getUserId())) {
            throw new IllegalArgumentException("User ID already exists");
        }
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setUserFirstName(userDto.getFirstName());
        user.setUserLastName(userDto.getLastName());
        user.setUserType(userDto.getUserType());
        user.setUserPassword(password); // In a real app, hash this!

        return toDto(userRepository.save(user));
    }

    @Transactional
    public Optional<UserDto> updateUser(String userId, UserDto userDto) {
        return userRepository.findById(userId).map(user -> {
            user.setUserFirstName(userDto.getFirstName());
            user.setUserLastName(userDto.getLastName());
            user.setUserType(userDto.getUserType());
            return toDto(userRepository.save(user));
        });
    }

    @Transactional
    public boolean deleteUser(String userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }

    private UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setUserId(user.getUserId());
        dto.setFirstName(user.getUserFirstName());
        dto.setLastName(user.getUserLastName());
        dto.setUserType(user.getUserType());
        return dto;
    }
}
