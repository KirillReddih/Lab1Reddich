package com.example.androidlab.ui.packages


import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
        bodyLarge = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
        )
        /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
object MyTextStyle {
        val ChipStyle = TextStyle(
                color = Color(android.graphics.Color.parseColor(colorChipText)),
                fontSize = 10.sp,
                fontWeight = FontWeight.W500,
                letterSpacing = 0.5.sp
        )
        val CommentNameStyle = TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.W400,
                letterSpacing = 0.5.sp
        )
        val CommentDateStyle = TextStyle(
                color = Color(android.graphics.Color.parseColor(colorDarkGray)),
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                letterSpacing = 0.5.sp
        )
        val CommentTextStyle = TextStyle(
                color = Color.Gray,
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                letterSpacing = 0.5.sp,
        )
        val HeaderTextStyle = TextStyle(
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 26.sp,
                letterSpacing = 0.5.sp
        )
        val HeaderCounterStyle = TextStyle(
                color = Color(android.graphics.Color.parseColor(colorDarkGray)),
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                lineHeight = 26.sp,
                letterSpacing = 0.5.sp
        )
        val DescriptionStyle = TextStyle(
                color = Color.Gray,
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                lineHeight = 19.sp,
                letterSpacing = 0.5.sp
        )
        val RewiewAndRatingsTextStyle = TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.W700,
                lineHeight = 19.sp,
                letterSpacing = 0.6.sp
        )
        val RatingRatingStyle = TextStyle(
                color = Color.White,
                fontSize = 48.sp,
                fontWeight = FontWeight.W700,
                letterSpacing = 0.5.sp
        )
        val RatingCounterStyle = TextStyle(
                color = Color.Gray,
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                lineHeight = 26.sp,
                letterSpacing = 0.5.sp
        )
        val ButtonStyle = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.W700,
                letterSpacing = 0.6.sp
        )
}