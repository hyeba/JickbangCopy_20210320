package com.neppplus.jickbangcopy_20210320

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210320.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20210320.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<Room>()

    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add(Room(7500, "서울시 동대문구", 2, "동대문구의 방입니다."))
        mRooms.add(Room(18500, "서울시 서대문구", 5, "서대문구의 방입니다."))
        mRooms.add(Room(2500, "서울시 동대문구", 0, "동대문구의 방입니다."))
        mRooms.add(Room(34000, "서울시 은평구", -3, "은평구의 방입니다."))
        mRooms.add(Room(111100, "서울시 서대문구", 8, "서대문구의 방입니다."))
        mRooms.add(Room(3500, "서울시 은평구", 2, "은평구의 방입니다."))
        mRooms.add(Room(5042, "서울시 동대문구", 2, "동대문구의 방입니다."))
        mRooms.add(Room(1500, "서울시 중구", 0, "중구의 방입니다."))
        mRooms.add(Room(903500, "서울시 동대문구", -1, "동대문구의 방입니다."))
        mRooms.add(Room(56500, "서울시 동대문구", 2, "동대문구의 방입니다."))
        mRooms.add(Room(5510, "서울시 중구", 2, "중구의 방입니다."))
        mRooms.add(Room(6310, "서울시 동대문구", 20, "동대문구의 방입니다."))
        mRooms.add(Room(7100, "서울시 동대문구", -2, "동대문구의 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRooms)

        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRooms[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)

        }

    }
}