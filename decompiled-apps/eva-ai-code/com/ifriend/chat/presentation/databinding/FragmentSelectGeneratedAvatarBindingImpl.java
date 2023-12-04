package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public class FragmentSelectGeneratedAvatarBindingImpl extends FragmentSelectGeneratedAvatarBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

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
        sparseIntArray.put(R.id.appbar, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.close, 3);
        sparseIntArray.put(R.id.title, 4);
        sparseIntArray.put(R.id.avatar_description, 5);
        sparseIntArray.put(R.id.edit_description_icon, 6);
        sparseIntArray.put(R.id.loader, 7);
        sparseIntArray.put(R.id.nested_scroll, 8);
        sparseIntArray.put(R.id.avatars, 9);
        sparseIntArray.put(R.id.avatar_try_again_price, 10);
        sparseIntArray.put(R.id.generate_again, 11);
    }

    public FragmentSelectGeneratedAvatarBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private FragmentSelectGeneratedAvatarBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[1], (TextView) objArr[5], (TextView) objArr[10], (RecyclerView) objArr[9], (ImageView) objArr[3], (ImageView) objArr[6], (FloatingActionButton) objArr[11], (ProgressBar) objArr[7], (NestedScrollView) objArr[8], (CoordinatorLayout) objArr[0], (TextView) objArr[4], (ConstraintLayout) objArr[2]);
        this.mDirtyFlags = -1L;
        this.root.setTag(null);
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
