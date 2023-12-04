package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.light.LightCardDiaryView;
import com.ifriend.chat.presentation.ui.diary.views.light.LightDiaryButton;
import com.ifriend.ui.progress.FullScreenProgressView;
/* loaded from: classes6.dex */
public abstract class FragmentLightDiaryBinding extends ViewDataBinding {
    public final LinearLayout bottomContainer;
    public final ImageView close;
    public final TextView diaryToolbarText;
    public final FullScreenProgressView fullScreenProgressView;
    public final LightCardDiaryView lightCardDiaryDetail;
    public final ConstraintLayout lightDiariesCardDetailContainer;
    public final ConstraintLayout lightDiariesListContainer;
    public final LightDiaryButton lightDiaryButton;
    public final TextView lightDiaryInfo;
    public final ProgressBar loader;
    public final RecyclerView recyclerView;
    public final ConstraintLayout root;
    public final ImageView toolbarShadow;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentLightDiaryBinding(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, TextView textView, FullScreenProgressView fullScreenProgressView, LightCardDiaryView lightCardDiaryView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LightDiaryButton lightDiaryButton, TextView textView2, ProgressBar progressBar, RecyclerView recyclerView, ConstraintLayout constraintLayout3, ImageView imageView2) {
        super(obj, view, i);
        this.bottomContainer = linearLayout;
        this.close = imageView;
        this.diaryToolbarText = textView;
        this.fullScreenProgressView = fullScreenProgressView;
        this.lightCardDiaryDetail = lightCardDiaryView;
        this.lightDiariesCardDetailContainer = constraintLayout;
        this.lightDiariesListContainer = constraintLayout2;
        this.lightDiaryButton = lightDiaryButton;
        this.lightDiaryInfo = textView2;
        this.loader = progressBar;
        this.recyclerView = recyclerView;
        this.root = constraintLayout3;
        this.toolbarShadow = imageView2;
    }

    public static FragmentLightDiaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentLightDiaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentLightDiaryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_light_diary, viewGroup, z, obj);
    }

    public static FragmentLightDiaryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentLightDiaryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentLightDiaryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_light_diary, null, false, obj);
    }

    public static FragmentLightDiaryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentLightDiaryBinding bind(View view, Object obj) {
        return (FragmentLightDiaryBinding) bind(obj, view, R.layout.fragment_light_diary);
    }
}
