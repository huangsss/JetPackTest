package com.huangasys.jetpacktest.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by "huangasys" on 2020/4/20.23:58
 */
@Database(entities = [UserBean::class,Status::class],version = 1,exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun getUserDao():UserDao
    abstract fun getStatusDao():StatusDao

    companion object{
        private var instace:UserDatabase?=null
        fun getInstance(context: Context) : UserDatabase{
            return instace?:Room.databaseBuilder(
                context,
                UserDatabase::class.java,
                "user_db").build()
        }

    }
}