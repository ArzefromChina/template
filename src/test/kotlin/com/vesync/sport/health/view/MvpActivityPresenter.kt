package com.vesync.sport.health.view

class MvpActivityPresenter(private val view: MvpActivityContract.View) : BasePresenter(), MvpActivityContract.Presenter {

    init {
        this.view.setPresenter(this)
    }

    override fun start() {

    }

    override fun stop() {

    }
}