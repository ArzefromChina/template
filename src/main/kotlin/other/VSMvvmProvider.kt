package other


import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.mvvm.activity.mvvmActivityTemplate

/**
 * Author: Arze
 * Date: 2022/6/2 9:50
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * Arze 2022/6/2 1.0
 */
class VSMvvmProvider : WizardTemplateProvider() {

    override fun getTemplates(): List<Template> {

        return  mutableListOf(mvvmActivityTemplate)
    }
}