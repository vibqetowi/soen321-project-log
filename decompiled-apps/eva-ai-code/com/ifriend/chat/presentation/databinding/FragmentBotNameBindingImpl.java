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
import com.ifriend.chat.presentation.ui.menu.botProfile.BotNameViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentBotNameBindingImpl extends FragmentBotNameBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mVmSaveAndroidViewViewOnClickListener;
    private OnTextChangedImpl mVmSetNameAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.back, 4);
    }

    public FragmentBotNameBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private FragmentBotNameBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
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
            setVm((BotNameViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentBotNameBinding
    public void setVm(BotNameViewModel botNameViewModel) {
        this.mVm = botNameViewModel;
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j;
        MutableLiveData<Boolean> mutableLiveData;
        String str;
        OnTextChangedImpl onTextChangedImpl;
        OnClickListenerImpl onClickListenerImpl;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        BotNameViewModel botNameViewModel = this.mVm;
        if ((15 & j) != 0) {
            if ((j & 13) != 0) {
                LiveData<?> title = botNameViewModel != null ? botNameViewModel.getTitle() : null;
                updateLiveDataRegistration(0, title);
                if (title != null) {
                    str = title.getValue();
                    if ((j & 12) != 0 || botNameViewModel == null) {
                        onTextChangedImpl = null;
                        onClickListenerImpl = null;
                    } else {
                        OnTextChangedImpl onTextChangedImpl2 = this.mVmSetNameAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
                        if (onTextChangedImpl2 == null) {
                            onTextChangedImpl2 = new OnTextChangedImpl();
                            this.mVmSetNameAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = onTextChangedImpl2;
                        }
                        onTextChangedImpl = onTextChangedImpl2.setValue(botNameViewModel);
                        OnClickListenerImpl onClickListenerImpl2 = this.mVmSaveAndroidViewViewOnClickListener;
                        if (onClickListenerImpl2 == null) {
                            onClickListenerImpl2 = new OnClickListenerImpl();
                            this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl2;
                        }
                        onClickListenerImpl = onClickListenerImpl2.setValue(botNameViewModel);
                    }
                    if ((j & 14) == 0) {
                        mutableLiveData = botNameViewModel != null ? botNameViewModel.isValid() : null;
                        updateLiveDataRegistration(1, mutableLiveData);
                        if (mutableLiveData != null) {
                            mutableLiveData.getValue();
                        }
                    } else {
                        mutableLiveData = null;
                    }
                }
            }
            str = null;
            if ((j & 12) != 0) {
            }
            onTextChangedImpl = null;
            onClickListenerImpl = null;
            if ((j & 14) == 0) {
            }
        } else {
            mutableLiveData = null;
            str = null;
            onTextChangedImpl = null;
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
    public static class OnTextChangedImpl implements TextViewBindingAdapter.OnTextChanged {
        private BotNameViewModel value;

        public OnTextChangedImpl setValue(BotNameViewModel botNameViewModel) {
            this.value = botNameViewModel;
            if (botNameViewModel == null) {
                return null;
            }
            return this;
        }

        @Override // androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.value.setName(charSequence, i, i2, i3);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private BotNameViewModel value;

        public OnClickListenerImpl setValue(BotNameViewModel botNameViewModel) {
            this.value = botNameViewModel;
            if (botNameViewModel == null) {
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
