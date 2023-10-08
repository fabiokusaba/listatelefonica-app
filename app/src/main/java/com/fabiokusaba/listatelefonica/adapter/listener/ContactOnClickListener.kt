package com.fabiokusaba.listatelefonica.adapter.listener

import com.fabiokusaba.listatelefonica.model.ContactModel

class ContactOnClickListener(val clickListener: (contact: ContactModel) -> Unit) {
    fun onClick(contact: ContactModel) = clickListener
}