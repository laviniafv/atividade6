package com.example.atividadehj.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.atividadehj.model.User

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insert(user: User)
}
