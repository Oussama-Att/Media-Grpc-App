package oss.att.mediaserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import oss.att.mediaserver.entities.VideoEntity;

public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
}
