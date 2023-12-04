package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ifriend.chat.presentation.BR;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentBotPersonalityBindingImpl extends FragmentBotPersonalityBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl1 mVmFlirtyClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl mVmFriendlyClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mVmSaveAndroidViewViewOnClickListener;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.back, 7);
        sparseIntArray.put(R.id.flirty_text, 8);
        sparseIntArray.put(R.id.male_text, 9);
    }

    public FragmentBotPersonalityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private FragmentBotPersonalityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[7], (ImageView) objArr[3], (ImageView) objArr[5], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[2], (TextView) objArr[8], (ConstraintLayout) objArr[4], (TextView) objArr[9], (TextView) objArr[1], (AppButton) objArr[6]);
        this.mDirtyFlags = -1L;
        this.check1.setTag(null);
        this.check2.setTag(null);
        this.container.setTag(null);
        this.flirty.setTag(null);
        this.friendly.setTag(null);
        this.name.setTag(null);
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
            setVm((BotPersonalityViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentBotPersonalityBinding
    public void setVm(BotPersonalityViewModel botPersonalityViewModel) {
        this.mVm = botPersonalityViewModel;
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
                    return onChangeVmIsFlirty((MutableLiveData) obj, i2);
                }
                return onChangeVmIsEdited((MutableLiveData) obj, i2);
            }
            return onChangeVmIsFriendly((MutableLiveData) obj, i2);
        }
        return onChangeVmTitle((MutableLiveData) obj, i2);
    }

    private boolean onChangeVmTitle(MutableLiveData<String> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsFriendly(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsEdited(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsFlirty(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        OnClickListenerImpl onClickListenerImpl;
        String str;
        MutableLiveData<Boolean> mutableLiveData;
        OnClickListenerImpl1 onClickListenerImpl1;
        OnClickListenerImpl2 onClickListenerImpl2;
        long j2;
        boolean z;
        boolean z2;
        OnClickListenerImpl onClickListenerImpl3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        BotPersonalityViewModel botPersonalityViewModel = this.mVm;
        if ((63 & j) != 0) {
            if ((j & 49) != 0) {
                LiveData<?> title = botPersonalityViewModel != null ? botPersonalityViewModel.getTitle() : null;
                updateLiveDataRegistration(0, title);
                if (title != null) {
                    str = title.getValue();
                    if ((j & 48) != 0 || botPersonalityViewModel == null) {
                        onClickListenerImpl1 = null;
                        onClickListenerImpl2 = null;
                        onClickListenerImpl3 = null;
                    } else {
                        OnClickListenerImpl onClickListenerImpl4 = this.mVmFriendlyClickAndroidViewViewOnClickListener;
                        if (onClickListenerImpl4 == null) {
                            onClickListenerImpl4 = new OnClickListenerImpl();
                            this.mVmFriendlyClickAndroidViewViewOnClickListener = onClickListenerImpl4;
                        }
                        onClickListenerImpl3 = onClickListenerImpl4.setValue(botPersonalityViewModel);
                        OnClickListenerImpl1 onClickListenerImpl12 = this.mVmFlirtyClickAndroidViewViewOnClickListener;
                        if (onClickListenerImpl12 == null) {
                            onClickListenerImpl12 = new OnClickListenerImpl1();
                            this.mVmFlirtyClickAndroidViewViewOnClickListener = onClickListenerImpl12;
                        }
                        onClickListenerImpl1 = onClickListenerImpl12.setValue(botPersonalityViewModel);
                        OnClickListenerImpl2 onClickListenerImpl22 = this.mVmSaveAndroidViewViewOnClickListener;
                        if (onClickListenerImpl22 == null) {
                            onClickListenerImpl22 = new OnClickListenerImpl2();
                            this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl22;
                        }
                        onClickListenerImpl2 = onClickListenerImpl22.setValue(botPersonalityViewModel);
                    }
                    if ((j & 50) == 0) {
                        LiveData<?> isFriendly = botPersonalityViewModel != null ? botPersonalityViewModel.isFriendly() : null;
                        updateLiveDataRegistration(1, isFriendly);
                        z = ViewDataBinding.safeUnbox(isFriendly != null ? isFriendly.getValue() : null);
                    } else {
                        z = false;
                    }
                    if ((j & 52) == 0) {
                        mutableLiveData = botPersonalityViewModel != null ? botPersonalityViewModel.isEdited() : null;
                        updateLiveDataRegistration(2, mutableLiveData);
                        if (mutableLiveData != null) {
                            mutableLiveData.getValue();
                        }
                    } else {
                        mutableLiveData = null;
                    }
                    if ((j & 56) == 0) {
                        LiveData<?> isFlirty = botPersonalityViewModel != null ? botPersonalityViewModel.isFlirty() : null;
                        updateLiveDataRegistration(3, isFlirty);
                        j2 = 56;
                        OnClickListenerImpl onClickListenerImpl5 = onClickListenerImpl3;
                        z2 = ViewDataBinding.safeUnbox(isFlirty != null ? isFlirty.getValue() : null);
                        onClickListenerImpl = onClickListenerImpl5;
                        if ((j2 & j) != 0) {
                            Adapter.setVisibility(this.check1, z2);
                        }
                        if ((j & 50) != 0) {
                            Adapter.setVisibility(this.check2, z);
                        }
                        if ((48 & j) != 0) {
                            this.flirty.setOnClickListener(onClickListenerImpl1);
                            this.friendly.setOnClickListener(onClickListenerImpl);
                            this.save.setOnClickListener(onClickListenerImpl2);
                        }
                        if ((49 & j) != 0) {
                            TextViewBindingAdapter.setText(this.name, str);
                        }
                        if ((j & 52) == 0) {
                            Adapter.setIsActive(this.save, mutableLiveData);
                            return;
                        }
                        return;
                    }
                    onClickListenerImpl = onClickListenerImpl3;
                    j2 = 56;
                }
            }
            str = null;
            if ((j & 48) != 0) {
            }
            onClickListenerImpl1 = null;
            onClickListenerImpl2 = null;
            onClickListenerImpl3 = null;
            if ((j & 50) == 0) {
            }
            if ((j & 52) == 0) {
            }
            if ((j & 56) == 0) {
            }
        } else {
            onClickListenerImpl = null;
            str = null;
            mutableLiveData = null;
            onClickListenerImpl1 = null;
            onClickListenerImpl2 = null;
            j2 = 56;
            z = false;
        }
        z2 = false;
        if ((j2 & j) != 0) {
        }
        if ((j & 50) != 0) {
        }
        if ((48 & j) != 0) {
        }
        if ((49 & j) != 0) {
        }
        if ((j & 52) == 0) {
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private BotPersonalityViewModel value;

        public OnClickListenerImpl setValue(BotPersonalityViewModel botPersonalityViewModel) {
            this.value = botPersonalityViewModel;
            if (botPersonalityViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.friendlyClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private BotPersonalityViewModel value;

        public OnClickListenerImpl1 setValue(BotPersonalityViewModel botPersonalityViewModel) {
            this.value = botPersonalityViewModel;
            if (botPersonalityViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.flirtyClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private BotPersonalityViewModel value;

        public OnClickListenerImpl2 setValue(BotPersonalityViewModel botPersonalityViewModel) {
            this.value = botPersonalityViewModel;
            if (botPersonalityViewModel == null) {
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
