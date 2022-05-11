package com.example.secondweeklifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.secondweeklifecycleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*
2.9 "Выявить отличия жизненного цикла фрагмента от жизненного цикла активити, ответить на вопрос - для чего нужны эти отличия, почему они возникли?"
Для начала нужно понимать, что фрагменты являются частью активити.
- фрагменты не могут существовать без активити.
- активити может содержать несколько фрагментов
- для взаимодействия с активити мы должны зарегистрировать её в манифесте, для фрагмента это не нужно
- в зависимости от экрана устройства, мы можем использовать сразу два фрагмента и более, в то время как с активити такое недоступно
2.10 "Описать в комментарии к основному экрану - для чего нужен жизненный цикл и какие задачи можно с помощью него решать?"
ЖЦ позволяет использовать приложение с меньшим количеством ошибок, грамотным использованием ресурсов системы и, чтобы,
пользователь мог пользоваться приложением без каких-либо проблем,а в случае их возникновения, вернуться в приложение не потеряв данные.

Пример жизненного цикла приложения ЯндексGo (такси) -
OnCreate - активити создана, но не представлена пользователю
    |
OnStart - UI создан, но пользователь не может взаимодействовать с приложением.
          Здесь происходит авторизация, подключение к БД и определение вашей геолокации,
          т.е. с тем, что должно работать пока интерфейс будет виден пользователю.
OnResume - запускаются анимации и др. компоненты, пользователь может взаимодействовать с приложением.
          Пользователь выбирает адрес и заказывает такси, после чего, как обычно пользователь либо свернул либо закрыл приложение ->
    |
OnPause - взаимодействие с приложением перестает быть доступным
    |
OnStop - взаимодействие перестает быть доступным и UI не виден пользователю
    |
(OnSaveInstanceState) - сохраняется состояние активити, в случае возврата в приложение, пользователь получит данные о своем заказе такси.
    |
OnDestroy - приложение закрывается

    */
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("MyTag", "Main activity - OnCreate")
        binding.firstActivityNavigateButton.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }

        binding.secondActivityNavigateButton.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "Main activity - OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "Main activity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "Main activity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "Main activity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag", "Main activity - onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MyTag", "Main activity - onSaveInstanceState")
    }

}