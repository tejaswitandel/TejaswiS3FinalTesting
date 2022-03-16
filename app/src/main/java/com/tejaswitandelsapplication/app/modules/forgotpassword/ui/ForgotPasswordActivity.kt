package com.tejaswitandelsapplication.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tejaswitandelsapplication.app.R
import com.tejaswitandelsapplication.app.appcomponents.base.BaseActivity
import com.tejaswitandelsapplication.app.databinding.ActivityForgotPasswordBinding
import com.tejaswitandelsapplication.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import kotlin.String
import kotlin.Unit

public class ForgotPasswordActivity :
    BaseActivity<ActivityForgotPasswordBinding>(R.layout.activity_forgot_password) {
  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.forgotPasswordVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
