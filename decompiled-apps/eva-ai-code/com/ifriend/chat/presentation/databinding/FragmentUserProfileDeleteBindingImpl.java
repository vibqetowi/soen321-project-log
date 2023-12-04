package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.BR;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentUserProfileDeleteBindingImpl extends FragmentUserProfileDeleteBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mVmBackAndroidViewViewOnClickListener;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.reset_bot, 3);
        sparseIntArray.put(R.id.delete_account, 4);
    }

    public FragmentUserProfileDeleteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private FragmentUserProfileDeleteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (TextView) objArr[4], (AppButton) objArr[3], (TextView) objArr[2]);
        this.mDirtyFlags = -1L;
        this.back.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
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
    public boolean setVariable(int i, Object obj) {
        if (BR.vm == i) {
            setVm((UserProfileDeleteViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentUserProfileDeleteBinding
    public void setVm(UserProfileDeleteViewModel userProfileDeleteViewModel) {
        this.mVm = userProfileDeleteViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        OnClickListenerImpl onClickListenerImpl;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        UserProfileDeleteViewModel userProfileDeleteViewModel = this.mVm;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || userProfileDeleteViewModel == null) {
            onClickListenerImpl = null;
        } else {
            OnClickListenerImpl onClickListenerImpl2 = this.mVmBackAndroidViewViewOnClickListener;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new OnClickListenerImpl();
                this.mVmBackAndroidViewViewOnClickListener = onClickListenerImpl2;
            }
            onClickListenerImpl = onClickListenerImpl2.setValue(userProfileDeleteViewModel);
        }
        if (i != 0) {
            this.back.setOnClickListener(onClickListenerImpl);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private UserProfileDeleteViewModel value;

        public OnClickListenerImpl setValue(UserProfileDeleteViewModel userProfileDeleteViewModel) {
            this.value = userProfileDeleteViewModel;
            if (userProfileDeleteViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.back(view);
        }
    }
}
