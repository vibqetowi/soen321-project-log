package com.google.accompanist.permissions;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MutableMultiplePermissionsState$shouldShowRationale$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ MutableMultiplePermissionsState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMultiplePermissionsState$shouldShowRationale$2(MutableMultiplePermissionsState mutableMultiplePermissionsState) {
        super(0);
        this.this$0 = mutableMultiplePermissionsState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        List<PermissionState> permissions2 = this.this$0.getPermissions();
        boolean z = false;
        if (!(permissions2 instanceof Collection) || !permissions2.isEmpty()) {
            Iterator<T> it = permissions2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (PermissionsUtilKt.getShouldShowRationale(((PermissionState) it.next()).getStatus())) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
