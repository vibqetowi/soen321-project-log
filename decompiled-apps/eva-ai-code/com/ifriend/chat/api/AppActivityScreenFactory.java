package com.ifriend.chat.api;

import com.ifriend.base.navigation.impl.cicerone.ActivityScreen;
import kotlin.Metadata;
/* compiled from: AppActivityScreenFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/chat/api/AppActivityScreenFactory;", "", "appActivityScreen", "Lcom/ifriend/base/navigation/impl/cicerone/ActivityScreen;", "notificationType", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppActivityScreenFactory {
    ActivityScreen appActivityScreen(String str);

    /* compiled from: AppActivityScreenFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ ActivityScreen appActivityScreen$default(AppActivityScreenFactory appActivityScreenFactory, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return appActivityScreenFactory.appActivityScreen(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appActivityScreen");
        }
    }
}
