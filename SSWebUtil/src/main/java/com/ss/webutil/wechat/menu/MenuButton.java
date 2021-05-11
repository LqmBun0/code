package com.ss.webutil.wechat.menu;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by liymm on 2015-04-02.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuButton {

    String type;
    String name;
    String key;
    String url;
    String media_id;
    List<MenuButton> sub_button;

    public MenuButton() {
    }

    public MenuButton(String type, String name, String key, String url, String media_id) {
        this.type = type;
        this.name = name;
        this.key = key;
        this.url = url;
        this.media_id = media_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public List<MenuButton> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<MenuButton> sub_button) {
        this.sub_button = sub_button;
    }
}
