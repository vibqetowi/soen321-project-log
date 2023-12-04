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
import com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentBotGenderBindingImpl extends FragmentBotGenderBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl1 mVmFemaleClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mVmMaleClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl mVmNonBinaryClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mVmSaveAndroidViewViewOnClickListener;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.back, 8);
        sparseIntArray.put(R.id.name, 9);
        sparseIntArray.put(R.id.female_text, 10);
        sparseIntArray.put(R.id.male_text, 11);
        sparseIntArray.put(R.id.non_binary_text, 12);
    }

    public FragmentBotGenderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private FragmentBotGenderBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[8], (ImageView) objArr[2], (ImageView) objArr[4], (ImageView) objArr[6], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1], (TextView) objArr[10], (ConstraintLayout) objArr[3], (TextView) objArr[11], (TextView) objArr[9], (ConstraintLayout) objArr[5], (TextView) objArr[12], (AppButton) objArr[7]);
        this.mDirtyFlags = -1L;
        this.check1.setTag(null);
        this.check2.setTag(null);
        this.check3.setTag(null);
        this.container.setTag(null);
        this.female.setTag(null);
        this.male.setTag(null);
        this.nonBinary.setTag(null);
        this.save.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 32L;
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
            setVm((BotGenderViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentBotGenderBinding
    public void setVm(BotGenderViewModel botGenderViewModel) {
        this.mVm = botGenderViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return onChangeVmIsEdited((MutableLiveData) obj, i2);
                }
                return onChangeVmIsNonBinary((MutableLiveData) obj, i2);
            }
            return onChangeVmIsMale((MutableLiveData) obj, i2);
        }
        return onChangeVmIsFemale((MutableLiveData) obj, i2);
    }

    private boolean onChangeVmIsFemale(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsMale(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsNonBinary(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsEdited(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        OnClickListenerImpl1 onClickListenerImpl1;
        OnClickListenerImpl onClickListenerImpl;
        MutableLiveData<Boolean> mutableLiveData;
        OnClickListenerImpl2 onClickListenerImpl2;
        OnClickListenerImpl3 onClickListenerImpl3;
        OnClickListenerImpl onClickListenerImpl4;
        boolean z4;
        boolean z5;
        long j2;
        boolean z6;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        BotGenderViewModel botGenderViewModel = this.mVm;
        if ((63 & j) != 0) {
            if ((j & 48) == 0 || botGenderViewModel == null) {
                onClickListenerImpl4 = null;
                onClickListenerImpl1 = null;
                onClickListenerImpl2 = null;
                onClickListenerImpl3 = null;
            } else {
                OnClickListenerImpl onClickListenerImpl5 = this.mVmNonBinaryClickAndroidViewViewOnClickListener;
                if (onClickListenerImpl5 == null) {
                    onClickListenerImpl5 = new OnClickListenerImpl();
                    this.mVmNonBinaryClickAndroidViewViewOnClickListener = onClickListenerImpl5;
                }
                onClickListenerImpl4 = onClickListenerImpl5.setValue(botGenderViewModel);
                OnClickListenerImpl1 onClickListenerImpl12 = this.mVmFemaleClickAndroidViewViewOnClickListener;
                if (onClickListenerImpl12 == null) {
                    onClickListenerImpl12 = new OnClickListenerImpl1();
                    this.mVmFemaleClickAndroidViewViewOnClickListener = onClickListenerImpl12;
                }
                onClickListenerImpl1 = onClickListenerImpl12.setValue(botGenderViewModel);
                OnClickListenerImpl2 onClickListenerImpl22 = this.mVmMaleClickAndroidViewViewOnClickListener;
                if (onClickListenerImpl22 == null) {
                    onClickListenerImpl22 = new OnClickListenerImpl2();
                    this.mVmMaleClickAndroidViewViewOnClickListener = onClickListenerImpl22;
                }
                onClickListenerImpl2 = onClickListenerImpl22.setValue(botGenderViewModel);
                OnClickListenerImpl3 onClickListenerImpl32 = this.mVmSaveAndroidViewViewOnClickListener;
                if (onClickListenerImpl32 == null) {
                    onClickListenerImpl32 = new OnClickListenerImpl3();
                    this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl32;
                }
                onClickListenerImpl3 = onClickListenerImpl32.setValue(botGenderViewModel);
            }
            if ((j & 49) != 0) {
                MutableLiveData<Boolean> isFemale = botGenderViewModel != null ? botGenderViewModel.isFemale() : null;
                updateLiveDataRegistration(0, isFemale);
                z4 = ViewDataBinding.safeUnbox(isFemale != null ? isFemale.getValue() : null);
            } else {
                z4 = false;
            }
            if ((j & 50) != 0) {
                MutableLiveData<Boolean> isMale = botGenderViewModel != null ? botGenderViewModel.isMale() : null;
                updateLiveDataRegistration(1, isMale);
                z5 = ViewDataBinding.safeUnbox(isMale != null ? isMale.getValue() : null);
            } else {
                z5 = false;
            }
            if ((j & 52) != 0) {
                MutableLiveData<Boolean> isNonBinary = botGenderViewModel != null ? botGenderViewModel.isNonBinary() : null;
                updateLiveDataRegistration(2, isNonBinary);
                z6 = ViewDataBinding.safeUnbox(isNonBinary != null ? isNonBinary.getValue() : null);
                j2 = 56;
            } else {
                j2 = 56;
                z6 = false;
            }
            if ((j & j2) != 0) {
                MutableLiveData<Boolean> isEdited = botGenderViewModel != null ? botGenderViewModel.isEdited() : null;
                updateLiveDataRegistration(3, isEdited);
                if (isEdited != null) {
                    isEdited.getValue();
                }
                mutableLiveData = isEdited;
                onClickListenerImpl = onClickListenerImpl4;
                z = z5;
                z3 = z4;
                z2 = z6;
            } else {
                onClickListenerImpl = onClickListenerImpl4;
                z = z5;
                z3 = z4;
                z2 = z6;
                mutableLiveData = null;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            onClickListenerImpl1 = null;
            onClickListenerImpl = null;
            mutableLiveData = null;
            onClickListenerImpl2 = null;
            onClickListenerImpl3 = null;
        }
        if ((49 & j) != 0) {
            Adapter.setVisibility(this.check1, z3);
        }
        if ((50 & j) != 0) {
            Adapter.setVisibility(this.check2, z);
        }
        if ((52 & j) != 0) {
            Adapter.setVisibility(this.check3, z2);
        }
        if ((48 & j) != 0) {
            this.female.setOnClickListener(onClickListenerImpl1);
            this.male.setOnClickListener(onClickListenerImpl2);
            this.nonBinary.setOnClickListener(onClickListenerImpl);
            this.save.setOnClickListener(onClickListenerImpl3);
        }
        if ((j & 56) != 0) {
            Adapter.setIsActive(this.save, mutableLiveData);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private BotGenderViewModel value;

        public OnClickListenerImpl setValue(BotGenderViewModel botGenderViewModel) {
            this.value = botGenderViewModel;
            if (botGenderViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.nonBinaryClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private BotGenderViewModel value;

        public OnClickListenerImpl1 setValue(BotGenderViewModel botGenderViewModel) {
            this.value = botGenderViewModel;
            if (botGenderViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.femaleClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private BotGenderViewModel value;

        public OnClickListenerImpl2 setValue(BotGenderViewModel botGenderViewModel) {
            this.value = botGenderViewModel;
            if (botGenderViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.maleClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl3 implements View.OnClickListener {
        private BotGenderViewModel value;

        public OnClickListenerImpl3 setValue(BotGenderViewModel botGenderViewModel) {
            this.value = botGenderViewModel;
            if (botGenderViewModel == null) {
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
