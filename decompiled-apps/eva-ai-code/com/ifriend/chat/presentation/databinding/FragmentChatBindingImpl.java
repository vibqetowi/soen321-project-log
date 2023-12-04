package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.ifriend.animatedBackground.AnimatedBackgroundView;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public class FragmentChatBindingImpl extends FragmentChatBinding {
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
        sparseIntArray.put(R.id.chatRoot, 1);
        sparseIntArray.put(R.id.chatScreenRoot, 2);
        sparseIntArray.put(R.id.imageBackgroundView, 3);
        sparseIntArray.put(R.id.headerComposeView, 4);
        sparseIntArray.put(R.id.container, 5);
        sparseIntArray.put(R.id.composeChatOverlayContainer, 6);
        sparseIntArray.put(R.id.composeMainContainer, 7);
        sparseIntArray.put(R.id.chatChildFragmentBackground, 8);
        sparseIntArray.put(R.id.chatFragmentContainer, 9);
    }

    public FragmentChatBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private FragmentChatBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AnimatedBackgroundView) objArr[0], (FrameLayout) objArr[8], (FragmentContainerView) objArr[9], (FrameLayout) objArr[1], (ConstraintLayout) objArr[2], (ComposeView) objArr[6], (ComposeView) objArr[7], (FragmentContainerView) objArr[5], (ComposeView) objArr[4], (ComposeView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.animatedBackgroundView.setTag(null);
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
