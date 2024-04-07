package com.example.repository

import com.example.model.Player
import org.springframework.data.repository.CrudRepository

interface PlayerRepository: CrudRepository<Player, Long> {
}