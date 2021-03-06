package ch.bfh.mad.eazytime.geofence.detail

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import ch.bfh.mad.eazytime.R

class GeoFenceRadiusFragment : androidx.fragment.app.Fragment() {

    private lateinit var callback: GeoFenceFlow

    companion object {
        fun newFragment(): androidx.fragment.app.Fragment = GeoFenceRadiusFragment()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        callback = context as? GeoFenceFlow ?: throw RuntimeException("Missing GeoFenceFlow implementation")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_geofence_radius, container, false)
        callback.setStep(GeoFenceFlow.Step.RADIUS)
        val proceedButton: Button = view.findViewById(R.id.btn_geoFenceRadiusProceed)
        val backButton: Button = view.findViewById(R.id.btn_geoFenceRadiusBack)

        proceedButton.setOnClickListener { callback.goToEdit() }
        backButton.setOnClickListener { callback.goToMarker() }

        return view
    }
}