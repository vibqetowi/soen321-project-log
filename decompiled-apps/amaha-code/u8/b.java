package u8;

import android.text.TextUtils;
/* compiled from: SsaDialogueFormat.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f33941a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33942b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33943c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33944d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33945e;

    public b(int i6, int i10, int i11, int i12, int i13) {
        this.f33941a = i6;
        this.f33942b = i10;
        this.f33943c = i11;
        this.f33944d = i12;
        this.f33945e = i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c10;
        sc.b.q(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i6 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < split.length; i13++) {
            String h02 = sc.b.h0(split[i13].trim());
            h02.getClass();
            switch (h02.hashCode()) {
                case 100571:
                    if (h02.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (h02.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (h02.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (h02.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            i11 = i13;
                        }
                    } else {
                        i6 = i13;
                    }
                } else {
                    i12 = i13;
                }
            } else {
                i10 = i13;
            }
        }
        if (i6 != -1 && i10 != -1 && i12 != -1) {
            return new b(i6, i10, i11, i12, split.length);
        }
        return null;
    }
}
