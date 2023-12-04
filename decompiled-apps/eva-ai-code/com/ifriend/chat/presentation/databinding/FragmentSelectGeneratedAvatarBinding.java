package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public abstract class FragmentSelectGeneratedAvatarBinding extends ViewDataBinding {
    public final AppBarLayout appbar;
    public final TextView avatarDescription;
    public final TextView avatarTryAgainPrice;
    public final RecyclerView avatars;
    public final ImageView close;
    public final ImageView editDescriptionIcon;
    public final FloatingActionButton generateAgain;
    public final ProgressBar loader;
    public final NestedScrollView nestedScroll;
    public final CoordinatorLayout root;
    public final TextView title;
    public final ConstraintLayout toolbar;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSelectGeneratedAvatarBinding(Object obj, View view, int i, AppBarLayout appBarLayout, TextView textView, TextView textView2, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, FloatingActionButton floatingActionButton, ProgressBar progressBar, NestedScrollView nestedScrollView, CoordinatorLayout coordinatorLayout, TextView textView3, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.appbar = appBarLayout;
        this.avatarDescription = textView;
        this.avatarTryAgainPrice = textView2;
        this.avatars = recyclerView;
        this.close = imageView;
        this.editDescriptionIcon = imageView2;
        this.generateAgain = floatingActionButton;
        this.loader = progressBar;
        this.nestedScroll = nestedScrollView;
        this.root = coordinatorLayout;
        this.title = textView3;
        this.toolbar = constraintLayout;
    }

    public static FragmentSelectGeneratedAvatarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSelectGeneratedAvatarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentSelectGeneratedAvatarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_select_generated_avatar, viewGroup, z, obj);
    }

    public static FragmentSelectGeneratedAvatarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSelectGeneratedAvatarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentSelectGeneratedAvatarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_select_generated_avatar, null, false, obj);
    }

    public static FragmentSelectGeneratedAvatarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSelectGeneratedAvatarBinding bind(View view, Object obj) {
        return (FragmentSelectGeneratedAvatarBinding) bind(obj, view, R.layout.fragment_select_generated_avatar);
    }
}
