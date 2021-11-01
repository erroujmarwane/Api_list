package com.example.api_list.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import com.example.api_list.GitRepo;
import com.example.api_list.model.GitUserResponse;

public interface GitRepoServiceAPI {
    @GET("search/users")
    public Call<GitUserResponse> searchUsers (@Query("q") String query);

    @GET("users/{u}/repos")
    public Call<List<GitRepo>> userRepos (@Path("u") String username);
}
