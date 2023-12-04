package com.ifriend.ui.utils;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Modification.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/ui/utils/Modification;", "", "()V", "onTouchOpacity", "", "Landroid/view/View;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Modification {
    public static final int $stable = 0;
    public static final Modification INSTANCE = new Modification();

    private Modification() {
    }

    public final void onTouchOpacity(final View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.ifriend.ui.utils.Modification$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean onTouchOpacity$lambda$0;
                onTouchOpacity$lambda$0 = Modification.onTouchOpacity$lambda$0(view, view2, motionEvent);
                return onTouchOpacity$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTouchOpacity$lambda$0(View this_onTouchOpacity, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this_onTouchOpacity, "$this_onTouchOpacity");
        int action = motionEvent.getAction();
        if (action == 0) {
            this_onTouchOpacity.setAlpha(0.8f);
            return false;
        } else if (action == 1 || action == 3) {
            this_onTouchOpacity.setAlpha(1.0f);
            return false;
        } else {
            return false;
        }
    }
}
