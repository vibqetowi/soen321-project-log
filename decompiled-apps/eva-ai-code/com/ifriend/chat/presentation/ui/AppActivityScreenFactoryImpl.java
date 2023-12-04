package com.ifriend.chat.presentation.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ifriend.base.navigation.impl.cicerone.ActivityScreen;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.common_utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppActivityScreenFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/AppActivityScreenFactoryImpl;", "Lcom/ifriend/chat/api/AppActivityScreenFactory;", "()V", "appActivityScreen", "Lcom/ifriend/base/navigation/impl/cicerone/ActivityScreen;", "notificationType", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppActivityScreenFactoryImpl implements AppActivityScreenFactory {
    public static final int $stable = 0;

    @Override // com.ifriend.chat.api.AppActivityScreenFactory
    public ActivityScreen appActivityScreen(final String str) {
        return new ActivityScreen() { // from class: com.ifriend.chat.presentation.ui.AppActivityScreenFactoryImpl$appActivityScreen$1
            @Override // com.ifriend.base.navigation.api.cicerone.Screen
            public String getScreenKey() {
                return ActivityScreen.DefaultImpls.getScreenKey(this);
            }

            @Override // com.ifriend.base.navigation.impl.cicerone.ActivityScreen
            public Bundle getStartActivityOptions() {
                return ActivityScreen.DefaultImpls.getStartActivityOptions(this);
            }

            @Override // com.ifriend.base.navigation.impl.cicerone.ActivityScreen
            public Intent createIntent(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, AppActivity.class);
                intent.putExtra(Constants.DEEP_LINK_URI, str);
                intent.setFlags(268468224);
                return intent;
            }
        };
    }
}
