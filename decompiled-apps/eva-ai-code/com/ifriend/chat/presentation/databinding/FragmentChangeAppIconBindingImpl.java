package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.ifriend.chat.presentation.BR;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.userProfile.ChangeAppIconViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
import com.ifriend.ui.button.GradientButton;
/* loaded from: classes6.dex */
public class FragmentChangeAppIconBindingImpl extends FragmentChangeAppIconBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl1 mVmBackAndroidViewViewOnClickListener;
    private OnClickListenerImpl mVmOnClickPremiumIconAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mVmOnClickRegularIconAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mVmSaveAndroidViewViewOnClickListener;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.name, 7);
        sparseIntArray.put(R.id.app_icon, 8);
        sparseIntArray.put(R.id.app_name_text, 9);
        sparseIntArray.put(R.id.premium_app_icon, 10);
        sparseIntArray.put(R.id.premium_app_icon_text, 11);
    }

    public FragmentChangeAppIconBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private FragmentChangeAppIconBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[8], (ImageView) objArr[3], (ConstraintLayout) objArr[2], (TextView) objArr[9], (ImageView) objArr[1], (TextView) objArr[7], (ImageView) objArr[10], (ImageView) objArr[5], (ConstraintLayout) objArr[4], (TextView) objArr[11], (GradientButton) objArr[6]);
        this.mDirtyFlags = -1L;
        this.appIconCheck.setTag(null);
        this.appIconPanel.setTag(null);
        this.back.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.premiumAppIconCheck.setTag(null);
        this.premiumAppIconPanel.setTag(null);
        this.save.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8L;
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
            setVm((ChangeAppIconViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentChangeAppIconBinding
    public void setVm(ChangeAppIconViewModel changeAppIconViewModel) {
        this.mVm = changeAppIconViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return onChangeVmIsEdited((MutableLiveData) obj, i2);
        }
        return onChangeVmIsPremiumIconSelected((MutableLiveData) obj, i2);
    }

    private boolean onChangeVmIsPremiumIconSelected(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsEdited(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        boolean z;
        OnClickListenerImpl1 onClickListenerImpl1;
        MutableLiveData<Boolean> mutableLiveData;
        OnClickListenerImpl2 onClickListenerImpl2;
        OnClickListenerImpl3 onClickListenerImpl3;
        OnClickListenerImpl onClickListenerImpl;
        boolean z2;
        OnClickListenerImpl3 onClickListenerImpl32;
        OnClickListenerImpl1 onClickListenerImpl12;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ChangeAppIconViewModel changeAppIconViewModel = this.mVm;
        boolean z3 = false;
        if ((15 & j) != 0) {
            if ((j & 13) != 0) {
                MutableLiveData<Boolean> isPremiumIconSelected = changeAppIconViewModel != null ? changeAppIconViewModel.isPremiumIconSelected() : null;
                updateLiveDataRegistration(0, isPremiumIconSelected);
                boolean safeUnbox = ViewDataBinding.safeUnbox(isPremiumIconSelected != null ? isPremiumIconSelected.getValue() : null);
                z3 = safeUnbox;
                z2 = ViewDataBinding.safeUnbox(Boolean.valueOf(!safeUnbox));
            } else {
                z2 = false;
            }
            if ((j & 12) == 0 || changeAppIconViewModel == null) {
                onClickListenerImpl2 = null;
                onClickListenerImpl32 = null;
                onClickListenerImpl12 = null;
                onClickListenerImpl = null;
            } else {
                OnClickListenerImpl onClickListenerImpl4 = this.mVmOnClickPremiumIconAndroidViewViewOnClickListener;
                if (onClickListenerImpl4 == null) {
                    onClickListenerImpl4 = new OnClickListenerImpl();
                    this.mVmOnClickPremiumIconAndroidViewViewOnClickListener = onClickListenerImpl4;
                }
                onClickListenerImpl = onClickListenerImpl4.setValue(changeAppIconViewModel);
                OnClickListenerImpl1 onClickListenerImpl13 = this.mVmBackAndroidViewViewOnClickListener;
                if (onClickListenerImpl13 == null) {
                    onClickListenerImpl13 = new OnClickListenerImpl1();
                    this.mVmBackAndroidViewViewOnClickListener = onClickListenerImpl13;
                }
                onClickListenerImpl12 = onClickListenerImpl13.setValue(changeAppIconViewModel);
                OnClickListenerImpl2 onClickListenerImpl22 = this.mVmSaveAndroidViewViewOnClickListener;
                if (onClickListenerImpl22 == null) {
                    onClickListenerImpl22 = new OnClickListenerImpl2();
                    this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl22;
                }
                onClickListenerImpl2 = onClickListenerImpl22.setValue(changeAppIconViewModel);
                OnClickListenerImpl3 onClickListenerImpl33 = this.mVmOnClickRegularIconAndroidViewViewOnClickListener;
                if (onClickListenerImpl33 == null) {
                    onClickListenerImpl33 = new OnClickListenerImpl3();
                    this.mVmOnClickRegularIconAndroidViewViewOnClickListener = onClickListenerImpl33;
                }
                onClickListenerImpl32 = onClickListenerImpl33.setValue(changeAppIconViewModel);
            }
            if ((j & 14) != 0) {
                MutableLiveData<Boolean> isEdited = changeAppIconViewModel != null ? changeAppIconViewModel.isEdited() : null;
                updateLiveDataRegistration(1, isEdited);
                if (isEdited != null) {
                    isEdited.getValue();
                }
                mutableLiveData = isEdited;
                z = z3;
            } else {
                z = z3;
                mutableLiveData = null;
            }
            z3 = z2;
            onClickListenerImpl1 = onClickListenerImpl12;
            onClickListenerImpl3 = onClickListenerImpl32;
        } else {
            z = false;
            onClickListenerImpl1 = null;
            mutableLiveData = null;
            onClickListenerImpl2 = null;
            onClickListenerImpl3 = null;
            onClickListenerImpl = null;
        }
        if ((j & 13) != 0) {
            Adapter.setVisibility(this.appIconCheck, z3);
            Adapter.setVisibility(this.premiumAppIconCheck, z);
        }
        if ((12 & j) != 0) {
            this.appIconPanel.setOnClickListener(onClickListenerImpl3);
            this.back.setOnClickListener(onClickListenerImpl1);
            this.premiumAppIconPanel.setOnClickListener(onClickListenerImpl);
            this.save.setOnClickListener(onClickListenerImpl2);
        }
        if ((j & 14) != 0) {
            Adapter.setIsActive(this.save, mutableLiveData);
            Adapter.setIsEnabled(this.save, mutableLiveData);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private ChangeAppIconViewModel value;

        public OnClickListenerImpl setValue(ChangeAppIconViewModel changeAppIconViewModel) {
            this.value = changeAppIconViewModel;
            if (changeAppIconViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.onClickPremiumIcon(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private ChangeAppIconViewModel value;

        public OnClickListenerImpl1 setValue(ChangeAppIconViewModel changeAppIconViewModel) {
            this.value = changeAppIconViewModel;
            if (changeAppIconViewModel == null) {
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
    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private ChangeAppIconViewModel value;

        public OnClickListenerImpl2 setValue(ChangeAppIconViewModel changeAppIconViewModel) {
            this.value = changeAppIconViewModel;
            if (changeAppIconViewModel == null) {
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
    public static class OnClickListenerImpl3 implements View.OnClickListener {
        private ChangeAppIconViewModel value;

        public OnClickListenerImpl3 setValue(ChangeAppIconViewModel changeAppIconViewModel) {
            this.value = changeAppIconViewModel;
            if (changeAppIconViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.onClickRegularIcon(view);
        }
    }
}
