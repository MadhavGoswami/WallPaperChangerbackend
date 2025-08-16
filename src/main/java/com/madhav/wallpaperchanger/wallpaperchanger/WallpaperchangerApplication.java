package com.madhav.wallpaperchanger.wallpaperchanger;

import com.madhav.wallpaperchanger.wallpaperchanger.model.Wallpaper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.madhav.wallpaperchanger.wallpaperchanger.repository.WallpaperRepository;
@SpringBootApplication
public class WallpaperchangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallpaperchangerApplication.class, args);
	}
    @Bean
    public CommandLineRunner demo(WallpaperRepository repository){
        return(args)->{
            System.out.println(">>> DEMO RUNNING <<<");
            Wallpaper wp=new Wallpaper("Test","Test.jpg");
            repository.save(wp);

            System.out.println("Wallpaper in Database:");
            for(Wallpaper wallpaper:repository.findAll()){
                System.out.println(wallpaper);
            }
        };
    }

}
