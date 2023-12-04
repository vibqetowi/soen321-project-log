package com.ifriend.popup.impl;

import androidx.fragment.app.DialogFragment;
import com.ifriend.popup.api.CommonPopupModel;
import com.ifriend.popup.api.GeneratingAvatarPopupModel;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.UpgradePopupModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PopupFragmentFactoryImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ifriend/popup/impl/PopupFragmentFactoryImpl;", "Lcom/ifriend/popup/api/PopupFragmentFactory;", "()V", "getCommonPopupFragment", "Landroidx/fragment/app/DialogFragment;", "popupModel", "Lcom/ifriend/popup/api/CommonPopupModel;", "getGeneratingAvatarPopupFragment", "Lcom/ifriend/popup/api/GeneratingAvatarPopupModel;", "getNoInternetConnectionFragment", "getRequestSextingPopupFragment", "getUpgradePopupFragment", "Lcom/ifriend/popup/api/UpgradePopupModel;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopupFragmentFactoryImpl implements PopupFragmentFactory {
    @Override // com.ifriend.popup.api.PopupFragmentFactory
    public DialogFragment getCommonPopupFragment(CommonPopupModel popupModel) {
        Intrinsics.checkNotNullParameter(popupModel, "popupModel");
        return CommonPopupDialog.Companion.newInstance(popupModel);
    }

    @Override // com.ifriend.popup.api.PopupFragmentFactory
    public DialogFragment getRequestSextingPopupFragment() {
        return SextingRequestPopupDialog.Companion.newInstance();
    }

    @Override // com.ifriend.popup.api.PopupFragmentFactory
    public DialogFragment getUpgradePopupFragment(UpgradePopupModel popupModel) {
        Intrinsics.checkNotNullParameter(popupModel, "popupModel");
        return UpgradePopupDialog.Companion.newInstance(popupModel);
    }

    @Override // com.ifriend.popup.api.PopupFragmentFactory
    public DialogFragment getGeneratingAvatarPopupFragment(GeneratingAvatarPopupModel popupModel) {
        Intrinsics.checkNotNullParameter(popupModel, "popupModel");
        return GeneratingAvatarPopupDialog.Companion.newInstance();
    }

    @Override // com.ifriend.popup.api.PopupFragmentFactory
    public DialogFragment getNoInternetConnectionFragment() {
        return NoInternetConnectionPopupDialog.Companion.newInstance();
    }
}
