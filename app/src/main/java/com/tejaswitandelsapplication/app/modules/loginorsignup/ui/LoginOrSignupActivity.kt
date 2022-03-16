package com.tejaswitandelsapplication.app.modules.loginorsignup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tejaswitandelsapplication.app.R
import com.tejaswitandelsapplication.app.appcomponents.base.BaseActivity
import com.tejaswitandelsapplication.app.databinding.ActivityLoginOrSignupBinding
import com.tejaswitandelsapplication.app.modules.login.ui.LoginActivity
import com.tejaswitandelsapplication.app.modules.loginorsignup.`data`.viewmodel.LoginOrSignupVM
import kotlin.String
import kotlin.Unit

public class LoginOrSignupActivity :
    BaseActivity<ActivityLoginOrSignupBinding>(R.layout.activity_login_or_signup) {
  private val viewModel: LoginOrSignupVM by viewModels<LoginOrSignupVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.loginOrSignupVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "LOGIN_OR_SIGNUP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginOrSignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
