package y8;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import c9.q;
import c9.w;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p8.a;
/* compiled from: WebvttCueParser.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f38360a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f38361b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, Integer> f38362c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, Integer> f38363d;

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final p0.d f38364c = new p0.d(7);

        /* renamed from: a  reason: collision with root package name */
        public final b f38365a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38366b;

        public a(b bVar, int i6) {
            this.f38365a = bVar;
            this.f38366b = i6;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f38367a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38368b;

        /* renamed from: c  reason: collision with root package name */
        public final String f38369c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f38370d;

        public b(String str, int i6, String str2, Set<String> set) {
            this.f38368b = i6;
            this.f38367a = str;
            this.f38369c = str2;
            this.f38370d = set;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: u  reason: collision with root package name */
        public final int f38371u;

        /* renamed from: v  reason: collision with root package name */
        public final y8.c f38372v;

        public c(int i6, y8.c cVar) {
            this.f38371u = i6;
            this.f38372v = cVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f38371u, cVar.f38371u);
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f38375c;

        /* renamed from: a  reason: collision with root package name */
        public long f38373a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f38374b = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f38376d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f38377e = -3.4028235E38f;
        public int f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f38378g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f38379h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f38380i = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: j  reason: collision with root package name */
        public float f38381j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f38382k = LinearLayoutManager.INVALID_OFFSET;

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
            if (r5 == 0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a.C0467a a() {
            Layout.Alignment alignment;
            int i6;
            CharSequence charSequence;
            float f = this.f38379h;
            float f2 = -3.4028235E38f;
            if (f == -3.4028235E38f) {
                int i10 = this.f38376d;
                if (i10 != 4) {
                    if (i10 != 5) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                } else {
                    f = 0.0f;
                }
            }
            int i11 = this.f38380i;
            if (i11 == Integer.MIN_VALUE) {
                int i12 = this.f38376d;
                if (i12 != 1) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                i11 = 1;
                            }
                        }
                    }
                    i11 = 2;
                }
                i11 = 0;
            }
            a.C0467a c0467a = new a.C0467a();
            int i13 = this.f38376d;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 5) {
                                defpackage.d.k(34, "Unknown textAlignment: ", i13, "WebvttCueParser");
                                alignment = null;
                            }
                        }
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                c0467a.f27991c = alignment;
                float f10 = this.f38377e;
                int i14 = this.f;
                i6 = (f10 > (-3.4028235E38f) ? 1 : (f10 == (-3.4028235E38f) ? 0 : -1));
                if (i6 != 0 || i14 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                    if (i6 == 0) {
                        f2 = f10;
                    }
                    c0467a.f27993e = f2;
                    c0467a.f = i14;
                    c0467a.f27994g = this.f38378g;
                    c0467a.f27995h = f;
                    c0467a.f27996i = i11;
                    float f11 = this.f38381j;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException(String.valueOf(i11));
                            }
                        } else if (f <= 0.5f) {
                            f *= 2.0f;
                        } else {
                            f = (1.0f - f) * 2.0f;
                        }
                    } else {
                        f = 1.0f - f;
                    }
                    c0467a.f27999l = Math.min(f11, f);
                    c0467a.f28003p = this.f38382k;
                    charSequence = this.f38375c;
                    if (charSequence != null) {
                        c0467a.f27989a = charSequence;
                    }
                    return c0467a;
                }
                f2 = 1.0f;
                c0467a.f27993e = f2;
                c0467a.f = i14;
                c0467a.f27994g = this.f38378g;
                c0467a.f27995h = f;
                c0467a.f27996i = i11;
                float f112 = this.f38381j;
                if (i11 != 0) {
                }
                c0467a.f27999l = Math.min(f112, f);
                c0467a.f28003p = this.f38382k;
                charSequence = this.f38375c;
                if (charSequence != null) {
                }
                return c0467a;
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            c0467a.f27991c = alignment;
            float f102 = this.f38377e;
            int i142 = this.f;
            i6 = (f102 > (-3.4028235E38f) ? 1 : (f102 == (-3.4028235E38f) ? 0 : -1));
            if (i6 != 0) {
            }
            if (i6 == 0) {
            }
            c0467a.f27993e = f2;
            c0467a.f = i142;
            c0467a.f27994g = this.f38378g;
            c0467a.f27995h = f;
            c0467a.f27996i = i11;
            float f1122 = this.f38381j;
            if (i11 != 0) {
            }
            c0467a.f27999l = Math.min(f1122, f);
            c0467a.f28003p = this.f38382k;
            charSequence = this.f38375c;
            if (charSequence != null) {
            }
            return c0467a;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f38362c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f38363d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, b bVar, String str, List list, List list2) {
        char c10;
        char c11;
        char c12;
        int i6;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13 = bVar.f38368b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f38367a;
        str2.getClass();
        int hashCode = str2.hashCode();
        int i14 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c10 = 5;
                                    }
                                    c10 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c10 = 4;
                                    }
                                    c10 = 65535;
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            }
                        } else {
                            if (str2.equals(Constants.ONBOARDING_VARIANT)) {
                                c10 = 1;
                            }
                            c10 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c10 = 7;
                        }
                        c10 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c10 = 6;
                    }
                    c10 = 65535;
                }
            } else {
                if (str2.equals("i")) {
                    c10 = 3;
                }
                c10 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i13, length, 33);
                break;
            case 2:
                for (String str3 : bVar.f38370d) {
                    Map<String, Integer> map = f38362c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i13, length, 33);
                    } else {
                        Map<String, Integer> map2 = f38363d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i13, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case 7:
                int c13 = c(list2, str, bVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, a.f38364c);
                int i15 = bVar.f38368b;
                int i16 = 0;
                int i17 = 0;
                while (i16 < arrayList.size()) {
                    if ("rt".equals(((a) arrayList.get(i16)).f38365a.f38367a)) {
                        a aVar = (a) arrayList.get(i16);
                        int c14 = c(list2, str, aVar.f38365a);
                        if (c14 == i14) {
                            if (c13 != i14) {
                                c14 = c13;
                            } else {
                                c14 = 1;
                            }
                        }
                        int i18 = aVar.f38365a.f38368b - i17;
                        int i19 = aVar.f38366b - i17;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i18, i19);
                        spannableStringBuilder.delete(i18, i19);
                        spannableStringBuilder.setSpan(new t8.c(subSequence.toString(), c14), i15, i18, 33);
                        i17 = subSequence.length() + i17;
                        i15 = i18;
                    }
                    i16++;
                    i14 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, bVar);
        for (int i20 = 0; i20 < b10.size(); i20++) {
            y8.c cVar = ((c) b10.get(i20)).f38372v;
            if (cVar != null) {
                int i21 = cVar.f38351l;
                if (i21 == -1 && cVar.f38352m == -1) {
                    i6 = -1;
                } else {
                    if (i21 == 1) {
                        c11 = 1;
                    } else {
                        c11 = 0;
                    }
                    if (cVar.f38352m == 1) {
                        c12 = 2;
                    } else {
                        c12 = 0;
                    }
                    i6 = c12 | c11;
                }
                if (i6 != -1) {
                    int i22 = cVar.f38351l;
                    if (i22 == -1 && cVar.f38352m == -1) {
                        i12 = -1;
                    } else {
                        if (i22 == 1) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (cVar.f38352m == 1) {
                            i11 = 2;
                        } else {
                            i11 = 0;
                        }
                        i12 = i10 | i11;
                    }
                    kc.f.g(spannableStringBuilder, new StyleSpan(i12), i13, length);
                }
                if (cVar.f38349j == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, length, 33);
                }
                if (cVar.f38350k == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                }
                if (cVar.f38346g) {
                    if (cVar.f38346g) {
                        kc.f.g(spannableStringBuilder, new ForegroundColorSpan(cVar.f), i13, length);
                    } else {
                        throw new IllegalStateException("Font color not defined");
                    }
                }
                if (cVar.f38348i) {
                    if (cVar.f38348i) {
                        kc.f.g(spannableStringBuilder, new BackgroundColorSpan(cVar.f38347h), i13, length);
                    } else {
                        throw new IllegalStateException("Background color not defined.");
                    }
                }
                if (cVar.f38345e != null) {
                    kc.f.g(spannableStringBuilder, new TypefaceSpan(cVar.f38345e), i13, length);
                }
                int i23 = cVar.f38353n;
                if (i23 != 1) {
                    if (i23 != 2) {
                        if (i23 == 3) {
                            kc.f.g(spannableStringBuilder, new RelativeSizeSpan(cVar.f38354o / 100.0f), i13, length);
                        }
                    } else {
                        kc.f.g(spannableStringBuilder, new RelativeSizeSpan(cVar.f38354o), i13, length);
                    }
                } else {
                    kc.f.g(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.f38354o, true), i13, length);
                }
                if (cVar.f38356q) {
                    spannableStringBuilder.setSpan(new t8.a(), i13, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, b bVar) {
        int i6;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            y8.c cVar = (y8.c) list.get(i10);
            String str2 = bVar.f38367a;
            if (cVar.f38341a.isEmpty() && cVar.f38342b.isEmpty() && cVar.f38343c.isEmpty() && cVar.f38344d.isEmpty()) {
                i6 = TextUtils.isEmpty(str2);
            } else {
                int a10 = y8.c.a(cVar.f38344d, y8.c.a(cVar.f38342b, y8.c.a(cVar.f38341a, 0, 1073741824, str), 2, str2), 4, bVar.f38369c);
                if (a10 != -1) {
                    if (bVar.f38370d.containsAll(cVar.f38343c)) {
                        i6 = a10 + (cVar.f38343c.size() * 4);
                    }
                }
                i6 = 0;
            }
            if (i6 > 0) {
                arrayList.add(new c(i6, cVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<y8.c> list, String str, b bVar) {
        ArrayList b10 = b(list, str, bVar);
        for (int i6 = 0; i6 < b10.size(); i6++) {
            int i10 = ((c) b10.get(i6)).f38372v.f38355p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static y8.d d(String str, Matcher matcher, q qVar, ArrayList arrayList) {
        String str2;
        d dVar = new d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.f38373a = g.b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.f38374b = g.b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, dVar);
            StringBuilder sb2 = new StringBuilder();
            String d10 = qVar.d();
            while (!TextUtils.isEmpty(d10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(d10.trim());
                d10 = qVar.d();
            }
            dVar.f38375c = f(str, sb2.toString(), arrayList);
            return new y8.d(dVar.a().a(), dVar.f38373a, dVar.f38374b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            if (valueOf.length() != 0) {
                str2 = "Skipping cue with bad header: ".concat(valueOf);
            } else {
                str2 = new String("Skipping cue with bad header: ");
            }
            Log.w("WebvttCueParser", str2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, d dVar) {
        String str2;
        String str3;
        String str4;
        Matcher matcher = f38361b.matcher(str);
        while (matcher.find()) {
            int i6 = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, dVar);
                } else if ("align".equals(group)) {
                    char c10 = 65535;
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                        case 1:
                            i6 = 2;
                            break;
                        case 2:
                            i6 = 3;
                            break;
                        case 3:
                            i6 = 4;
                            break;
                        case 4:
                            i6 = 5;
                            break;
                        case 5:
                            break;
                        default:
                            if (group2.length() != 0) {
                                str3 = "Invalid alignment value: ".concat(group2);
                            } else {
                                str3 = new String("Invalid alignment value: ");
                            }
                            Log.w("WebvttCueParser", str3);
                            i6 = 2;
                            break;
                    }
                    dVar.f38376d = i6;
                } else if (Constants.DAYMODEL_POSITION.equals(group)) {
                    h(group2, dVar);
                } else if ("size".equals(group)) {
                    dVar.f38381j = g.a(group2);
                } else if ("vertical".equals(group)) {
                    if (!group2.equals("lr")) {
                        if (!group2.equals("rl")) {
                            if (group2.length() != 0) {
                                str4 = "Invalid 'vertical' value: ".concat(group2);
                            } else {
                                str4 = new String("Invalid 'vertical' value: ");
                            }
                            Log.w("WebvttCueParser", str4);
                            i6 = LinearLayoutManager.INVALID_OFFSET;
                        }
                    } else {
                        i6 = 2;
                    }
                    dVar.f38382k = i6;
                } else {
                    StringBuilder sb2 = new StringBuilder(group.length() + 21 + group2.length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(group);
                    sb2.append(":");
                    sb2.append(group2);
                    Log.w("WebvttCueParser", sb2.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                if (valueOf.length() != 0) {
                    str2 = "Skipping bad cue setting: ".concat(valueOf);
                } else {
                    str2 = new String("Skipping bad cue setting: ");
                }
                Log.w("WebvttCueParser", str2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString f(String str, String str2, List<y8.c> list) {
        boolean z10;
        boolean z11;
        int i6;
        char c10;
        boolean z12;
        char c11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String str3 = "";
            if (i10 < str2.length()) {
                char charAt = str2.charAt(i10);
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i10++;
                    } else {
                        int i11 = i10 + 1;
                        if (i11 < str2.length()) {
                            if (str2.charAt(i11) == '/') {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int indexOf = str2.indexOf(62, i11);
                            if (indexOf == -1) {
                                i11 = str2.length();
                            } else {
                                i11 = indexOf + 1;
                            }
                            int i12 = i11 - 2;
                            if (str2.charAt(i12) == '/') {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10) {
                                i6 = 2;
                            } else {
                                i6 = 1;
                            }
                            int i13 = i10 + i6;
                            if (!z11) {
                                i12 = i11 - 1;
                            }
                            String substring = str2.substring(i13, i12);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                sc.b.q(!trim.isEmpty());
                                int i14 = w.f5205a;
                                String str4 = trim.split("[ \\.]", 2)[0];
                                str4.getClass();
                                int hashCode = str4.hashCode();
                                if (hashCode != 98) {
                                    if (hashCode != 99) {
                                        if (hashCode != 105) {
                                            if (hashCode != 3650) {
                                                if (hashCode != 3314158) {
                                                    if (hashCode != 3511770) {
                                                        if (hashCode != 117) {
                                                            if (hashCode == 118 && str4.equals("v")) {
                                                                c10 = 4;
                                                                switch (c10) {
                                                                    case 0:
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                    case 5:
                                                                    case 6:
                                                                    case 7:
                                                                        z12 = true;
                                                                        break;
                                                                    default:
                                                                        z12 = false;
                                                                        break;
                                                                }
                                                                if (z12) {
                                                                    if (z10) {
                                                                        while (!arrayDeque.isEmpty()) {
                                                                            b bVar = (b) arrayDeque.pop();
                                                                            a(spannableStringBuilder, bVar, str, arrayList, list);
                                                                            if (!arrayDeque.isEmpty()) {
                                                                                arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                                                            } else {
                                                                                arrayList.clear();
                                                                            }
                                                                            if (bVar.f38367a.equals(str4)) {
                                                                            }
                                                                        }
                                                                    } else if (!z11) {
                                                                        int length = spannableStringBuilder.length();
                                                                        String trim2 = substring.trim();
                                                                        sc.b.q(!trim2.isEmpty());
                                                                        int indexOf2 = trim2.indexOf(" ");
                                                                        if (indexOf2 == -1) {
                                                                            c11 = 0;
                                                                        } else {
                                                                            str3 = trim2.substring(indexOf2).trim();
                                                                            c11 = 0;
                                                                            trim2 = trim2.substring(0, indexOf2);
                                                                        }
                                                                        String[] split = trim2.split("\\.", -1);
                                                                        String str5 = split[c11];
                                                                        HashSet hashSet = new HashSet();
                                                                        for (int i15 = 1; i15 < split.length; i15++) {
                                                                            hashSet.add(split[i15]);
                                                                        }
                                                                        arrayDeque.push(new b(str5, length, str3, hashSet));
                                                                    }
                                                                }
                                                            }
                                                            c10 = 65535;
                                                            switch (c10) {
                                                            }
                                                            if (z12) {
                                                            }
                                                        } else {
                                                            if (str4.equals("u")) {
                                                                c10 = 3;
                                                                switch (c10) {
                                                                }
                                                                if (z12) {
                                                                }
                                                            }
                                                            c10 = 65535;
                                                            switch (c10) {
                                                            }
                                                            if (z12) {
                                                            }
                                                        }
                                                    } else {
                                                        if (str4.equals("ruby")) {
                                                            c10 = 7;
                                                            switch (c10) {
                                                            }
                                                            if (z12) {
                                                            }
                                                        }
                                                        c10 = 65535;
                                                        switch (c10) {
                                                        }
                                                        if (z12) {
                                                        }
                                                    }
                                                } else {
                                                    if (str4.equals("lang")) {
                                                        c10 = 6;
                                                        switch (c10) {
                                                        }
                                                        if (z12) {
                                                        }
                                                    }
                                                    c10 = 65535;
                                                    switch (c10) {
                                                    }
                                                    if (z12) {
                                                    }
                                                }
                                            } else {
                                                if (str4.equals("rt")) {
                                                    c10 = 5;
                                                    switch (c10) {
                                                    }
                                                    if (z12) {
                                                    }
                                                }
                                                c10 = 65535;
                                                switch (c10) {
                                                }
                                                if (z12) {
                                                }
                                            }
                                        } else {
                                            if (str4.equals("i")) {
                                                c10 = 2;
                                                switch (c10) {
                                                }
                                                if (z12) {
                                                }
                                            }
                                            c10 = 65535;
                                            switch (c10) {
                                            }
                                            if (z12) {
                                            }
                                        }
                                    } else {
                                        if (str4.equals("c")) {
                                            c10 = 1;
                                            switch (c10) {
                                            }
                                            if (z12) {
                                            }
                                        }
                                        c10 = 65535;
                                        switch (c10) {
                                        }
                                        if (z12) {
                                        }
                                    }
                                } else {
                                    if (str4.equals(Constants.ONBOARDING_VARIANT)) {
                                        c10 = 0;
                                        switch (c10) {
                                        }
                                        if (z12) {
                                        }
                                    }
                                    c10 = 65535;
                                    switch (c10) {
                                    }
                                    if (z12) {
                                    }
                                }
                            }
                        }
                        i10 = i11;
                    }
                } else {
                    i10++;
                    int indexOf3 = str2.indexOf(59, i10);
                    int indexOf4 = str2.indexOf(32, i10);
                    char c12 = 65535;
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i10, indexOf3);
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case 3309:
                                if (substring2.equals("gt")) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c12 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c12) {
                            case 0:
                                spannableStringBuilder.append('>');
                                break;
                            case 1:
                                spannableStringBuilder.append('<');
                                break;
                            case 2:
                                spannableStringBuilder.append('&');
                                break;
                            case 3:
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                StringBuilder sb2 = new StringBuilder(substring2.length() + 33);
                                sb2.append("ignoring unsupported entity: '&");
                                sb2.append(substring2);
                                sb2.append(";'");
                                Log.w("WebvttCueParser", sb2.toString());
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i10 = indexOf3 + 1;
                    } else {
                        spannableStringBuilder.append(charAt);
                    }
                }
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(spannableStringBuilder, (b) arrayDeque.pop(), str, arrayList, list);
                }
                a(spannableStringBuilder, new b("", 0, "", Collections.emptySet()), str, Collections.emptyList(), list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, d dVar) {
        String str2;
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i6 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i6 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i6 = 0;
                    break;
                default:
                    if (substring.length() != 0) {
                        str2 = "Invalid anchor value: ".concat(substring);
                    } else {
                        str2 = new String("Invalid anchor value: ");
                    }
                    Log.w("WebvttCueParser", str2);
                    i6 = LinearLayoutManager.INVALID_OFFSET;
                    break;
            }
            dVar.f38378g = i6;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f38377e = g.a(str);
            dVar.f = 0;
            return;
        }
        dVar.f38377e = Integer.parseInt(str);
        dVar.f = 1;
    }

    public static void h(String str, d dVar) {
        String str2;
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i6 = 2;
            switch (substring.hashCode()) {
                case -1842484672:
                    if (substring.equals("line-left")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1276788989:
                    if (substring.equals("line-right")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 5:
                    i6 = 0;
                    break;
                case 1:
                case 3:
                    i6 = 1;
                    break;
                case 2:
                case 4:
                    break;
                default:
                    if (substring.length() != 0) {
                        str2 = "Invalid anchor value: ".concat(substring);
                    } else {
                        str2 = new String("Invalid anchor value: ");
                    }
                    Log.w("WebvttCueParser", str2);
                    i6 = LinearLayoutManager.INVALID_OFFSET;
                    break;
            }
            dVar.f38380i = i6;
            str = str.substring(0, indexOf);
        }
        dVar.f38379h = g.a(str);
    }
}
