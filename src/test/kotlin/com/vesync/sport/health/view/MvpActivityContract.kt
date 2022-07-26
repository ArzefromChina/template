package com.vesync.sport.health.view

//todo create BaseContract and import to this class
interface MvpActivityContract {

    interface View : BaseContract.View<Presenter>

    interface Presenter : BaseContract.Presenter
}