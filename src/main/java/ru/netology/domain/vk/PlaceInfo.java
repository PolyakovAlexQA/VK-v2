package ru.netology.domain.vk;

import lombok.Data;

@Data

public class PlaceInfo {
    private int id;
    private String title;
    private int latitude;
    private int longitude;
    private int created;
    private String icon;
    private int checkins;
    private int updated;
    private int type;
    private int country;
    private int city;
    private String address;
}
