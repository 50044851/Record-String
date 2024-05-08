package com.example.recordstring

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp


@Composable
fun StringNumberLabel(){
    Box(
        modifier = Modifier
            .width(width = (120).dp)
            .height(height = (35).dp)
            .absoluteOffset(x = (0).dp, y = (0).dp)
            .fillMaxSize(1f)
            .background(color = Color(red = 0, green = 167, blue = 185)),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "String Number",
                    fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
        )
    }
}

@Composable
fun SoakTimeLabel(){
    Box(
        modifier = Modifier
            .width(width = (120).dp)
            .height(height = (35).dp)
            .absoluteOffset(x = (0).dp, y = (0).dp)
            .fillMaxSize(1f)
            .background(color = Color(red = 0, green = 167, blue = 185)),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Soak Time",
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Composable
@Preview
fun Labels() {
    StringNumberLabel()
    SoakTimeLabel()
    DepthLabel()
    //BaitTypeLabel()
    //PotTypeLabel()
    //EscapePanelLabel()
    //StartPositionLabel()
    //EndPositionLabel()
    //NumberOfPotsLabel()
    //CatchTypeLabel()
    //PercentageLabel()
    //AdditionalCommentsLabel()
}