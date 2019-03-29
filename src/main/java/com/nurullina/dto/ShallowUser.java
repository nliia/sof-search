package com.nurullina.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author lnurullina
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShallowUser {
    private String display_name;
    private String profile_image;
    private String link;

    ShallowUser() {

    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "ShallowUser{" +
                "display_name='" + display_name + '\'' +
                ", profile_image='" + profile_image + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
