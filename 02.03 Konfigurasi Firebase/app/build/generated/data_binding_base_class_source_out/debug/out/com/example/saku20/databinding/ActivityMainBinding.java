// Generated by view binder compiler. Do not edit!
package com.example.saku20.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.saku20.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText emailLogin;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final TextView goToSignUpScreen;

  @NonNull
  public final EditText passwordLogin;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button btnLogin,
      @NonNull EditText emailLogin, @NonNull TextView forgotPassword,
      @NonNull TextView goToSignUpScreen, @NonNull EditText passwordLogin) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.emailLogin = emailLogin;
    this.forgotPassword = forgotPassword;
    this.goToSignUpScreen = goToSignUpScreen;
    this.passwordLogin = passwordLogin;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.email_login;
      EditText emailLogin = ViewBindings.findChildViewById(rootView, id);
      if (emailLogin == null) {
        break missingId;
      }

      id = R.id.forgotPassword;
      TextView forgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (forgotPassword == null) {
        break missingId;
      }

      id = R.id.goToSignUpScreen;
      TextView goToSignUpScreen = ViewBindings.findChildViewById(rootView, id);
      if (goToSignUpScreen == null) {
        break missingId;
      }

      id = R.id.password_login;
      EditText passwordLogin = ViewBindings.findChildViewById(rootView, id);
      if (passwordLogin == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, btnLogin, emailLogin, forgotPassword,
          goToSignUpScreen, passwordLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
