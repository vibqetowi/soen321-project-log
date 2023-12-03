package y8;

import android.text.TextUtils;
import android.util.Log;
import c9.q;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: WebvttDecoder.java */
/* loaded from: classes.dex */
public final class f extends p8.e {

    /* renamed from: m  reason: collision with root package name */
    public final q f38383m = new q();

    /* renamed from: n  reason: collision with root package name */
    public final b f38384n = new b();

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0383, code lost:
        r2.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
        if (")".equals(y8.b.b(r6, r11)) == false) goto L230;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0353  */
    @Override // p8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p8.f h(byte[] bArr, int i6, boolean z10) {
        int i10;
        d dVar;
        String str;
        boolean z11;
        String sb2;
        char c10;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        f fVar = this;
        q qVar = fVar.f38383m;
        qVar.y(bArr, i6);
        ArrayList arrayList = new ArrayList();
        try {
            g.c(qVar);
            do {
            } while (!TextUtils.isEmpty(qVar.d()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i12 = -1;
                int i13 = 0;
                char c11 = 65535;
                int i14 = 0;
                while (true) {
                    i10 = 1;
                    if (c11 != 65535) {
                        break;
                    }
                    i14 = qVar.f5187b;
                    String d10 = qVar.d();
                    if (d10 == null) {
                        c11 = 0;
                    } else if ("STYLE".equals(d10)) {
                        c11 = 2;
                    } else if (d10.startsWith("NOTE")) {
                        c11 = 1;
                    } else {
                        c11 = 3;
                    }
                }
                qVar.A(i14);
                if (c11 != 0) {
                    if (c11 == 1) {
                        do {
                        } while (!TextUtils.isEmpty(qVar.d()));
                    } else {
                        if (c11 == 2) {
                            if (arrayList2.isEmpty()) {
                                qVar.d();
                                b bVar = fVar.f38384n;
                                StringBuilder sb3 = bVar.f38340b;
                                sb3.setLength(0);
                                int i15 = qVar.f5187b;
                                while (!TextUtils.isEmpty(qVar.d())) {
                                }
                                byte[] bArr2 = qVar.f5186a;
                                int i16 = qVar.f5187b;
                                q qVar2 = bVar.f38339a;
                                qVar2.y(bArr2, i16);
                                qVar2.A(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    b.c(qVar2);
                                    if (qVar2.f5188c - qVar2.f5187b >= 5 && "::cue".equals(qVar2.n(5))) {
                                        int i17 = qVar2.f5187b;
                                        String b10 = b.b(qVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                qVar2.A(i17);
                                                str = "";
                                            } else if ("(".equals(b10)) {
                                                int i18 = qVar2.f5187b;
                                                int i19 = qVar2.f5188c;
                                                boolean z15 = false;
                                                while (i18 < i19 && !z15) {
                                                    int i20 = i18 + 1;
                                                    if (((char) qVar2.f5186a[i18]) == ')') {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    z15 = z14;
                                                    i18 = i20;
                                                }
                                                str = qVar2.n((i18 - 1) - qVar2.f5187b).trim();
                                            } else {
                                                str = null;
                                            }
                                            if (str == null || !"{".equals(b.b(qVar2, sb3))) {
                                                break;
                                            }
                                            c cVar = new c();
                                            if (!"".equals(str)) {
                                                int indexOf = str.indexOf(91);
                                                if (indexOf != i12) {
                                                    Matcher matcher = b.f38337c.matcher(str.substring(indexOf));
                                                    if (matcher.matches()) {
                                                        String group = matcher.group(i10);
                                                        group.getClass();
                                                        cVar.f38344d = group;
                                                    }
                                                    str = str.substring(i13, indexOf);
                                                }
                                                int i21 = w.f5205a;
                                                String[] split = str.split("\\.", i12);
                                                String str2 = split[i13];
                                                int indexOf2 = str2.indexOf(35);
                                                if (indexOf2 != i12) {
                                                    cVar.f38342b = str2.substring(i13, indexOf2);
                                                    cVar.f38341a = str2.substring(indexOf2 + 1);
                                                } else {
                                                    cVar.f38342b = str2;
                                                }
                                                if (split.length > i10) {
                                                    int length = split.length;
                                                    if (length <= split.length) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    sc.b.q(z13);
                                                    cVar.f38343c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i10, length)));
                                                }
                                            }
                                            boolean z16 = false;
                                            String str3 = null;
                                            while (!z16) {
                                                int i22 = qVar2.f5187b;
                                                str3 = b.b(qVar2, sb3);
                                                if (str3 != null && !"}".equals(str3)) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                if (!z11) {
                                                    qVar2.A(i22);
                                                    b.c(qVar2);
                                                    String a10 = b.a(qVar2, sb3);
                                                    if (!"".equals(a10) && ":".equals(b.b(qVar2, sb3))) {
                                                        b.c(qVar2);
                                                        StringBuilder sb4 = new StringBuilder();
                                                        boolean z17 = false;
                                                        while (true) {
                                                            if (!z17) {
                                                                int i23 = qVar2.f5187b;
                                                                boolean z18 = z17;
                                                                String b11 = b.b(qVar2, sb3);
                                                                if (b11 == null) {
                                                                    sb2 = null;
                                                                    break;
                                                                } else if (!"}".equals(b11) && !";".equals(b11)) {
                                                                    sb4.append(b11);
                                                                    z17 = z18;
                                                                } else {
                                                                    qVar2.A(i23);
                                                                    z17 = true;
                                                                }
                                                            } else {
                                                                sb2 = sb4.toString();
                                                                break;
                                                            }
                                                        }
                                                        if (sb2 != null && !"".equals(sb2)) {
                                                            int i24 = qVar2.f5187b;
                                                            String b12 = b.b(qVar2, sb3);
                                                            if (!";".equals(b12)) {
                                                                if ("}".equals(b12)) {
                                                                    qVar2.A(i24);
                                                                }
                                                            }
                                                            if ("color".equals(a10)) {
                                                                cVar.f = c9.c.a(sb2, true);
                                                                cVar.f38346g = true;
                                                            } else if ("background-color".equals(a10)) {
                                                                cVar.f38347h = c9.c.a(sb2, true);
                                                                cVar.f38348i = true;
                                                            } else if ("ruby-position".equals(a10)) {
                                                                if ("over".equals(sb2)) {
                                                                    cVar.f38355p = 1;
                                                                } else if ("under".equals(sb2)) {
                                                                    cVar.f38355p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(a10)) {
                                                                if (!"all".equals(sb2) && !sb2.startsWith("digits")) {
                                                                    z12 = false;
                                                                } else {
                                                                    z12 = true;
                                                                }
                                                                cVar.f38356q = z12;
                                                            } else if ("text-decoration".equals(a10)) {
                                                                if ("underline".equals(sb2)) {
                                                                    cVar.f38350k = 1;
                                                                }
                                                            } else if ("font-family".equals(a10)) {
                                                                cVar.f38345e = sc.b.h0(sb2);
                                                            } else if ("font-weight".equals(a10)) {
                                                                if ("bold".equals(sb2)) {
                                                                    cVar.f38351l = 1;
                                                                }
                                                            } else if ("font-style".equals(a10)) {
                                                                if ("italic".equals(sb2)) {
                                                                    cVar.f38352m = 1;
                                                                }
                                                            } else if ("font-size".equals(a10)) {
                                                                Matcher matcher2 = b.f38338d.matcher(sc.b.h0(sb2));
                                                                if (!matcher2.matches()) {
                                                                    StringBuilder sb5 = new StringBuilder(sb2.length() + 22);
                                                                    sb5.append("Invalid font-size: '");
                                                                    sb5.append(sb2);
                                                                    sb5.append("'.");
                                                                    Log.w("WebvttCssParser", sb5.toString());
                                                                } else {
                                                                    String group2 = matcher2.group(2);
                                                                    group2.getClass();
                                                                    int hashCode = group2.hashCode();
                                                                    if (hashCode != 37) {
                                                                        if (hashCode != 3240) {
                                                                            if (hashCode == 3592 && group2.equals("px")) {
                                                                                c10 = 2;
                                                                                if (c10 == 0) {
                                                                                    i11 = 1;
                                                                                    if (c10 != 1) {
                                                                                        if (c10 == 2) {
                                                                                            cVar.f38353n = 1;
                                                                                        } else {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                    } else {
                                                                                        cVar.f38353n = 2;
                                                                                    }
                                                                                } else {
                                                                                    i11 = 1;
                                                                                    cVar.f38353n = 3;
                                                                                }
                                                                                String group3 = matcher2.group(i11);
                                                                                group3.getClass();
                                                                                cVar.f38354o = Float.parseFloat(group3);
                                                                                z16 = z11;
                                                                            }
                                                                            c10 = 65535;
                                                                            if (c10 == 0) {
                                                                            }
                                                                            String group32 = matcher2.group(i11);
                                                                            group32.getClass();
                                                                            cVar.f38354o = Float.parseFloat(group32);
                                                                            z16 = z11;
                                                                        } else {
                                                                            if (group2.equals("em")) {
                                                                                c10 = 1;
                                                                                if (c10 == 0) {
                                                                                }
                                                                                String group322 = matcher2.group(i11);
                                                                                group322.getClass();
                                                                                cVar.f38354o = Float.parseFloat(group322);
                                                                                z16 = z11;
                                                                            }
                                                                            c10 = 65535;
                                                                            if (c10 == 0) {
                                                                            }
                                                                            String group3222 = matcher2.group(i11);
                                                                            group3222.getClass();
                                                                            cVar.f38354o = Float.parseFloat(group3222);
                                                                            z16 = z11;
                                                                        }
                                                                    } else {
                                                                        if (group2.equals("%")) {
                                                                            c10 = 0;
                                                                            if (c10 == 0) {
                                                                            }
                                                                            String group32222 = matcher2.group(i11);
                                                                            group32222.getClass();
                                                                            cVar.f38354o = Float.parseFloat(group32222);
                                                                            z16 = z11;
                                                                        }
                                                                        c10 = 65535;
                                                                        if (c10 == 0) {
                                                                        }
                                                                        String group322222 = matcher2.group(i11);
                                                                        group322222.getClass();
                                                                        cVar.f38354o = Float.parseFloat(group322222);
                                                                        z16 = z11;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z16 = z11;
                                            }
                                            if ("}".equals(str3)) {
                                                arrayList3.add(cVar);
                                            }
                                            i12 = -1;
                                            i13 = 0;
                                            i10 = 1;
                                        }
                                    }
                                    str = null;
                                    if (str == null) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            throw new SubtitleDecoderException("A style block was found after the first cue.");
                        } else if (c11 == 3) {
                            Pattern pattern = e.f38360a;
                            String d11 = qVar.d();
                            if (d11 == null) {
                                dVar = null;
                            } else {
                                Pattern pattern2 = e.f38360a;
                                Matcher matcher3 = pattern2.matcher(d11);
                                if (matcher3.matches()) {
                                    dVar = e.d(null, matcher3, qVar, arrayList);
                                } else {
                                    String d12 = qVar.d();
                                    if (d12 != null) {
                                        Matcher matcher4 = pattern2.matcher(d12);
                                        if (matcher4.matches()) {
                                            dVar = e.d(d11.trim(), matcher4, qVar, arrayList);
                                        }
                                    }
                                    dVar = null;
                                }
                            }
                            if (dVar != null) {
                                arrayList2.add(dVar);
                            }
                        }
                        fVar = this;
                    }
                } else {
                    return new h(arrayList2);
                }
            }
        } catch (ParserException e10) {
            throw new SubtitleDecoderException(e10);
        }
    }
}
