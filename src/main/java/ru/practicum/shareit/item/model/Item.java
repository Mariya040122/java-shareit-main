package ru.practicum.shareit.item.model;

import lombok.Data;

/**
 * TODO Sprint add-controllers.
 */

@Data
public class Item {

    long id;  //уникальный идентификатор вещи
    String name; // краткое название
    String description; //развёрнутое описание
    boolean available; //статус о том, доступна или нет вещь для аренды
    String owner;  //владелец вещи
    String request; //ссылка на запрос
}
