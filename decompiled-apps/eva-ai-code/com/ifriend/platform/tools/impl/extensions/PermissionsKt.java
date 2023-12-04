package com.ifriend.platform.tools.impl.extensions;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: permissions.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a)\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, d2 = {"hasPermission", "", "Landroid/content/Context;", "permission", "", "hasPermissions", "", "permissions", "", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/Map;", "isGranted", "impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PermissionsKt {
    public static final boolean hasPermission(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (Intrinsics.areEqual(permission, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            Boolean valueOf = Boolean.valueOf(isGranted(context, permission));
            valueOf.booleanValue();
            if (!(Build.VERSION.SDK_INT < 29)) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
            return true;
        }
        return isGranted(context, permission);
    }

    private static final boolean isGranted(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static final Map<String, Boolean> hasPermissions(Context context, String[] permissions2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissions2, "permissions");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(permissions2.length), 16));
        for (String str : permissions2) {
            linkedHashMap.put(str, Boolean.valueOf(hasPermission(context, str)));
        }
        return linkedHashMap;
    }
}
