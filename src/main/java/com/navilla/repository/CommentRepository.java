package com.navilla.repository;

import com.navilla.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mramos on 8/23/2016.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
