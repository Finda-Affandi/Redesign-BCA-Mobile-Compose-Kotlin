package edu.uksw.fti.pam.pam_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.material.navigation.NavigationBarMenu
import edu.uksw.fti.pam.pam_activity.ui.theme.PAM_ActivityTheme

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_ActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""
//                    Greeting("Android")
                    Ellipse()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

@Composable
fun Ellipse() {
    Box(
        modifier = Modifier
            .width(width = 360.dp)
            .height(height = 800.dp)
            .background(color = Color(0xfff8fbff))
    )

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(16.dp, 168.dp, 16.dp, 541.dp)
            .width(width = 328.dp)
            .height(height = 92.dp)
            .shadow(7.dp, shape = RoundedCornerShape(16.dp))
            .clip(shape = RoundedCornerShape(16.dp))){}

    Card(
        backgroundColor = Color(0xff1763ce),
        modifier = Modifier
            .padding(30.dp, 181.dp, 169.dp, 553.dp)
            .width(width = 161.dp)
            .height(height = 66.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(16.dp, 300.dp, 274.dp, 430.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .size(size = 70.dp)
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(102.dp, 300.dp, 188.dp, 430.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .size(size = 70.dp)
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(188.dp, 300.dp, 102.dp, 430.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .size(size = 70.dp)
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(274.dp, 300.dp, 16.dp, 430.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .size(size = 70.dp)
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(16.dp, 389.dp, 274.dp, 341.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .size(size = 70.dp)
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(102.dp, 389.dp, 188.dp, 341.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .size(size = 70.dp)
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(188.dp, 389.dp, 102.dp, 341.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .size(size = 70.dp)
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(274.dp, 389.dp, 16.dp, 341.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .size(size = 70.dp)
            .clip(shape = RoundedCornerShape(12.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(16.dp, 523.dp, 16.dp, 211.dp)
            .shadow(3.dp, shape = RoundedCornerShape(10.dp))
            .width(width = 328.dp)
            .height(height = 66.dp)
            .clip(shape = RoundedCornerShape(10.dp))){}

    Card(
        backgroundColor = Color(0xfff8fbff),
        modifier = Modifier
            .padding(16.dp, 600.dp, 16.dp, 134.dp)
            .shadow(3.dp, shape = RoundedCornerShape(10.dp))
            .width(width = 328.dp)
            .height(height = 66.dp)
            .clip(shape = RoundedCornerShape(10.dp))){}

    Card(
        backgroundColor = Color(0xff1763ce),
        modifier = Modifier
            .padding(0.dp, 730.dp, 0.dp, 0.dp)
            .width(width = 360.dp)
            .height(height = 70.dp)){}

    }



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAM_ActivityTheme {
//        Greeting("Android")
        Ellipse()
    }
}