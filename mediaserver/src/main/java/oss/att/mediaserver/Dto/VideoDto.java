package oss.att.mediaserver.Dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class VideoDto {
    String id;
    String title;
    String description;
    String url;
    int duration_seconds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDuration_seconds() {
        return duration_seconds;
    }

    public void setDuration_seconds(int duration_seconds) {
        this.duration_seconds = duration_seconds;
    }
}