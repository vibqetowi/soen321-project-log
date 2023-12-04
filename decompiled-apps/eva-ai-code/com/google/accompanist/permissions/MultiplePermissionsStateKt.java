package com.google.accompanist.permissions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"rememberMultiplePermissionsState", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "permissions", "", "", "onPermissionsResult", "Lkotlin/Function1;", "", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/MultiplePermissionsState;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiplePermissionsStateKt {
    public static final MultiplePermissionsState rememberMultiplePermissionsState(List<String> permissions2, Function1<? super Map<String, Boolean>, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        composer.startReplaceableGroup(-57132327);
        ComposerKt.sourceInformation(composer, "C(rememberMultiplePermissionsState)P(1)");
        if ((i2 & 2) != 0) {
            function1 = MultiplePermissionsStateKt$rememberMultiplePermissionsState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-57132327, i, -1, "com.google.accompanist.permissions.rememberMultiplePermissionsState (MultiplePermissionsState.kt:36)");
        }
        MultiplePermissionsState rememberMutableMultiplePermissionsState = MutableMultiplePermissionsStateKt.rememberMutableMultiplePermissionsState(permissions2, function1, composer, (i & 112) | 8, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberMutableMultiplePermissionsState;
    }
}
