package com.vesync.sport.health.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vesync.sport.health.R;

// Your presenter is available using the mPresenter variable
class MvpActivityFragment : BaseFragment(), MvpActivityContract.View {

    private var presenter: MvpActivityContract.Presenter? = null

    override fun setPresenter(presenter: MvpActivityContract.Presenter) {
        this.presenter = presenter
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_mvpactivity_layout, container, false)

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    interface OnMvpActivityFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onMvpActivityFragmentInteraction()
    }

    companion object {
        fun newInstance() = MvpActivityFragment()
    }
}// Required empty public constructor