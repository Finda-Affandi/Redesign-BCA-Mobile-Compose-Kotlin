package edu.uksw.fti.pam.pam_activity.ui.screens

import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity.HomeActivity
import edu.uksw.fti.pam.pam_activity.contracts.SignupContract
import edu.uksw.fti.pam.pam_activity.ui.theme.PAM_ActivityTheme
import edu.uksw.fti.pam.pam_activity.R



internal fun doAuth(
    username: String,
    password: String,
): Boolean {
    return (username.equals("admin") && password.equals("admin"))
}

@Composable
fun LoginForm() {
    val lContext = LocalContext.current

    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    val getUsernameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignupContract(),
        onResult = {usernameInput = it!!})

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = usernameInput.toString(),
            onValueChange = { usernameInput = it },
            label = { Text(text = stringResource(R.string.username)) },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = passwordInput.toString(),
            onValueChange = { passwordInput = it },
            label = { Text(text = stringResource(R.string.password)) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
        )
        Row() {
            Button(
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                onClick = {
                    val isAuthtenticated = doAuth(usernameInput, passwordInput)
                    if (isAuthtenticated) {
                        lContext.startActivity(
                            Intent(lContext, HomeActivity::class.java)
                                .apply {
                                    putExtra("username", usernameInput)
                                }
                        )
                    }
                }
            ) {
                Text(
                    text = "Login",
                    color = Color(0xfff8fbff)
                )
            }

            Button(
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                modifier =  Modifier
                    .padding(start = 10.dp),
                onClick = {
                    getUsernameFromSignedUpForm.launch("")
                }
            ) {
                Text(
                    text = "SignUp",
                    color = Color(0xfff8fbff)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    PAM_ActivityTheme {
        LoginForm()
    }
}