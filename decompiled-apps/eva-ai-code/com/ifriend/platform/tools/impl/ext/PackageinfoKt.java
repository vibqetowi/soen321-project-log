package com.ifriend.platform.tools.impl.ext;

import android.content.pm.PackageInfo;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: packageinfo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"versionCodeCompat", "", "Landroid/content/pm/PackageInfo;", "getVersionCodeCompat", "(Landroid/content/pm/PackageInfo;)J", "impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PackageinfoKt {
    public static final long getVersionCodeCompat(PackageInfo packageInfo) {
        long longVersionCode;
        Intrinsics.checkNotNullParameter(packageInfo, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }
        return packageInfo.versionCode;
    }
}
