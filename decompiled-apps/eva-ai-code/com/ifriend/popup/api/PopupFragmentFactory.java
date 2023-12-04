package com.ifriend.popup.api;

import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
/* compiled from: PopupFragmentFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ifriend/popup/api/PopupFragmentFactory;", "", "getCommonPopupFragment", "Landroidx/fragment/app/DialogFragment;", "popupModel", "Lcom/ifriend/popup/api/CommonPopupModel;", "getGeneratingAvatarPopupFragment", "Lcom/ifriend/popup/api/GeneratingAvatarPopupModel;", "getNoInternetConnectionFragment", "getRequestSextingPopupFragment", "getUpgradePopupFragment", "Lcom/ifriend/popup/api/UpgradePopupModel;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PopupFragmentFactory {
    DialogFragment getCommonPopupFragment(CommonPopupModel commonPopupModel);

    DialogFragment getGeneratingAvatarPopupFragment(GeneratingAvatarPopupModel generatingAvatarPopupModel);

    DialogFragment getNoInternetConnectionFragment();

    DialogFragment getRequestSextingPopupFragment();

    DialogFragment getUpgradePopupFragment(UpgradePopupModel upgradePopupModel);
}
