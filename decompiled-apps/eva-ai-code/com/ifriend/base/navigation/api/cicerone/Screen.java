package com.ifriend.base.navigation.api.cicerone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/Screen;", "", "screenKey", "", "getScreenKey", "()Ljava/lang/String;", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Screen {
    String getScreenKey();

    /* compiled from: Screen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static String getScreenKey(Screen screen) {
            String name = screen.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
    }
}
