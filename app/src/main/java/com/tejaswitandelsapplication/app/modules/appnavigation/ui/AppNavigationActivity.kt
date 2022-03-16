package com.tejaswitandelsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.tejaswitandelsapplication.app.R
import com.tejaswitandelsapplication.app.appcomponents.base.BaseActivity
import com.tejaswitandelsapplication.app.databinding.ActivityAppNavigationBinding
import com.tejaswitandelsapplication.app.modules.adacana.ui.AdacanaActivity
import com.tejaswitandelsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.tejaswitandelsapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.tejaswitandelsapplication.app.modules.login.ui.LoginActivity
import com.tejaswitandelsapplication.app.modules.loginorsignup.ui.LoginOrSignupActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAdacana.setOnClickListener {
      val destIntent = AdacanaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginOrSignUp.setOnClickListener {
      val destIntent = LoginOrSignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
