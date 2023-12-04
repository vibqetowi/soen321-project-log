package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.dark.DarkCardDiaryView;
import com.ifriend.chat.presentation.ui.diary.views.dark.DarkDiaryButton;
import com.ifriend.ui.progress.FullScreenProgressView;
/* loaded from: classes6.dex */
public abstract class FragmentDarkDiaryBinding extends ViewDataBinding {
    public final ImageView close;
    public final ConstraintLayout darkDiariesCardDetailContainer;
    public final ConstraintLayout darkDiariesListContainer;
    public final DarkDiaryButton darkDiaryButton;
    public final DarkCardDiaryView darkDiaryCardDetail;
    public final TextView darkDiaryInfo;
    public final TextView diaryToolbarText;
    public final FullScreenProgressView fullScreenProgressView;
    public final ProgressBar loader;
    public final RecyclerView recyclerView;
    public final ConstraintLayout root;
    public final ImageView toolbarShadow;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentDarkDiaryBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DarkDiaryButton darkDiaryButton, DarkCardDiaryView darkCardDiaryView, TextView textView, TextView textView2, FullScreenProgressView fullScreenProgressView, ProgressBar progressBar, RecyclerView recyclerView, ConstraintLayout constraintLayout3, ImageView imageView2) {
        super(obj, view, i);
        this.close = imageView;
        this.darkDiariesCardDetailContainer = constraintLayout;
        this.darkDiariesListContainer = constraintLayout2;
        this.darkDiaryButton = darkDiaryButton;
        this.darkDiaryCardDetail = darkCardDiaryView;
        this.darkDiaryInfo = textView;
        this.diaryToolbarText = textView2;
        this.fullScreenProgressView = fullScreenProgressView;
        this.loader = progressBar;
        this.recyclerView = recyclerView;
        this.root = constraintLayout3;
        this.toolbarShadow = imageView2;
    }

    public static FragmentDarkDiaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDarkDiaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentDarkDiaryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_dark_diary, viewGroup, z, obj);
    }

    public static FragmentDarkDiaryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDarkDiaryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentDarkDiaryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_dark_diary, null, false, obj);
    }

    public static FragmentDarkDiaryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDarkDiaryBinding bind(View view, Object obj) {
        return (FragmentDarkDiaryBinding) bind(obj, view, R.layout.fragment_dark_diary);
    }
}
