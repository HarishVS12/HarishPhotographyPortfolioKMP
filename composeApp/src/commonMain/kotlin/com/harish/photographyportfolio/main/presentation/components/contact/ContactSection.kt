package com.harish.photographyportfolio.main.presentation.components.contact

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harish.photographyportfolio.core.presentation.getPrimaryFontFamily
import harishphotographyportfolio.composeapp.generated.resources.Res
import harishphotographyportfolio.composeapp.generated.resources.github
import harishphotographyportfolio.composeapp.generated.resources.instagram
import harishphotographyportfolio.composeapp.generated.resources.linkedin
import org.jetbrains.compose.resources.painterResource

@Composable
fun ContactSection(modifier: Modifier = Modifier, headerTextSize: Int, isSpacingRequired: Boolean) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Contact  me",
            modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally),
            fontFamily = getPrimaryFontFamily(),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Normal,
            fontSize = headerTextSize.sp,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            letterSpacing = TextUnit(-8f, TextUnitType.Sp)
        )
        Spacer(modifier = if (isSpacingRequired) Modifier.height(60.dp) else Modifier.height(32.dp))
        //Row of 3 images
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = if (isSpacingRequired) Arrangement.Center else Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(Res.drawable.instagram),
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )
            if (isSpacingRequired)
                Spacer(modifier = Modifier.width(60.dp))
            Image(
                painter = painterResource(Res.drawable.linkedin),
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            if (isSpacingRequired)
                Spacer(modifier = Modifier.width(60.dp))
            Image(
                painter = painterResource(Res.drawable.github),
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

        }
        Spacer(modifier = Modifier.height(40.dp))
    }
}