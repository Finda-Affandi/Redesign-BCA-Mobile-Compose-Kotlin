package edu.uksw.fti.pam.pam_activity.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity.ui.theme.PAM_ActivityTheme
import edu.uksw.fti.pam.pam_activity.R

@Composable
fun SignUp(
    btnOnClickAction: (String?) -> Unit
) {
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
                    backgroundColor = Color(0xffcce2ff)
                ),
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
                    backgroundColor = Color(0xffcce2ff)
                ),
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
                    backgroundColor = Color(0xffcce2ff)
                ),
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
                    backgroundColor = Color(0xffcce2ff)
                ),
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
                    backgroundColor = Color(0xffcce2ff)
                ),
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
                onClick = { btnOnClickAction(usernameInput) },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                modifier = Modifier

            ) {
                Text(
                    text = "Sign Up",
                    color = Color(0xfff8fbff)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PAM_ActivityTheme {
//        Greeting("Android")
        SignUp({})
    }
}