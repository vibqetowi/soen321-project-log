package com.google.accompanist.permissions;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MultiplePermissionsState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MultiplePermissionsStateKt$rememberMultiplePermissionsState$1 extends Lambda implements Function1<Map<String, ? extends Boolean>, Unit> {
    public static final MultiplePermissionsStateKt$rememberMultiplePermissionsState$1 INSTANCE = new MultiplePermissionsStateKt$rememberMultiplePermissionsState$1();

    MultiplePermissionsStateKt$rememberMultiplePermissionsState$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Boolean> it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Boolean> map) {
        invoke2((Map<String, Boolean>) map);
        return Unit.INSTANCE;
    }
}
