package com.yeji.dicegame.repository;


import com.yeji.dicegame.domain.GamePlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GamePlayerRepository extends JpaRepository<GamePlayer,Long>{
}
