package oss.att.mediaclient.Service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;
import org.xproce.lab.VideoServiceGrpc;
import oss.att.mediaclient.Mapper.VideoMapper;

@Service
public class VideoServiceClient {

    @GrpcClient("mediaserver")
    VideoServiceGrpc.VideoServiceBlockingStub stub;

    @Autowired
    private VideoMapper mapper;

    public VideoDto uploadVideo(UploadVideoRequest videoRequest) {

        Video video = stub.uploadVideo(videoRequest);
        VideoDto videoDto = mapper.fromVideoProtoTovideoDto(video);

        return videoDto;
    }


}