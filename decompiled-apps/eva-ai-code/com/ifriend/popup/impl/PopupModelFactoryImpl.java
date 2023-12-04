package com.ifriend.popup.impl;

import android.content.res.Resources;
import com.ifriend.popup.api.CommonPopupModel;
import com.ifriend.popup.api.GeneratingAvatarPopupModel;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.popup.api.UpgradePopupModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PopupModelFactoryImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ifriend/popup/impl/PopupModelFactoryImpl;", "Lcom/ifriend/popup/api/PopupModelFactory;", "()V", "getChooseVoicePopupModel", "Lcom/ifriend/popup/api/CommonPopupModel;", "resources", "Landroid/content/res/Resources;", "name", "", "getGeneratingAnimatedAvatarPopupModel", "Lcom/ifriend/popup/api/GeneratingAvatarPopupModel;", "getRateUsPopupModel", "getUpgradePopupModel", "Lcom/ifriend/popup/api/UpgradePopupModel;", "title", "", "secondaryButtonText", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopupModelFactoryImpl implements PopupModelFactory {
    @Override // com.ifriend.popup.api.PopupModelFactory
    public CommonPopupModel getRateUsPopupModel(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(R.string.popup_rate_app_title);
        String string2 = resources.getString(R.string.popup_rate_app_text);
        String string3 = resources.getString(R.string.popup_rate_app_button);
        int i = R.drawable.ic_stars;
        Intrinsics.checkNotNull(string);
        return new CommonPopupModel(string, string2, Integer.valueOf(i), string3, false, false, 48, null);
    }

    @Override // com.ifriend.popup.api.PopupModelFactory
    public UpgradePopupModel getUpgradePopupModel(CharSequence title, CharSequence secondaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        return new UpgradePopupModel(title, secondaryButtonText, false, 4, null);
    }

    @Override // com.ifriend.popup.api.PopupModelFactory
    public CommonPopupModel getChooseVoicePopupModel(Resources resources, String name) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(name, "name");
        String string = resources.getString(com.ifriend.ui.R.string.choose_a_different_voice);
        String string2 = resources.getString(com.ifriend.ui.R.string.check_out_other_voice_options, name);
        String string3 = resources.getString(com.ifriend.ui.R.string.try_other_voices);
        int i = com.ifriend.ui.R.drawable.voice_image;
        Intrinsics.checkNotNull(string);
        return new CommonPopupModel(string, string2, Integer.valueOf(i), string3, false, false, 48, null);
    }

    @Override // com.ifriend.popup.api.PopupModelFactory
    public GeneratingAvatarPopupModel getGeneratingAnimatedAvatarPopupModel(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new GeneratingAvatarPopupModel(false, 1, null);
    }
}
