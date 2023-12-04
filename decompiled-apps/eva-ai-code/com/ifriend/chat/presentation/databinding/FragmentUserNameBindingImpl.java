package com.ifriend.chat.presentation.databinding;

import android.text.TextWatcher;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.BR;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserNameViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.editText.WhiteEditText;
/* loaded from: classes6.dex */
public class FragmentUserNameBindingImpl extends FragmentUserNameBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl1 mVmBackAndroidViewViewOnClickListener;
    private OnClickListenerImpl mVmSaveAndroidViewViewOnClickListener;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.name, 4);
    }

    public FragmentUserNameBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private FragmentUserNameBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (WhiteEditText) objArr[2], (TextView) objArr[4], (AppButton) objArr[3]);
        this.mDirtyFlags = -1L;
        this.back.setTag(null);
        this.editText.setTag(null);
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
            setVm((UserNameViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentUserNameBinding
    public void setVm(UserNameViewModel userNameViewModel) {
        this.mVm = userNameViewModel;
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
        TextWatcher textWatcher;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        UserNameViewModel userNameViewModel = this.mVm;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || userNameViewModel == null) {
            onClickListenerImpl = null;
            onClickListenerImpl1 = null;
            textWatcher = null;
        } else {
            OnClickListenerImpl onClickListenerImpl2 = this.mVmSaveAndroidViewViewOnClickListener;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new OnClickListenerImpl();
                this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl2;
            }
            onClickListenerImpl = onClickListenerImpl2.setValue(userNameViewModel);
            OnClickListenerImpl1 onClickListenerImpl12 = this.mVmBackAndroidViewViewOnClickListener;
            if (onClickListenerImpl12 == null) {
                onClickListenerImpl12 = new OnClickListenerImpl1();
                this.mVmBackAndroidViewViewOnClickListener = onClickListenerImpl12;
            }
            onClickListenerImpl1 = onClickListenerImpl12.setValue(userNameViewModel);
            textWatcher = userNameViewModel.getNameChangedWatcher();
        }
        if (i != 0) {
            this.back.setOnClickListener(onClickListenerImpl1);
            Adapter.onTextChanged(this.editText, textWatcher);
            this.save.setOnClickListener(onClickListenerImpl);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private UserNameViewModel value;

        public OnClickListenerImpl setValue(UserNameViewModel userNameViewModel) {
            this.value = userNameViewModel;
            if (userNameViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.save(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private UserNameViewModel value;

        public OnClickListenerImpl1 setValue(UserNameViewModel userNameViewModel) {
            this.value = userNameViewModel;
            if (userNameViewModel == null) {
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
