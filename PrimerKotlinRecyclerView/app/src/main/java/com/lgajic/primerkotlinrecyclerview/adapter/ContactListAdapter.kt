package com.lgajic.primerkotlinrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lgajic.primerkotlinrecyclerview.R
import com.lgajic.primerkotlinrecyclerview.model.Contact

class ContactListAdapter(private val contacts: List<Contact>): RecyclerView.Adapter<ContactListAdapter.ContactListViewHolder>() {
    class ContactListViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val labelName: TextView
        val labelEmail: TextView
        val labelPhone: TextView

        init {
            labelName = view.findViewById(R.id.contact_list_item_name)
            labelEmail = view.findViewById(R.id.contact_list_item_email)
            labelPhone = view.findViewById(R.id.contact_list_item_phone)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item, parent, false)

        return ContactListViewHolder(v)
    }

    override fun onBindViewHolder(holder: ContactListViewHolder, position: Int) {
        holder.labelName.text = "${contacts[position].forename} ${contacts[position].surname}"
        holder.labelEmail.text = "${contacts[position].email}"
        holder.labelPhone.text = "${contacts[position].phoneNumber}"
    }

    override fun getItemCount(): Int = contacts.size
}