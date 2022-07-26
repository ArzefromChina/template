package com.vesync.sport.health.view

import 	com.vesync.sport.health.R

//todo create BaseActivity and import to this class
class TitiActivity : BaseActivity(), TitiFragment.OnTitiFragmentInteractionListener {

	private lateinit var presenter: TitiContract.Presenter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_titi_layout)

		val titiFragment = TitiFragment.newInstance()
		supportFragmentManager
				.beginTransaction()
				.replace(R.id.frame_layout_content, titiFragment, "TitiFragment")
				.addToBackStack(null)
				.commit()

		presenter = TitiPresenter(this, titiFragment)
	}

	override fun onStart() {
		super.onStart()
		presenter.start()
	}

	override fun onStop() {
		super.onStop()
		presenter.stop()
	}

	override fun onTitiFragmentInteraction() {

	}
}