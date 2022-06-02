package other.mvvm.activity.src.app_package

/**
 * Author: Arze
 * Date: 2022/6/2 10:01
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * Arze 2022/6/2 1.0
 */
fun mvvmViewModel(
    packageName: String,
    activityClass: String
) = """
package ${packageName}
import com.vesync.base.BaseViewModel
import android.app.Application
class ${activityClass}ViewModel(application: Application) : BaseViewModel(application) {
    
   fun back() {
      finish()
   }
} 
"""