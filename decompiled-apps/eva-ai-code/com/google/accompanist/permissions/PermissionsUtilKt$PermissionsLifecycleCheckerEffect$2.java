package com.google.accompanist.permissions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.Lifecycle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PermissionsUtil.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionsUtilKt$PermissionsLifecycleCheckerEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Lifecycle.Event $lifecycleEvent;
    final /* synthetic */ List<MutablePermissionState> $permissions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsUtilKt$PermissionsLifecycleCheckerEffect$2(List<MutablePermissionState> list, Lifecycle.Event event, int i, int i2) {
        super(2);
        this.$permissions = list;
        this.$lifecycleEvent = event;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        PermissionsUtilKt.PermissionsLifecycleCheckerEffect(this.$permissions, this.$lifecycleEvent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
