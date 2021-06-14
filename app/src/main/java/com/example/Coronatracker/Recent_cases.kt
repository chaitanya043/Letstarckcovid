package com.example.Coronatracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class Recent_cases_adapter(val recent_casesitems : ArrayList<Recent_cases_data>) : RecyclerView.Adapter<Recent_cases_adapter.ViewHolder>()
{
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val place  = itemView.findViewById(R.id.textmapbtn) as TextView
        val active  = itemView.findViewById(R.id.test) as TextView
        val anum  = itemView.findViewById(R.id.dailyupdateview) as TextView
        /*val recovered  = itemView.findViewById(R.id.recovered) as TextView
        val rnum  = itemView.findViewById(R.id.rnum) as TextView*/

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recent_cases_adapter.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.cases_stats,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(parent :ViewHolder, position: Int) {

        val rcdata : Recent_cases_data = recent_casesitems[position]
        parent.place.text = rcdata.Sno.toString()
        parent.active.text = rcdata.Name_of_State
        parent.anum.text = rcdata.Helpline_No.toString()
        /*parent.recovered.text = rcdata.recovered
        parent.rnum.text = rcdata.rnum.toString()*/

    }

    override fun getItemCount(): Int {
        return recent_casesitems.size
    }

}