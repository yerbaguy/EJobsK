package com.ebartmedia.ejobsk6.model



import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

//data class MovieCategory(val name: String? = null,
//                         val movies: List<Movie>) : ExpandableGroup<Movie>(name, movies)


data class SubCategories(val catName: String? = null,
                         val subCat: List<Categories>) : ExpandableGroup<Categories>(catName, subCat)


