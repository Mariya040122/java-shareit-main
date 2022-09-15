package ru.practicum.shareit.user.model;

import lombok.Data;

/**
 * TODO Sprint add-controllers.
 */

@Data
public class User {

    long id; //уникальный идентификатор пользователя
    String name; //имя или логин пользователя
    String email; //адрес электронной почты

}
