package org.hierax.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.hierax.affirmations.adapter.AffirmationAdapter
import org.hierax.affirmations.data.Datasource
import org.hierax.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataset = Datasource().loadAffirmations()
        val recyclerView = binding.affirmationRecyclerView
        recyclerView.adapter = AffirmationAdapter(this, dataset)
        recyclerView.setHasFixedSize(true)
    }

}