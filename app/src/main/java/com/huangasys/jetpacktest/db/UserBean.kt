package com.huangasys.jetpacktest.db

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * Created by "huangasys" on 2020/4/20.23:49
 */
@Entity(tableName = "tb_user")
data class UserBean(
    @PrimaryKey
    val uid: Int = 0,
    @ColumnInfo
    val name: String,
    @ColumnInfo
    val sex: Int,//0女1男
    @ColumnInfo
    val age: Int,
    @ColumnInfo
    val city: String
)

@Dao
interface UserDao {
    @Query(value = "select * from tb_user where uid = 0 ")
    fun query(): LiveData<UserBean>

    @Insert(entity = UserBean::class, onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: UserBean)

    @Update
    fun update(user: UserBean)

    @Delete
    fun delete(user: UserBean)

}