package com.example.animals

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.animals.database.AnimalRepo

class FragmentAddAnimal : Fragment() {
    private val animalRepo:AnimalRepo = AnimalRepo.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}