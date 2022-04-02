package com.example.testpagingwtihmdb.testmodel


import com.google.gson.annotations.SerializedName

data class Item(
    @field:SerializedName("allow_forking")
    val allowForking: Boolean,
    @field:SerializedName("archive_url")
    val archiveUrl: String,
    val archived: Boolean,
    @field:SerializedName("assignees_url")
    val assigneesUrl: String,
    @field:SerializedName("blobs_url")
    val blobsUrl: String,
    @field:SerializedName("branches_url")
    val branchesUrl: String,
    @field:SerializedName("clone_url")
    val cloneUrl: String,
    @field:SerializedName("collaborators_url")
    val collaboratorsUrl: String,
    @field:SerializedName("comments_url")
    val commentsUrl: String,
    @field:SerializedName("commits_url")
    val commitsUrl: String,

    val forks: Int,
    @SerializedName("forks_count")
    val forksCount: Int,
    @SerializedName("forks_url")
    val forksUrl: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("git_commits_url")
    val gitCommitsUrl: String,
    @SerializedName("git_refs_url")
    val gitRefsUrl: String,
    @SerializedName("git_tags_url")
    val gitTagsUrl: String,
    @SerializedName("git_url")
    val gitUrl: String,
    @SerializedName("has_downloads")
    val hasDownloads: Boolean,
    @SerializedName("has_issues")
    val hasIssues: Boolean,
    @SerializedName("has_pages")
    val hasPages: Boolean,
    @SerializedName("has_projects")
    val hasProjects: Boolean,
    @SerializedName("has_wiki")
    val hasWiki: Boolean,
    val homepage: String,
    @SerializedName("hooks_url")
    val hooksUrl: String,
    @SerializedName("html_url")
    val htmlUrl: String,
    val id: Int,
    @SerializedName("is_template")
    val isTemplate: Boolean,
    @SerializedName("issue_comment_url")
    val issueCommentUrl: String,
    @SerializedName("issue_events_url")
    val issueEventsUrl: String,
    @SerializedName("issues_url")
    val issuesUrl: String,
    @SerializedName("keys_url")
    val keysUrl: String,
    @SerializedName("labels_url")
    val labelsUrl: String,
    val language: String,
    @SerializedName("languages_url")
    val languagesUrl: String,
    val license: License,
    @SerializedName("merges_url")
    val mergesUrl: String,
    @SerializedName("milestones_url")
    val milestonesUrl: String,
    @SerializedName("mirror_url")
    val mirrorUrl: Any,
    val name: String,
    @SerializedName("node_id")
    val nodeId: String,
    @SerializedName("notifications_url")
    val notificationsUrl: String,
    @SerializedName("open_issues")
    val openIssues: Int,
    @SerializedName("open_issues_count")
    val openIssuesCount: Int,
    val owner: Owner,
    val `private`: Boolean,
    @SerializedName("pulls_url")
    val pullsUrl: String,
    @SerializedName("pushed_at")
    val pushedAt: String,
    @SerializedName("releases_url")
    val releasesUrl: String,
    val score: Double,
    val size: Int,
    @SerializedName("ssh_url")
    val sshUrl: String,
    @SerializedName("stargazers_count")
    val stargazersCount: Int,
    @SerializedName("stargazers_url")
    val stargazersUrl: String,
    @SerializedName("statuses_url")
    val statusesUrl: String,
    @SerializedName("subscribers_url")
    val subscribersUrl: String,
    @SerializedName("subscription_url")
    val subscriptionUrl: String,
    @SerializedName("svn_url")
    val svnUrl: String,
    @SerializedName("tags_url")
    val tagsUrl: String,
    @SerializedName("teams_url")
    val teamsUrl: String,
    val topics: List<String>,
    @SerializedName("trees_url")
    val treesUrl: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    val url: String,
    val visibility: String,
    val watchers: Int,
    @SerializedName("watchers_count")
    val watchersCount: Int
)