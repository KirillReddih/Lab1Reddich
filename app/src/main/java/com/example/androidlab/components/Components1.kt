package com.example.androidlab.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidlab.R
import com.example.androidlab.ui.packages.MyTextStyle
import com.example.androidlab.ui.packages.colorChip

@Composable
fun Chip(text: String) {
    Box(
        modifier = Modifier
            .padding(horizontal = 4.dp)
            .background(
                Color(android.graphics.Color.parseColor(colorChip)),
                shape = RoundedCornerShape(45.dp)
            )
            .padding(8.dp)
    ) {
        Text(
            text = text,
            style = MyTextStyle.ChipStyle
        )
    }
}

@Composable
fun Comments(image: Int, name: String, date: String, text: String) {
    Column(modifier = Modifier.padding(start = 24.dp)) {
        Row {
            Image(
                painter = painterResource(id = image),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(36.dp)
                    .width(36.dp)
                    .clip(RoundedCornerShape(25.dp))
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = name,
                    style = MyTextStyle.CommentNameStyle
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = date,
                    style = MyTextStyle.CommentDateStyle
                )
            }
        }
        Text(
            text = text,
            style = MyTextStyle.CommentTextStyle,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Line() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 38.dp)
            .padding(vertical = 24.dp)
    ) {
        Divider(
            color = Color.Gray,
            thickness = 1.dp,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

