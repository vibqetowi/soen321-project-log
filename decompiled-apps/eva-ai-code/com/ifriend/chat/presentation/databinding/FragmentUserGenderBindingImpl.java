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
import com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentUserGenderBindingImpl extends FragmentUserGenderBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mVmBackAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mVmSaveAndroidViewViewOnClickListener;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.name, 3);
        sparseIntArray.put(R.id.female, 4);
        sparseIntArray.put(R.id.check1, 5);
        sparseIntArray.put(R.id.female_text, 6);
        sparseIntArray.put(R.id.male, 7);
        sparseIntArray.put(R.id.check2, 8);
        sparseIntArray.put(R.id.male_text, 9);
        sparseIntArray.put(R.id.non_binary, 10);
        sparseIntArray.put(R.id.check3, 11);
        sparseIntArray.put(R.id.non_binary_text, 12);
    }

    public FragmentUserGenderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private FragmentUserGenderBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ImageView) objArr[5], (ImageView) objArr[8], (ImageView) objArr[11], (ConstraintLayout) objArr[4], (TextView) objArr[6], (ConstraintLayout) objArr[7], (TextView) objArr[9], (TextView) objArr[3], (ConstraintLayout) objArr[10], (TextView) objArr[12], (AppButton) objArr[2]);
        this.mDirtyFlags = -1L;
        this.back.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.save.setTag(null);
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
            setVm((UserGenderViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentUserGenderBinding
    public void setVm(UserGenderViewModel userGenderViewModel) {
        this.mVm = userGenderViewModel;
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
        OnClickListenerImpl1 onClickListenerImpl1;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        UserGenderViewModel userGenderViewModel = this.mVm;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || userGenderViewModel == null) {
            onClickListenerImpl = null;
            onClickListenerImpl1 = null;
        } else {
            OnClickListenerImpl onClickListenerImpl2 = this.mVmBackAndroidViewViewOnClickListener;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new OnClickListenerImpl();
                this.mVmBackAndroidViewViewOnClickListener = onClickListenerImpl2;
            }
            onClickListenerImpl = onClickListenerImpl2.setValue(userGenderViewModel);
            OnClickListenerImpl1 onClickListenerImpl12 = this.mVmSaveAndroidViewViewOnClickListener;
            if (onClickListenerImpl12 == null) {
                onClickListenerImpl12 = new OnClickListenerImpl1();
                this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl12;
            }
            onClickListenerImpl1 = onClickListenerImpl12.setValue(userGenderViewModel);
        }
        if (i != 0) {
            this.back.setOnClickListener(onClickListenerImpl);
            this.save.setOnClickListener(onClickListenerImpl1);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private UserGenderViewModel value;

        public OnClickListenerImpl setValue(UserGenderViewModel userGenderViewModel) {
            this.value = userGenderViewModel;
            if (userGenderViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.back(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private UserGenderViewModel value;

        public OnClickListenerImpl1 setValue(UserGenderViewModel userGenderViewModel) {
            this.value = userGenderViewModel;
            if (userGenderViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.save(view);
        }
    }
}
