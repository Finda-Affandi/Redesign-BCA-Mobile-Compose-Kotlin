package edu.uksw.fti.pam.pam_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
                        Text(text = "Williard Towsend",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            color = Color(0xfff8fbff))
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

                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier
                            .width(200.dp)
                    ) {
                        Button(
                            onClick = { },
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                            modifier = Modifier
                                .padding(14.dp, 13.dp, 153.dp, 13.dp)
                                .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                                .width(width = 200.dp)
                                .height(height = 66.dp)){

                            Column() {
                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Saldo Anda",
                                        textAlign = TextAlign.Left,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = Color(0xfff8fbff))
                                }

                                Row(
                                ) {
                                    Text(
                                        text = "Rp",
                                        fontWeight = FontWeight.Light,
                                        fontSize = 14.sp,
                                        color = Color(0xfff8fbff),
                                        modifier = Modifier
                                            .padding(top = 2.dp)
                                    )
                                    Text(
                                        text = "97.548.506,00",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp,
                                        color = Color(0xfff8fbff),
                                        modifier = Modifier
                                            .padding(start = 5.dp)
                                    )
                                }
                            }
                        }
                    }

                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .width(70.dp)
                                .height(92.dp)
                                .padding(end = 14.dp)
                        ) {

                            Row(
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_payment),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(35.dp)
                                        .height(35.dp)
                                        .padding(start = 0.dp)
                                )
                            }

                            Row(
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Pembayaran",
                                    color = Color(0xff666666),
                                    textAlign = TextAlign.Center,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }
                        
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .width(70.dp)
                                .height(92.dp)
                                .padding(end = 14.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_transfer),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(30.dp)
                                        .height(30.dp)
                                        .padding(end = 0.dp)
                                )
                            }

                            Row(
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Transfer",
                                    color = Color(0xff666666),
                                    textAlign = TextAlign.Center,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
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
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                .padding(16.dp, 300.dp, 274.dp, 430.dp)
                        .padding(start = 0.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_info),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(30.dp)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "m-Info",
                                color = Color(0xff666666),
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                        .padding(16.dp, 389.dp, 274.dp, 341.dp)
                        .padding(start = 0.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_keyboard),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(30.dp)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Keyboard",
                                color = Color(0xff666666),
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                }
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
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                .padding(102.dp, 300.dp, 188.dp, 430.dp)
                        .padding(start = 7.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_commerce),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(30.dp)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Commerce",
                                color = Color(0xff666666),
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                        .padding(102.dp, 389.dp, 188.dp, 341.dp)
                        .padding(start = 7.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_flazz),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(30.dp)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Flazz",
                                color = Color(0xff666666),
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                }
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
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                    .padding(188.dp, 300.dp, 102.dp, 430.dp)
                        .padding(start = 13.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_cardless),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(30.dp)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Cardless",
                                color = Color(0xff666666),
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                        .padding(188.dp, 389.dp, 102.dp, 341.dp)
                        .padding(start = 13.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_gift),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(30.dp)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "BagiBagi",
                                color = Color(0xff666666),
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                }
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
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                    .padding(274.dp, 300.dp, 16.dp, 430.dp)
                        .padding(start = 20.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_admin),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(30.dp)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "m-Admin",
                                color = Color(0xff666666),
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
//                        .padding(274.dp, 389.dp, 16.dp, 341.dp)
                        .padding(start = 20.dp)
                        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                        .size(size = 70.dp)
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_lifestyle),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(30.dp)
                                    .height(30.dp)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Lifestyle",
                                color = Color(0xff666666),
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                }
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

                Text(
                    text = "Riwayat Transaksi",
                    color = Color(0xff3e3e3e),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(8.dp, 5.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
                        .shadow(3.dp, shape = RoundedCornerShape(10.dp))
//                        .padding(16.dp, 523.dp, 16.dp, 211.dp)
                        .fillMaxWidth()
                        .height(height = 66.dp)
                ){
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .width(180.dp)
                                .fillMaxHeight()
                        ) {
                            Text(
                                text = "Transfer Rekening",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xff3e3e3e)
                            )

                            Text(
                                text = "Larissa Clara",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xff666666),
                                modifier = Modifier
                                    .padding(top = 2.dp)
                            )

                            Text(
                                text = "20:23, 19 Januari 2023",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xff666666),
                                modifier = Modifier
                                    .padding(top = 1.dp)
                            )
                        }

                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Rp",
                                    fontSize = 14.sp,
                                    color = Color(0xff016eff).copy(alpha = 0.75f),
                                    modifier = Modifier
                                        .padding(end = 2.dp, top = 2.dp)
                            )

                                Text(
                                    text = "29.200.000,00",
                                    color = Color(0xff1763ce),
                                    textAlign = TextAlign.End,
                                    fontSize = 18.sp
                                )
                            }
                        }
                    }
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(8.dp, 5.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
                        .shadow(3.dp, shape = RoundedCornerShape(10.dp))
//                        .padding(16.dp, 600.dp, 16.dp, 134.dp)
                        .fillMaxWidth()
                        .height(height = 66.dp)
                ){
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .width(180.dp)
                                .fillMaxHeight()
                        ) {
                            Text(
                                text = "Transfer Virtual Account",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xff3e3e3e)
                            )

                            Text(
                                text = "Tokopedia",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xff666666),
                                modifier = Modifier
                                    .padding(top = 2.dp)
                            )

                            Text(
                                text = "12:31, 15 Januari 2023",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xff666666),
                                modifier = Modifier
                                    .padding(top = 1.dp)
                            )
                        }

                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Rp",
                                    fontSize = 14.sp,
                                    color = Color(0xff016eff).copy(alpha = 0.75f),
                                    modifier = Modifier
                                        .padding(end = 2.dp, top = 2.dp)
                                )

                                Text(
                                    text = "3.550.000,00",
                                    color = Color(0xff1763ce),
                                    textAlign = TextAlign.End,
                                    fontSize = 18.sp
                                )
                            }
                        }
                    }
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(8.dp, 5.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
                        .shadow(3.dp, shape = RoundedCornerShape(10.dp))
//                        .padding(16.dp, 600.dp, 16.dp, 134.dp)
                        .fillMaxWidth()
                        .height(height = 66.dp)
                ){
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .width(180.dp)
                                .fillMaxHeight()
                        ) {
                            Text(
                                text = "Pembelian Pulsa",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xff3e3e3e)
                            )

                            Text(
                                text = "Indosat",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xff666666),
                                modifier = Modifier
                                    .padding(top = 2.dp)
                            )

                            Text(
                                text = "00:13, 10 Januari 2023",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xff666666),
                                modifier = Modifier
                                    .padding(top = 1.dp)
                            )
                        }

                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Rp",
                                    fontSize = 14.sp,
                                    color = Color(0xff016eff).copy(alpha = 0.75f),
                                    modifier = Modifier
                                        .padding(end = 2.dp, top = 2.dp)
                                )

                                Text(
                                    text = "200.000,00",
                                    color = Color(0xff1763ce),
                                    textAlign = TextAlign.End,
                                    fontSize = 18.sp
                                )
                            }
                        }
                    }
                }
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
            .shadow(7.dp)
    ){
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .width(180.dp)
                    .fillMaxHeight()
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(50.dp),
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff8fbff)),
                    modifier = Modifier
                        .padding(start = 30.dp)
                        .shadow(5.dp, RoundedCornerShape(50.dp))
                        .height(40.dp)
                        .width(80.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_home),
                            contentDescription = null,
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                                .padding(top = 8.dp)
                        )
                    }
                }
            }

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .width(180.dp)
                    .fillMaxHeight()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_profile),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 105.dp)
                )
            }
        }
    }

    Button(
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
        shape = CircleShape,
        modifier = Modifier
            .padding(160.dp, 730.dp, 0.dp, 0.dp)
            .size(90.dp)
            .shadow(3.dp, shape = CircleShape)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_qr),
                    contentDescription = null,
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                )
            }
        }
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