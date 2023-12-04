package com.ifriend.ui.utils;

import android.view.View;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
/* compiled from: ViewCoroutineScope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"viewScope", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/View;", "getViewScope", "(Landroid/view/View;)Lkotlinx/coroutines/CoroutineScope;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewCoroutineScopeKt {
    public static final CoroutineScope getViewScope(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(R.string.view_coroutine_scope);
        CoroutineScope coroutineScope = tag instanceof CoroutineScope ? (CoroutineScope) tag : null;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        ViewCoroutineScope viewCoroutineScope = new ViewCoroutineScope();
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(viewCoroutineScope);
            view.setTag(R.string.view_coroutine_scope, viewCoroutineScope);
        } else {
            CoroutineScopeKt.cancel$default(viewCoroutineScope, null, 1, null);
        }
        return viewCoroutineScope;
    }
}
