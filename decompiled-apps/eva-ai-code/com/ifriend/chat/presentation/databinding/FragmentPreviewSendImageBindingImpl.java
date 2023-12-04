package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentPreviewSendImageBindingImpl extends FragmentPreviewSendImageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.container, 1);
        sparseIntArray.put(R.id.surface, 2);
        sparseIntArray.put(R.id.flash, 3);
        sparseIntArray.put(R.id.image, 4);
        sparseIntArray.put(R.id.progress, 5);
        sparseIntArray.put(R.id.change_camera, 6);
        sparseIntArray.put(R.id.send, 7);
        sparseIntArray.put(R.id.make_photo, 8);
        sparseIntArray.put(R.id.back, 9);
    }

    public FragmentPreviewSendImageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private FragmentPreviewSendImageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageButton) objArr[9], (ImageButton) objArr[6], (ConstraintLayout) objArr[1], (ImageButton) objArr[3], (ImageView) objArr[4], (ImageButton) objArr[8], (ProgressBar) objArr[5], (AppButton) objArr[7], (PreviewView) objArr[2]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
