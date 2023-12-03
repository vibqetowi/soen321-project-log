package com.google.android.gms.internal.p000firebaseauthapi;

import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yb  reason: invalid package */
/* loaded from: classes.dex */
public final class yb {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[][] f8259a = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, JsonWriter.ARRAY_START, 4, 68, JsonWriter.ESCAPE, -60, 88, 28, -114, -122, -40, JsonWriter.QUOTE, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    public static void a(long[] jArr, long[] jArr2, int i6) {
        int i10 = -i6;
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = (int) jArr[i11];
            int i13 = (((int) jArr2[i11]) ^ i12) & i10;
            jArr[i11] = i12 ^ i13;
            jArr2[i11] = i13 ^ ((int) jArr2[i11]);
        }
    }
}
