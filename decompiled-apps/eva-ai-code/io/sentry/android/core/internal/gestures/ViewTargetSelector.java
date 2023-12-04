package io.sentry.android.core.internal.gestures;

import android.view.View;
/* loaded from: classes4.dex */
interface ViewTargetSelector {

    /* renamed from: io.sentry.android.core.internal.gestures.ViewTargetSelector$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static boolean $default$skipChildren(ViewTargetSelector _this) {
            return false;
        }
    }

    boolean select(View view);

    boolean skipChildren();
}
