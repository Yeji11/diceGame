package com.yeji.dicegame.repository;


import com.yeji.dicegame.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends JpaRepository<Player,Long>{
}
