package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.btnToast.setOnClickListener{
            binding.ivProfile.setImageResource(R.drawable.cat)
            //ImageView에 새로운 이미지 등록
            Toast.makeText(this@MainActivity,"고앵이 최고",Toast.LENGTH_SHORT).show()
            //세번째 인자 -> 알림의 지속 길이(duration)
        }
    }
}