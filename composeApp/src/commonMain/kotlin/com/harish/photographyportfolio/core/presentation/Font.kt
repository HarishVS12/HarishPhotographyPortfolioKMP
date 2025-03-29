package com.harish.photographyportfolio.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import harishphotographyportfolio.composeapp.generated.resources.Res
import harishphotographyportfolio.composeapp.generated.resources.mon_bold
import harishphotographyportfolio.composeapp.generated.resources.mon_extra_bold
import harishphotographyportfolio.composeapp.generated.resources.mon_medium
import harishphotographyportfolio.composeapp.generated.resources.mon_regular
import harishphotographyportfolio.composeapp.generated.resources.mon_semi_bold
import org.jetbrains.compose.resources.Font


@Composable
fun getPrimaryFontFamily() =
    FontFamily(
        Font(Res.font.mon_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
        Font(Res.font.mon_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
        Font(Res.font.mon_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
        Font(Res.font.mon_semi_bold, weight = FontWeight.SemiBold, style = FontStyle.Normal),
        Font(Res.font.mon_extra_bold, weight = FontWeight.ExtraBold, style = FontStyle.Normal)
    )
