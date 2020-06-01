package com.huangasys.jetpacktest.db

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by "huangasys" on 2020/4/20.23:58
 */
@Database(entities = [UserBean::class],version = 1,exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

//    abstract fun g
}