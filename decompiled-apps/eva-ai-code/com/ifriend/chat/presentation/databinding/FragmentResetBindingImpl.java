package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public class FragmentResetBindingImpl extends FragmentResetBinding {
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
        sparseIntArray.put(R.id.back, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.description, 3);
        sparseIntArray.put(R.id.erase_last_hour, 4);
        sparseIntArray.put(R.id.erase_last_hour_text, 5);
        sparseIntArray.put(R.id.erase_last_24_hours, 6);
        sparseIntArray.put(R.id.erase_last_24_hours_text, 7);
        sparseIntArray.put(R.id.erase_all, 8);
        sparseIntArray.put(R.id.erase_all_text, 9);
        sparseIntArray.put(R.id.note, 10);
    }

    public FragmentResetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, sIncludes, sViewsWithIds));
    }

    private FragmentResetBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (TextView) objArr[3], (ConstraintLayout) objArr[8], (TextView) objArr[9], (ConstraintLayout) objArr[6], (TextView) objArr[7], (ConstraintLayout) objArr[4], (TextView) objArr[5], (TextView) objArr[10], (TextView) objArr[2]);
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
