package com.ifriend.ui.touchFeedback;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DeprecatedVibrateTouchFeedback.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/ui/touchFeedback/DeprecatedVibrateTouchFeedback;", "Lcom/ifriend/ui/touchFeedback/TouchFeedback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickFeedback", "Landroid/os/VibrationEffect;", "kotlin.jvm.PlatformType", "vibrator", "Landroid/os/Vibrator;", "vibrate", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeprecatedVibrateTouchFeedback implements TouchFeedback {
    private final VibrationEffect clickFeedback;
    private final Vibrator vibrator;

    public DeprecatedVibrateTouchFeedback(Context context) {
        VibrationEffect createOneShot;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("vibrator");
        this.vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        createOneShot = VibrationEffect.createOneShot(50L, -1);
        this.clickFeedback = createOneShot;
    }

    @Override // com.ifriend.ui.touchFeedback.TouchFeedback
    public void vibrate() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.vibrate(this.clickFeedback);
        }
    }
}
