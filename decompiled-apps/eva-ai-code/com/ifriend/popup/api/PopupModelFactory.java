package com.ifriend.popup.api;

import android.content.res.Resources;
import kotlin.Metadata;
/* compiled from: PopupModelFactory.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/ifriend/popup/api/PopupModelFactory;", "", "getChooseVoicePopupModel", "Lcom/ifriend/popup/api/CommonPopupModel;", "resources", "Landroid/content/res/Resources;", "name", "", "getGeneratingAnimatedAvatarPopupModel", "Lcom/ifriend/popup/api/GeneratingAvatarPopupModel;", "getRateUsPopupModel", "getUpgradePopupModel", "Lcom/ifriend/popup/api/UpgradePopupModel;", "title", "", "secondaryButtonText", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PopupModelFactory {
    CommonPopupModel getChooseVoicePopupModel(Resources resources, String str);

    GeneratingAvatarPopupModel getGeneratingAnimatedAvatarPopupModel(Resources resources);

    CommonPopupModel getRateUsPopupModel(Resources resources);

    UpgradePopupModel getUpgradePopupModel(CharSequence charSequence, CharSequence charSequence2);
}
