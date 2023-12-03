package q8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.k;
import c9.q;
import c9.w;
import com.appsflyer.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p8.a;
import q8.c;
/* compiled from: Cea608Decoder.java */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: h  reason: collision with root package name */
    public final int f29328h;

    /* renamed from: i  reason: collision with root package name */
    public final int f29329i;

    /* renamed from: j  reason: collision with root package name */
    public final int f29330j;

    /* renamed from: n  reason: collision with root package name */
    public List<p8.a> f29334n;

    /* renamed from: o  reason: collision with root package name */
    public List<p8.a> f29335o;

    /* renamed from: p  reason: collision with root package name */
    public int f29336p;

    /* renamed from: q  reason: collision with root package name */
    public int f29337q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f29338s;

    /* renamed from: t  reason: collision with root package name */
    public byte f29339t;

    /* renamed from: u  reason: collision with root package name */
    public byte f29340u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f29342w;

    /* renamed from: x  reason: collision with root package name */
    public long f29343x;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f29325y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f29326z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, R.styleable.AppCompatTheme_switchStyle, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_textAppearanceListItem, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_textAppearanceListItemSmall, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textColorSearchUrl, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_windowActionBarOverlay, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowFixedHeightMajor, R.styleable.AppCompatTheme_windowFixedHeightMinor, R.styleable.AppCompatTheme_windowFixedWidthMajor, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, k.d.DEFAULT_DRAG_ANIMATION_DURATION, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMinor, 92, 94, 95, R.styleable.AppCompatTheme_windowMinWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    public final q f29327g = new q();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<C0494a> f29332l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public C0494a f29333m = new C0494a(0, 4);

    /* renamed from: v  reason: collision with root package name */
    public int f29341v = 0;

    /* renamed from: k  reason: collision with root package name */
    public final long f29331k = 16000000;

    /* compiled from: Cea608Decoder.java */
    /* renamed from: q8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0494a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f29344a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f29345b;

        /* renamed from: c  reason: collision with root package name */
        public final StringBuilder f29346c;

        /* renamed from: d  reason: collision with root package name */
        public int f29347d;

        /* renamed from: e  reason: collision with root package name */
        public int f29348e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f29349g;

        /* renamed from: h  reason: collision with root package name */
        public int f29350h;

        /* compiled from: Cea608Decoder.java */
        /* renamed from: q8.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0495a {

            /* renamed from: a  reason: collision with root package name */
            public final int f29351a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f29352b;

            /* renamed from: c  reason: collision with root package name */
            public int f29353c;

            public C0495a(int i6, int i10, boolean z10) {
                this.f29351a = i6;
                this.f29352b = z10;
                this.f29353c = i10;
            }
        }

        public C0494a(int i6, int i10) {
            ArrayList arrayList = new ArrayList();
            this.f29344a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f29345b = arrayList2;
            StringBuilder sb2 = new StringBuilder();
            this.f29346c = sb2;
            this.f29349g = i6;
            arrayList.clear();
            arrayList2.clear();
            sb2.setLength(0);
            this.f29347d = 15;
            this.f29348e = 0;
            this.f = 0;
            this.f29350h = i10;
        }

        public final void a(char c10) {
            StringBuilder sb2 = this.f29346c;
            if (sb2.length() < 32) {
                sb2.append(c10);
            }
        }

        public final void b() {
            C0495a c0495a;
            int i6;
            StringBuilder sb2 = this.f29346c;
            int length = sb2.length();
            if (length > 0) {
                sb2.delete(length - 1, length);
                ArrayList arrayList = this.f29344a;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0 && (i6 = (c0495a = (C0495a) arrayList.get(size)).f29353c) == length) {
                        c0495a.f29353c = i6 - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public final p8.a c(int i6) {
            float f;
            int i10 = this.f29348e + this.f;
            int i11 = 32 - i10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f29345b;
                if (i12 >= arrayList.size()) {
                    break;
                }
                CharSequence charSequence = (CharSequence) arrayList.get(i12);
                int i13 = w.f5205a;
                if (charSequence.length() > i11) {
                    charSequence = charSequence.subSequence(0, i11);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append('\n');
                i12++;
            }
            SpannableString d10 = d();
            int i14 = w.f5205a;
            int length = d10.length();
            CharSequence charSequence2 = d10;
            if (length > i11) {
                charSequence2 = d10.subSequence(0, i11);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i11 - spannableStringBuilder.length();
            int i15 = i10 - length2;
            if (i6 == Integer.MIN_VALUE) {
                if (this.f29349g == 2 && (Math.abs(i15) < 3 || length2 < 0)) {
                    i6 = 1;
                } else if (this.f29349g == 2 && i15 > 0) {
                    i6 = 2;
                } else {
                    i6 = 0;
                }
            }
            if (i6 != 1) {
                if (i6 == 2) {
                    i10 = 32 - length2;
                }
                f = ((i10 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i16 = this.f29347d;
            if (i16 > 7) {
                i16 = (i16 - 15) - 2;
            } else if (this.f29349g == 1) {
                i16 -= this.f29350h - 1;
            }
            a.C0467a c0467a = new a.C0467a();
            c0467a.f27989a = spannableStringBuilder;
            c0467a.f27991c = Layout.Alignment.ALIGN_NORMAL;
            c0467a.f27993e = i16;
            c0467a.f = 1;
            c0467a.f27995h = f;
            c0467a.f27996i = i6;
            return c0467a.a();
        }

        public final SpannableString d() {
            int i6;
            boolean z10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29346c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            boolean z11 = false;
            int i15 = -1;
            while (true) {
                ArrayList arrayList = this.f29344a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                C0495a c0495a = (C0495a) arrayList.get(i10);
                boolean z12 = c0495a.f29352b;
                int i16 = c0495a.f29351a;
                if (i16 != 8) {
                    if (i16 == 7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z11 = z10;
                }
                int i17 = c0495a.f29353c;
                i10++;
                if (i10 < arrayList.size()) {
                    i6 = ((C0495a) arrayList.get(i10)).f29353c;
                } else {
                    i6 = length;
                }
                if (i17 != i6) {
                    if (i11 != -1 && !z12) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z12) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        if (i14 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, i17, 33);
                        }
                        i14 = i15;
                        i13 = i17;
                    }
                }
            }
            if (i11 != -1 && i11 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (i12 != -1 && i12 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
            }
            if (i13 != length && i14 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            if (this.f29344a.isEmpty() && this.f29345b.isEmpty() && this.f29346c.length() == 0) {
                return true;
            }
            return false;
        }
    }

    public a(String str, int i6) {
        int i10;
        if ("application/x-mp4-cea-608".equals(str)) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        this.f29328h = i10;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f29330j = 0;
                        this.f29329i = 0;
                    } else {
                        this.f29330j = 1;
                        this.f29329i = 1;
                    }
                } else {
                    this.f29330j = 0;
                    this.f29329i = 1;
                }
            } else {
                this.f29330j = 1;
                this.f29329i = 0;
            }
        } else {
            this.f29330j = 0;
            this.f29329i = 0;
        }
        l(0);
        k();
        this.f29342w = true;
        this.f29343x = -9223372036854775807L;
    }

    @Override // q8.c
    public final d f() {
        List<p8.a> list = this.f29334n;
        this.f29335o = list;
        list.getClass();
        return new d(0, list);
    }

    @Override // q8.c, r7.d
    public final void flush() {
        super.flush();
        this.f29334n = null;
        this.f29335o = null;
        l(0);
        this.f29337q = 4;
        this.f29333m.f29350h = 4;
        k();
        this.r = false;
        this.f29338s = false;
        this.f29339t = (byte) 0;
        this.f29340u = (byte) 0;
        this.f29341v = 0;
        this.f29342w = true;
        this.f29343x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    @Override // q8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(c.a aVar) {
        byte q10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        int i6;
        boolean z26;
        int i10;
        boolean z27;
        ByteBuffer byteBuffer = aVar.f6360w;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        q qVar = this.f29327g;
        qVar.y(array, limit);
        boolean z28 = false;
        while (true) {
            int i11 = qVar.f5188c - qVar.f5187b;
            int i12 = this.f29328h;
            if (i11 >= i12) {
                if (i12 == 2) {
                    q10 = -4;
                } else {
                    q10 = (byte) qVar.q();
                }
                int q11 = qVar.q();
                int q12 = qVar.q();
                if ((q10 & 2) == 0 && (q10 & 1) == this.f29329i) {
                    byte b10 = (byte) (q11 & 127);
                    byte b11 = (byte) (q12 & 127);
                    if (b10 != 0 || b11 != 0) {
                        boolean z29 = this.r;
                        if ((q10 & 4) == 4) {
                            boolean[] zArr = F;
                            if (zArr[q11] && zArr[q12]) {
                                z10 = true;
                                this.r = z10;
                                if (z10) {
                                    if ((b10 & 240) == 16) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    if (z27) {
                                        if (this.f29338s && this.f29339t == b10 && this.f29340u == b11) {
                                            this.f29338s = false;
                                            z11 = true;
                                            if (!z11) {
                                            }
                                        } else {
                                            this.f29338s = true;
                                            this.f29339t = b10;
                                            this.f29340u = b11;
                                            z11 = false;
                                            if (!z11) {
                                                if (!z10) {
                                                    if (z29) {
                                                        k();
                                                        z28 = true;
                                                    }
                                                } else {
                                                    if (1 <= b10 && b10 <= 15) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (z12) {
                                                        this.f29342w = false;
                                                    } else {
                                                        if ((b10 & 247) == 20) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        if (z13) {
                                                            if (b11 != 32 && b11 != 47) {
                                                                switch (b11) {
                                                                    default:
                                                                        switch (b11) {
                                                                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                                            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                                                                this.f29342w = false;
                                                                                break;
                                                                        }
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        this.f29342w = true;
                                                                        break;
                                                                }
                                                            }
                                                            this.f29342w = true;
                                                        }
                                                    }
                                                    if (this.f29342w) {
                                                        int i13 = b10 & 224;
                                                        if (i13 == 0) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14) {
                                                            this.f29341v = (b10 >> 3) & 1;
                                                        }
                                                        if (this.f29341v == this.f29330j) {
                                                            z15 = true;
                                                        } else {
                                                            z15 = false;
                                                        }
                                                        if (z15) {
                                                            if (i13 == 0) {
                                                                z16 = true;
                                                            } else {
                                                                z16 = false;
                                                            }
                                                            if (z16) {
                                                                int i14 = b10 & 247;
                                                                if (i14 == 17 && (b11 & 240) == 48) {
                                                                    z17 = true;
                                                                } else {
                                                                    z17 = false;
                                                                }
                                                                if (z17) {
                                                                    this.f29333m.a((char) C[b11 & 15]);
                                                                } else {
                                                                    int i15 = b10 & 246;
                                                                    if (i15 == 18 && (b11 & 224) == 32) {
                                                                        z18 = true;
                                                                    } else {
                                                                        z18 = false;
                                                                    }
                                                                    if (z18) {
                                                                        this.f29333m.b();
                                                                        C0494a c0494a = this.f29333m;
                                                                        if ((b10 & 1) == 0) {
                                                                            i10 = D[b11 & 31];
                                                                        } else {
                                                                            i10 = E[b11 & 31];
                                                                        }
                                                                        c0494a.a((char) i10);
                                                                    } else {
                                                                        if (i14 == 17 && (b11 & 240) == 32) {
                                                                            z19 = true;
                                                                        } else {
                                                                            z19 = false;
                                                                        }
                                                                        if (z19) {
                                                                            this.f29333m.a(' ');
                                                                            if ((b11 & 1) == 1) {
                                                                                z26 = true;
                                                                            } else {
                                                                                z26 = false;
                                                                            }
                                                                            C0494a c0494a2 = this.f29333m;
                                                                            c0494a2.f29344a.add(new C0494a.C0495a((b11 >> 1) & 7, c0494a2.f29346c.length(), z26));
                                                                        } else {
                                                                            if ((b10 & 240) == 16 && (b11 & 192) == 64) {
                                                                                z20 = true;
                                                                            } else {
                                                                                z20 = false;
                                                                            }
                                                                            if (z20) {
                                                                                int i16 = f29325y[b10 & 7];
                                                                                if ((b11 & 32) != 0) {
                                                                                    z23 = true;
                                                                                } else {
                                                                                    z23 = false;
                                                                                }
                                                                                if (z23) {
                                                                                    i16++;
                                                                                }
                                                                                C0494a c0494a3 = this.f29333m;
                                                                                if (i16 != c0494a3.f29347d) {
                                                                                    if (this.f29336p != 1 && !c0494a3.e()) {
                                                                                        C0494a c0494a4 = new C0494a(this.f29336p, this.f29337q);
                                                                                        this.f29333m = c0494a4;
                                                                                        this.f29332l.add(c0494a4);
                                                                                    }
                                                                                    this.f29333m.f29347d = i16;
                                                                                }
                                                                                if ((b11 & 16) == 16) {
                                                                                    z24 = true;
                                                                                } else {
                                                                                    z24 = false;
                                                                                }
                                                                                if ((b11 & 1) == 1) {
                                                                                    z25 = true;
                                                                                } else {
                                                                                    z25 = false;
                                                                                }
                                                                                int i17 = (b11 >> 1) & 7;
                                                                                C0494a c0494a5 = this.f29333m;
                                                                                if (z24) {
                                                                                    i6 = 8;
                                                                                } else {
                                                                                    i6 = i17;
                                                                                }
                                                                                c0494a5.f29344a.add(new C0494a.C0495a(i6, c0494a5.f29346c.length(), z25));
                                                                                if (z24) {
                                                                                    this.f29333m.f29348e = f29326z[i17];
                                                                                }
                                                                            } else {
                                                                                if (i14 == 23 && b11 >= 33 && b11 <= 35) {
                                                                                    z21 = true;
                                                                                } else {
                                                                                    z21 = false;
                                                                                }
                                                                                if (z21) {
                                                                                    this.f29333m.f = b11 - 32;
                                                                                } else {
                                                                                    if (i15 == 20 && (b11 & 240) == 32) {
                                                                                        z22 = true;
                                                                                    } else {
                                                                                        z22 = false;
                                                                                    }
                                                                                    if (z22) {
                                                                                        if (b11 != 32) {
                                                                                            if (b11 != 41) {
                                                                                                switch (b11) {
                                                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                                                        l(1);
                                                                                                        this.f29337q = 2;
                                                                                                        this.f29333m.f29350h = 2;
                                                                                                        break;
                                                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                                                        l(1);
                                                                                                        this.f29337q = 3;
                                                                                                        this.f29333m.f29350h = 3;
                                                                                                        break;
                                                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                                                        l(1);
                                                                                                        this.f29337q = 4;
                                                                                                        this.f29333m.f29350h = 4;
                                                                                                        break;
                                                                                                    default:
                                                                                                        int i18 = this.f29336p;
                                                                                                        if (i18 != 0) {
                                                                                                            if (b11 != 33) {
                                                                                                                switch (b11) {
                                                                                                                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                                                                                                        this.f29334n = Collections.emptyList();
                                                                                                                        int i19 = this.f29336p;
                                                                                                                        if (i19 == 1 || i19 == 3) {
                                                                                                                            k();
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                                                        if (i18 == 1 && !this.f29333m.e()) {
                                                                                                                            C0494a c0494a6 = this.f29333m;
                                                                                                                            ArrayList arrayList = c0494a6.f29345b;
                                                                                                                            arrayList.add(c0494a6.d());
                                                                                                                            c0494a6.f29346c.setLength(0);
                                                                                                                            c0494a6.f29344a.clear();
                                                                                                                            int min = Math.min(c0494a6.f29350h, c0494a6.f29347d);
                                                                                                                            while (arrayList.size() >= min) {
                                                                                                                                arrayList.remove(0);
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                                                        k();
                                                                                                                        break;
                                                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                                                        this.f29334n = j();
                                                                                                                        k();
                                                                                                                        break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                this.f29333m.b();
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                            } else {
                                                                                                l(3);
                                                                                            }
                                                                                        } else {
                                                                                            l(2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                C0494a c0494a7 = this.f29333m;
                                                                int[] iArr = B;
                                                                c0494a7.a((char) iArr[(b10 & Byte.MAX_VALUE) - 32]);
                                                                if ((b11 & 224) != 0) {
                                                                    this.f29333m.a((char) iArr[(b11 & Byte.MAX_VALUE) - 32]);
                                                                }
                                                            }
                                                            z28 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                this.f29338s = false;
                                z11 = false;
                                if (!z11) {
                                }
                            }
                        }
                        z10 = false;
                        this.r = z10;
                        if (z10) {
                        }
                        this.f29338s = false;
                        z11 = false;
                        if (!z11) {
                        }
                    }
                }
            } else if (z28) {
                int i20 = this.f29336p;
                if (i20 == 1 || i20 == 3) {
                    this.f29334n = j();
                    this.f29343x = this.f29399e;
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // q8.c, r7.d
    /* renamed from: h */
    public final p8.k c() {
        boolean z10;
        p8.k pollFirst;
        p8.k c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        long j10 = this.f29331k;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f29343x;
            if (j11 != -9223372036854775807L && this.f29399e - j11 >= j10) {
                z10 = true;
                if (!z10 && (pollFirst = this.f29396b.pollFirst()) != null) {
                    this.f29334n = Collections.emptyList();
                    this.f29343x = -9223372036854775807L;
                    pollFirst.p(this.f29399e, f(), Long.MAX_VALUE);
                    return pollFirst;
                }
            }
        }
        z10 = false;
        return !z10 ? null : null;
    }

    @Override // q8.c
    public final boolean i() {
        if (this.f29334n != this.f29335o) {
            return true;
        }
        return false;
    }

    public final List<p8.a> j() {
        ArrayList<C0494a> arrayList = this.f29332l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i6 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            p8.a c10 = arrayList.get(i10).c(LinearLayoutManager.INVALID_OFFSET);
            arrayList2.add(c10);
            if (c10 != null) {
                i6 = Math.min(i6, c10.C);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            p8.a aVar = (p8.a) arrayList2.get(i11);
            if (aVar != null) {
                if (aVar.C != i6) {
                    aVar = arrayList.get(i11).c(i6);
                    aVar.getClass();
                }
                arrayList3.add(aVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        C0494a c0494a = this.f29333m;
        c0494a.f29349g = this.f29336p;
        c0494a.f29344a.clear();
        c0494a.f29345b.clear();
        c0494a.f29346c.setLength(0);
        c0494a.f29347d = 15;
        c0494a.f29348e = 0;
        c0494a.f = 0;
        ArrayList<C0494a> arrayList = this.f29332l;
        arrayList.clear();
        arrayList.add(this.f29333m);
    }

    public final void l(int i6) {
        int i10 = this.f29336p;
        if (i10 == i6) {
            return;
        }
        this.f29336p = i6;
        if (i6 == 3) {
            int i11 = 0;
            while (true) {
                ArrayList<C0494a> arrayList = this.f29332l;
                if (i11 < arrayList.size()) {
                    arrayList.get(i11).f29349g = i6;
                    i11++;
                } else {
                    return;
                }
            }
        } else {
            k();
            if (i10 == 3 || i6 == 1 || i6 == 0) {
                this.f29334n = Collections.emptyList();
            }
        }
    }

    @Override // q8.c, r7.d
    public final void a() {
    }
}
