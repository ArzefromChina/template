package com.vesync.sport.health.view

class TitiPresenter(private val view: TitiContract.View) : BasePresenter(), TitiContract.Presenter {

    init {
        this.view.setPresenter(this)
    }

    override fun start() {

    }

    override fun stop() {

    }
}