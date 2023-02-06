package edu.uksw.fti.pam.pam_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
//                    val username = getIntent().getStringExtra("username") ?: ""
//                    Greeting("Android")
                    Home()
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
fun Home() {


    Image(
        painter = painterResource(id = R.drawable.header),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 12.dp)
                .fillMaxWidth()
                .height(135.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column() {
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_notification),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(top = 7.dp, end = 5.dp)
                                .width(40.dp)
                                .height(40.dp)
                                .clip(CircleShape)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.profile_photo),
                            contentDescription = null,
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp)
                                .clip(CircleShape)
                        )
                    }
                }
                
                Column() {
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(text = "Williard Towsend", fontWeight = FontWeight.SemiBold, fontSize = 20.sp, color = Color(0xfff8fbff))
                    }
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth()
                .height(120.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Card(
                    backgroundColor = Color(0xfff8fbff),
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 0.dp, 0.dp)
                        .fillMaxWidth()
                        .height(height = 92.dp)
                        .shadow(7.dp, shape = RoundedCornerShape(16.dp))
                        .clip(shape = RoundedCornerShape(16.dp))){

                    Button(
                        onClick = { },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                        modifier = Modifier
                            .padding(14.dp, 13.dp, 153.dp, 13.dp)
                            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                            .width(width = 161.dp)
                            .height(height = 66.dp)){
                        
                        Column() {
                            Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(text = "Saldo Anda", textAlign = TextAlign.Left, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                            }

                            Row(
                            ) {
                                Text(
                                    text = "Rps",
                                    fontWeight = FontWeight.Light,
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                    )
                                Text(text = "10.000.500,00", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                            }
                        }
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(90.dp),

                ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                .padding(16.dp, 300.dp, 274.dp, 430.dp)
                        .padding(start = 0.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)){}

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                        .padding(16.dp, 389.dp, 274.dp, 341.dp)
                        .padding(start = 0.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)){}
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(90.dp)
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                .padding(102.dp, 300.dp, 188.dp, 430.dp)
                        .padding(start = 7.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)){}

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                        .padding(102.dp, 389.dp, 188.dp, 341.dp)
                        .padding(start = 7.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)){}
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(90.dp)
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                    .padding(188.dp, 300.dp, 102.dp, 430.dp)
                        .padding(start = 13.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)){}

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                        .padding(188.dp, 389.dp, 102.dp, 341.dp)
                        .padding(start = 13.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)){}
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(90.dp)
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                    .padding(274.dp, 300.dp, 16.dp, 430.dp)
                        .padding(start = 20.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)){}

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                        .padding(274.dp, 389.dp, 16.dp, 341.dp)
                        .padding(start = 20.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)){}
            }
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
                        .shadow(3.dp, shape = RoundedCornerShape(10.dp))
//                        .padding(16.dp, 523.dp, 16.dp, 211.dp)
                        .fillMaxWidth()
                        .height(height = 66.dp)){}

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
                        .shadow(3.dp, shape = RoundedCornerShape(10.dp))
//                        .padding(16.dp, 600.dp, 16.dp, 134.dp)
                        .fillMaxWidth()
                        .height(height = 66.dp)){}

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
                        .shadow(3.dp, shape = RoundedCornerShape(10.dp))
//                        .padding(16.dp, 600.dp, 16.dp, 134.dp)
                        .fillMaxWidth()
                        .height(height = 66.dp)){}
            }
        }
    }

    Card(
        backgroundColor = Color(0xff1763ce),
        modifier = Modifier
//                    .padding(0.dp, 730.dp, 0.dp, 0.dp)
            .padding(top = 773.dp, start = 7.dp, end = 7.dp)
            .fillMaxWidth()
            .height(height = 70.dp)
            .shadow(7.dp)){}

    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
        shape = CircleShape,
        modifier = Modifier
            .padding(160.dp, 730.dp, 0.dp, 0.dp)
            .size(90.dp)
            .shadow(3.dp, shape = CircleShape)
    ) {

    }
}



@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    PAM_ActivityTheme {
//        Greeting("Android")
        Home()
    }
}