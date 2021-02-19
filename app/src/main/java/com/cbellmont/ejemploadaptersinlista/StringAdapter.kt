package com.cbellmont.ejemploadaptersinlista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class StringAdapter : RecyclerView.Adapter<StringAdapter.StringViewHolder>()  {

    class StringViewHolder(var root: View, var textView: TextView) : RecyclerView.ViewHolder(root)

    var numeroDeFilas = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        val twTextView = view.findViewById<TextView>(R.id.textView)
        return StringViewHolder(view, twTextView)
    }

    override fun getItemCount(): Int {
        return numeroDeFilas
    }

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        holder.textView.text = if (position % 2 == 0) {
            holder.textView.setBackgroundColor(ContextCompat.getColor(holder.root.context, R.color.colorPrimaryDark))
            "Position = $position"
        } else {
            holder.textView.setBackgroundColor(ContextCompat.getColor(holder.root.context, R.color.colorAccent))
            "Soy impar"
        }
    }

}

