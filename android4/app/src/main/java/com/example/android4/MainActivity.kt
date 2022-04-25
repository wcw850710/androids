package com.example.android4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.android4.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding

  private fun onPreviewClicked() {
    val message = Message(
      binding.inputLayoutContactName.editText?.text.toString() ?: "",
      binding.inputLayoutContactNumber.editText?.text.toString() ?: "",
      binding.inputLayoutContactDisplayName.editText?.text.toString() ?: "",
      binding.checkboxIncludeJunior.isChecked,
      binding.spinnerJobTitle.selectedItem.toString(),
      binding.checkboxImmediateStart.isChecked,
      binding.inputLayoutAvailableFromDate.editText?.text.toString() ?: "",
    )
    val previewActivityIntent = Intent(this, PreviewActivity::class.java)
    previewActivityIntent.putExtra("message", message)
    startActivity(previewActivityIntent)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val jobTitles = arrayOf("Android Developer", "Web Developer")
    val jobTitleAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, jobTitles)
    binding.spinnerJobTitle.adapter = jobTitleAdapter

    binding.buttonSubmit.setOnClickListener {
      onPreviewClicked()
    }
  }
}