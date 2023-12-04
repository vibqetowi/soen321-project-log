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
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
/* loaded from: classes6.dex */
public class FragmentUserProfileBindingImpl extends FragmentUserProfileBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl5 mVmChangeAgeAndroidViewViewOnClickListener;
    private OnClickListenerImpl8 mVmChangeGenderAndroidViewViewOnClickListener;
    private OnClickListenerImpl mVmChangeIconAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mVmChangeNameAndroidViewViewOnClickListener;
    private OnClickListenerImpl6 mVmChangePremiumAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mVmCloseClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mVmDeleteAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mVmLogoutAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mVmRestorePurchasesAndroidViewViewOnClickListener;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.title, 16);
        sparseIntArray.put(R.id.name_text, 17);
        sparseIntArray.put(R.id.arrow_1, 18);
        sparseIntArray.put(R.id.gender_text, 19);
        sparseIntArray.put(R.id.arrow_2, 20);
        sparseIntArray.put(R.id.age_text, 21);
        sparseIntArray.put(R.id.arrow_3, 22);
        sparseIntArray.put(R.id.title2, 23);
        sparseIntArray.put(R.id.restore_purchases_text, 24);
        sparseIntArray.put(R.id.title3, 25);
        sparseIntArray.put(R.id.change_icon_text, 26);
        sparseIntArray.put(R.id.arrow_4, 27);
        sparseIntArray.put(R.id.logout_text, 28);
        sparseIntArray.put(R.id.delete_text, 29);
        sparseIntArray.put(R.id.arrow_5, 30);
    }

    public FragmentUserProfileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 31, sIncludes, sViewsWithIds));
    }

    private FragmentUserProfileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (ConstraintLayout) objArr[6], (TextView) objArr[21], (TextView) objArr[7], (ImageView) objArr[18], (ImageView) objArr[20], (ImageView) objArr[22], (ImageView) objArr[27], (ImageView) objArr[30], (ImageView) objArr[11], (ConstraintLayout) objArr[13], (TextView) objArr[26], (ImageView) objArr[1], (ConstraintLayout) objArr[15], (TextView) objArr[29], (ConstraintLayout) objArr[4], (TextView) objArr[19], (TextView) objArr[5], (ConstraintLayout) objArr[14], (TextView) objArr[28], (ConstraintLayout) objArr[2], (TextView) objArr[17], (TextView) objArr[3], (ConstraintLayout) objArr[8], (TextView) objArr[9], (TextView) objArr[10], (ConstraintLayout) objArr[12], (TextView) objArr[24], (TextView) objArr[16], (TextView) objArr[23], (TextView) objArr[25]);
        this.mDirtyFlags = -1L;
        this.age.setTag(null);
        this.ageValue.setTag(null);
        this.arrowPrem.setTag(null);
        this.changeIcon.setTag(null);
        this.close.setTag(null);
        this.delete.setTag(null);
        this.gender.setTag(null);
        this.genderValue.setTag(null);
        this.logout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.name.setTag(null);
        this.nameValue.setTag(null);
        this.premium.setTag(null);
        this.premiumText.setTag(null);
        this.premiumValue.setTag(null);
        this.restorePurchases.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128L;
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
            setVm((UserProfileViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentUserProfileBinding
    public void setVm(UserProfileViewModel userProfileViewModel) {
        this.mVm = userProfileViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
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
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            return onChangeVmPremium((MutableLiveData) obj, i2);
                        }
                        return onChangeVmIsPremium((MutableLiveData) obj, i2);
                    }
                    return onChangeVmAge((MutableLiveData) obj, i2);
                }
                return onChangeVmName((MutableLiveData) obj, i2);
            }
            return onChangeVmPremiumActive((MutableLiveData) obj, i2);
        }
        return onChangeVmGender((MutableLiveData) obj, i2);
    }

    private boolean onChangeVmGender(MutableLiveData<String> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmPremiumActive(MutableLiveData<String> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmName(MutableLiveData<String> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmAge(MutableLiveData<String> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmIsPremium(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean onChangeVmPremium(MutableLiveData<String> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 32;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        OnClickListenerImpl onClickListenerImpl;
        boolean z;
        OnClickListenerImpl8 onClickListenerImpl8;
        OnClickListenerImpl7 onClickListenerImpl7;
        OnClickListenerImpl1 onClickListenerImpl1;
        OnClickListenerImpl5 onClickListenerImpl5;
        String str;
        OnClickListenerImpl6 onClickListenerImpl6;
        String str2;
        String str3;
        OnClickListenerImpl2 onClickListenerImpl2;
        OnClickListenerImpl3 onClickListenerImpl3;
        OnClickListenerImpl4 onClickListenerImpl4;
        String str4;
        String str5;
        String str6;
        String str7;
        OnClickListenerImpl7 onClickListenerImpl72;
        OnClickListenerImpl onClickListenerImpl9;
        OnClickListenerImpl5 onClickListenerImpl52;
        String str8;
        OnClickListenerImpl7 onClickListenerImpl73;
        String str9;
        String str10;
        String str11;
        String str12;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<String> mutableLiveData3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        UserProfileViewModel userProfileViewModel = this.mVm;
        if ((255 & j) != 0) {
            if ((j & 193) != 0) {
                MutableLiveData<String> gender = userProfileViewModel != null ? userProfileViewModel.getGender() : null;
                updateLiveDataRegistration(0, gender);
                if (gender != null) {
                    str7 = gender.getValue();
                    if ((j & 192) != 0 || userProfileViewModel == null) {
                        onClickListenerImpl72 = null;
                        onClickListenerImpl8 = null;
                        onClickListenerImpl1 = null;
                        onClickListenerImpl9 = null;
                        onClickListenerImpl52 = null;
                        onClickListenerImpl6 = null;
                        onClickListenerImpl2 = null;
                        onClickListenerImpl3 = null;
                        onClickListenerImpl4 = null;
                    } else {
                        OnClickListenerImpl onClickListenerImpl10 = this.mVmChangeIconAndroidViewViewOnClickListener;
                        if (onClickListenerImpl10 == null) {
                            onClickListenerImpl10 = new OnClickListenerImpl();
                            this.mVmChangeIconAndroidViewViewOnClickListener = onClickListenerImpl10;
                        }
                        onClickListenerImpl9 = onClickListenerImpl10.setValue(userProfileViewModel);
                        OnClickListenerImpl1 onClickListenerImpl12 = this.mVmCloseClickAndroidViewViewOnClickListener;
                        if (onClickListenerImpl12 == null) {
                            onClickListenerImpl12 = new OnClickListenerImpl1();
                            this.mVmCloseClickAndroidViewViewOnClickListener = onClickListenerImpl12;
                        }
                        onClickListenerImpl1 = onClickListenerImpl12.setValue(userProfileViewModel);
                        OnClickListenerImpl2 onClickListenerImpl22 = this.mVmChangeNameAndroidViewViewOnClickListener;
                        if (onClickListenerImpl22 == null) {
                            onClickListenerImpl22 = new OnClickListenerImpl2();
                            this.mVmChangeNameAndroidViewViewOnClickListener = onClickListenerImpl22;
                        }
                        onClickListenerImpl2 = onClickListenerImpl22.setValue(userProfileViewModel);
                        OnClickListenerImpl3 onClickListenerImpl32 = this.mVmDeleteAndroidViewViewOnClickListener;
                        if (onClickListenerImpl32 == null) {
                            onClickListenerImpl32 = new OnClickListenerImpl3();
                            this.mVmDeleteAndroidViewViewOnClickListener = onClickListenerImpl32;
                        }
                        onClickListenerImpl3 = onClickListenerImpl32.setValue(userProfileViewModel);
                        OnClickListenerImpl4 onClickListenerImpl42 = this.mVmLogoutAndroidViewViewOnClickListener;
                        if (onClickListenerImpl42 == null) {
                            onClickListenerImpl42 = new OnClickListenerImpl4();
                            this.mVmLogoutAndroidViewViewOnClickListener = onClickListenerImpl42;
                        }
                        onClickListenerImpl4 = onClickListenerImpl42.setValue(userProfileViewModel);
                        OnClickListenerImpl5 onClickListenerImpl53 = this.mVmChangeAgeAndroidViewViewOnClickListener;
                        if (onClickListenerImpl53 == null) {
                            onClickListenerImpl53 = new OnClickListenerImpl5();
                            this.mVmChangeAgeAndroidViewViewOnClickListener = onClickListenerImpl53;
                        }
                        onClickListenerImpl52 = onClickListenerImpl53.setValue(userProfileViewModel);
                        OnClickListenerImpl6 onClickListenerImpl62 = this.mVmChangePremiumAndroidViewViewOnClickListener;
                        if (onClickListenerImpl62 == null) {
                            onClickListenerImpl62 = new OnClickListenerImpl6();
                            this.mVmChangePremiumAndroidViewViewOnClickListener = onClickListenerImpl62;
                        }
                        onClickListenerImpl6 = onClickListenerImpl62.setValue(userProfileViewModel);
                        OnClickListenerImpl7 onClickListenerImpl74 = this.mVmRestorePurchasesAndroidViewViewOnClickListener;
                        if (onClickListenerImpl74 == null) {
                            onClickListenerImpl74 = new OnClickListenerImpl7();
                            this.mVmRestorePurchasesAndroidViewViewOnClickListener = onClickListenerImpl74;
                        }
                        onClickListenerImpl72 = onClickListenerImpl74.setValue(userProfileViewModel);
                        OnClickListenerImpl8 onClickListenerImpl82 = this.mVmChangeGenderAndroidViewViewOnClickListener;
                        if (onClickListenerImpl82 == null) {
                            onClickListenerImpl82 = new OnClickListenerImpl8();
                            this.mVmChangeGenderAndroidViewViewOnClickListener = onClickListenerImpl82;
                        }
                        onClickListenerImpl8 = onClickListenerImpl82.setValue(userProfileViewModel);
                    }
                    if ((j & 194) != 0) {
                        MutableLiveData<String> premiumActive = userProfileViewModel != null ? userProfileViewModel.getPremiumActive() : null;
                        updateLiveDataRegistration(1, premiumActive);
                        if (premiumActive != null) {
                            str8 = premiumActive.getValue();
                            if ((j & 196) != 0) {
                                if (userProfileViewModel != null) {
                                    mutableLiveData3 = userProfileViewModel.getName();
                                    onClickListenerImpl73 = onClickListenerImpl72;
                                } else {
                                    onClickListenerImpl73 = onClickListenerImpl72;
                                    mutableLiveData3 = null;
                                }
                                updateLiveDataRegistration(2, mutableLiveData3);
                                if (mutableLiveData3 != null) {
                                    str9 = mutableLiveData3.getValue();
                                    if ((j & 200) == 0) {
                                        if (userProfileViewModel != null) {
                                            mutableLiveData2 = userProfileViewModel.getAge();
                                            str10 = str9;
                                        } else {
                                            str10 = str9;
                                            mutableLiveData2 = null;
                                        }
                                        updateLiveDataRegistration(3, mutableLiveData2);
                                        if (mutableLiveData2 != null) {
                                            str11 = mutableLiveData2.getValue();
                                            if ((j & 208) != 0) {
                                                if (userProfileViewModel != null) {
                                                    mutableLiveData = userProfileViewModel.isPremium();
                                                    str12 = str11;
                                                } else {
                                                    str12 = str11;
                                                    mutableLiveData = null;
                                                }
                                                updateLiveDataRegistration(4, mutableLiveData);
                                                z = ViewDataBinding.safeUnbox(mutableLiveData != null ? mutableLiveData.getValue() : null);
                                            } else {
                                                str12 = str11;
                                                z = false;
                                            }
                                            if ((j & 224) != 0) {
                                                MutableLiveData<String> premium = userProfileViewModel != null ? userProfileViewModel.getPremium() : null;
                                                updateLiveDataRegistration(5, premium);
                                                if (premium != null) {
                                                    str4 = premium.getValue();
                                                    onClickListenerImpl = onClickListenerImpl9;
                                                    onClickListenerImpl5 = onClickListenerImpl52;
                                                    str5 = str8;
                                                    str3 = str10;
                                                    str = str12;
                                                    str2 = str7;
                                                    onClickListenerImpl7 = onClickListenerImpl73;
                                                }
                                            }
                                            onClickListenerImpl = onClickListenerImpl9;
                                            onClickListenerImpl5 = onClickListenerImpl52;
                                            str5 = str8;
                                            str3 = str10;
                                            str = str12;
                                            str4 = null;
                                            str2 = str7;
                                            onClickListenerImpl7 = onClickListenerImpl73;
                                        }
                                    } else {
                                        str10 = str9;
                                    }
                                    str11 = null;
                                    if ((j & 208) != 0) {
                                    }
                                    if ((j & 224) != 0) {
                                    }
                                    onClickListenerImpl = onClickListenerImpl9;
                                    onClickListenerImpl5 = onClickListenerImpl52;
                                    str5 = str8;
                                    str3 = str10;
                                    str = str12;
                                    str4 = null;
                                    str2 = str7;
                                    onClickListenerImpl7 = onClickListenerImpl73;
                                }
                            } else {
                                onClickListenerImpl73 = onClickListenerImpl72;
                            }
                            str9 = null;
                            if ((j & 200) == 0) {
                            }
                            str11 = null;
                            if ((j & 208) != 0) {
                            }
                            if ((j & 224) != 0) {
                            }
                            onClickListenerImpl = onClickListenerImpl9;
                            onClickListenerImpl5 = onClickListenerImpl52;
                            str5 = str8;
                            str3 = str10;
                            str = str12;
                            str4 = null;
                            str2 = str7;
                            onClickListenerImpl7 = onClickListenerImpl73;
                        }
                    }
                    str8 = null;
                    if ((j & 196) != 0) {
                    }
                    str9 = null;
                    if ((j & 200) == 0) {
                    }
                    str11 = null;
                    if ((j & 208) != 0) {
                    }
                    if ((j & 224) != 0) {
                    }
                    onClickListenerImpl = onClickListenerImpl9;
                    onClickListenerImpl5 = onClickListenerImpl52;
                    str5 = str8;
                    str3 = str10;
                    str = str12;
                    str4 = null;
                    str2 = str7;
                    onClickListenerImpl7 = onClickListenerImpl73;
                }
            }
            str7 = null;
            if ((j & 192) != 0) {
            }
            onClickListenerImpl72 = null;
            onClickListenerImpl8 = null;
            onClickListenerImpl1 = null;
            onClickListenerImpl9 = null;
            onClickListenerImpl52 = null;
            onClickListenerImpl6 = null;
            onClickListenerImpl2 = null;
            onClickListenerImpl3 = null;
            onClickListenerImpl4 = null;
            if ((j & 194) != 0) {
            }
            str8 = null;
            if ((j & 196) != 0) {
            }
            str9 = null;
            if ((j & 200) == 0) {
            }
            str11 = null;
            if ((j & 208) != 0) {
            }
            if ((j & 224) != 0) {
            }
            onClickListenerImpl = onClickListenerImpl9;
            onClickListenerImpl5 = onClickListenerImpl52;
            str5 = str8;
            str3 = str10;
            str = str12;
            str4 = null;
            str2 = str7;
            onClickListenerImpl7 = onClickListenerImpl73;
        } else {
            onClickListenerImpl = null;
            z = false;
            onClickListenerImpl8 = null;
            onClickListenerImpl7 = null;
            onClickListenerImpl1 = null;
            onClickListenerImpl5 = null;
            str = null;
            onClickListenerImpl6 = null;
            str2 = null;
            str3 = null;
            onClickListenerImpl2 = null;
            onClickListenerImpl3 = null;
            onClickListenerImpl4 = null;
            str4 = null;
            str5 = null;
        }
        if ((j & 192) != 0) {
            str6 = str3;
            this.age.setOnClickListener(onClickListenerImpl5);
            this.changeIcon.setOnClickListener(onClickListenerImpl);
            this.close.setOnClickListener(onClickListenerImpl1);
            this.delete.setOnClickListener(onClickListenerImpl3);
            this.gender.setOnClickListener(onClickListenerImpl8);
            this.logout.setOnClickListener(onClickListenerImpl4);
            this.name.setOnClickListener(onClickListenerImpl2);
            this.premium.setOnClickListener(onClickListenerImpl6);
            this.restorePurchases.setOnClickListener(onClickListenerImpl7);
        } else {
            str6 = str3;
        }
        if ((200 & j) != 0) {
            TextViewBindingAdapter.setText(this.ageValue, str);
        }
        if ((208 & j) != 0) {
            Adapter.setGoneVisibility(this.arrowPrem, z);
        }
        if ((128 & j) != 0) {
            Adapter.setGoneVisibility(this.changeIcon, false);
        }
        if ((j & 193) != 0) {
            TextViewBindingAdapter.setText(this.genderValue, str2);
        }
        if ((196 & j) != 0) {
            TextViewBindingAdapter.setText(this.nameValue, str6);
        }
        if ((224 & j) != 0) {
            TextViewBindingAdapter.setText(this.premiumText, str4);
        }
        if ((j & 194) != 0) {
            TextViewBindingAdapter.setText(this.premiumValue, str5);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.changeIcon(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl1 setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.closeClick(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl2 setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.changeName(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl3 implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl3 setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.delete(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl4 implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl4 setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.logout(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl5 implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl5 setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.changeAge(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl6 implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl6 setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.changePremium(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl7 implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl7 setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.restorePurchases(view);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl8 implements View.OnClickListener {
        private UserProfileViewModel value;

        public OnClickListenerImpl8 setValue(UserProfileViewModel userProfileViewModel) {
            this.value = userProfileViewModel;
            if (userProfileViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.changeGender(view);
        }
    }
}
