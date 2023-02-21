package edu.uksw.fti.pam.pam_activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import edu.uksw.fti.pam.pam_activity.ui.screens.SignUp
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
                    SignUp(::sendUsernameBackToLogin)
                }
            }
        }
    }
    private fun sendUsernameBackToLogin(username: String?) {
        val result = Intent().putExtra("username", username)
        setResult(Activity.RESULT_OK, result)
        finish()
    }
}



//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

