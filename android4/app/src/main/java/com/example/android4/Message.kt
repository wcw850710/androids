package com.example.android4

import java.io.Serializable

data class Message(
  val contactName: String,
  val contactNumber: String,
  val displayName: String,
  val includeJunior: Boolean,
  val jobTitle: String,
  val immediateStart: Boolean,
  val fromDate: String,
): Serializable {
  fun getFullJobDescription() = if (includeJunior) "a Junior $jobTitle" else "an $jobTitle"
  fun getAvailability() = if (immediateStart) "immediagely" else "from $fromDate"
}