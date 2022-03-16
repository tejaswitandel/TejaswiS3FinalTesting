package com.tejaswitandelsapplication.app.modules.forgotpassword.`data`.model

import com.tejaswitandelsapplication.app.R
import com.tejaswitandelsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_helping_others)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIfyouarealwa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_are_alwa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailValue: String? = null
)
