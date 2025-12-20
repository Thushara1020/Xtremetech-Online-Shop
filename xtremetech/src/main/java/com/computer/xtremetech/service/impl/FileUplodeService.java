package com.computer.xtremetech.service.impl;

import org.springframework.web.multipart.MultipartFile;

public interface FileUplodeService {

    String uploadFile(MultipartFile file);

    boolean deleteFile(String imgUrl);

}
