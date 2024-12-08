package oss.att.mediaserver;

import net.devh.boot.grpc.server.service.GrpcService;
import org.modelmapper.ModelMapper;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;
import org.xproce.lab.VideoServiceGrpc;
import io.grpc.stub.StreamObserver;
import oss.att.mediaserver.Dto.VideoDto;
import oss.att.mediaserver.entities.VideoEntity;
import oss.att.mediaserver.repositories.VideoRepository;

@GrpcService
public class VideoService extends VideoServiceGrpc.VideoServiceImplBase {

    private final VideoRepository videoRepository;
    private final ModelMapper mapper;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
        this.mapper =new ModelMapper();
    }

    @Override
    public void uploadVideo(UploadVideoRequest request, StreamObserver<Video> responseObserver) {

        // map from UploadVideoRequest to VideoEntity

        //save the VideoEntity via VideoRepository

        //map to Video

        VideoEntity videoEntity = new VideoEntity();
        videoEntity.setTitle(request.getTitle());
        videoEntity.setDescription(request.getDescription());
        videoEntity.setUrl(request.getUrl());
        videoEntity.setDurationSeconds(request.getDurationSeconds());
        videoEntity.setCreatorName(request.getCreator().getName());
        videoEntity.setCreatorEmail(request.getCreator().getEmail());

        VideoEntity savedEntity = videoRepository.save(videoEntity);

        VideoDto videoDto = mapper.map(savedEntity, VideoDto.class);

//        Video video = Video.newBuilder()
//                .setId("1234")
//                .setTitle(request.getTitle())
//                .setDescription(request.getDescription())
//                .setUrl(request.getUrl())
//                .setDurationSeconds(request.getDurationSeconds())
//                .setCreator(request.getCreator())
//                .build();

        responseObserver.onNext(video);
        responseObserver.onCompleted();

    }
}