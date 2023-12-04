package com.ifriend.registration.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.ifriend.registration.presentation.R;
import com.ifriend.ui.button.BlackButton;
import com.ifriend.ui.button.GlowAppButton;
import com.ifriend.ui.button.IconDarkButton;
/* loaded from: classes6.dex */
public abstract class FragmentRegistrationVideoBackgroundBinding extends ViewDataBinding {
    public final StyledPlayerView backgroundVideoPlayerView;
    public final ImageView registrationAppName;
    public final ConstraintLayout registrationContainer;
    public final IconDarkButton registrationEmailButton;
    public final IconDarkButton registrationFacebookButton;
    public final GlowAppButton registrationGoogleButton;
    public final ImageView registrationMiniAppIcon;
    public final BlackButton registrationOtherOptionsButton;
    public final TextView registrationSignInHint;
    public final TextView registrationTerms;
    public final TextView registrationTitle;
    public final View registrationVideoOverlay;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentRegistrationVideoBackgroundBinding(Object obj, View view, int i, StyledPlayerView styledPlayerView, ImageView imageView, ConstraintLayout constraintLayout, IconDarkButton iconDarkButton, IconDarkButton iconDarkButton2, GlowAppButton glowAppButton, ImageView imageView2, BlackButton blackButton, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.backgroundVideoPlayerView = styledPlayerView;
        this.registrationAppName = imageView;
        this.registrationContainer = constraintLayout;
        this.registrationEmailButton = iconDarkButton;
        this.registrationFacebookButton = iconDarkButton2;
        this.registrationGoogleButton = glowAppButton;
        this.registrationMiniAppIcon = imageView2;
        this.registrationOtherOptionsButton = blackButton;
        this.registrationSignInHint = textView;
        this.registrationTerms = textView2;
        this.registrationTitle = textView3;
        this.registrationVideoOverlay = view2;
    }

    public static FragmentRegistrationVideoBackgroundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRegistrationVideoBackgroundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentRegistrationVideoBackgroundBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_registration_video_background, viewGroup, z, obj);
    }

    public static FragmentRegistrationVideoBackgroundBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRegistrationVideoBackgroundBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentRegistrationVideoBackgroundBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_registration_video_background, null, false, obj);
    }

    public static FragmentRegistrationVideoBackgroundBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRegistrationVideoBackgroundBinding bind(View view, Object obj) {
        return (FragmentRegistrationVideoBackgroundBinding) bind(obj, view, R.layout.fragment_registration_video_background);
    }
}
