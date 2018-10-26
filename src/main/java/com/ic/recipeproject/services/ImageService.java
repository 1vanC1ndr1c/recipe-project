package com.ic.recipeproject.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Ivan Cindric for recipe-project
 * 26-Oct-18
 * 19:08
 **/
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);

}