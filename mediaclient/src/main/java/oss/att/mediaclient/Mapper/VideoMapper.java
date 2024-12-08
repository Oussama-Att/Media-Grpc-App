package oss.att.mediaclient.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.lab.Video;
import oss.att.mediaclient.Service.VideoDto;

@Component
public class VideoMapper {


    ModelMapper mapper = new ModelMapper();

    public VideoDto fromVideoProtoTovideoDto(Video video) {
        return mapper.map(video, VideoDto.class);
    }
}
