package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.dark.DarkCardDiaryView;
import com.ifriend.chat.presentation.ui.diary.views.dark.DarkDiaryButton;
import com.ifriend.ui.progress.FullScreenProgressView;
/* loaded from: classes6.dex */
public class FragmentDarkDiaryBindingImpl extends FragmentDarkDiaryBinding {
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
        sparseIntArray.put(R.id.diaryToolbarText, 1);
        sparseIntArray.put(R.id.toolbarShadow, 2);
        sparseIntArray.put(R.id.close, 3);
        sparseIntArray.put(R.id.darkDiariesListContainer, 4);
        sparseIntArray.put(R.id.recyclerView, 5);
        sparseIntArray.put(R.id.darkDiariesCardDetailContainer, 6);
        sparseIntArray.put(R.id.darkDiaryCardDetail, 7);
        sparseIntArray.put(R.id.dark_diary_info, 8);
        sparseIntArray.put(R.id.darkDiaryButton, 9);
        sparseIntArray.put(R.id.loader, 10);
        sparseIntArray.put(R.id.fullScreenProgressView, 11);
    }

    public FragmentDarkDiaryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private FragmentDarkDiaryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[4], (DarkDiaryButton) objArr[9], (DarkCardDiaryView) objArr[7], (TextView) objArr[8], (TextView) objArr[1], (FullScreenProgressView) objArr[11], (ProgressBar) objArr[10], (RecyclerView) objArr[5], (ConstraintLayout) objArr[0], (ImageView) objArr[2]);
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
