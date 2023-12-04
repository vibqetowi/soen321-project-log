package com.ifriend.platform.tools.impl.permissions;

import android.content.Context;
import com.ifriend.platform.tools.api.permissions.PermissionProvider;
import com.ifriend.platform.tools.impl.extensions.PermissionsKt;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PermissionProviderImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/platform/tools/impl/permissions/PermissionProviderImpl;", "Lcom/ifriend/platform/tools/api/permissions/PermissionProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hasPermission", "", "permission", "", "hasPermissions", "", "permissions", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PermissionProviderImpl implements PermissionProvider {
    private final Context context;

    @Inject
    public PermissionProviderImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.ifriend.platform.tools.api.permissions.PermissionProvider
    public boolean hasPermission(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return PermissionsKt.hasPermission(this.context, permission);
    }

    @Override // com.ifriend.platform.tools.api.permissions.PermissionProvider
    public Map<String, Boolean> hasPermissions(List<String> permissions2) {
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        return PermissionsKt.hasPermissions(this.context, (String[]) permissions2.toArray(new String[0]));
    }
}
