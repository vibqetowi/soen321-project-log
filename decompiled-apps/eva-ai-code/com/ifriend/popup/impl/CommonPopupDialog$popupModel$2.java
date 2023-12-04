package com.ifriend.popup.impl;

import android.os.Bundle;
import com.ifriend.popup.api.CommonPopupModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonPopupDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/popup/api/CommonPopupModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonPopupDialog$popupModel$2 extends Lambda implements Function0<CommonPopupModel> {
    final /* synthetic */ CommonPopupDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonPopupDialog$popupModel$2(CommonPopupDialog commonPopupDialog) {
        super(0);
        this.this$0 = commonPopupDialog;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CommonPopupModel invoke() {
        Bundle arguments = this.this$0.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("POPUP_MODEL_KEY") : null;
        CommonPopupModel commonPopupModel = serializable instanceof CommonPopupModel ? (CommonPopupModel) serializable : null;
        if (commonPopupModel != null) {
            return commonPopupModel;
        }
        throw new IllegalArgumentException();
    }
}
