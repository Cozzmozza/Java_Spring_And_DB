package com.filesystem.hw.filesystem.components;

import com.filesystem.hw.filesystem.models.File;
import com.filesystem.hw.filesystem.models.Folder;
//import com.filesystem.hw.filesystem.models.User;
import com.filesystem.hw.filesystem.repositories.FileRepository;
import com.filesystem.hw.filesystem.repositories.FolderRepository;
//import com.filesystem.hw.filesystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;
//
//    @Autowired
//    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
//        User user1 = new User("Cozza");
//        userRepository.save(user1);
//
//        User user2 = new User("Mozza");
//        userRepository.save(user2);

//        Folder folder11 = new Folder("Text", user1);
//        folderRepository.save(folder11);
//
//        Folder folder12 = new Folder("Images", user1);
//        folderRepository.save(folder12);
//
//        Folder folder21 = new Folder("All", user2);
//        folderRepository.save(folder21);

        Folder folder11 = new Folder("Text");
        folderRepository.save(folder11);

        Folder folder12 = new Folder("Images");
        folderRepository.save(folder12);

        Folder folder21 = new Folder("All");
        folderRepository.save(folder21);

        File file111 = new File("Notes", "txt", 32.50, folder11);
        fileRepository.save(file111);

        File file112 = new File("Instructions", "txt", 280.53, folder11);
        fileRepository.save(file112);

        File file121 = new File("Screenshot", "img", 2050.19, folder12);
        fileRepository.save(file121);

        File file211 = new File("Some file", ".xls", 283020.38, folder21);
        fileRepository.save(file211);
    }
}
