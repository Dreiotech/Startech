package com.kimm369.startech

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kimm369.startech.ui.theme.StartechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // Greeting("Android")
                    login()
                }
            }
        }
    }
}

@Composable
fun login() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var context = LocalContext.current
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.LightGray)
    ) {
        Text(text = "UEFA Champions League",
            color = Color.Blue,
            fontSize = 38.sp,
            fontFamily = FontFamily.Cursive
        )
        OutlinedTextField(
            value = email ,
            onValueChange = {email = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email,
                contentDescription = "EMAIL")},
            label = { Text(text = "Email Address",color = Color.Cyan, fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),

            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
            )
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person ,
                contentDescription = "")},
            label = { Text(text = "Password",color = Color.Cyan, fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {
          
            Text(text = "Login",
                fontSize = 25.sp)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
                         val intent =Intent(context,RegisterActivity::class.java)
                         context.startActivity(intent)

        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Click to Register",
                fontSize = 25.sp)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent =Intent(context,IntentActivity::class.java)
            context.startActivity(intent)

        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Click to Intent",
                fontSize = 25.sp)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent =Intent(context,Simplelist::class.java)
            context.startActivity(intent)

        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Click to View",
                fontSize = 25.sp)
        }
        }
    }







@Preview
@Composable
private fun loginprev() {
    login()
}