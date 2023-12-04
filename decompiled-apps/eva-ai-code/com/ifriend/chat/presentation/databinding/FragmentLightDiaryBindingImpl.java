package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.light.LightCardDiaryView;
import com.ifriend.chat.presentation.ui.diary.views.light.LightDiaryButton;
import com.ifriend.ui.progress.FullScreenProgressView;
/* loaded from: classes6.dex */
public class FragmentLightDiaryBindingImpl extends FragmentLightDiaryBinding {
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
        sparseIntArray.put(R.id.lightDiariesListContainer, 1);
        sparseIntArray.put(R.id.recyclerView, 2);
        sparseIntArray.put(R.id.toolbarShadow, 3);
        sparseIntArray.put(R.id.lightDiariesCardDetailContainer, 4);
        sparseIntArray.put(R.id.lightCardDiaryDetail, 5);
        sparseIntArray.put(R.id.bottomContainer, 6);
        sparseIntArray.put(R.id.light_diary_info, 7);
        sparseIntArray.put(R.id.lightDiaryButton, 8);
        sparseIntArray.put(R.id.close, 9);
        sparseIntArray.put(R.id.diaryToolbarText, 10);
        sparseIntArray.put(R.id.loader, 11);
        sparseIntArray.put(R.id.fullScreenProgressView, 12);
    }

    public FragmentLightDiaryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private FragmentLightDiaryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[6], (ImageView) objArr[9], (TextView) objArr[10], (FullScreenProgressView) objArr[12], (LightCardDiaryView) objArr[5], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[1], (LightDiaryButton) objArr[8], (TextView) objArr[7], (ProgressBar) objArr[11], (RecyclerView) objArr[2], (ConstraintLayout) objArr[0], (ImageView) objArr[3]);
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
