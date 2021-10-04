// Generated by data binding compiler. Do not edit!
package com.example.flatload.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.flatload.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityInputWayBinding extends ViewDataBinding {
  @NonNull
  public final Button button;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final EditText editTextEnd;

  @NonNull
  public final EditText editTextStart;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textviewJSONText;

  protected ActivityInputWayBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button button, Button button2, Button button3, EditText editTextEnd, EditText editTextStart,
      TextView textView2, TextView textView3, TextView textView4, TextView textviewJSONText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.button = button;
    this.button2 = button2;
    this.button3 = button3;
    this.editTextEnd = editTextEnd;
    this.editTextStart = editTextStart;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textviewJSONText = textviewJSONText;
  }

  @NonNull
  public static ActivityInputWayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_input_way, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityInputWayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityInputWayBinding>inflateInternal(inflater, R.layout.activity_input_way, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityInputWayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_input_way, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityInputWayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityInputWayBinding>inflateInternal(inflater, R.layout.activity_input_way, null, false, component);
  }

  public static ActivityInputWayBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityInputWayBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityInputWayBinding)bind(component, view, R.layout.activity_input_way);
  }
}