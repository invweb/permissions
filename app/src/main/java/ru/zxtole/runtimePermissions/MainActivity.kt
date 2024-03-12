package ru.zxtole.runtimePermissions

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.zxtole.runtimePermissions.ui.theme.RuntimePermissionsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RuntimePermissionsTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    RequestPermissions(getString(R.string.request_permissions), this )
                }
            }
        }
    }
}

@Composable
fun RequestPermissions(name: String, activity: MainActivity) {
    FilledTonalButton(
        modifier = Modifier.height(100.dp).width(200.dp),
        onClick = { exec(activity) }) {
        Text(name)
    }
}

fun exec(activity: Activity) {
    requestPermissions(activity)
}
