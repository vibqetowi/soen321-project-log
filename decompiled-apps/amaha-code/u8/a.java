package u8;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import c9.q;
import c9.w;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p8.a;
import p8.e;
import p8.f;
import u8.c;
/* compiled from: SsaDecoder.java */
/* loaded from: classes.dex */
public final class a extends e {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m  reason: collision with root package name */
    public final boolean f33936m;

    /* renamed from: n  reason: collision with root package name */
    public final b f33937n;

    /* renamed from: o  reason: collision with root package name */
    public LinkedHashMap f33938o;

    /* renamed from: p  reason: collision with root package name */
    public float f33939p = -3.4028235E38f;

    /* renamed from: q  reason: collision with root package name */
    public float f33940q = -3.4028235E38f;

    public a(List<byte[]> list) {
        if (list != null && !list.isEmpty()) {
            this.f33936m = true;
            int i6 = w.f5205a;
            String str = new String(list.get(0), nc.c.f25988c);
            sc.b.q(str.startsWith("Format:"));
            b a10 = b.a(str);
            a10.getClass();
            this.f33937n = a10;
            j(new q(list.get(1)));
            return;
        }
        this.f33936m = false;
        this.f33937n = null;
    }

    public static int i(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i6;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i6 = size + 1;
                    break;
                }
            } else {
                i6 = 0;
                break;
            }
        }
        arrayList.add(i6, Long.valueOf(j10));
        if (i6 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i6 - 1));
        }
        arrayList2.add(i6, arrayList3);
        return i6;
    }

    public static long k(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i6 = w.f5205a;
        long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
    }

    @Override // p8.e
    public final f h(byte[] bArr, int i6, boolean z10) {
        b bVar;
        q qVar;
        b bVar2;
        c cVar;
        long j10;
        Layout.Alignment alignment;
        int i10;
        float f;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        String str2;
        String str3;
        String str4;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        q qVar2 = new q(bArr, i6);
        boolean z11 = aVar.f33936m;
        if (!z11) {
            aVar.j(qVar2);
        }
        if (z11) {
            bVar = aVar.f33937n;
        } else {
            bVar = null;
        }
        while (true) {
            String d10 = qVar2.d();
            if (d10 != null) {
                if (d10.startsWith("Format:")) {
                    bVar = b.a(d10);
                } else {
                    if (d10.startsWith("Dialogue:")) {
                        if (bVar == null) {
                            if (d10.length() != 0) {
                                str4 = "Skipping dialogue line before complete format: ".concat(d10);
                            } else {
                                str4 = new String("Skipping dialogue line before complete format: ");
                            }
                            Log.w("SsaDecoder", str4);
                        } else {
                            sc.b.q(d10.startsWith("Dialogue:"));
                            String substring = d10.substring(9);
                            int i15 = bVar.f33945e;
                            String[] split = substring.split(",", i15);
                            if (split.length != i15) {
                                if (d10.length() != 0) {
                                    str3 = "Skipping dialogue line with fewer columns than format: ".concat(d10);
                                } else {
                                    str3 = new String("Skipping dialogue line with fewer columns than format: ");
                                }
                                Log.w("SsaDecoder", str3);
                            } else {
                                long k10 = k(split[bVar.f33941a]);
                                if (k10 == -9223372036854775807L) {
                                    if (d10.length() != 0) {
                                        str2 = "Skipping invalid timing: ".concat(d10);
                                    } else {
                                        str2 = new String("Skipping invalid timing: ");
                                    }
                                    Log.w("SsaDecoder", str2);
                                } else {
                                    long k11 = k(split[bVar.f33942b]);
                                    if (k11 == -9223372036854775807L) {
                                        if (d10.length() != 0) {
                                            str = "Skipping invalid timing: ".concat(d10);
                                        } else {
                                            str = new String("Skipping invalid timing: ");
                                        }
                                        Log.w("SsaDecoder", str);
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.f33938o;
                                        if (linkedHashMap != null && (i14 = bVar.f33943c) != -1) {
                                            cVar = (c) linkedHashMap.get(split[i14].trim());
                                        } else {
                                            cVar = null;
                                        }
                                        String str5 = split[bVar.f33944d];
                                        Matcher matcher = c.b.f33961a.matcher(str5);
                                        PointF pointF = null;
                                        int i16 = -1;
                                        while (true) {
                                            qVar = qVar2;
                                            if (matcher.find()) {
                                                String group = matcher.group(1);
                                                group.getClass();
                                                try {
                                                    PointF a10 = c.b.a(group);
                                                    if (a10 != null) {
                                                        pointF = a10;
                                                    }
                                                } catch (RuntimeException unused) {
                                                }
                                                try {
                                                    Matcher matcher2 = c.b.f33964d.matcher(group);
                                                    if (matcher2.find()) {
                                                        String group2 = matcher2.group(1);
                                                        group2.getClass();
                                                        i13 = c.a(group2);
                                                    } else {
                                                        i13 = -1;
                                                    }
                                                    if (i13 != -1) {
                                                        i16 = i13;
                                                    }
                                                } catch (RuntimeException unused2) {
                                                }
                                                qVar2 = qVar;
                                            } else {
                                                String replace = c.b.f33961a.matcher(str5).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                                float f2 = aVar.f33939p;
                                                float f10 = aVar.f33940q;
                                                SpannableString spannableString = new SpannableString(replace);
                                                a.C0467a c0467a = new a.C0467a();
                                                c0467a.f27989a = spannableString;
                                                if (cVar != null) {
                                                    Integer num = cVar.f33948c;
                                                    if (num != null) {
                                                        bVar2 = bVar;
                                                        j10 = k11;
                                                        spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                                    } else {
                                                        bVar2 = bVar;
                                                        j10 = k11;
                                                    }
                                                    float f11 = cVar.f33949d;
                                                    if (f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
                                                        c0467a.f27998k = f11 / f10;
                                                        c0467a.f27997j = 1;
                                                    }
                                                    boolean z12 = cVar.f;
                                                    boolean z13 = cVar.f33950e;
                                                    if (z13 && z12) {
                                                        i11 = 33;
                                                        i12 = 0;
                                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                    } else {
                                                        i11 = 33;
                                                        i12 = 0;
                                                        if (z13) {
                                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                        } else if (z12) {
                                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                        }
                                                    }
                                                    if (cVar.f33951g) {
                                                        spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i11);
                                                    }
                                                    if (cVar.f33952h) {
                                                        spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i11);
                                                    }
                                                } else {
                                                    bVar2 = bVar;
                                                    j10 = k11;
                                                }
                                                if (i16 == -1) {
                                                    if (cVar != null) {
                                                        i16 = cVar.f33947b;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                }
                                                switch (i16) {
                                                    case 0:
                                                    default:
                                                        defpackage.d.k(30, "Unknown alignment: ", i16, "SsaDecoder");
                                                    case -1:
                                                        alignment = null;
                                                        break;
                                                    case 1:
                                                    case 4:
                                                    case 7:
                                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                                        break;
                                                    case 2:
                                                    case 5:
                                                    case 8:
                                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                                        break;
                                                    case 3:
                                                    case 6:
                                                    case 9:
                                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                        break;
                                                }
                                                c0467a.f27991c = alignment;
                                                int i17 = LinearLayoutManager.INVALID_OFFSET;
                                                switch (i16) {
                                                    case 0:
                                                    default:
                                                        defpackage.d.k(30, "Unknown alignment: ", i16, "SsaDecoder");
                                                    case -1:
                                                        i10 = LinearLayoutManager.INVALID_OFFSET;
                                                        break;
                                                    case 1:
                                                    case 4:
                                                    case 7:
                                                        i10 = 0;
                                                        break;
                                                    case 2:
                                                    case 5:
                                                    case 8:
                                                        i10 = 1;
                                                        break;
                                                    case 3:
                                                    case 6:
                                                    case 9:
                                                        i10 = 2;
                                                        break;
                                                }
                                                c0467a.f27996i = i10;
                                                switch (i16) {
                                                    case -1:
                                                        break;
                                                    case 0:
                                                    default:
                                                        defpackage.d.k(30, "Unknown alignment: ", i16, "SsaDecoder");
                                                        break;
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                        i17 = 2;
                                                        break;
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                        i17 = 1;
                                                        break;
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        i17 = 0;
                                                        break;
                                                }
                                                c0467a.f27994g = i17;
                                                if (pointF != null && f10 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                                    c0467a.f27995h = pointF.x / f2;
                                                    c0467a.f27993e = pointF.y / f10;
                                                    c0467a.f = 0;
                                                } else {
                                                    int i18 = c0467a.f27996i;
                                                    float f12 = 0.95f;
                                                    if (i18 != 0) {
                                                        if (i18 != 1) {
                                                            if (i18 != 2) {
                                                                f = -3.4028235E38f;
                                                            } else {
                                                                f = 0.95f;
                                                            }
                                                        } else {
                                                            f = 0.5f;
                                                        }
                                                    } else {
                                                        f = 0.05f;
                                                    }
                                                    c0467a.f27995h = f;
                                                    if (i17 != 0) {
                                                        if (i17 != 1) {
                                                            if (i17 != 2) {
                                                                f12 = -3.4028235E38f;
                                                            }
                                                        } else {
                                                            f12 = 0.5f;
                                                        }
                                                    } else {
                                                        f12 = 0.05f;
                                                    }
                                                    c0467a.f27993e = f12;
                                                    c0467a.f = 0;
                                                }
                                                p8.a a11 = c0467a.a();
                                                int i19 = i(j10, arrayList2, arrayList);
                                                for (int i20 = i(k10, arrayList2, arrayList); i20 < i19; i20++) {
                                                    ((List) arrayList.get(i20)).add(a11);
                                                }
                                                aVar = this;
                                                bVar = bVar2;
                                                qVar2 = qVar;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    qVar = qVar2;
                    bVar2 = bVar;
                    aVar = this;
                    bVar = bVar2;
                    qVar2 = qVar;
                }
            } else {
                return new d(arrayList, 0, arrayList2);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(q qVar) {
        char c10;
        c cVar;
        String trim;
        int i6;
        Integer num;
        int i10;
        float f;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        String str;
        while (true) {
            String d10 = qVar.d();
            if (d10 != null) {
                char c11 = '[';
                char c12 = 2;
                char c13 = 0;
                if ("[Script Info]".equalsIgnoreCase(d10)) {
                    while (true) {
                        String d11 = qVar.d();
                        if (d11 != null) {
                            int i15 = qVar.f5188c;
                            int i16 = qVar.f5187b;
                            if (i15 - i16 == 0 || (qVar.f5186a[i16] & 255) != 91) {
                                String[] split = d11.split(":");
                                if (split.length == 2) {
                                    String h02 = sc.b.h0(split[0].trim());
                                    h02.getClass();
                                    if (!h02.equals("playresx")) {
                                        if (h02.equals("playresy")) {
                                            try {
                                                this.f33940q = Float.parseFloat(split[1].trim());
                                            } catch (NumberFormatException unused) {
                                            }
                                        }
                                    } else {
                                        this.f33939p = Float.parseFloat(split[1].trim());
                                    }
                                }
                            }
                        }
                    }
                } else if ("[V4+ Styles]".equalsIgnoreCase(d10)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        c.a aVar = null;
                        while (true) {
                            String d12 = qVar.d();
                            if (d12 != null) {
                                int i17 = qVar.f5188c;
                                int i18 = qVar.f5187b;
                                if (i17 - i18 == 0 || (qVar.f5186a[i18] & 255) != c11) {
                                    if (d12.startsWith("Format:")) {
                                        String[] split2 = TextUtils.split(d12.substring(7), ",");
                                        int i19 = -1;
                                        int i20 = -1;
                                        int i21 = -1;
                                        int i22 = -1;
                                        int i23 = -1;
                                        int i24 = -1;
                                        int i25 = -1;
                                        int i26 = -1;
                                        for (int i27 = 0; i27 < split2.length; i27++) {
                                            String h03 = sc.b.h0(split2[i27].trim());
                                            h03.getClass();
                                            switch (h03.hashCode()) {
                                                case -1178781136:
                                                    if (h03.equals("italic")) {
                                                        c10 = 0;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case -1026963764:
                                                    if (h03.equals("underline")) {
                                                        c10 = 1;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case -192095652:
                                                    if (h03.equals("strikeout")) {
                                                        c10 = 2;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case -70925746:
                                                    if (h03.equals("primarycolour")) {
                                                        c10 = 3;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case 3029637:
                                                    if (h03.equals("bold")) {
                                                        c10 = 4;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case 3373707:
                                                    if (h03.equals(SessionManager.KEY_NAME)) {
                                                        c10 = 5;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case 366554320:
                                                    if (h03.equals("fontsize")) {
                                                        c10 = 6;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case 1767875043:
                                                    if (h03.equals("alignment")) {
                                                        c10 = 7;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                default:
                                                    c10 = 65535;
                                                    break;
                                            }
                                            switch (c10) {
                                                case 0:
                                                    i24 = i27;
                                                    break;
                                                case 1:
                                                    i25 = i27;
                                                    break;
                                                case 2:
                                                    i26 = i27;
                                                    break;
                                                case 3:
                                                    i21 = i27;
                                                    break;
                                                case 4:
                                                    i23 = i27;
                                                    break;
                                                case 5:
                                                    i19 = i27;
                                                    break;
                                                case 6:
                                                    i22 = i27;
                                                    break;
                                                case 7:
                                                    i20 = i27;
                                                    break;
                                            }
                                        }
                                        if (i19 != -1) {
                                            aVar = new c.a(i19, i20, i21, i22, i23, i24, i25, i26, split2.length);
                                            c11 = '[';
                                        }
                                    } else {
                                        if (d12.startsWith("Style:")) {
                                            if (aVar == null) {
                                                if (d12.length() != 0) {
                                                    str = "Skipping 'Style:' line before 'Format:' line: ".concat(d12);
                                                } else {
                                                    str = new String("Skipping 'Style:' line before 'Format:' line: ");
                                                }
                                                Log.w("SsaDecoder", str);
                                            } else {
                                                sc.b.q(d12.startsWith("Style:"));
                                                String[] split3 = TextUtils.split(d12.substring(6), ",");
                                                int length = split3.length;
                                                int i28 = aVar.f33960i;
                                                if (length != i28) {
                                                    Object[] objArr = new Object[3];
                                                    objArr[c13] = Integer.valueOf(i28);
                                                    objArr[1] = Integer.valueOf(split3.length);
                                                    objArr[c12] = d12;
                                                    Log.w("SsaStyle", w.k("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
                                                } else {
                                                    try {
                                                        trim = split3[aVar.f33953a].trim();
                                                        int i29 = aVar.f33954b;
                                                        if (i29 != -1) {
                                                            i6 = c.a(split3[i29].trim());
                                                        } else {
                                                            i6 = -1;
                                                        }
                                                        int i30 = aVar.f33955c;
                                                        if (i30 != -1) {
                                                            num = c.c(split3[i30].trim());
                                                        } else {
                                                            num = null;
                                                        }
                                                        i10 = aVar.f33956d;
                                                    } catch (RuntimeException e10) {
                                                        StringBuilder sb2 = new StringBuilder(d12.length() + 36);
                                                        sb2.append("Skipping malformed 'Style:' line: '");
                                                        sb2.append(d12);
                                                        sb2.append("'");
                                                        ca.a.B1("SsaStyle", sb2.toString(), e10);
                                                    }
                                                    if (i10 != -1) {
                                                        String trim2 = split3[i10].trim();
                                                        try {
                                                            f = Float.parseFloat(trim2);
                                                        } catch (NumberFormatException e11) {
                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(trim2).length() + 29);
                                                            sb3.append("Failed to parse font size: '");
                                                            sb3.append(trim2);
                                                            sb3.append("'");
                                                            ca.a.B1("SsaStyle", sb3.toString(), e11);
                                                        }
                                                        i11 = aVar.f33957e;
                                                        if (i11 == -1 && c.b(split3[i11].trim())) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        i12 = aVar.f;
                                                        if (i12 == -1 && c.b(split3[i12].trim())) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        i13 = aVar.f33958g;
                                                        if (i13 == -1 && c.b(split3[i13].trim())) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        i14 = aVar.f33959h;
                                                        if (i14 == -1 && c.b(split3[i14].trim())) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        cVar = new c(trim, i6, num, f, z10, z11, z12, z13);
                                                        if (cVar != null) {
                                                            linkedHashMap.put(cVar.f33946a, cVar);
                                                        }
                                                    }
                                                    f = -3.4028235E38f;
                                                    i11 = aVar.f33957e;
                                                    if (i11 == -1) {
                                                    }
                                                    z10 = false;
                                                    i12 = aVar.f;
                                                    if (i12 == -1) {
                                                    }
                                                    z11 = false;
                                                    i13 = aVar.f33958g;
                                                    if (i13 == -1) {
                                                    }
                                                    z12 = false;
                                                    i14 = aVar.f33959h;
                                                    if (i14 == -1) {
                                                    }
                                                    z13 = false;
                                                    cVar = new c(trim, i6, num, f, z10, z11, z12, z13);
                                                    if (cVar != null) {
                                                    }
                                                }
                                                cVar = null;
                                                if (cVar != null) {
                                                }
                                            }
                                        }
                                        c11 = '[';
                                        c12 = 2;
                                        c13 = 0;
                                    }
                                }
                            }
                        }
                        c11 = '[';
                    }
                    this.f33938o = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(d10)) {
                    Log.i("SsaDecoder", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(d10)) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
