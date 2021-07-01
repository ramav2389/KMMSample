package com.rama.xapoSample.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.rama.xapoSample.R
import util.getDummyTransactions
import com.rama.xapoSample.util.RecyclerViewClickListener
import com.rama.xapoSample.util.imgs
import kotlinx.android.synthetic.main.home_fragment.*
import kotlinx.android.synthetic.main.mk_card.*

class HomeFragment : Fragment(), RecyclerViewClickListener {

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)


        recycler_view.also {
            it.layoutManager = LinearLayoutManager(requireContext())
            it.setHasFixedSize(true)
            it.adapter = TransactionAdapter(
                getDummyTransactions(imgs = imgs),
                this
            )
        }

        mk_btn_home.setOnClickListener {
            val action = HomeFragmentDirections.toTransactionFragment()
            Navigation.findNavController(it).navigate(action)
        }

        mk_card.setOnClickListener {
            val action = HomeFragmentDirections.toCardInfoFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun onRecyclerViewItemClick(view: View, model: Any) {

    }

}