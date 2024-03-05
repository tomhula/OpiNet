package me.tomasan7.databaseprogram.post

import kotlinx.collections.immutable.ImmutableList

interface PostService
{
    suspend fun createPost(postDto: PostDto)
    suspend fun getPostById(id: Int): PostDto?
    suspend fun getAllPosts(): ImmutableList<PostDto>
    suspend fun getPostsByAuthorId(authorId: Int): ImmutableList<PostDto>
}