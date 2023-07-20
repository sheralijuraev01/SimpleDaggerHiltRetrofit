package uz.sher.daggerhiltretrofit

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import uz.sher.daggerhiltretrofit.databinding.ActivityMainBinding
import uz.sher.daggerhiltretrofit.viewmodel.MainViewModel


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel.userData.observe(this) { data ->
            binding.textView.text = data.toString()
        }


    }
}