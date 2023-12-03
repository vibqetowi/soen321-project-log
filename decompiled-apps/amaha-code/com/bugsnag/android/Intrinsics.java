package com.bugsnag.android;
/* loaded from: classes.dex */
class Intrinsics {
    public static boolean isEmpty(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }
}
