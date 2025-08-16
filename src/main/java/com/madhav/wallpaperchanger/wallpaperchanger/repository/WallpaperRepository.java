package com.madhav.wallpaperchanger.wallpaperchanger.repository; // your package name here

import com.madhav.wallpaperchanger.wallpaperchanger.model.Wallpaper;
import org.springframework.data.jpa.repository.JpaRepository;

// Step 2: Repository
public interface WallpaperRepository extends JpaRepository<Wallpaper, Long> {
    // No code needed — Spring will handle it
}
