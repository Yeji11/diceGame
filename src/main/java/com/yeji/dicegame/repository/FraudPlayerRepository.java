package com.yeji.dicegame.repository;

import com.yeji.dicegame.domain.FraudPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FraudPlayerRepository extends JpaRepository<FraudPlayer,Long> {
    }

