package com.example.model

import jakarta.persistence.*

@Entity
data class Player(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column
        val name: String,

        @Column
        val age: Int,

        @Column
        val position: String
){}
