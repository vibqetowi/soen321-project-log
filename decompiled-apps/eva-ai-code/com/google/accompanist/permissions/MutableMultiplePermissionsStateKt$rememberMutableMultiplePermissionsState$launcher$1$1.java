package com.google.accompanist.permissions;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "permissionsResult", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1 extends Lambda implements Function1<Map<String, Boolean>, Unit> {
    final /* synthetic */ MutableMultiplePermissionsState $multiplePermissionsState;
    final /* synthetic */ Function1<Map<String, Boolean>, Unit> $onPermissionsResult;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1(MutableMultiplePermissionsState mutableMultiplePermissionsState, Function1<? super Map<String, Boolean>, Unit> function1) {
        super(1);
        this.$multiplePermissionsState = mutableMultiplePermissionsState;
        this.$onPermissionsResult = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, Boolean> map) {
        invoke2(map);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Boolean> permissionsResult) {
        Intrinsics.checkNotNullParameter(permissionsResult, "permissionsResult");
        this.$multiplePermissionsState.updatePermissionsStatus$permissions_release(permissionsResult);
        this.$onPermissionsResult.invoke(permissionsResult);
    }
}
