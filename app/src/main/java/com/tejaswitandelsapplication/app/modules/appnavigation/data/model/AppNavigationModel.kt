package com.tejaswitandelsapplication.app.modules.appnavigation.`data`.model

import com.tejaswitandelsapplication.app.R
import com.tejaswitandelsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAdacana: String? = MyApp.getInstance().resources.getString(R.string.lbl_adacana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginOrSignUp: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_login_or_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)

)
