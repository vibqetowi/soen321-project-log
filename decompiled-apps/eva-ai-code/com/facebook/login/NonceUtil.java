package com.facebook.login;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
/* compiled from: NonceUtil.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/NonceUtil;", "", "()V", "isValidNonce", "", "nonce", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NonceUtil {
    public static final NonceUtil INSTANCE = new NonceUtil();

    private NonceUtil() {
    }

    @JvmStatic
    public static final boolean isValidNonce(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        return !(StringsKt.indexOf$default((CharSequence) str2, ' ', 0, false, 6, (Object) null) >= 0);
    }
}
