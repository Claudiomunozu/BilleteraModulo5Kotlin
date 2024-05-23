package com.example.billeteramodulo4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.billeteramodulo4.databinding.ItemContactsBinding
import com.example.billeteramodulo4.model.Contactos

class ContactoAdapter(private val contactosList: List<Contactos>) :
    RecyclerView.Adapter<ContactoAdapter.ContactoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactoViewHolder {

        val binding =
            ItemContactsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactoViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactoViewHolder, position: Int) {
        val contactositem: Contactos = contactosList[position]
        holder.bind(contactositem)

    }

    override fun getItemCount(): Int = contactosList.size


    inner class ContactoViewHolder(private val binding: ItemContactsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(contactos: Contactos) {

            binding.ivfotoContacts.setImageResource(contactos.photo)
            binding.tvnombreContacts.text = contactos.name
            binding.tvdateTransaction.text = contactos.date
            binding.tvvalueTransaction.text = contactos.import


        }
    }
}
