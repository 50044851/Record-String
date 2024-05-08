package com.example.recordstring

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recordstring.ui.theme.RecordStringTheme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecordStringTheme {
                RecordStringPage()
            }
        }
    }
}

@Preview
@Composable
fun RecordStringPage(modifier: Modifier = Modifier
    .background(MaterialTheme.colorScheme.background)
    .fillMaxSize(1f)
) {
    StringNumberLabel(modifier)
    SoakTimeLabel(modifier)
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

@Composable
fun StringNumberLabel(modifier: Modifier = Modifier
    .offset(y = (70).dp)
    .fillMaxHeight(0.4f)
    .fillMaxWidth(0.5f)
    .padding(8.dp)) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {Text(stringResource(R.string.String_Number))}
}

@Composable
fun StringNumberDBO(modifier: Modifier = Modifier) {
    val ports = arrayOf("Annalong -11", "")