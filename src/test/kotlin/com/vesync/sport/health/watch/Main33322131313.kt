
package com.vesync.sport.health.watch
import android.os.Bundle
import com.vesync.base.BaseMvvmActivity
import androidx.lifecycle.ViewModelProviders
import androidx.fragment.app.FragmentActivity
import com.vesync.sport.health.R
import com.vesync.sport.health.BR
import com.vesync.sport.health.databinding.HealthDeviceActivityMain33322131313Binding

class Main33322131313Activity : BaseMvvmActivity<HealthDeviceActivityMain33322131313Binding,Main33322131313ViewModel>() {

 override fun initContentView(savedInstanceState: Bundle?) =  R.layout.health_deviceactivity_main2
 
 
 override fun createViewModel(p0: FragmentActivity?) =  ViewModelProviders.of(this)[Main33322131313ViewModel::class.java]
 
 
 override fun initVariableId() = BR.main33322131313ViewModel
 
 } 
