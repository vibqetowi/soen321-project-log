package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.ifriend.animatedBackground.AnimatedBackgroundView;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public abstract class FragmentChatBinding extends ViewDataBinding {
    public final AnimatedBackgroundView animatedBackgroundView;
    public final FrameLayout chatChildFragmentBackground;
    public final FragmentContainerView chatFragmentContainer;
    public final FrameLayout chatRoot;
    public final ConstraintLayout chatScreenRoot;
    public final ComposeView composeChatOverlayContainer;
    public final ComposeView composeMainContainer;
    public final FragmentContainerView container;
    public final ComposeView headerComposeView;
    public final ComposeView imageBackgroundView;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentChatBinding(Object obj, View view, int i, AnimatedBackgroundView animatedBackgroundView, FrameLayout frameLayout, FragmentContainerView fragmentContainerView, FrameLayout frameLayout2, ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, FragmentContainerView fragmentContainerView2, ComposeView composeView3, ComposeView composeView4) {
        super(obj, view, i);
        this.animatedBackgroundView = animatedBackgroundView;
        this.chatChildFragmentBackground = frameLayout;
        this.chatFragmentContainer = fragmentContainerView;
        this.chatRoot = frameLayout2;
        this.chatScreenRoot = constraintLayout;
        this.composeChatOverlayContainer = composeView;
        this.composeMainContainer = composeView2;
        this.container = fragmentContainerView2;
        this.headerComposeView = composeView3;
        this.imageBackgroundView = composeView4;
    }

    public static FragmentChatBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChatBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentChatBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_chat, viewGroup, z, obj);
    }

    public static FragmentChatBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChatBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentChatBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_chat, null, false, obj);
    }

    public static FragmentChatBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChatBinding bind(View view, Object obj) {
        return (FragmentChatBinding) bind(obj, view, R.layout.fragment_chat);
    }
}
