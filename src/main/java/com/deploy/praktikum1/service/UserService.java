package com.deploy.praktikum1.service;

import com.deploy.praktikum1.model.dto.UserAddRequest;
import com.deploy.praktikum1.model.dto.UserDto;

import java.util.List;

public interface UserService {
    // Semuanya diawali huruf kecil (camelCase)
    UserDto addUser(UserAddRequest request);

    // Tambahkan 's' untuk menandakan jamak (karena mengembalikan List)
    List<UserDto> getAllUsers();

    UserDto getUserById(String id);
    UserDto updateUser(String id, UserAddRequest request);
    void deleteUser(String id);
}
