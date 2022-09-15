package ru.practicum.shareit.item.dto;

import lombok.*;

/**
 * TODO Sprint add-controllers.
 */

@AllArgsConstructor
@Getter
@Setter
public class ItemDto {

    long id;  //уникальный идентификатор вещи
    String name; // краткое название
    String description; //развёрнутое описание
    boolean available; //статус о том, доступна или нет вещь для аренды
    String owner;  //владелец вещи
    String request; //ссылка на запрос
}
