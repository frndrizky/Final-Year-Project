package com.example.ecommerce.interfaces

import android.view.View

interface ItemClickListener {

    fun onClick(view:View, position:Int, isLongClick:Boolean)
}