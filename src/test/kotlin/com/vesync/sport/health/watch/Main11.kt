
package com.vesync.sport.health.watch
import android.os.Bundle
import com.vesync.base.BaseMvvmActivity
import androidx.lifecycle.ViewModelProviders
import androidx.fragment.app.FragmentActivity
import com.vesync.sport.health.R
import com.vesync.sport.health.BR
import com.vesync.sport.health.databinding.HealthDeviceActivityMain11Binding

class Main11Activity : BaseMvvmActivity<HealthDeviceActivityMain11Binding,Main11ViewModel>() {

 override fun initContentView(savedInstanceState: Bundle?) =  R.layout.health_deviceactivity_main11
 
 
 override fun createViewModel(p0: FragmentActivity?) =  ViewModelProviders.of(this)[Main11ViewModel::class.java]
 
 
 override fun initVariableId() = BR.main11ViewModel
 
 } 
