package com.rama.xapoSample.ui.payment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.rama.xapoSample.R
import com.rama.xapoSample.databinding.MkPaymentItemBinding
import model.Payment
import com.rama.xapoSample.util.RecyclerViewClickListener

class PaymentAdapter(
    private val payments: List<Payment>,
    private val listener: RecyclerViewClickListener
) : RecyclerView.Adapter<PaymentAdapter.HistoricViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HistoricViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.mk_payment_item,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: HistoricViewHolder, position: Int) {
        holder.recyclerViewBinding.payment = payments[position]
    }


    override fun getItemCount() = payments.size

    inner class HistoricViewHolder(val recyclerViewBinding: MkPaymentItemBinding) :
        RecyclerView.ViewHolder(recyclerViewBinding.root)
}