package ru.zxtole.runtimePermissions

import android.Manifest
import android.app.Activity
import androidx.core.app.ActivityCompat

fun requestPermissions(activity: Activity) {
    val permissionList: Array<String> = arrayOf(
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.BLUETOOTH_CONNECT,
            Manifest.permission.BLUETOOTH_SCAN
        )

    ActivityCompat.requestPermissions(
        activity,
        permissionList,
        1
    )
}