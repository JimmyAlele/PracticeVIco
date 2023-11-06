package com.alele.practicevico.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alele.practicevico.ui.theme.PracticeVicoTheme
import com.patrykandpatrick.vico.compose.axis.horizontal.rememberBottomAxis
import com.patrykandpatrick.vico.compose.axis.vertical.rememberStartAxis
import com.patrykandpatrick.vico.compose.chart.Chart
import com.patrykandpatrick.vico.compose.chart.line.lineChart
import com.patrykandpatrick.vico.compose.component.shape.shader.fromBrush
import com.patrykandpatrick.vico.core.axis.AxisItemPlacer
import com.patrykandpatrick.vico.core.component.shape.shader.DynamicShaders
import com.patrykandpatrick.vico.core.entry.FloatEntry
import com.patrykandpatrick.vico.core.entry.entryModelOf

@Composable
fun LineChart () {
//    val data = List(200) { entryOf(it , Random.nextFloat()*10) }

    val data = listOf(
        FloatEntry(1F, 2F),
        FloatEntry(2F, 3F),
        FloatEntry(3F, 3F),
        FloatEntry(4F, 0F), // this
        FloatEntry(5F, 1F),
        FloatEntry(6F, 0F), // this
        FloatEntry(7F, 10F),
        FloatEntry(8F, 0F),
        FloatEntry(9F, 0F), // this
        FloatEntry(10F, 0F), // this
        FloatEntry(11F, 0F), // this
        FloatEntry(13F, 5F), // this
    )

    val chartEntryModel = entryModelOf(data)

    Chart(
        chart = lineChart(
            spacing = 4.dp,
            lines = listOf(
                com.patrykandpatrick.vico.core.chart.line.LineChart.LineSpec(
                    lineThicknessDp = 0.5f,
                    lineColor = MaterialTheme.colorScheme.tertiary.toArgb(),
                    lineBackgroundShader = DynamicShaders.fromBrush(
                        brush = Brush.verticalGradient(
                            listOf(
                                MaterialTheme.colorScheme.surfaceTint.copy(com.patrykandpatrick.vico.core.DefaultAlpha.LINE_BACKGROUND_SHADER_START),
                                MaterialTheme.colorScheme.surfaceTint.copy(com.patrykandpatrick.vico.core.DefaultAlpha.LINE_BACKGROUND_SHADER_END)
                            )
                        )
                    )
                )
            ),
        ),
        model = chartEntryModel,
        startAxis = rememberStartAxis(
            itemPlacer = AxisItemPlacer.Vertical.default(maxItemCount = 5),
            guideline = null
        ),
        bottomAxis = rememberBottomAxis(
            itemPlacer = AxisItemPlacer.Horizontal.default(
                spacing = data.size/5,
                offset = 10,
                shiftExtremeTicks = false
            ),
            guideline = null,
            tickLength = 0.dp,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun LineChartPreview() {
    PracticeVicoTheme {
        LineChart()
    }
}