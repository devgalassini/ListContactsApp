package galassini.tecnology.modulo10.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import galassini.tecnology.modulo10.R
import galassini.tecnology.modulo10.model.ContactInfo

class ContactAdapter(private val contacts: List<ContactInfo>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.textViewName)
        val phoneTextView: TextView = itemView.findViewById(R.id.textViewPhone)
        val contactImageView: ImageView = itemView.findViewById(R.id.imageViewContact)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.nameTextView.text = contact.name
        holder.phoneTextView.text = contact.phone
        holder.contactImageView.setImageResource(R.drawable.ic_contact_image_background_foreground)
    }

    override fun getItemCount() = contacts.size
}
