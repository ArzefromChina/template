package other.mvvm.activity.src.app_package

import other.mvvm.headToLower
import other.mvvm.replaceComponent

/**
 * Author: Arze
 * Date: 2022/6/2 10:06
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * Arze 2022/6/2 1.0
 */
fun mvvmActivityKt(
    applicationPackage: String?,
    activityClass: String,
    componentName: String,
    layoutName: String,
    packageName: String
) = """
package ${packageName}
import android.os.Bundle
import com.vesync.base.BaseMvvmActivity
import androidx.lifecycle.ViewModelProviders
import androidx.fragment.app.FragmentActivity
import ${applicationPackage}.R
import ${applicationPackage}.BR
import ${applicationPackage}.databinding.${componentName.replaceComponent()}Activity${activityClass}Binding

class ${activityClass}Activity : BaseMvvmActivity<${componentName.replaceComponent()}Activity${activityClass}Binding,${activityClass}ViewModel>() {

 override fun initContentView(savedInstanceState: Bundle?) =  R.layout.${componentName}${layoutName}
 
 
 override fun createViewModel(p0: FragmentActivity?) =  ViewModelProviders.of(this)[${activityClass}ViewModel::class.java]
 
 
 override fun initVariableId() = BR.${activityClass.headToLower()}ViewModel
 
 } 
"""