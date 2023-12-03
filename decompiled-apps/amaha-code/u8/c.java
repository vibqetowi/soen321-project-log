package u8;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import c9.w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ri.e;
/* compiled from: SsaStyle.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f33946a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33947b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f33948c;

    /* renamed from: d  reason: collision with root package name */
    public final float f33949d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f33950e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f33951g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f33952h;

    /* compiled from: SsaStyle.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f33953a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33954b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33955c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33956d;

        /* renamed from: e  reason: collision with root package name */
        public final int f33957e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final int f33958g;

        /* renamed from: h  reason: collision with root package name */
        public final int f33959h;

        /* renamed from: i  reason: collision with root package name */
        public final int f33960i;

        public a(int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f33953a = i6;
            this.f33954b = i10;
            this.f33955c = i11;
            this.f33956d = i12;
            this.f33957e = i13;
            this.f = i14;
            this.f33958g = i15;
            this.f33959h = i16;
            this.f33960i = i17;
        }
    }

    /* compiled from: SsaStyle.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Pattern f33961a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b  reason: collision with root package name */
        public static final Pattern f33962b = Pattern.compile(w.k("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c  reason: collision with root package name */
        public static final Pattern f33963c = Pattern.compile(w.k("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: d  reason: collision with root package name */
        public static final Pattern f33964d = Pattern.compile("\\\\an(\\d+)");

        public static PointF a(String str) {
            String group;
            String group2;
            Matcher matcher = f33962b.matcher(str);
            Matcher matcher2 = f33963c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 82);
                    sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb2.append(str);
                    sb2.append("'");
                    Log.i("SsaStyle.Overrides", sb2.toString());
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    public c(String str, int i6, Integer num, float f, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f33946a = str;
        this.f33947b = i6;
        this.f33948c = num;
        this.f33949d = f;
        this.f33950e = z10;
        this.f = z11;
        this.f33951g = z12;
        this.f33952h = z13;
    }

    public static int a(String str) {
        String str2;
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Ignoring unknown alignment: ".concat(valueOf);
        } else {
            str2 = new String("Ignoring unknown alignment: ");
        }
        Log.w("SsaStyle", str2);
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(e.c(str, 33));
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            ca.a.B1("SsaStyle", sb2.toString(), e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.q(z10);
            int D = qc.a.D(((parseLong >> 24) & 255) ^ 255);
            int D2 = qc.a.D((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(D, qc.a.D(parseLong & 255), qc.a.D((parseLong >> 8) & 255), D2));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(e.c(str, 36));
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            ca.a.B1("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }
}
