package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.ifriend.chat.presentation.BR;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentBotEthnicityBindingImpl extends FragmentBotEthnicityBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl3 mVmAsianClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mVmBlackClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl mVmLatinoClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mVmOtherClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mVmSaveAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mVmWhiteClickAndroidViewViewOnClickListener;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.back, 13);
        sparseIntArray.put(R.id.asian_text, 14);
        sparseIntArray.put(R.id.white_text, 15);
        sparseIntArray.put(R.id.latino_text, 16);
        sparseIntArray.put(R.id.black_text, 17);
        sparseIntArray.put(R.id.other_text, 18);
    }

    public FragmentBotEthnicityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 19, sIncludes, sViewsWithIds));
    }

    private FragmentBotEthnicityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (ConstraintLayout) objArr[2], (TextView) objArr[14], (ImageView) objArr[13], (ConstraintLayout) objArr[8], (TextView) objArr[17], (ImageView) objArr[3], (ImageView) objArr[5], (ImageView) objArr[7], (ImageView) objArr[9], (ImageView) objArr[11], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[6], (TextView) objArr[16], (TextView) objArr[1], (ConstraintLayout) objArr[10], (TextView) objArr[18], (AppButton) objArr[12], (ConstraintLayout) objArr[4], (TextView) objArr[15]);
        this.mDirtyFlags = -1L;
        this.asian.setTag(null);
        this.black.setTag(null);
        this.check1.setTag(null);
        this.check2.setTag(null);
        this.check3.setTag(null);
        this.check4.setTag(null);
        this.check5.setTag(null);
        this.container.setTag(null);
        this.latino.setTag(null);
        this.name.setTag(null);
        this.other.setTag(null);
        this.save.setTag(null);
        this.white.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256L;
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
            setVm((BotEthnicityViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentBotEthnicityBinding
    public void setVm(BotEthnicityViewModel botEthnicityViewModel) {
        this.mVm = botEthnicityViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangeVmTitle((MutableLiveData) obj, i2);
            case 1:
                return onChangeVmIsOther((MutableLiveData) obj, i2);
            case 2:
                return onChangeVmIsLatino((MutableLiveData) obj, i2);
            case 3:
                return onChangeVmIsWhite((MutableLiveData) obj, i2);
            case 4:
                return onChangeVmIsAsian((MutableLiveData) obj, i2);
            case 5:
                return onChangeVmIsEdited((MutableLiveData) obj, i2);
            case 6:
                return onChangeVmIsBlack((MutableLiveData) obj, i2);
            default:
                return false;
        }
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

    private boolean onChangeVmIsOther(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsLatino(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsWhite(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsAsian(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsEdited(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsBlack(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 64;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015e  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        boolean z;
        boolean z2;
        OnClickListenerImpl onClickListenerImpl;
        OnClickListenerImpl1 onClickListenerImpl1;
        OnClickListenerImpl2 onClickListenerImpl2;
        String str;
        boolean z3;
        OnClickListenerImpl3 onClickListenerImpl3;
        OnClickListenerImpl5 onClickListenerImpl5;
        boolean z4;
        boolean z5;
        MutableLiveData<Boolean> mutableLiveData;
        OnClickListenerImpl4 onClickListenerImpl4;
        MutableLiveData<Boolean> mutableLiveData2;
        String str2;
        OnClickListenerImpl3 onClickListenerImpl32;
        OnClickListenerImpl onClickListenerImpl6;
        OnClickListenerImpl1 onClickListenerImpl12;
        boolean z6;
        boolean z7;
        boolean z8;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        BotEthnicityViewModel botEthnicityViewModel = this.mVm;
        if ((511 & j) != 0) {
            if ((j & 385) != 0) {
                MutableLiveData<String> title = botEthnicityViewModel != null ? botEthnicityViewModel.getTitle() : null;
                updateLiveDataRegistration(0, title);
                if (title != null) {
                    str2 = title.getValue();
                    if ((j & 384) != 0 || botEthnicityViewModel == null) {
                        onClickListenerImpl2 = null;
                        onClickListenerImpl32 = null;
                        onClickListenerImpl6 = null;
                        onClickListenerImpl12 = null;
                        onClickListenerImpl5 = null;
                        onClickListenerImpl4 = null;
                    } else {
                        OnClickListenerImpl onClickListenerImpl7 = this.mVmLatinoClickAndroidViewViewOnClickListener;
                        if (onClickListenerImpl7 == null) {
                            onClickListenerImpl7 = new OnClickListenerImpl();
                            this.mVmLatinoClickAndroidViewViewOnClickListener = onClickListenerImpl7;
                        }
                        onClickListenerImpl6 = onClickListenerImpl7.setValue(botEthnicityViewModel);
                        OnClickListenerImpl1 onClickListenerImpl13 = this.mVmWhiteClickAndroidViewViewOnClickListener;
                        if (onClickListenerImpl13 == null) {
                            onClickListenerImpl13 = new OnClickListenerImpl1();
                            this.mVmWhiteClickAndroidViewViewOnClickListener = onClickListenerImpl13;
                        }
                        onClickListenerImpl12 = onClickListenerImpl13.setValue(botEthnicityViewModel);
                        OnClickListenerImpl2 onClickListenerImpl22 = this.mVmBlackClickAndroidViewViewOnClickListener;
                        if (onClickListenerImpl22 == null) {
                            onClickListenerImpl22 = new OnClickListenerImpl2();
                            this.mVmBlackClickAndroidViewViewOnClickListener = onClickListenerImpl22;
                        }
                        onClickListenerImpl2 = onClickListenerImpl22.setValue(botEthnicityViewModel);
                        OnClickListenerImpl3 onClickListenerImpl33 = this.mVmAsianClickAndroidViewViewOnClickListener;
                        if (onClickListenerImpl33 == null) {
                            onClickListenerImpl33 = new OnClickListenerImpl3();
                            this.mVmAsianClickAndroidViewViewOnClickListener = onClickListenerImpl33;
                        }
                        onClickListenerImpl32 = onClickListenerImpl33.setValue(botEthnicityViewModel);
                        OnClickListenerImpl4 onClickListenerImpl42 = this.mVmOtherClickAndroidViewViewOnClickListener;
                        if (onClickListenerImpl42 == null) {
                            onClickListenerImpl42 = new OnClickListenerImpl4();
                            this.mVmOtherClickAndroidViewViewOnClickListener = onClickListenerImpl42;
                        }
                        onClickListenerImpl4 = onClickListenerImpl42.setValue(botEthnicityViewModel);
                        OnClickListenerImpl5 onClickListenerImpl52 = this.mVmSaveAndroidViewViewOnClickListener;
                        if (onClickListenerImpl52 == null) {
                            onClickListenerImpl52 = new OnClickListenerImpl5();
                            this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl52;
                        }
                        onClickListenerImpl5 = onClickListenerImpl52.setValue(botEthnicityViewModel);
                    }
                    if ((j & 386) == 0) {
                        MutableLiveData<Boolean> isOther = botEthnicityViewModel != null ? botEthnicityViewModel.isOther() : null;
                        updateLiveDataRegistration(1, isOther);
                        z4 = ViewDataBinding.safeUnbox(isOther != null ? isOther.getValue() : null);
                    } else {
                        z4 = false;
                    }
                    if ((j & 388) == 0) {
                        MutableLiveData<Boolean> isLatino = botEthnicityViewModel != null ? botEthnicityViewModel.isLatino() : null;
                        updateLiveDataRegistration(2, isLatino);
                        z5 = ViewDataBinding.safeUnbox(isLatino != null ? isLatino.getValue() : null);
                    } else {
                        z5 = false;
                    }
                    if ((j & 392) == 0) {
                        MutableLiveData<Boolean> isWhite = botEthnicityViewModel != null ? botEthnicityViewModel.isWhite() : null;
                        updateLiveDataRegistration(3, isWhite);
                        z6 = ViewDataBinding.safeUnbox(isWhite != null ? isWhite.getValue() : null);
                    } else {
                        z6 = false;
                    }
                    if ((j & 400) == 0) {
                        MutableLiveData<Boolean> isAsian = botEthnicityViewModel != null ? botEthnicityViewModel.isAsian() : null;
                        updateLiveDataRegistration(4, isAsian);
                        z7 = ViewDataBinding.safeUnbox(isAsian != null ? isAsian.getValue() : null);
                    } else {
                        z7 = false;
                    }
                    if ((j & 416) == 0) {
                        if (botEthnicityViewModel != null) {
                            mutableLiveData = botEthnicityViewModel.isEdited();
                            z8 = z6;
                        } else {
                            z8 = z6;
                            mutableLiveData = null;
                        }
                        updateLiveDataRegistration(5, mutableLiveData);
                        if (mutableLiveData != null) {
                            mutableLiveData.getValue();
                        }
                    } else {
                        z8 = z6;
                        mutableLiveData = null;
                    }
                    if ((j & 448) == 0) {
                        MutableLiveData<Boolean> isBlack = botEthnicityViewModel != null ? botEthnicityViewModel.isBlack() : null;
                        updateLiveDataRegistration(6, isBlack);
                        z2 = ViewDataBinding.safeUnbox(isBlack != null ? isBlack.getValue() : null);
                        z = z8;
                    } else {
                        z = z8;
                        z2 = false;
                    }
                    OnClickListenerImpl onClickListenerImpl8 = onClickListenerImpl6;
                    z3 = z7;
                    onClickListenerImpl = onClickListenerImpl8;
                    OnClickListenerImpl3 onClickListenerImpl34 = onClickListenerImpl32;
                    str = str2;
                    onClickListenerImpl1 = onClickListenerImpl12;
                    onClickListenerImpl3 = onClickListenerImpl34;
                }
            }
            str2 = null;
            if ((j & 384) != 0) {
            }
            onClickListenerImpl2 = null;
            onClickListenerImpl32 = null;
            onClickListenerImpl6 = null;
            onClickListenerImpl12 = null;
            onClickListenerImpl5 = null;
            onClickListenerImpl4 = null;
            if ((j & 386) == 0) {
            }
            if ((j & 388) == 0) {
            }
            if ((j & 392) == 0) {
            }
            if ((j & 400) == 0) {
            }
            if ((j & 416) == 0) {
            }
            if ((j & 448) == 0) {
            }
            OnClickListenerImpl onClickListenerImpl82 = onClickListenerImpl6;
            z3 = z7;
            onClickListenerImpl = onClickListenerImpl82;
            OnClickListenerImpl3 onClickListenerImpl342 = onClickListenerImpl32;
            str = str2;
            onClickListenerImpl1 = onClickListenerImpl12;
            onClickListenerImpl3 = onClickListenerImpl342;
        } else {
            z = false;
            z2 = false;
            onClickListenerImpl = null;
            onClickListenerImpl1 = null;
            onClickListenerImpl2 = null;
            str = null;
            z3 = false;
            onClickListenerImpl3 = null;
            onClickListenerImpl5 = null;
            z4 = false;
            z5 = false;
            mutableLiveData = null;
            onClickListenerImpl4 = null;
        }
        if ((j & 384) != 0) {
            mutableLiveData2 = mutableLiveData;
            this.asian.setOnClickListener(onClickListenerImpl3);
            this.black.setOnClickListener(onClickListenerImpl2);
            this.latino.setOnClickListener(onClickListenerImpl);
            this.other.setOnClickListener(onClickListenerImpl4);
            this.save.setOnClickListener(onClickListenerImpl5);
            this.white.setOnClickListener(onClickListenerImpl1);
        } else {
            mutableLiveData2 = mutableLiveData;
        }
        if ((j & 400) != 0) {
            Adapter.setVisibility(this.check1, z3);
        }
        if ((392 & j) != 0) {
            Adapter.setVisibility(this.check2, z);
        }
        if ((388 & j) != 0) {
            Adapter.setVisibility(this.check3, z5);
        }
        if ((448 & j) != 0) {
            Adapter.setVisibility(this.check4, z2);
        }
        if ((386 & j) != 0) {
            Adapter.setVisibility(this.check5, z4);
        }
        if ((j & 385) != 0) {
            TextViewBindingAdapter.setText(this.name, str);
        }
        if ((j & 416) != 0) {
            Adapter.setIsActive(this.save, mutableLiveData2);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private BotEthnicityViewModel value;

        public OnClickListenerImpl setValue(BotEthnicityViewModel botEthnicityViewModel) {
            this.value = botEthnicityViewModel;
            if (botEthnicityViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.latinoClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private BotEthnicityViewModel value;

        public OnClickListenerImpl1 setValue(BotEthnicityViewModel botEthnicityViewModel) {
            this.value = botEthnicityViewModel;
            if (botEthnicityViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.whiteClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private BotEthnicityViewModel value;

        public OnClickListenerImpl2 setValue(BotEthnicityViewModel botEthnicityViewModel) {
            this.value = botEthnicityViewModel;
            if (botEthnicityViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.blackClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl3 implements View.OnClickListener {
        private BotEthnicityViewModel value;

        public OnClickListenerImpl3 setValue(BotEthnicityViewModel botEthnicityViewModel) {
            this.value = botEthnicityViewModel;
            if (botEthnicityViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.asianClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl4 implements View.OnClickListener {
        private BotEthnicityViewModel value;

        public OnClickListenerImpl4 setValue(BotEthnicityViewModel botEthnicityViewModel) {
            this.value = botEthnicityViewModel;
            if (botEthnicityViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.otherClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl5 implements View.OnClickListener {
        private BotEthnicityViewModel value;

        public OnClickListenerImpl5 setValue(BotEthnicityViewModel botEthnicityViewModel) {
            this.value = botEthnicityViewModel;
            if (botEthnicityViewModel == null) {
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
