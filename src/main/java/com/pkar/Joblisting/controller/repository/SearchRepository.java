package com.pkar.Joblisting.controller.repository;

import java.util.List;

import com.pkar.Joblisting.controller.Model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}