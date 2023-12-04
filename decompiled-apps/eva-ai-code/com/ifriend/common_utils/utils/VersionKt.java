package com.ifriend.common_utils.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Version.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVersion", "Lcom/ifriend/common_utils/utils/Version;", "", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VersionKt {
    public static final Version toVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Version.Companion.from(str);
    }
}
