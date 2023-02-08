package edu.uksw.fti.pam.pam_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity.ui.theme.PAM_ActivityTheme

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_ActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                    SignUp()
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
fun SignUp() {
    val lContext = LocalContext.current

    var firstnameInput by remember { mutableStateOf("") }
    var lastnameInput by remember { mutableStateOf("") }
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var confPasswordInput by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = firstnameInput.toString(),
                onValueChange = { firstnameInput = it },
                label = { Text(text = "First Name") },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)),
                modifier = Modifier
                    .width(180.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )

            TextField(
                value = lastnameInput.toString(),
                onValueChange = { lastnameInput = it },
                label = { Text(text = "Last Name") },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)),
                modifier = Modifier
                    .width(180.dp)
                    .padding(start = 10.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )
        }
        
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = usernameInput.toString(),
                onValueChange = { usernameInput = it },
                label = { Text(text = "Username") },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = passwordInput.toString(),
                onValueChange = { passwordInput = it },
                label = { Text(text = "Password") },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = confPasswordInput.toString(),
                onValueChange = { confPasswordInput = it },
                label = { Text(text = "Confirm Password") },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )
        }

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                modifier = Modifier

            ) {
                Text(
                    text = "Sign Up",
                    color = Color(0xfff8fbff))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PAM_ActivityTheme {
//        Greeting("Android")
        SignUp()
    }
}