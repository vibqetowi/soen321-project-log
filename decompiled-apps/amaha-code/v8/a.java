package v8;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import c9.q;
import i5.n;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p8.a;
import p8.e;
import p8.f;
/* compiled from: SubripDecoder.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f34834o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f34835p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m  reason: collision with root package name */
    public final StringBuilder f34836m = new StringBuilder();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<String> f34837n = new ArrayList<>();

    public static long i(Matcher matcher, int i6) {
        long j10;
        String group = matcher.group(i6 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i6 + 2);
        group2.getClass();
        String group3 = matcher.group(i6 + 3);
        group3.getClass();
        long parseLong = (Long.parseLong(group3) * 1000) + (Long.parseLong(group2) * 60 * 1000) + j10;
        String group4 = matcher.group(i6 + 4);
        if (group4 != null) {
            parseLong += Long.parseLong(group4);
        }
        return parseLong * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x026e, code lost:
        return new u8.d((p8.a[]) r2.toArray(new p8.a[0]), 1, java.util.Arrays.copyOf((long[]) r3.f19877v, r3.f19876u));
     */
    @Override // p8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f h(byte[] bArr, int i6, boolean z10) {
        q qVar;
        String str;
        String d10;
        String str2;
        String str3;
        char c10;
        char c11;
        int i10;
        float f;
        p8.a a10;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        n nVar = new n(3);
        q qVar2 = new q(bArr, i6);
        while (true) {
            String d11 = qVar2.d();
            if (d11 != null) {
                if (d11.length() != 0) {
                    try {
                        Integer.parseInt(d11);
                        d10 = qVar2.d();
                    } catch (NumberFormatException unused) {
                        qVar = qVar2;
                        if (d11.length() != 0) {
                            str = "Skipping invalid index: ".concat(d11);
                        } else {
                            str = new String("Skipping invalid index: ");
                        }
                        Log.w("SubripDecoder", str);
                    }
                    if (d10 == null) {
                        Log.w("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f34834o.matcher(d10);
                        if (matcher.matches()) {
                            nVar.a(i(matcher, 1));
                            nVar.a(i(matcher, 6));
                            StringBuilder sb2 = aVar.f34836m;
                            sb2.setLength(0);
                            ArrayList<String> arrayList2 = aVar.f34837n;
                            arrayList2.clear();
                            for (String d12 = qVar2.d(); !TextUtils.isEmpty(d12); d12 = qVar2.d()) {
                                if (sb2.length() > 0) {
                                    sb2.append("<br>");
                                }
                                String trim = d12.trim();
                                StringBuilder sb3 = new StringBuilder(trim);
                                Matcher matcher2 = f34835p.matcher(trim);
                                int i11 = 0;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i11;
                                    int length = group.length();
                                    sb3.replace(start, start + length, "");
                                    i11 += length;
                                }
                                sb2.append(sb3.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(sb2.toString());
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    str3 = arrayList2.get(i12);
                                    if (!str3.matches("\\{\\\\an[1-9]\\}")) {
                                        i12++;
                                    }
                                } else {
                                    str3 = null;
                                }
                            }
                            a.C0467a c0467a = new a.C0467a();
                            c0467a.f27989a = fromHtml;
                            if (str3 == null) {
                                a10 = c0467a.a();
                                qVar = qVar2;
                            } else {
                                switch (str3.hashCode()) {
                                    case -685620710:
                                        if (str3.equals("{\\an1}")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620679:
                                        if (str3.equals("{\\an2}")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620648:
                                        if (str3.equals("{\\an3}")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620617:
                                        if (str3.equals("{\\an4}")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620586:
                                        if (str3.equals("{\\an5}")) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620555:
                                        if (str3.equals("{\\an6}")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620524:
                                        if (str3.equals("{\\an7}")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620493:
                                        if (str3.equals("{\\an8}")) {
                                            c10 = '\b';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620462:
                                        if (str3.equals("{\\an9}")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                qVar = qVar2;
                                if (c10 != 0 && c10 != 1 && c10 != 2) {
                                    if (c10 != 3 && c10 != 4 && c10 != 5) {
                                        c0467a.f27996i = 1;
                                    } else {
                                        c0467a.f27996i = 2;
                                    }
                                } else {
                                    c0467a.f27996i = 0;
                                }
                                switch (str3.hashCode()) {
                                    case -685620710:
                                        if (str3.equals("{\\an1}")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620679:
                                        if (str3.equals("{\\an2}")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620648:
                                        if (str3.equals("{\\an3}")) {
                                            c11 = 2;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620617:
                                        if (str3.equals("{\\an4}")) {
                                            c11 = 6;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620586:
                                        if (str3.equals("{\\an5}")) {
                                            c11 = 7;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620555:
                                        if (str3.equals("{\\an6}")) {
                                            c11 = '\b';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620524:
                                        if (str3.equals("{\\an7}")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620493:
                                        if (str3.equals("{\\an8}")) {
                                            c11 = 4;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620462:
                                        if (str3.equals("{\\an9}")) {
                                            c11 = 5;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    default:
                                        c11 = 65535;
                                        break;
                                }
                                if (c11 != 0 && c11 != 1 && c11 != 2) {
                                    if (c11 != 3 && c11 != 4 && c11 != 5) {
                                        c0467a.f27994g = 1;
                                    } else {
                                        c0467a.f27994g = 0;
                                    }
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    c0467a.f27994g = 2;
                                }
                                int i13 = c0467a.f27996i;
                                float f2 = 0.92f;
                                if (i13 != 0) {
                                    if (i13 != 1) {
                                        if (i13 == i10) {
                                            f = 0.92f;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        f = 0.5f;
                                    }
                                } else {
                                    f = 0.08f;
                                }
                                c0467a.f27995h = f;
                                int i14 = c0467a.f27994g;
                                if (i14 != 0) {
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        f2 = 0.5f;
                                    }
                                } else {
                                    f2 = 0.08f;
                                }
                                c0467a.f27993e = f2;
                                c0467a.f = 0;
                                a10 = c0467a.a();
                            }
                            arrayList.add(a10);
                            arrayList.add(p8.a.L);
                        } else {
                            qVar = qVar2;
                            if (d10.length() != 0) {
                                str2 = "Skipping invalid timing: ".concat(d10);
                            } else {
                                str2 = new String("Skipping invalid timing: ");
                            }
                            Log.w("SubripDecoder", str2);
                        }
                        aVar = this;
                        qVar2 = qVar;
                    }
                }
            }
        }
    }
}
