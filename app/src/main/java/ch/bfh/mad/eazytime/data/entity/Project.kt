package ch.bfh.mad.eazytime.data.entity

import android.arch.persistence.room.*

@Entity
data class Project(@PrimaryKey(autoGenerate = true)
                   var id: Long = 0,
                   var name: String? = null,
                   var shortCode: String? = null,
                   var color: String? = null,
                   var onWidget: Boolean? = null,
                   var isDefault: Boolean? = null)