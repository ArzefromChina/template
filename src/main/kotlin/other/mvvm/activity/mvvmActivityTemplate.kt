package other.mvvm.activity

import com.android.tools.idea.wizard.template.*

/**
 * Author: Arze
 * Date: 2022/6/2 14:00
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * Arze 2022/6/2 1.0
 */
val mvvmActivityTemplate
    get() = template {
        revision = 1
        name = "VS MVVM Activity"
        description = "适用于VS MVVM框架的Activity"

        category = Category.Activity
        formFactor = FormFactor.Mobile
        screens = listOf(
            WizardUiContext.ActivityGallery,
            WizardUiContext.MenuEntry,
            WizardUiContext.NewProject,
            WizardUiContext.NewModule
        )

        lateinit var layoutName: StringParameter

        val activityClass = stringParameter {
            name = "Activity Name"
            default = "Main"
            help = "只输入名字，不要包含Activity"
            constraints = listOf(Constraint.NONEMPTY)
        }

        val componentName = stringParameter {
            name = "Component Name prefix"
            default = "health_device_"
            constraints = listOf(Constraint.NONEMPTY)
        }

        layoutName = stringParameter {
            name = "Layout Name"
            default = "activity_main"
            help = "请输入布局的名字"
            constraints = listOf(Constraint.LAYOUT, Constraint.UNIQUE, Constraint.NONEMPTY)
            suggest = { activityToLayout(activityClass.value.toLowerCase()) }
        }

        val packageName = defaultPackageNameParameter

        widgets(
            TextFieldWidget(activityClass),
            TextFieldWidget(componentName),
            TextFieldWidget(layoutName),
            PackageNameWidget(packageName)
        )
//        thumb { File("logo.png") }
        recipe = { data: TemplateData ->
            mvvmActivityRecipe(
                data as ModuleTemplateData,
                activityClass.value,
                componentName.value,
                layoutName.value,
                packageName.value
            )
        }
    }

val defaultPackageNameParameter
    get() = stringParameter {
        name = "Package name"
        visible = { !isNewModule }
        default = "com.neo.myapp"
        constraints = listOf(Constraint.PACKAGE)
        suggest = { packageName }
    }
