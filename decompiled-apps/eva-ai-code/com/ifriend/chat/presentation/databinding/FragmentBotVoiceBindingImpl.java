package com.ifriend.chat.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.ifriend.chat.presentation.BR;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel;
import com.ifriend.chat.presentation.utils.Adapter;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public class FragmentBotVoiceBindingImpl extends FragmentBotVoiceBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mVmSaveAndroidViewViewOnClickListener;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.back, 2);
        sparseIntArray.put(R.id.name, 3);
        sparseIntArray.put(R.id.items, 4);
    }

    public FragmentBotVoiceBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private FragmentBotVoiceBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[2], (ConstraintLayout) objArr[0], (ListView) objArr[4], (TextView) objArr[3], (AppButton) objArr[1]);
        this.mDirtyFlags = -1L;
        this.container.setTag(null);
        this.save.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
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
            setVm((BotVoiceViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // com.ifriend.chat.presentation.databinding.FragmentBotVoiceBinding
    public void setVm(BotVoiceViewModel botVoiceViewModel) {
        this.mVm = botVoiceViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeVmIsEdited((MutableLiveData) obj, i2);
    }

    private boolean onChangeVmIsEdited(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i == BR._all) {
            synchronized (this) {
                this.mDirtyFlags |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        OnClickListenerImpl onClickListenerImpl;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        BotVoiceViewModel botVoiceViewModel = this.mVm;
        int i = ((7 & j) > 0L ? 1 : ((7 & j) == 0L ? 0 : -1));
        if (i != 0) {
            if ((j & 6) == 0 || botVoiceViewModel == null) {
                onClickListenerImpl = null;
            } else {
                OnClickListenerImpl onClickListenerImpl2 = this.mVmSaveAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new OnClickListenerImpl();
                    this.mVmSaveAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                onClickListenerImpl = onClickListenerImpl2.setValue(botVoiceViewModel);
            }
            r8 = botVoiceViewModel != null ? botVoiceViewModel.isEdited() : null;
            updateLiveDataRegistration(0, r8);
            if (r8 != null) {
                r8.getValue();
            }
        } else {
            onClickListenerImpl = null;
        }
        if (i != 0) {
            Adapter.setIsActive(this.save, r8);
        }
        if ((j & 6) != 0) {
            this.save.setOnClickListener(onClickListenerImpl);
        }
    }

    /* loaded from: classes6.dex */
    public static class OnClickListenerImpl implements View.OnClickListener {
        private BotVoiceViewModel value;

        public OnClickListenerImpl setValue(BotVoiceViewModel botVoiceViewModel) {
            this.value = botVoiceViewModel;
            if (botVoiceViewModel == null) {
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
