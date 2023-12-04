package com.google.accompanist.permissions;

import com.google.accompanist.permissions.PermissionStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/google/accompanist/permissions/PermissionState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MutableMultiplePermissionsState$revokedPermissions$2 extends Lambda implements Function0<List<? extends PermissionState>> {
    final /* synthetic */ MutableMultiplePermissionsState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMultiplePermissionsState$revokedPermissions$2(MutableMultiplePermissionsState mutableMultiplePermissionsState) {
        super(0);
        this.this$0 = mutableMultiplePermissionsState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends PermissionState> invoke() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.this$0.getPermissions()) {
            if (!Intrinsics.areEqual(((PermissionState) obj).getStatus(), PermissionStatus.Granted.INSTANCE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
