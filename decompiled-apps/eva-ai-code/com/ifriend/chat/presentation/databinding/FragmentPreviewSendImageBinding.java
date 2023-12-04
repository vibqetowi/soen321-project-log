package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentPreviewSendImageBinding extends ViewDataBinding {
    public final ImageButton back;
    public final ImageButton changeCamera;
    public final ConstraintLayout container;
    public final ImageButton flash;
    public final ImageView image;
    public final ImageButton makePhoto;
    public final ProgressBar progress;
    public final AppButton send;
    public final PreviewView surface;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentPreviewSendImageBinding(Object obj, View view, int i, ImageButton imageButton, ImageButton imageButton2, ConstraintLayout constraintLayout, ImageButton imageButton3, ImageView imageView, ImageButton imageButton4, ProgressBar progressBar, AppButton appButton, PreviewView previewView) {
        super(obj, view, i);
        this.back = imageButton;
        this.changeCamera = imageButton2;
        this.container = constraintLayout;
        this.flash = imageButton3;
        this.image = imageView;
        this.makePhoto = imageButton4;
        this.progress = progressBar;
        this.send = appButton;
        this.surface = previewView;
    }

    public static FragmentPreviewSendImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPreviewSendImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPreviewSendImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_preview_send_image, viewGroup, z, obj);
    }

    public static FragmentPreviewSendImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPreviewSendImageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPreviewSendImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_preview_send_image, null, false, obj);
    }

    public static FragmentPreviewSendImageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPreviewSendImageBinding bind(View view, Object obj) {
        return (FragmentPreviewSendImageBinding) bind(obj, view, R.layout.fragment_preview_send_image);
    }
}
