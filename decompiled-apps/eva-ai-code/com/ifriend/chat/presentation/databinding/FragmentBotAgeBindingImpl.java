package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
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
import com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentBotAgeBindingImpl extends FragmentBotAgeBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mVmSaveAndroidViewViewOnClickListener;
    private OnTextChangedImpl mVmSetAgeAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.back, 4);
    }

    public FragmentBotAgeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private FragmentBotAgeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[4], (ConstraintLayout) objArr[0], (EditText) objArr[2], (TextView) objArr[1], (AppButton) objArr[3]);
        this.mDirtyFlags = -1L;
        this.container.setTag(null);
        this.editText.setTag(null);
        this.name.setTag(null);
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
            setVm((BotAgeViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentBotAgeBinding
    public void setVm(BotAgeViewModel botAgeViewModel) {
        this.mVm = botAgeViewModel;
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
            return onChangeVmIsValid((MutableLiveData) obj, i2);
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

    private boolean onChangeVmIsValid(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 2;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        OnTextChangedImpl onTextChangedImpl;
        String str;
        MutableLiveData<Boolean> mutableLiveData;
        OnClickListenerImpl onClickListenerImpl;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        BotAgeViewModel botAgeViewModel = this.mVm;
        if ((15 & j) != 0) {
            if ((j & 13) != 0) {
                LiveData<?> title = botAgeViewModel != null ? botAgeViewModel.getTitle() : null;
                updateLiveDataRegistration(0, title);
                if (title != null) {
                    str = title.getValue();
                    if ((j & 14) == 0) {
                        mutableLiveData = botAgeViewModel != null ? botAgeViewModel.isValid() : null;
                        updateLiveDataRegistration(1, mutableLiveData);
                        if (mutableLiveData != null) {
                            mutableLiveData.getValue();
                        }
                    } else {
                        mutableLiveData = null;
                    }
                    if ((j & 12) != 0 || botAgeViewModel == null) {
                        onTextChangedImpl = null;
                        onClickListenerImpl = null;
                    } else {
                        OnClickListenerImpl onClickListenerImpl2 = this.mVmSaveAndroidViewViewOnClickListener;
                        if (onClickListenerImpl2 == null) {
                            onClickListenerImpl2 = new OnClickListenerImpl();
                            this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl2;
                        }
                        onClickListenerImpl = onClickListenerImpl2.setValue(botAgeViewModel);
                        OnTextChangedImpl onTextChangedImpl2 = this.mVmSetAgeAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
                        if (onTextChangedImpl2 == null) {
                            onTextChangedImpl2 = new OnTextChangedImpl();
                            this.mVmSetAgeAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = onTextChangedImpl2;
                        }
                        onTextChangedImpl = onTextChangedImpl2.setValue(botAgeViewModel);
                    }
                }
            }
            str = null;
            if ((j & 14) == 0) {
            }
            if ((j & 12) != 0) {
            }
            onTextChangedImpl = null;
            onClickListenerImpl = null;
        } else {
            onTextChangedImpl = null;
            str = null;
            mutableLiveData = null;
            onClickListenerImpl = null;
        }
        if ((j & 12) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.editText, null, onTextChangedImpl, null, null);
            this.save.setOnClickListener(onClickListenerImpl);
        }
        if ((j & 13) != 0) {
            TextViewBindingAdapter.setText(this.name, str);
        }
        if ((j & 14) != 0) {
            Adapter.setIsActive(this.save, mutableLiveData);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private BotAgeViewModel value;

        public OnClickListenerImpl setValue(BotAgeViewModel botAgeViewModel) {
            this.value = botAgeViewModel;
            if (botAgeViewModel == null) {
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
    public static class OnTextChangedImpl implements TextViewBindingAdapter.OnTextChanged {
        private BotAgeViewModel value;

        public OnTextChangedImpl setValue(BotAgeViewModel botAgeViewModel) {
            this.value = botAgeViewModel;
            if (botAgeViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.value.setAge(charSequence, i, i2, i3);
        }
    }
}
