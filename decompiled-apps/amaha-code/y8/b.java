package y8;

import c9.q;
import java.util.regex.Pattern;
/* compiled from: WebvttCssParser.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f38337c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f38338d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    public final q f38339a = new q();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f38340b = new StringBuilder();

    public static String a(q qVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i6 = qVar.f5187b;
        int i10 = qVar.f5188c;
        while (i6 < i10 && !z10) {
            char c10 = (char) qVar.f5186a[i6];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && ((c10 < '0' || c10 > '9') && c10 != '#' && c10 != '-' && c10 != '.' && c10 != '_'))) {
                z10 = true;
            } else {
                i6++;
                sb2.append(c10);
            }
        }
        qVar.B(i6 - qVar.f5187b);
        return sb2.toString();
    }

    public static String b(q qVar, StringBuilder sb2) {
        c(qVar);
        if (qVar.f5188c - qVar.f5187b == 0) {
            return null;
        }
        String a10 = a(qVar, sb2);
        if (!"".equals(a10)) {
            return a10;
        }
        StringBuilder sb3 = new StringBuilder(1);
        sb3.append((char) qVar.q());
        return sb3.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067 A[LOOP:1: B:4:0x0002->B:38:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(q qVar) {
        boolean z10;
        boolean z11;
        while (true) {
            boolean z12 = true;
            while (true) {
                int i6 = qVar.f5188c;
                int i10 = qVar.f5187b;
                if (i6 - i10 > 0 && z12) {
                    char c10 = (char) qVar.f5186a[i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        z10 = false;
                    } else {
                        qVar.B(1);
                        z10 = true;
                    }
                    if (!z10) {
                        int i11 = qVar.f5187b;
                        int i12 = qVar.f5188c;
                        byte[] bArr = qVar.f5186a;
                        if (i11 + 2 <= i12) {
                            int i13 = i11 + 1;
                            if (bArr[i11] == 47) {
                                int i14 = i13 + 1;
                                if (bArr[i13] == 42) {
                                    while (true) {
                                        int i15 = i14 + 1;
                                        if (i15 >= i12) {
                                            break;
                                        } else if (((char) bArr[i14]) == '*' && ((char) bArr[i15]) == '/') {
                                            i12 = i15 + 1;
                                            i14 = i12;
                                        } else {
                                            i14 = i15;
                                        }
                                    }
                                    qVar.B(i12 - qVar.f5187b);
                                    z11 = true;
                                    if (!z11) {
                                        break;
                                    }
                                    z12 = false;
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
