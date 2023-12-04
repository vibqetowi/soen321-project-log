package com.ifriend.ui.touchFeedback;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TouchFeedback.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/touchFeedback/TouchFeedback;", "", "vibrate", "", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TouchFeedback {
    public static final Companion Companion = Companion.$$INSTANCE;

    void vibrate();

    /* compiled from: TouchFeedback.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ifriend/ui/touchFeedback/TouchFeedback$Companion;", "", "()V", "instance", "Lcom/ifriend/ui/touchFeedback/TouchFeedback;", "get", "context", "Landroid/content/Context;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static TouchFeedback instance;

        private Companion() {
        }

        public final TouchFeedback get(Context context) {
            TouchFeedback touchFeedback;
            NoneTouchFeedback noneTouchFeedback;
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (this) {
                if (instance == null) {
                    synchronized (this) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            noneTouchFeedback = new DeprecatedVibrateTouchFeedback(applicationContext);
                        } else {
                            noneTouchFeedback = new NoneTouchFeedback();
                        }
                        instance = noneTouchFeedback;
                        Unit unit = Unit.INSTANCE;
                    }
                }
                touchFeedback = instance;
                Intrinsics.checkNotNull(touchFeedback);
            }
            return touchFeedback;
        }
    }
}
