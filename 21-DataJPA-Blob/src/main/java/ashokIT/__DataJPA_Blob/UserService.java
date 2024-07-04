package ashokIT.__DataJPA_Blob;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public void saveUser() {

  try{
      String imgPath = "D:\\INTELIJ-spring-practice\\images\\black_sharee.png";

      User user = new User();
      user.setUserName("Fatima Begum");
      user.setUserEmail("begumfatima69@gmail.com");


     long size =  Files.size(Paths.get(imgPath));
      byte[] arr = new byte[4096];
      FileInputStream fis = new FileInputStream(new File(imgPath));
      fis.read(arr);
      user.setUserImage(arr);

      fis.close();
      userRepo.save(user);
  }catch(Exception e){
      System.out.println(e.getMessage());
  }








    }

}
