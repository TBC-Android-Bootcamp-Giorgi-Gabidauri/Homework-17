package com.gabo.navdrawer

import com.gabo.navdrawer.databinding.DrawerMenuItemBinding
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val click: (MenuModel) -> Unit): RecyclerView.Adapter<MenuAdapter.MenuVH>() {
    private var list: List<MenuModel> = emptyList()

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<MenuModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class MenuVH(private val binding: DrawerMenuItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(model: MenuModel, click: (MenuModel) -> Unit){
            with(binding){
                ivItem.setImageResource(model.icon)
                tvTitle.text = model.title
                if(model.number.isNotEmpty()){
                    tvCount.text = model.number
                    tvCount.setBackgroundResource(model.numColor!!)
                }
            }
        itemView.setOnClickListener {click(model)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuVH {
        val binding = DrawerMenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuVH(binding)
    }

    override fun onBindViewHolder(holder: MenuVH, position: Int) {
        val item = list[position]
        holder.bind(item, click)
    }

    override fun getItemCount(): Int = list.size
}