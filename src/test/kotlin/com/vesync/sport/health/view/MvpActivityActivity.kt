package com.vesync.sport.health.view

import 	com.vesync.sport.health.R

//todo create BaseActivity and import to this class
class MvpActivityActivity : BaseActivity(), MvpActivityFragment.OnMvpActivityFragmentInteractionListener {

	private lateinit var presenter: MvpActivityContract.Presenter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_mvpactivity_layout)

		val mvpactivityFragment = MvpActivityFragment.newInstance()
		supportFragmentManager
				.beginTransaction()
				.replace(R.id.frame_layout_content, mvpactivityFragment, "MvpActivityFragment")
				.addToBackStack(null)
				.commit()

		presenter = MvpActivityPresenter(this, mvpactivityFragment)
	}

	override fun onStart() {
		super.onStart()
		presenter.start()
	}

	override fun onStop() {
		super.onStop()
		presenter.stop()
	}

	override fun onMvpActivityFragmentInteraction() {

	}
}