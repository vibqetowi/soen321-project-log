package com.ifriend.registration.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.ifriend.registration.presentation.R;
import com.ifriend.ui.button.BlackButton;
import com.ifriend.ui.button.GlowAppButton;
import com.ifriend.ui.button.IconDarkButton;
/* loaded from: classes6.dex */
public class FragmentRegistrationVideoBackgroundBindingImpl extends FragmentRegistrationVideoBackgroundBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final FrameLayout mboundView0;

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
        sparseIntArray.put(R.id.backgroundVideoPlayerView, 1);
        sparseIntArray.put(R.id.registrationVideoOverlay, 2);
        sparseIntArray.put(R.id.registrationContainer, 3);
        sparseIntArray.put(R.id.registrationMiniAppIcon, 4);
        sparseIntArray.put(R.id.registrationAppName, 5);
        sparseIntArray.put(R.id.registrationTitle, 6);
        sparseIntArray.put(R.id.registrationSignInHint, 7);
        sparseIntArray.put(R.id.registrationGoogleButton, 8);
        sparseIntArray.put(R.id.registrationFacebookButton, 9);
        sparseIntArray.put(R.id.registrationOtherOptionsButton, 10);
        sparseIntArray.put(R.id.registrationEmailButton, 11);
        sparseIntArray.put(R.id.registrationTerms, 12);
    }

    public FragmentRegistrationVideoBackgroundBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private FragmentRegistrationVideoBackgroundBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (StyledPlayerView) objArr[1], (ImageView) objArr[5], (ConstraintLayout) objArr[3], (IconDarkButton) objArr[11], (IconDarkButton) objArr[9], (GlowAppButton) objArr[8], (ImageView) objArr[4], (BlackButton) objArr[10], (TextView) objArr[7], (TextView) objArr[12], (TextView) objArr[6], (View) objArr[2]);
        this.mDirtyFlags = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
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
