
package com.vesync.sport.health.view
import android.os.Bundle
import com.vesync.base.BaseMvvmActivity
import androidx.lifecycle.ViewModelProviders
import androidx.fragment.app.FragmentActivity
import com.vesync.sport.health.R
import com.vesync.sport.health.BR
import com.vesync.sport.health.databinding.HealthDeviceActivityMainBinding

class MainActivity : BaseMvvmActivity<HealthDeviceActivityMainBinding,MainViewModel>() {

 override fun initContentView(savedInstanceState: Bundle?) =  R.layout.health_deviceactivity_main2
 
 
 override fun createViewModel(p0: FragmentActivity?) =  ViewModelProviders.of(this)[MainViewModel::class.java]
 
 
 override fun initVariableId() = BR.mainViewModel
 
 } 
