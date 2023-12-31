package com.ifriend.icon_switcher.di;

import android.content.Context;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.icon_switcher.PremiumAppIconManagerImpl;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PremiumIconManagerModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ifriend/icon_switcher/di/PremiumIconManagerModule;", "", "()V", "providePremiumAppIconManager", "Lcom/ifriend/icon_switcher/PremiumAppIconManager;", "context", "Landroid/content/Context;", "icon_switcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class PremiumIconManagerModule {
    @Provides
    public final PremiumAppIconManager providePremiumAppIconManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PremiumAppIconManagerImpl(null, context, 1, null);
    }
}
