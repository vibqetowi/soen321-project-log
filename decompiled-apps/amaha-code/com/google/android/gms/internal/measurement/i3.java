package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class i3 implements y5 {

    /* renamed from: a  reason: collision with root package name */
    public static final i3 f8422a = new i3();

    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean a(int i6) {
        char c10;
        if (i6 != 0) {
            c10 = 2;
            if (i6 != 1) {
                if (i6 != 2) {
                    c10 = 4;
                    if (i6 != 3) {
                        if (i6 != 4) {
                            c10 = 0;
                        } else {
                            c10 = 5;
                        }
                    }
                } else {
                    c10 = 3;
                }
            }
        } else {
            c10 = 1;
        }
        if (c10 == 0) {
            return false;
        }
        return true;
    }
}
