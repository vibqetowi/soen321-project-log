package com.google.accompanist.permissions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: PermissionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PermissionStateKt$rememberPermissionState$1 extends Lambda implements Function1<Boolean, Unit> {
    public static final PermissionStateKt$rememberPermissionState$1 INSTANCE = new PermissionStateKt$rememberPermissionState$1();

    PermissionStateKt$rememberPermissionState$1() {
        super(1);
    }

    public final void invoke(boolean z) {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }
}
