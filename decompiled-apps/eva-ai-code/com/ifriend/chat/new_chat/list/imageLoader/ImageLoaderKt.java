package com.ifriend.chat.new_chat.list.imageLoader;

import com.facebook.share.internal.ShareInternalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: ImageLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isLocalUrl", "", "", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageLoaderKt {
    public static final boolean isLocalUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith(str, ShareInternalUtility.STAGING_PARAM, true);
    }
}
