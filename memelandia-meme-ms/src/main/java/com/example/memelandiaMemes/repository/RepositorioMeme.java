package com.example.memelandiaMemes.repository;

import com.example.memelandiaMemes.model.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, Long> {
}
