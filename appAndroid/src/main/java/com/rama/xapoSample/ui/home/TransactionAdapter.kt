package com.rama.xapoSample.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.rama.xapoSample.R
import com.rama.xapoSample.databinding.MkTransactionItemBinding
import model.Transaction
import com.rama.xapoSample.util.RecyclerViewClickListener

class TransactionAdapter(
    private val transactions: List<Transaction>,
    private val listener: RecyclerViewClickListener
) : RecyclerView.Adapter<TransactionAdapter.HistoricViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HistoricViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.mk_transaction_item,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: HistoricViewHolder, position: Int) {
        holder.recyclerViewBinding.transaction = transactions[position]
    }


    override fun getItemCount() = transactions.size

    inner class HistoricViewHolder(val recyclerViewBinding: MkTransactionItemBinding) :
        RecyclerView.ViewHolder(recyclerViewBinding.root)
}