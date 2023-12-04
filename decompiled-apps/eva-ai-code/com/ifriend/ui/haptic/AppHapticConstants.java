package com.ifriend.ui.haptic;

import android.os.Build;
import kotlin.Metadata;
/* compiled from: AppHapticConstants.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ifriend/ui/haptic/AppHapticConstants;", "", "()V", "CONFIRM", "", "getCONFIRM", "()I", "DRAG_START", "getDRAG_START", "REJECT", "getREJECT", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppHapticConstants {
    public static final int $stable = 0;
    private static final int CONFIRM;
    private static final int DRAG_START;
    public static final AppHapticConstants INSTANCE = new AppHapticConstants();
    private static final int REJECT;

    private AppHapticConstants() {
    }

    static {
        DRAG_START = Build.VERSION.SDK_INT >= 34 ? 25 : 0;
        CONFIRM = Build.VERSION.SDK_INT >= 30 ? 16 : 6;
        REJECT = Build.VERSION.SDK_INT >= 30 ? 17 : 6;
    }

    public final int getDRAG_START() {
        return DRAG_START;
    }

    public final int getCONFIRM() {
        return CONFIRM;
    }

    public final int getREJECT() {
        return REJECT;
    }
}
