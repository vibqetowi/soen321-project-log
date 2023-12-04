package com.ifriend.icon_switcher;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PremiumAppIconManagerImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/icon_switcher/PremiumAppIconManagerImpl;", "Lcom/ifriend/icon_switcher/PremiumAppIconManager;", "switcher", "Lcom/ifriend/icon_switcher/AppComponentSwitcher;", "context", "Landroid/content/Context;", "(Lcom/ifriend/icon_switcher/AppComponentSwitcher;Landroid/content/Context;)V", "disablePremiumIcon", "", "enablePremiumIcon", "isPremiumIconEnabled", "", "Companion", "icon_switcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumAppIconManagerImpl implements PremiumAppIconManager {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String PREMIUM_LAUNCHER_NAME = "com.ifriend.app.ui.splash.PremiumSplashActivity";
    @Deprecated
    public static final String REGULAR_LAUNCHER_NAME = "com.ifriend.app.ui.splash.NotPremiumSplashActivity";
    private static String changedInCurrentSessionIcon;
    private final Context context;
    private final AppComponentSwitcher switcher;

    public PremiumAppIconManagerImpl(AppComponentSwitcher switcher, Context context) {
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.switcher = switcher;
        this.context = context;
    }

    public /* synthetic */ PremiumAppIconManagerImpl(AppComponentPostponedSwitcher appComponentPostponedSwitcher, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AppComponentPostponedSwitcher.INSTANCE : appComponentPostponedSwitcher, context);
    }

    /* compiled from: PremiumAppIconManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/icon_switcher/PremiumAppIconManagerImpl$Companion;", "", "()V", "PREMIUM_LAUNCHER_NAME", "", "REGULAR_LAUNCHER_NAME", "changedInCurrentSessionIcon", "icon_switcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.icon_switcher.PremiumAppIconManager
    public boolean isPremiumIconEnabled() {
        return Intrinsics.areEqual(changedInCurrentSessionIcon, PREMIUM_LAUNCHER_NAME) || this.context.getPackageManager().getComponentEnabledSetting(new ComponentName(this.context, PREMIUM_LAUNCHER_NAME)) == 1;
    }

    @Override // com.ifriend.icon_switcher.PremiumAppIconManager
    public void enablePremiumIcon() {
        if (isPremiumIconEnabled()) {
            return;
        }
        changedInCurrentSessionIcon = PREMIUM_LAUNCHER_NAME;
        this.switcher.switchComponents(REGULAR_LAUNCHER_NAME, PREMIUM_LAUNCHER_NAME, this.context);
    }

    @Override // com.ifriend.icon_switcher.PremiumAppIconManager
    public void disablePremiumIcon() {
        if (isPremiumIconEnabled()) {
            changedInCurrentSessionIcon = REGULAR_LAUNCHER_NAME;
            this.switcher.switchComponents(PREMIUM_LAUNCHER_NAME, REGULAR_LAUNCHER_NAME, this.context);
        }
    }
}
