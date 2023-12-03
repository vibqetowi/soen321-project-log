package com.google.android.gms.internal.p000firebaseauthapi;

import com.appsflyer.R;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g3  reason: invalid package */
/* loaded from: classes.dex */
public abstract class g3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(int i6, byte[] bArr, int i10) {
        int i11;
        while (i6 < i10 && bArr[i6] >= 0) {
            i6++;
        }
        if (i6 < i10) {
            while (i6 < i10) {
                int i12 = i6 + 1;
                i11 = bArr[i6];
                if (i11 < 0) {
                    if (i11 < -32) {
                        if (i12 < i10) {
                            if (i11 >= -62) {
                                i6 = i12 + 1;
                                if (bArr[i12] > -65) {
                                }
                            }
                            i11 = -1;
                            break;
                        }
                        break;
                    } else if (i11 < -16) {
                        if (i12 >= i10 - 1) {
                            i11 = j3.a(i12, bArr, i10);
                            break;
                        }
                        int i13 = i12 + 1;
                        char c10 = bArr[i12];
                        if (c10 <= -65 && ((i11 != -32 || c10 >= -96) && (i11 != -19 || c10 < -96))) {
                            i6 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        i11 = -1;
                        break;
                    } else if (i12 >= i10 - 2) {
                        i11 = j3.a(i12, bArr, i10);
                        break;
                    } else {
                        int i14 = i12 + 1;
                        int i15 = bArr[i12];
                        if (i15 <= -65) {
                            if ((((i15 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) + (i11 << 28)) >> 30) == 0) {
                                int i16 = i14 + 1;
                                if (bArr[i14] <= -65) {
                                    i12 = i16 + 1;
                                    if (bArr[i16] > -65) {
                                    }
                                }
                            }
                        }
                        i11 = -1;
                        break;
                    }
                }
                i6 = i12;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            return false;
        }
        return true;
    }
}
