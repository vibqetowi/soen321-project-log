package com.google.accompanist.permissions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PermissionState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"rememberPermissionState", "Lcom/google/accompanist/permissions/PermissionState;", "permission", "", "onPermissionResult", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/PermissionState;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionStateKt {
    public static final PermissionState rememberPermissionState(String permission, Function1<? super Boolean, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        composer.startReplaceableGroup(923020361);
        ComposerKt.sourceInformation(composer, "C(rememberPermissionState)P(1)");
        if ((i2 & 2) != 0) {
            function1 = PermissionStateKt$rememberPermissionState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(923020361, i, -1, "com.google.accompanist.permissions.rememberPermissionState (PermissionState.kt:36)");
        }
        MutablePermissionState rememberMutablePermissionState = MutablePermissionStateKt.rememberMutablePermissionState(permission, function1, composer, (i & 112) | (i & 14), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberMutablePermissionState;
    }
}
