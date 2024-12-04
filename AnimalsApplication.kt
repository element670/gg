package com.example.animals

import android.app.Application
import com.example.animalsdatabase.AnimalRepo

class AnimalsApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        AnimalRepo.init(this)

    }
}