package com.ifriend.icon_switcher;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppComponentInstantSwitcher.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u000b"}, d2 = {"Lcom/ifriend/icon_switcher/AppComponentInstantSwitcher;", "Lcom/ifriend/icon_switcher/AppComponentSwitcher;", "()V", "switchComponents", "", "componentNameToDisable", "", "componentNameToEnable", "context", "Landroid/content/Context;", "Companion", "icon_switcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppComponentInstantSwitcher implements AppComponentSwitcher {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int NO_FLAG = 0;

    /* compiled from: AppComponentInstantSwitcher.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/icon_switcher/AppComponentInstantSwitcher$Companion;", "", "()V", "NO_FLAG", "", "icon_switcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.icon_switcher.AppComponentSwitcher
    public void switchComponents(String componentNameToDisable, String componentNameToEnable, Context context) {
        Intrinsics.checkNotNullParameter(componentNameToDisable, "componentNameToDisable");
        Intrinsics.checkNotNullParameter(componentNameToEnable, "componentNameToEnable");
        Intrinsics.checkNotNullParameter(context, "context");
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, componentNameToEnable), 1, 0);
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, componentNameToDisable), 2, 0);
    }
}
