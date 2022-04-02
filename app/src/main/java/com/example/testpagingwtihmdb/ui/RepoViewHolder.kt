/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.testpagingwtihmdb.ui

import android.accounts.AccountManager.get
import android.content.Intent
import android.graphics.ColorSpace.get
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewConfiguration.get
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatDrawableManager.get
import androidx.recyclerview.widget.RecyclerView
import com.example.testpagingwtihmdb.R
import com.example.testpagingwtihmdb.model.Result
import com.squareup.picasso.Picasso
import java.lang.reflect.Array.get
import java.nio.file.Paths.get

/**
 * View Holder for a [Repo] RecyclerView list item.
 */
class RepoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val name: TextView = view.findViewById(R.id.repo_name)
    private val description: TextView = view.findViewById(R.id.repo_description)
    private val stars: TextView = view.findViewById(R.id.repo_stars)
    private val language: TextView = view.findViewById(R.id.repo_language)
    private val forks: TextView = view.findViewById(R.id.repo_forks)
    private val mvImage: ImageView = view.findViewById(R.id.mvImage)

    private var repo: Result? = null

    init {
        view.setOnClickListener {
            repo?.posterPath?.let { url ->
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://image.tmdb.org/t/p/w200${repo?.posterPath}"))
                view.context.startActivity(intent)
            }
        }
    }

    fun bind(repo: Result?) {
        if (repo == null) {
            val resources = itemView.resources
            name.text = resources.getString(R.string.loading)
            description.visibility = View.GONE
            language.visibility = View.GONE
            stars.text = resources.getString(R.string.unknown)
            forks.text = resources.getString(R.string.unknown)

        } else {
            showRepoData(repo)
        }
    }

    private fun showRepoData(repo: Result) {
        this.repo = repo
        name.text = repo.title

        Picasso.get()
            .load("https://image.tmdb.org/t/p/w200${repo.posterPath}")
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(mvImage)

        // if the description is missing, hide the TextView
        var descriptionVisibility = View.GONE
        description.text = repo.voteCount.toString()
        descriptionVisibility = View.VISIBLE
        description.visibility = descriptionVisibility
//this is new git test


        // if the language is missing, hide the label and the value
        var languageVisibility = View.GONE
        if (!repo.originalLanguage.isNullOrEmpty()) {
            val resources = this.itemView.context.resources
            language.text = resources.getString(R.string.language, repo.originalLanguage)
            languageVisibility = View.VISIBLE
        }
        language.visibility = languageVisibility
    }

    companion object {
        fun create(parent: ViewGroup): RepoViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.repo_view_item, parent, false)
            return RepoViewHolder(view)
        }
    }
}
