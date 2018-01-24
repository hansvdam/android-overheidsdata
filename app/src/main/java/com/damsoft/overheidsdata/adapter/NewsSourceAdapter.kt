package com.damsoft.overheidsdata.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.damsoft.overheidsdata.R
import com.damsoft.overheidsdata.adapter.viewholder.NewsSourceViewHolder
import com.damsoft.overheidsdata.db.SourceEntity
import com.damsoft.overheidsdata.inflate

/**
 * Created by abhinav.sharma on 01/11/17.
 */
class NewsSourceAdapter(private val listener: (SourceEntity) -> Unit, private var sourceList: List<SourceEntity>) : RecyclerView.Adapter<NewsSourceViewHolder>() {


    override fun getItemCount(): Int {
        return sourceList.size
    }

    private fun getItem(position: Int): SourceEntity {
        return sourceList[position]
    }

    override fun onBindViewHolder(holder: NewsSourceViewHolder, position: Int) =
            holder.bind(getItem(position), listener)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsSourceViewHolder =
            NewsSourceViewHolder(parent.inflate(R.layout.layout_news_source_single))

    fun updateDataSet(data: List<SourceEntity>){
        sourceList = data
        notifyDataSetChanged()
    }
}