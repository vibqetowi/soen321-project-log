package com.google.accompanist.permissions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MutablePermissionState $permissionState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1(MutablePermissionState mutablePermissionState) {
        super(1);
        this.$permissionState = mutablePermissionState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$permissionState.refreshPermissionStatus$permissions_release();
    }
}
