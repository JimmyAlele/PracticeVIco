package com.alele.practicevico.ui
/*
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.patrykandpatrick.vico.compose.axis.horizontal.rememberBottomAxis
import com.patrykandpatrick.vico.compose.axis.vertical.rememberStartAxis
import com.patrykandpatrick.vico.compose.chart.column.columnChart
import com.patrykandpatrick.vico.core.chart.Chart
import com.patrykandpatrick.vico.core.entry.ChartEntryModelProducer
import com.patrykandpatrick.vico.core.entry.entryOf
import kotlin.random.Random

@Composable
fun Barchart () {

    val data = List(200) { entryOf(it , Random.nextFloat()*10) }

    val chartEntryModelProducer = ChartEntryModelProducer(getRandomEntries())

    Chart(
        chart = remember(
            columnChart(
                spacing = 1.dp,
        )
        ),
        chartModelProducer = chartEntryModelProducer,
        startAxis = rememberStartAxis(),
        bottomAxis = rememberBottomAxis(),
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
    )
}

fun getRandomEntries() = List(4) { entryOf(it, Random.nextFloat() * 16f) }
*/
