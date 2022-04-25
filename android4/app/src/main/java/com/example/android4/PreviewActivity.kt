package com.example.android4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android4.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {
  private lateinit var binding: ActivityPreviewBinding
  private lateinit var message: Message
  private lateinit var messagePreviewText: String

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityPreviewBinding.inflate(layoutInflater)
    setContentView(binding.root)
    displayMessage()
    setupButton()
  }

  private fun setupButton() {
    binding.buttonSend.setOnClickListener {
      val intent = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("smsto: ${message.contactNumber}")
        putExtra("sms_body", messagePreviewText)
      }
      startActivity(intent)
    }
  }

  private fun displayMessage() {
    message = intent.getSerializableExtra("message") as Message
    messagePreviewText = """
      Hi ${message.contactName},
      
      My Name is ${message.displayName} and Iam ${message.getFullJobDescription()}.
      
      I have a portfolio of apps to demonstrate my technical skills that I can show on request.
      
      I am able to start a new position ${message.getAvailability()}.
      
      Please get in touch if you have any suitable roles for me.
      
      Thanks and best regards.
    """.trimIndent()
    binding.textViewMessage.text = messagePreviewText
  }
}