package org.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.sample.view.rows.ImageRow
import org.sample.view.rows.ImageTextRow
import org.sample.view.rows.Row
import org.sample.view.rows.TextRow
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<Row>()
    private val random = Random(2000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.layoutManager = (LinearLayoutManager(this))

        val images = listOf(R.drawable.ic_01, R.drawable.ic_02, R.drawable.ic_03)

        val randomImage = images[images[Random.nextInt(0, 2)]]

        for (i in 0..14) {
            when (random.nextInt(3)) {
                Row.TEXT -> items.add(TextRow("Item: $i"))
                Row.IMAGE -> items.add(ImageRow(randomImage))
                Row.IMAGE_AND_TEXT -> items.add(ImageTextRow("Item: $i", randomImage))
            }
        }


    }
}