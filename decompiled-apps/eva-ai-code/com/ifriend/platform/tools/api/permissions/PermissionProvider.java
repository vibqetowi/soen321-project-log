package com.ifriend.platform.tools.api.permissions;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PermissionProvider.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&¨\u0006\n"}, d2 = {"Lcom/ifriend/platform/tools/api/permissions/PermissionProvider;", "", "hasPermission", "", "permission", "", "hasPermissions", "", "permissions", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PermissionProvider {
    boolean hasPermission(String str);

    Map<String, Boolean> hasPermissions(List<String> list);
}
