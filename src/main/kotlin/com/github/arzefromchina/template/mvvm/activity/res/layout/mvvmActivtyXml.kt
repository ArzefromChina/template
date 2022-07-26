package com.github.arzefromchina.template.mvvm.activity.res.layout

import com.github.arzefromchina.template.mvvm.headToLower

/**
 * Author: Arze
 * Date: 2022/6/2 10:00
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * Arze 2022/6/2 1.0
 */
fun mvvmActivityXml(
    packageName: String,
    activityClass: String
) = """<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools">
 
    <data>
        <variable
                name="${activityClass.headToLower()}ViewModel"
                type="${packageName}.${activityClass}ViewModel" />
    </data>
  
    <androidx.constraintlayout.widget.ConstraintLayout 
            android:layout_width="match_parent"
            android:background="#f7f7f7"
            android:layout_height="match_parent">
        <com.vesync.widget.ToolBar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="44dp"
                app:backClick="@{(view)-> ${activityClass.headToLower()}ViewModel.back()}"
                app:backIcon="@drawable/widget_ic_back"
                app:layout_constraintTop_toTopOf="parent"/>
            
    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
"""