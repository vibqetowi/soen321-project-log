package com.ifriend.popup.api;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PopupModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/popup/api/PopupModel;", "Ljava/io/Serializable;", "()V", "shouldDismissOnActionClick", "", "getShouldDismissOnActionClick", "()Z", "Lcom/ifriend/popup/api/CommonPopupModel;", "Lcom/ifriend/popup/api/GeneratingAvatarPopupModel;", "Lcom/ifriend/popup/api/LevelPopupModel;", "Lcom/ifriend/popup/api/UpgradePopupModel;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PopupModel implements Serializable {
    private final boolean shouldDismissOnActionClick;

    public /* synthetic */ PopupModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PopupModel() {
        this.shouldDismissOnActionClick = true;
    }

    public boolean getShouldDismissOnActionClick() {
        return this.shouldDismissOnActionClick;
    }
}
