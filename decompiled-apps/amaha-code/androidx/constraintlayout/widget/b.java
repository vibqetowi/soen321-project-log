package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import tr.r;
/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1811g = {0, 4, 8};

    /* renamed from: h  reason: collision with root package name */
    public static final SparseIntArray f1812h;

    /* renamed from: i  reason: collision with root package name */
    public static final SparseIntArray f1813i;

    /* renamed from: a  reason: collision with root package name */
    public String f1814a;

    /* renamed from: b  reason: collision with root package name */
    public String f1815b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f1816c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, b0.a> f1817d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1818e = true;
    public final HashMap<Integer, a> f = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1819a;

        /* renamed from: b  reason: collision with root package name */
        public String f1820b;

        /* renamed from: c  reason: collision with root package name */
        public final d f1821c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final c f1822d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final C0027b f1823e = new C0027b();
        public final e f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, b0.a> f1824g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public C0026a f1825h;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0026a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f1826a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1827b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1828c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1829d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1830e = new float[10];
            public int f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f1831g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1832h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f1833i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1834j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f1835k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1836l = 0;

            public final void a(float f, int i6) {
                int i10 = this.f;
                int[] iArr = this.f1829d;
                if (i10 >= iArr.length) {
                    this.f1829d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1830e;
                    this.f1830e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1829d;
                int i11 = this.f;
                iArr2[i11] = i6;
                float[] fArr2 = this.f1830e;
                this.f = i11 + 1;
                fArr2[i11] = f;
            }

            public final void b(int i6, int i10) {
                int i11 = this.f1828c;
                int[] iArr = this.f1826a;
                if (i11 >= iArr.length) {
                    this.f1826a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1827b;
                    this.f1827b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1826a;
                int i12 = this.f1828c;
                iArr3[i12] = i6;
                int[] iArr4 = this.f1827b;
                this.f1828c = i12 + 1;
                iArr4[i12] = i10;
            }

            public final void c(int i6, String str) {
                int i10 = this.f1833i;
                int[] iArr = this.f1831g;
                if (i10 >= iArr.length) {
                    this.f1831g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1832h;
                    this.f1832h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1831g;
                int i11 = this.f1833i;
                iArr2[i11] = i6;
                String[] strArr2 = this.f1832h;
                this.f1833i = i11 + 1;
                strArr2[i11] = str;
            }

            public final void d(int i6, boolean z10) {
                int i10 = this.f1836l;
                int[] iArr = this.f1834j;
                if (i10 >= iArr.length) {
                    this.f1834j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1835k;
                    this.f1835k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1834j;
                int i11 = this.f1836l;
                iArr2[i11] = i6;
                boolean[] zArr2 = this.f1835k;
                this.f1836l = i11 + 1;
                zArr2[i11] = z10;
            }

            public final void e(a aVar) {
                for (int i6 = 0; i6 < this.f1828c; i6++) {
                    int i10 = this.f1826a[i6];
                    int i11 = this.f1827b[i6];
                    int[] iArr = b.f1811g;
                    if (i10 != 6) {
                        if (i10 != 7) {
                            if (i10 != 8) {
                                if (i10 != 27) {
                                    if (i10 != 28) {
                                        if (i10 != 41) {
                                            if (i10 != 42) {
                                                if (i10 != 61) {
                                                    if (i10 != 62) {
                                                        if (i10 != 72) {
                                                            if (i10 != 73) {
                                                                if (i10 != 2) {
                                                                    if (i10 != 31) {
                                                                        if (i10 != 34) {
                                                                            if (i10 != 38) {
                                                                                if (i10 != 64) {
                                                                                    if (i10 != 66) {
                                                                                        if (i10 != 76) {
                                                                                            if (i10 != 78) {
                                                                                                if (i10 != 97) {
                                                                                                    if (i10 != 93) {
                                                                                                        if (i10 != 94) {
                                                                                                            switch (i10) {
                                                                                                                case 11:
                                                                                                                    aVar.f1823e.Q = i11;
                                                                                                                    continue;
                                                                                                                case 12:
                                                                                                                    aVar.f1823e.R = i11;
                                                                                                                    continue;
                                                                                                                case 13:
                                                                                                                    aVar.f1823e.N = i11;
                                                                                                                    continue;
                                                                                                                case 14:
                                                                                                                    aVar.f1823e.P = i11;
                                                                                                                    continue;
                                                                                                                case 15:
                                                                                                                    aVar.f1823e.S = i11;
                                                                                                                    continue;
                                                                                                                case 16:
                                                                                                                    aVar.f1823e.O = i11;
                                                                                                                    continue;
                                                                                                                case 17:
                                                                                                                    aVar.f1823e.f1845e = i11;
                                                                                                                    continue;
                                                                                                                case 18:
                                                                                                                    aVar.f1823e.f = i11;
                                                                                                                    continue;
                                                                                                                default:
                                                                                                                    switch (i10) {
                                                                                                                        case 21:
                                                                                                                            aVar.f1823e.f1843d = i11;
                                                                                                                            continue;
                                                                                                                        case 22:
                                                                                                                            aVar.f1821c.f1890b = i11;
                                                                                                                            continue;
                                                                                                                        case 23:
                                                                                                                            aVar.f1823e.f1842c = i11;
                                                                                                                            continue;
                                                                                                                        case 24:
                                                                                                                            aVar.f1823e.G = i11;
                                                                                                                            continue;
                                                                                                                        default:
                                                                                                                            switch (i10) {
                                                                                                                                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                                                                                                                    aVar.f1823e.Y = i11;
                                                                                                                                    continue;
                                                                                                                                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                                                                                                                    aVar.f1823e.Z = i11;
                                                                                                                                    continue;
                                                                                                                                case R.styleable.AppCompatTheme_colorError /* 56 */:
                                                                                                                                    aVar.f1823e.f1839a0 = i11;
                                                                                                                                    continue;
                                                                                                                                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                                                                                                                    aVar.f1823e.f1841b0 = i11;
                                                                                                                                    continue;
                                                                                                                                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                                                                                                                    aVar.f1823e.c0 = i11;
                                                                                                                                    continue;
                                                                                                                                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                                                                                                                    aVar.f1823e.f1844d0 = i11;
                                                                                                                                    continue;
                                                                                                                                default:
                                                                                                                                    switch (i10) {
                                                                                                                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                                                                                                                            aVar.f1822d.f1879c = i11;
                                                                                                                                            continue;
                                                                                                                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                                                                                                                            aVar.f.f1902i = i11;
                                                                                                                                            continue;
                                                                                                                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                                                                                                                            aVar.f1822d.f1885j = i11;
                                                                                                                                            continue;
                                                                                                                                        default:
                                                                                                                                            switch (i10) {
                                                                                                                                                case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                                                                                                                                    aVar.f1822d.f1887l = i11;
                                                                                                                                                    continue;
                                                                                                                                                case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                                                                                                                                    aVar.f1822d.f1888m = i11;
                                                                                                                                                    continue;
                                                                                                                                                default:
                                                                                                                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                                                                                                    continue;
                                                                                                                                            }
                                                                                                                                    }
                                                                                                                            }
                                                                                                                    }
                                                                                                            }
                                                                                                        } else {
                                                                                                            aVar.f1823e.T = i11;
                                                                                                        }
                                                                                                    } else {
                                                                                                        aVar.f1823e.M = i11;
                                                                                                    }
                                                                                                } else {
                                                                                                    aVar.f1823e.f1866p0 = i11;
                                                                                                }
                                                                                            } else {
                                                                                                aVar.f1821c.f1891c = i11;
                                                                                            }
                                                                                        } else {
                                                                                            aVar.f1822d.f1881e = i11;
                                                                                        }
                                                                                    } else {
                                                                                        aVar.f1822d.f = i11;
                                                                                    }
                                                                                } else {
                                                                                    aVar.f1822d.f1878b = i11;
                                                                                }
                                                                            } else {
                                                                                aVar.f1819a = i11;
                                                                            }
                                                                        } else {
                                                                            aVar.f1823e.I = i11;
                                                                        }
                                                                    } else {
                                                                        aVar.f1823e.L = i11;
                                                                    }
                                                                } else {
                                                                    aVar.f1823e.J = i11;
                                                                }
                                                            } else {
                                                                aVar.f1823e.f1850h0 = i11;
                                                            }
                                                        } else {
                                                            aVar.f1823e.f1848g0 = i11;
                                                        }
                                                    } else {
                                                        aVar.f1823e.B = i11;
                                                    }
                                                } else {
                                                    aVar.f1823e.A = i11;
                                                }
                                            } else {
                                                aVar.f1823e.X = i11;
                                            }
                                        } else {
                                            aVar.f1823e.W = i11;
                                        }
                                    } else {
                                        aVar.f1823e.H = i11;
                                    }
                                } else {
                                    aVar.f1823e.F = i11;
                                }
                            } else {
                                aVar.f1823e.K = i11;
                            }
                        } else {
                            aVar.f1823e.E = i11;
                        }
                    } else {
                        aVar.f1823e.D = i11;
                    }
                }
                for (int i12 = 0; i12 < this.f; i12++) {
                    int i13 = this.f1829d[i12];
                    float f = this.f1830e[i12];
                    int[] iArr2 = b.f1811g;
                    if (i13 != 19) {
                        if (i13 != 20) {
                            if (i13 != 37) {
                                if (i13 != 60) {
                                    if (i13 != 63) {
                                        if (i13 != 79) {
                                            if (i13 != 85) {
                                                if (i13 != 87) {
                                                    if (i13 != 39) {
                                                        if (i13 != 40) {
                                                            switch (i13) {
                                                                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                                                    aVar.f1821c.f1892d = f;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                                                    e eVar = aVar.f;
                                                                    eVar.f1907n = f;
                                                                    eVar.f1906m = true;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                    aVar.f.f1897c = f;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                    aVar.f.f1898d = f;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                    aVar.f.f1899e = f;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                                                    aVar.f.f = f;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                                                    aVar.f.f1900g = f;
                                                                    continue;
                                                                case 50:
                                                                    aVar.f.f1901h = f;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                                    aVar.f.f1903j = f;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                                    aVar.f.f1904k = f;
                                                                    continue;
                                                                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                                                    aVar.f.f1905l = f;
                                                                    continue;
                                                                default:
                                                                    switch (i13) {
                                                                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                                                            aVar.f1822d.f1883h = f;
                                                                            continue;
                                                                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                                                            aVar.f1821c.f1893e = f;
                                                                            continue;
                                                                        case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                                                            aVar.f1823e.e0 = f;
                                                                            continue;
                                                                        case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                                                            aVar.f1823e.f1846f0 = f;
                                                                            continue;
                                                                        default:
                                                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                            continue;
                                                                            continue;
                                                                    }
                                                            }
                                                        } else {
                                                            aVar.f1823e.U = f;
                                                        }
                                                    } else {
                                                        aVar.f1823e.V = f;
                                                    }
                                                }
                                            } else {
                                                aVar.f1822d.f1884i = f;
                                            }
                                        } else {
                                            aVar.f1822d.f1882g = f;
                                        }
                                    } else {
                                        aVar.f1823e.C = f;
                                    }
                                } else {
                                    aVar.f.f1896b = f;
                                }
                            } else {
                                aVar.f1823e.f1874y = f;
                            }
                        } else {
                            aVar.f1823e.f1873x = f;
                        }
                    } else {
                        aVar.f1823e.f1847g = f;
                    }
                }
                for (int i14 = 0; i14 < this.f1833i; i14++) {
                    int i15 = this.f1831g[i14];
                    String str = this.f1832h[i14];
                    int[] iArr3 = b.f1811g;
                    if (i15 != 5) {
                        if (i15 != 65) {
                            if (i15 != 74) {
                                if (i15 != 77) {
                                    if (i15 != 87) {
                                        if (i15 != 90) {
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                        } else {
                                            aVar.f1822d.f1886k = str;
                                        }
                                    }
                                } else {
                                    aVar.f1823e.f1858l0 = str;
                                }
                            } else {
                                C0027b c0027b = aVar.f1823e;
                                c0027b.f1856k0 = str;
                                c0027b.f1854j0 = null;
                            }
                        } else {
                            aVar.f1822d.f1880d = str;
                        }
                    } else {
                        aVar.f1823e.f1875z = str;
                    }
                }
                for (int i16 = 0; i16 < this.f1836l; i16++) {
                    int i17 = this.f1834j[i16];
                    boolean z10 = this.f1835k[i16];
                    int[] iArr4 = b.f1811g;
                    if (i17 != 44) {
                        if (i17 != 75) {
                            if (i17 != 87) {
                                if (i17 != 80) {
                                    if (i17 != 81) {
                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                    } else {
                                        aVar.f1823e.f1862n0 = z10;
                                    }
                                } else {
                                    aVar.f1823e.f1860m0 = z10;
                                }
                            }
                        } else {
                            aVar.f1823e.f1864o0 = z10;
                        }
                    } else {
                        aVar.f.f1906m = z10;
                    }
                }
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            C0027b c0027b = this.f1823e;
            aVar.f1764e = c0027b.f1851i;
            aVar.f = c0027b.f1853j;
            aVar.f1766g = c0027b.f1855k;
            aVar.f1768h = c0027b.f1857l;
            aVar.f1770i = c0027b.f1859m;
            aVar.f1772j = c0027b.f1861n;
            aVar.f1774k = c0027b.f1863o;
            aVar.f1776l = c0027b.f1865p;
            aVar.f1778m = c0027b.f1867q;
            aVar.f1780n = c0027b.r;
            aVar.f1782o = c0027b.f1868s;
            aVar.f1788s = c0027b.f1869t;
            aVar.f1789t = c0027b.f1870u;
            aVar.f1790u = c0027b.f1871v;
            aVar.f1791v = c0027b.f1872w;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = c0027b.G;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = c0027b.H;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = c0027b.I;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = c0027b.J;
            aVar.A = c0027b.S;
            aVar.B = c0027b.R;
            aVar.f1793x = c0027b.O;
            aVar.f1795z = c0027b.Q;
            aVar.E = c0027b.f1873x;
            aVar.F = c0027b.f1874y;
            aVar.f1784p = c0027b.A;
            aVar.f1786q = c0027b.B;
            aVar.r = c0027b.C;
            aVar.G = c0027b.f1875z;
            aVar.T = c0027b.D;
            aVar.U = c0027b.E;
            aVar.I = c0027b.U;
            aVar.H = c0027b.V;
            aVar.K = c0027b.X;
            aVar.J = c0027b.W;
            aVar.W = c0027b.f1860m0;
            aVar.X = c0027b.f1862n0;
            aVar.L = c0027b.Y;
            aVar.M = c0027b.Z;
            aVar.P = c0027b.f1839a0;
            aVar.Q = c0027b.f1841b0;
            aVar.N = c0027b.c0;
            aVar.O = c0027b.f1844d0;
            aVar.R = c0027b.e0;
            aVar.S = c0027b.f1846f0;
            aVar.V = c0027b.F;
            aVar.f1761c = c0027b.f1847g;
            aVar.f1757a = c0027b.f1845e;
            aVar.f1759b = c0027b.f;
            ((ViewGroup.MarginLayoutParams) aVar).width = c0027b.f1842c;
            ((ViewGroup.MarginLayoutParams) aVar).height = c0027b.f1843d;
            String str = c0027b.f1858l0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = c0027b.f1866p0;
            aVar.setMarginStart(c0027b.L);
            aVar.setMarginEnd(c0027b.K);
            aVar.a();
        }

        /* renamed from: b */
        public final a clone() {
            a aVar = new a();
            aVar.f1823e.a(this.f1823e);
            aVar.f1822d.a(this.f1822d);
            d dVar = aVar.f1821c;
            dVar.getClass();
            d dVar2 = this.f1821c;
            dVar.f1889a = dVar2.f1889a;
            dVar.f1890b = dVar2.f1890b;
            dVar.f1892d = dVar2.f1892d;
            dVar.f1893e = dVar2.f1893e;
            dVar.f1891c = dVar2.f1891c;
            aVar.f.a(this.f);
            aVar.f1819a = this.f1819a;
            aVar.f1825h = this.f1825h;
            return aVar;
        }

        public final void c(int i6, ConstraintLayout.a aVar) {
            this.f1819a = i6;
            int i10 = aVar.f1764e;
            C0027b c0027b = this.f1823e;
            c0027b.f1851i = i10;
            c0027b.f1853j = aVar.f;
            c0027b.f1855k = aVar.f1766g;
            c0027b.f1857l = aVar.f1768h;
            c0027b.f1859m = aVar.f1770i;
            c0027b.f1861n = aVar.f1772j;
            c0027b.f1863o = aVar.f1774k;
            c0027b.f1865p = aVar.f1776l;
            c0027b.f1867q = aVar.f1778m;
            c0027b.r = aVar.f1780n;
            c0027b.f1868s = aVar.f1782o;
            c0027b.f1869t = aVar.f1788s;
            c0027b.f1870u = aVar.f1789t;
            c0027b.f1871v = aVar.f1790u;
            c0027b.f1872w = aVar.f1791v;
            c0027b.f1873x = aVar.E;
            c0027b.f1874y = aVar.F;
            c0027b.f1875z = aVar.G;
            c0027b.A = aVar.f1784p;
            c0027b.B = aVar.f1786q;
            c0027b.C = aVar.r;
            c0027b.D = aVar.T;
            c0027b.E = aVar.U;
            c0027b.F = aVar.V;
            c0027b.f1847g = aVar.f1761c;
            c0027b.f1845e = aVar.f1757a;
            c0027b.f = aVar.f1759b;
            c0027b.f1842c = ((ViewGroup.MarginLayoutParams) aVar).width;
            c0027b.f1843d = ((ViewGroup.MarginLayoutParams) aVar).height;
            c0027b.G = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            c0027b.H = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            c0027b.I = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            c0027b.J = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            c0027b.M = aVar.D;
            c0027b.U = aVar.I;
            c0027b.V = aVar.H;
            c0027b.X = aVar.K;
            c0027b.W = aVar.J;
            c0027b.f1860m0 = aVar.W;
            c0027b.f1862n0 = aVar.X;
            c0027b.Y = aVar.L;
            c0027b.Z = aVar.M;
            c0027b.f1839a0 = aVar.P;
            c0027b.f1841b0 = aVar.Q;
            c0027b.c0 = aVar.N;
            c0027b.f1844d0 = aVar.O;
            c0027b.e0 = aVar.R;
            c0027b.f1846f0 = aVar.S;
            c0027b.f1858l0 = aVar.Y;
            c0027b.O = aVar.f1793x;
            c0027b.Q = aVar.f1795z;
            c0027b.N = aVar.f1792w;
            c0027b.P = aVar.f1794y;
            c0027b.S = aVar.A;
            c0027b.R = aVar.B;
            c0027b.T = aVar.C;
            c0027b.f1866p0 = aVar.Z;
            c0027b.K = aVar.getMarginEnd();
            c0027b.L = aVar.getMarginStart();
        }

        public final void d(int i6, c.a aVar) {
            c(i6, aVar);
            this.f1821c.f1892d = aVar.f1909r0;
            float f = aVar.f1912u0;
            e eVar = this.f;
            eVar.f1896b = f;
            eVar.f1897c = aVar.f1913v0;
            eVar.f1898d = aVar.f1914w0;
            eVar.f1899e = aVar.f1915x0;
            eVar.f = aVar.f1916y0;
            eVar.f1900g = aVar.f1917z0;
            eVar.f1901h = aVar.A0;
            eVar.f1903j = aVar.B0;
            eVar.f1904k = aVar.C0;
            eVar.f1905l = aVar.D0;
            eVar.f1907n = aVar.f1911t0;
            eVar.f1906m = aVar.f1910s0;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0027b {

        /* renamed from: q0  reason: collision with root package name */
        public static final SparseIntArray f1837q0;

        /* renamed from: c  reason: collision with root package name */
        public int f1842c;

        /* renamed from: d  reason: collision with root package name */
        public int f1843d;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f1854j0;

        /* renamed from: k0  reason: collision with root package name */
        public String f1856k0;

        /* renamed from: l0  reason: collision with root package name */
        public String f1858l0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1838a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1840b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f1845e = -1;
        public int f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f1847g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1849h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f1851i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1853j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1855k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f1857l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f1859m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f1861n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f1863o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f1865p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f1867q = -1;
        public int r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1868s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1869t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1870u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1871v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1872w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f1873x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public float f1874y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f1875z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = LinearLayoutManager.INVALID_OFFSET;
        public int O = LinearLayoutManager.INVALID_OFFSET;
        public int P = LinearLayoutManager.INVALID_OFFSET;
        public int Q = LinearLayoutManager.INVALID_OFFSET;
        public int R = LinearLayoutManager.INVALID_OFFSET;
        public int S = LinearLayoutManager.INVALID_OFFSET;
        public int T = LinearLayoutManager.INVALID_OFFSET;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f1839a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f1841b0 = 0;
        public int c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f1844d0 = 0;
        public float e0 = 1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public float f1846f0 = 1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f1848g0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1850h0 = 0;

        /* renamed from: i0  reason: collision with root package name */
        public int f1852i0 = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f1860m0 = false;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1862n0 = false;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f1864o0 = true;

        /* renamed from: p0  reason: collision with root package name */
        public int f1866p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1837q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(C0027b c0027b) {
            this.f1838a = c0027b.f1838a;
            this.f1842c = c0027b.f1842c;
            this.f1840b = c0027b.f1840b;
            this.f1843d = c0027b.f1843d;
            this.f1845e = c0027b.f1845e;
            this.f = c0027b.f;
            this.f1847g = c0027b.f1847g;
            this.f1849h = c0027b.f1849h;
            this.f1851i = c0027b.f1851i;
            this.f1853j = c0027b.f1853j;
            this.f1855k = c0027b.f1855k;
            this.f1857l = c0027b.f1857l;
            this.f1859m = c0027b.f1859m;
            this.f1861n = c0027b.f1861n;
            this.f1863o = c0027b.f1863o;
            this.f1865p = c0027b.f1865p;
            this.f1867q = c0027b.f1867q;
            this.r = c0027b.r;
            this.f1868s = c0027b.f1868s;
            this.f1869t = c0027b.f1869t;
            this.f1870u = c0027b.f1870u;
            this.f1871v = c0027b.f1871v;
            this.f1872w = c0027b.f1872w;
            this.f1873x = c0027b.f1873x;
            this.f1874y = c0027b.f1874y;
            this.f1875z = c0027b.f1875z;
            this.A = c0027b.A;
            this.B = c0027b.B;
            this.C = c0027b.C;
            this.D = c0027b.D;
            this.E = c0027b.E;
            this.F = c0027b.F;
            this.G = c0027b.G;
            this.H = c0027b.H;
            this.I = c0027b.I;
            this.J = c0027b.J;
            this.K = c0027b.K;
            this.L = c0027b.L;
            this.M = c0027b.M;
            this.N = c0027b.N;
            this.O = c0027b.O;
            this.P = c0027b.P;
            this.Q = c0027b.Q;
            this.R = c0027b.R;
            this.S = c0027b.S;
            this.T = c0027b.T;
            this.U = c0027b.U;
            this.V = c0027b.V;
            this.W = c0027b.W;
            this.X = c0027b.X;
            this.Y = c0027b.Y;
            this.Z = c0027b.Z;
            this.f1839a0 = c0027b.f1839a0;
            this.f1841b0 = c0027b.f1841b0;
            this.c0 = c0027b.c0;
            this.f1844d0 = c0027b.f1844d0;
            this.e0 = c0027b.e0;
            this.f1846f0 = c0027b.f1846f0;
            this.f1848g0 = c0027b.f1848g0;
            this.f1850h0 = c0027b.f1850h0;
            this.f1852i0 = c0027b.f1852i0;
            this.f1858l0 = c0027b.f1858l0;
            int[] iArr = c0027b.f1854j0;
            if (iArr != null && c0027b.f1856k0 == null) {
                this.f1854j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1854j0 = null;
            }
            this.f1856k0 = c0027b.f1856k0;
            this.f1860m0 = c0027b.f1860m0;
            this.f1862n0 = c0027b.f1862n0;
            this.f1864o0 = c0027b.f1864o0;
            this.f1866p0 = c0027b.f1866p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.H);
            this.f1840b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                SparseIntArray sparseIntArray = f1837q0;
                int i10 = sparseIntArray.get(index);
                switch (i10) {
                    case 1:
                        this.f1867q = b.o(obtainStyledAttributes, index, this.f1867q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.f1865p = b.o(obtainStyledAttributes, index, this.f1865p);
                        break;
                    case 4:
                        this.f1863o = b.o(obtainStyledAttributes, index, this.f1863o);
                        break;
                    case 5:
                        this.f1875z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.f1872w = b.o(obtainStyledAttributes, index, this.f1872w);
                        break;
                    case 10:
                        this.f1871v = b.o(obtainStyledAttributes, index, this.f1871v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f1845e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1845e);
                        break;
                    case 18:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.f1847g = obtainStyledAttributes.getFloat(index, this.f1847g);
                        break;
                    case 20:
                        this.f1873x = obtainStyledAttributes.getFloat(index, this.f1873x);
                        break;
                    case 21:
                        this.f1843d = obtainStyledAttributes.getLayoutDimension(index, this.f1843d);
                        break;
                    case 22:
                        this.f1842c = obtainStyledAttributes.getLayoutDimension(index, this.f1842c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.f1851i = b.o(obtainStyledAttributes, index, this.f1851i);
                        break;
                    case 25:
                        this.f1853j = b.o(obtainStyledAttributes, index, this.f1853j);
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.f1855k = b.o(obtainStyledAttributes, index, this.f1855k);
                        break;
                    case 29:
                        this.f1857l = b.o(obtainStyledAttributes, index, this.f1857l);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        this.f1869t = b.o(obtainStyledAttributes, index, this.f1869t);
                        break;
                    case 32:
                        this.f1870u = b.o(obtainStyledAttributes, index, this.f1870u);
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        this.f1861n = b.o(obtainStyledAttributes, index, this.f1861n);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        this.f1859m = b.o(obtainStyledAttributes, index, this.f1859m);
                        break;
                    case 36:
                        this.f1874y = obtainStyledAttributes.getFloat(index, this.f1874y);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        b.p(this, obtainStyledAttributes, index, 0);
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        b.p(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i10) {
                            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                this.A = b.o(obtainStyledAttributes, index, this.A);
                                continue;
                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                switch (i10) {
                                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                        this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                        this.f1846f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                        this.f1848g0 = obtainStyledAttributes.getInt(index, this.f1848g0);
                                        continue;
                                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                                        this.f1850h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1850h0);
                                        continue;
                                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                        this.f1856k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                        this.f1864o0 = obtainStyledAttributes.getBoolean(index, this.f1864o0);
                                        continue;
                                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                        this.f1866p0 = obtainStyledAttributes.getInt(index, this.f1866p0);
                                        continue;
                                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                        this.r = b.o(obtainStyledAttributes, index, this.r);
                                        continue;
                                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                        this.f1868s = b.o(obtainStyledAttributes, index, this.f1868s);
                                        continue;
                                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                        this.f1841b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1841b0);
                                        continue;
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                        this.f1839a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1839a0);
                                        continue;
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                                        this.f1844d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1844d0);
                                        continue;
                                    case 86:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        continue;
                                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                        this.f1860m0 = obtainStyledAttributes.getBoolean(index, this.f1860m0);
                                        continue;
                                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                        this.f1862n0 = obtainStyledAttributes.getBoolean(index, this.f1862n0);
                                        continue;
                                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                        this.f1858l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f1849h = obtainStyledAttributes.getBoolean(index, this.f1849h);
                                        continue;
                                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        continue;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: n  reason: collision with root package name */
        public static final SparseIntArray f1876n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1877a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1878b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f1879c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f1880d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1881e = -1;
        public int f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f1882g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f1883h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f1884i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public int f1885j = -1;

        /* renamed from: k  reason: collision with root package name */
        public String f1886k = null;

        /* renamed from: l  reason: collision with root package name */
        public int f1887l = -3;

        /* renamed from: m  reason: collision with root package name */
        public int f1888m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1876n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(c cVar) {
            this.f1877a = cVar.f1877a;
            this.f1878b = cVar.f1878b;
            this.f1880d = cVar.f1880d;
            this.f1881e = cVar.f1881e;
            this.f = cVar.f;
            this.f1883h = cVar.f1883h;
            this.f1882g = cVar.f1882g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.I);
            this.f1877a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                switch (f1876n.get(index)) {
                    case 1:
                        this.f1883h = obtainStyledAttributes.getFloat(index, this.f1883h);
                        break;
                    case 2:
                        this.f1881e = obtainStyledAttributes.getInt(index, this.f1881e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1880d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f1880d = w.c.f36203c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1878b = b.o(obtainStyledAttributes, index, this.f1878b);
                        break;
                    case 6:
                        this.f1879c = obtainStyledAttributes.getInteger(index, this.f1879c);
                        break;
                    case 7:
                        this.f1882g = obtainStyledAttributes.getFloat(index, this.f1882g);
                        break;
                    case 8:
                        this.f1885j = obtainStyledAttributes.getInteger(index, this.f1885j);
                        break;
                    case 9:
                        this.f1884i = obtainStyledAttributes.getFloat(index, this.f1884i);
                        break;
                    case 10:
                        int i10 = obtainStyledAttributes.peekValue(index).type;
                        if (i10 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1888m = resourceId;
                            if (resourceId != -1) {
                                this.f1887l = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i10 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f1886k = string;
                            if (string.indexOf("/") > 0) {
                                this.f1888m = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1887l = -2;
                                break;
                            } else {
                                this.f1887l = -1;
                                break;
                            }
                        } else {
                            this.f1887l = obtainStyledAttributes.getInteger(index, this.f1888m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1889a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1890b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1891c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f1892d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1893e = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.O);
            this.f1889a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 1) {
                    this.f1892d = obtainStyledAttributes.getFloat(index, this.f1892d);
                } else if (index == 0) {
                    int i10 = obtainStyledAttributes.getInt(index, this.f1890b);
                    this.f1890b = i10;
                    this.f1890b = b.f1811g[i10];
                } else if (index == 4) {
                    this.f1891c = obtainStyledAttributes.getInt(index, this.f1891c);
                } else if (index == 3) {
                    this.f1893e = obtainStyledAttributes.getFloat(index, this.f1893e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: o  reason: collision with root package name */
        public static final SparseIntArray f1894o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1895a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f1896b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1897c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1898d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1899e = 1.0f;
        public float f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1900g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f1901h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f1902i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1903j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1904k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1905l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1906m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f1907n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1894o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.f1895a = eVar.f1895a;
            this.f1896b = eVar.f1896b;
            this.f1897c = eVar.f1897c;
            this.f1898d = eVar.f1898d;
            this.f1899e = eVar.f1899e;
            this.f = eVar.f;
            this.f1900g = eVar.f1900g;
            this.f1901h = eVar.f1901h;
            this.f1902i = eVar.f1902i;
            this.f1903j = eVar.f1903j;
            this.f1904k = eVar.f1904k;
            this.f1905l = eVar.f1905l;
            this.f1906m = eVar.f1906m;
            this.f1907n = eVar.f1907n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.R);
            this.f1895a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                switch (f1894o.get(index)) {
                    case 1:
                        this.f1896b = obtainStyledAttributes.getFloat(index, this.f1896b);
                        break;
                    case 2:
                        this.f1897c = obtainStyledAttributes.getFloat(index, this.f1897c);
                        break;
                    case 3:
                        this.f1898d = obtainStyledAttributes.getFloat(index, this.f1898d);
                        break;
                    case 4:
                        this.f1899e = obtainStyledAttributes.getFloat(index, this.f1899e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.f1900g = obtainStyledAttributes.getDimension(index, this.f1900g);
                        break;
                    case 7:
                        this.f1901h = obtainStyledAttributes.getDimension(index, this.f1901h);
                        break;
                    case 8:
                        this.f1903j = obtainStyledAttributes.getDimension(index, this.f1903j);
                        break;
                    case 9:
                        this.f1904k = obtainStyledAttributes.getDimension(index, this.f1904k);
                        break;
                    case 10:
                        this.f1905l = obtainStyledAttributes.getDimension(index, this.f1905l);
                        break;
                    case 11:
                        this.f1906m = true;
                        this.f1907n = obtainStyledAttributes.getDimension(index, this.f1907n);
                        break;
                    case 12:
                        this.f1902i = b.o(obtainStyledAttributes, index, this.f1902i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1812h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1813i = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(R.styleable.AppCompatTheme_switchStyle, 6);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 13);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 16);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 14);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 11);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 15);
        sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMinor, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedWidthMajor, 67);
        sparseIntArray.append(R.styleable.AppCompatTheme_toolbarStyle, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(R.styleable.AppCompatTheme_textColorSearchUrl, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(R.styleable.AppCompatTheme_tooltipForegroundColor, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedWidthMinor, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(R.styleable.AppCompatTheme_viewInflaterClass, 82);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowFixedHeightMajor, 83);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionModeOverlay, 84);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBarOverlay, 85);
        sparseIntArray.append(R.styleable.AppCompatTheme_windowActionBar, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 83);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceListItem, 84);
        sparseIntArray2.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 85);
        sparseIntArray2.append(R.styleable.AppCompatTheme_switchStyle, 86);
        sparseIntArray2.append(94, 97);
    }

    public static a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, r.f33566z);
        r(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] i(Barrier barrier, String str) {
        int i6;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            Integer num = null;
            try {
                i6 = b0.d.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i6 = 0;
            }
            if (i6 == 0) {
                i6 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i6 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.G) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.G.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i6 = num.intValue();
                }
            }
            iArr[i11] = i6;
            i10++;
            i11++;
        }
        if (i11 != split.length) {
            return Arrays.copyOf(iArr, i11);
        }
        return iArr;
    }

    public static a j(Context context, AttributeSet attributeSet, boolean z10) {
        int[] iArr;
        a aVar = new a();
        if (z10) {
            iArr = r.f33566z;
        } else {
            iArr = r.f33564x;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z10) {
            r(aVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i6 = 0;
            while (true) {
                C0027b c0027b = aVar.f1823e;
                if (i6 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i6);
                    d dVar = aVar.f1821c;
                    e eVar = aVar.f;
                    c cVar = aVar.f1822d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.f1877a = true;
                        c0027b.f1840b = true;
                        dVar.f1889a = true;
                        eVar.f1895a = true;
                    }
                    SparseIntArray sparseIntArray = f1812h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            c0027b.f1867q = o(obtainStyledAttributes, index, c0027b.f1867q);
                            break;
                        case 2:
                            c0027b.J = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.J);
                            break;
                        case 3:
                            c0027b.f1865p = o(obtainStyledAttributes, index, c0027b.f1865p);
                            break;
                        case 4:
                            c0027b.f1863o = o(obtainStyledAttributes, index, c0027b.f1863o);
                            break;
                        case 5:
                            c0027b.f1875z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            c0027b.D = obtainStyledAttributes.getDimensionPixelOffset(index, c0027b.D);
                            break;
                        case 7:
                            c0027b.E = obtainStyledAttributes.getDimensionPixelOffset(index, c0027b.E);
                            break;
                        case 8:
                            c0027b.K = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.K);
                            break;
                        case 9:
                            c0027b.f1872w = o(obtainStyledAttributes, index, c0027b.f1872w);
                            break;
                        case 10:
                            c0027b.f1871v = o(obtainStyledAttributes, index, c0027b.f1871v);
                            break;
                        case 11:
                            c0027b.Q = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.Q);
                            break;
                        case 12:
                            c0027b.R = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.R);
                            break;
                        case 13:
                            c0027b.N = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.N);
                            break;
                        case 14:
                            c0027b.P = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.P);
                            break;
                        case 15:
                            c0027b.S = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.S);
                            break;
                        case 16:
                            c0027b.O = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.O);
                            break;
                        case 17:
                            c0027b.f1845e = obtainStyledAttributes.getDimensionPixelOffset(index, c0027b.f1845e);
                            break;
                        case 18:
                            c0027b.f = obtainStyledAttributes.getDimensionPixelOffset(index, c0027b.f);
                            break;
                        case 19:
                            c0027b.f1847g = obtainStyledAttributes.getFloat(index, c0027b.f1847g);
                            break;
                        case 20:
                            c0027b.f1873x = obtainStyledAttributes.getFloat(index, c0027b.f1873x);
                            break;
                        case 21:
                            c0027b.f1843d = obtainStyledAttributes.getLayoutDimension(index, c0027b.f1843d);
                            break;
                        case 22:
                            dVar.f1890b = f1811g[obtainStyledAttributes.getInt(index, dVar.f1890b)];
                            break;
                        case 23:
                            c0027b.f1842c = obtainStyledAttributes.getLayoutDimension(index, c0027b.f1842c);
                            break;
                        case 24:
                            c0027b.G = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.G);
                            break;
                        case 25:
                            c0027b.f1851i = o(obtainStyledAttributes, index, c0027b.f1851i);
                            break;
                        case 26:
                            c0027b.f1853j = o(obtainStyledAttributes, index, c0027b.f1853j);
                            break;
                        case 27:
                            c0027b.F = obtainStyledAttributes.getInt(index, c0027b.F);
                            break;
                        case 28:
                            c0027b.H = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.H);
                            break;
                        case 29:
                            c0027b.f1855k = o(obtainStyledAttributes, index, c0027b.f1855k);
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            c0027b.f1857l = o(obtainStyledAttributes, index, c0027b.f1857l);
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            c0027b.L = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.L);
                            break;
                        case 32:
                            c0027b.f1869t = o(obtainStyledAttributes, index, c0027b.f1869t);
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            c0027b.f1870u = o(obtainStyledAttributes, index, c0027b.f1870u);
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            c0027b.I = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.I);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            c0027b.f1861n = o(obtainStyledAttributes, index, c0027b.f1861n);
                            break;
                        case 36:
                            c0027b.f1859m = o(obtainStyledAttributes, index, c0027b.f1859m);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            c0027b.f1874y = obtainStyledAttributes.getFloat(index, c0027b.f1874y);
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            aVar.f1819a = obtainStyledAttributes.getResourceId(index, aVar.f1819a);
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            c0027b.V = obtainStyledAttributes.getFloat(index, c0027b.V);
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            c0027b.U = obtainStyledAttributes.getFloat(index, c0027b.U);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            c0027b.W = obtainStyledAttributes.getInt(index, c0027b.W);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            c0027b.X = obtainStyledAttributes.getInt(index, c0027b.X);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            dVar.f1892d = obtainStyledAttributes.getFloat(index, dVar.f1892d);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            eVar.f1906m = true;
                            eVar.f1907n = obtainStyledAttributes.getDimension(index, eVar.f1907n);
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            eVar.f1897c = obtainStyledAttributes.getFloat(index, eVar.f1897c);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            eVar.f1898d = obtainStyledAttributes.getFloat(index, eVar.f1898d);
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            eVar.f1899e = obtainStyledAttributes.getFloat(index, eVar.f1899e);
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            eVar.f = obtainStyledAttributes.getFloat(index, eVar.f);
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            eVar.f1900g = obtainStyledAttributes.getDimension(index, eVar.f1900g);
                            break;
                        case 50:
                            eVar.f1901h = obtainStyledAttributes.getDimension(index, eVar.f1901h);
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            eVar.f1903j = obtainStyledAttributes.getDimension(index, eVar.f1903j);
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            eVar.f1904k = obtainStyledAttributes.getDimension(index, eVar.f1904k);
                            break;
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            eVar.f1905l = obtainStyledAttributes.getDimension(index, eVar.f1905l);
                            break;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            c0027b.Y = obtainStyledAttributes.getInt(index, c0027b.Y);
                            break;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            c0027b.Z = obtainStyledAttributes.getInt(index, c0027b.Z);
                            break;
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            c0027b.f1839a0 = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.f1839a0);
                            break;
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            c0027b.f1841b0 = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.f1841b0);
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            c0027b.c0 = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.c0);
                            break;
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            c0027b.f1844d0 = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.f1844d0);
                            break;
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            eVar.f1896b = obtainStyledAttributes.getFloat(index, eVar.f1896b);
                            break;
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            c0027b.A = o(obtainStyledAttributes, index, c0027b.A);
                            break;
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            c0027b.B = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.B);
                            break;
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            c0027b.C = obtainStyledAttributes.getFloat(index, c0027b.C);
                            break;
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            cVar.f1878b = o(obtainStyledAttributes, index, cVar.f1878b);
                            break;
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            if (obtainStyledAttributes.peekValue(index).type == 3) {
                                cVar.f1880d = obtainStyledAttributes.getString(index);
                                break;
                            } else {
                                cVar.f1880d = w.c.f36203c[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            }
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            cVar.f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            cVar.f1883h = obtainStyledAttributes.getFloat(index, cVar.f1883h);
                            break;
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            dVar.f1893e = obtainStyledAttributes.getFloat(index, dVar.f1893e);
                            break;
                        case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                            c0027b.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                            c0027b.f1846f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                            c0027b.f1848g0 = obtainStyledAttributes.getInt(index, c0027b.f1848g0);
                            break;
                        case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                            c0027b.f1850h0 = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.f1850h0);
                            break;
                        case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                            c0027b.f1856k0 = obtainStyledAttributes.getString(index);
                            break;
                        case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                            c0027b.f1864o0 = obtainStyledAttributes.getBoolean(index, c0027b.f1864o0);
                            break;
                        case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                            cVar.f1881e = obtainStyledAttributes.getInt(index, cVar.f1881e);
                            break;
                        case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                            c0027b.f1858l0 = obtainStyledAttributes.getString(index);
                            break;
                        case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                            dVar.f1891c = obtainStyledAttributes.getInt(index, dVar.f1891c);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                            cVar.f1882g = obtainStyledAttributes.getFloat(index, cVar.f1882g);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                            c0027b.f1860m0 = obtainStyledAttributes.getBoolean(index, c0027b.f1860m0);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                            c0027b.f1862n0 = obtainStyledAttributes.getBoolean(index, c0027b.f1862n0);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                            cVar.f1879c = obtainStyledAttributes.getInteger(index, cVar.f1879c);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                            eVar.f1902i = o(obtainStyledAttributes, index, eVar.f1902i);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                            cVar.f1885j = obtainStyledAttributes.getInteger(index, cVar.f1885j);
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                            cVar.f1884i = obtainStyledAttributes.getFloat(index, cVar.f1884i);
                            break;
                        case 86:
                            int i10 = obtainStyledAttributes.peekValue(index).type;
                            if (i10 == 1) {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                cVar.f1888m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    cVar.f1887l = -2;
                                    break;
                                }
                            } else if (i10 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                cVar.f1886k = string;
                                if (string.indexOf("/") > 0) {
                                    cVar.f1888m = obtainStyledAttributes.getResourceId(index, -1);
                                    cVar.f1887l = -2;
                                    break;
                                } else {
                                    cVar.f1887l = -1;
                                    break;
                                }
                            } else {
                                cVar.f1887l = obtainStyledAttributes.getInteger(index, cVar.f1888m);
                                break;
                            }
                        case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                            c0027b.r = o(obtainStyledAttributes, index, c0027b.r);
                            break;
                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            c0027b.f1868s = o(obtainStyledAttributes, index, c0027b.f1868s);
                            break;
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            c0027b.M = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.M);
                            break;
                        case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                            c0027b.T = obtainStyledAttributes.getDimensionPixelSize(index, c0027b.T);
                            break;
                        case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                            p(c0027b, obtainStyledAttributes, index, 0);
                            break;
                        case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                            p(c0027b, obtainStyledAttributes, index, 1);
                            break;
                        case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                            c0027b.f1866p0 = obtainStyledAttributes.getInt(index, c0027b.f1866p0);
                            break;
                    }
                    i6++;
                } else if (c0027b.f1856k0 != null) {
                    c0027b.f1854j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int o(TypedArray typedArray, int i6, int i10) {
        int resourceId = typedArray.getResourceId(i6, i10);
        if (resourceId == -1) {
            return typedArray.getInt(i6, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r9 == (-1)) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p(Object obj, TypedArray typedArray, int i6, int i10) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i11 = typedArray.peekValue(i6).type;
        boolean z10 = true;
        int i12 = 0;
        if (i11 != 3) {
            if (i11 != 5) {
                dimensionPixelSize = typedArray.getInt(i6, 0);
                if (dimensionPixelSize != -4) {
                    if (dimensionPixelSize != -3) {
                        if (dimensionPixelSize != -2) {
                        }
                    }
                    z10 = false;
                    if (obj instanceof ConstraintLayout.a) {
                        ConstraintLayout.a aVar = (ConstraintLayout.a) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) aVar).width = i12;
                            aVar.W = z10;
                            return;
                        }
                        ((ViewGroup.MarginLayoutParams) aVar).height = i12;
                        aVar.X = z10;
                        return;
                    } else if (obj instanceof C0027b) {
                        C0027b c0027b = (C0027b) obj;
                        if (i10 == 0) {
                            c0027b.f1842c = i12;
                            c0027b.f1860m0 = z10;
                            return;
                        }
                        c0027b.f1843d = i12;
                        c0027b.f1862n0 = z10;
                        return;
                    } else if (obj instanceof a.C0026a) {
                        a.C0026a c0026a = (a.C0026a) obj;
                        if (i10 == 0) {
                            c0026a.b(23, i12);
                            c0026a.d(80, z10);
                            return;
                        }
                        c0026a.b(21, i12);
                        c0026a.d(81, z10);
                        return;
                    } else {
                        return;
                    }
                }
                i12 = -2;
                if (obj instanceof ConstraintLayout.a) {
                }
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i6, 0);
            }
            i12 = dimensionPixelSize;
            z10 = false;
            if (obj instanceof ConstraintLayout.a) {
            }
        } else {
            String string = typedArray.getString(i6);
            if (string != null) {
                int indexOf = string.indexOf(61);
                int length = string.length();
                if (indexOf > 0 && indexOf < length - 1) {
                    String substring = string.substring(0, indexOf);
                    String substring2 = string.substring(indexOf + 1);
                    if (substring2.length() > 0) {
                        String trim = substring.trim();
                        String trim2 = substring2.trim();
                        if ("ratio".equalsIgnoreCase(trim)) {
                            if (obj instanceof ConstraintLayout.a) {
                                ConstraintLayout.a aVar2 = (ConstraintLayout.a) obj;
                                if (i10 == 0) {
                                    ((ViewGroup.MarginLayoutParams) aVar2).width = 0;
                                } else {
                                    ((ViewGroup.MarginLayoutParams) aVar2).height = 0;
                                }
                                q(aVar2, trim2);
                                return;
                            } else if (obj instanceof C0027b) {
                                ((C0027b) obj).f1875z = trim2;
                                return;
                            } else if (obj instanceof a.C0026a) {
                                ((a.C0026a) obj).c(5, trim2);
                                return;
                            } else {
                                return;
                            }
                        }
                        try {
                            if ("weight".equalsIgnoreCase(trim)) {
                                float parseFloat = Float.parseFloat(trim2);
                                if (obj instanceof ConstraintLayout.a) {
                                    ConstraintLayout.a aVar3 = (ConstraintLayout.a) obj;
                                    if (i10 == 0) {
                                        ((ViewGroup.MarginLayoutParams) aVar3).width = 0;
                                        aVar3.H = parseFloat;
                                    } else {
                                        ((ViewGroup.MarginLayoutParams) aVar3).height = 0;
                                        aVar3.I = parseFloat;
                                    }
                                } else if (obj instanceof C0027b) {
                                    C0027b c0027b2 = (C0027b) obj;
                                    if (i10 == 0) {
                                        c0027b2.f1842c = 0;
                                        c0027b2.V = parseFloat;
                                    } else {
                                        c0027b2.f1843d = 0;
                                        c0027b2.U = parseFloat;
                                    }
                                } else if (obj instanceof a.C0026a) {
                                    a.C0026a c0026a2 = (a.C0026a) obj;
                                    if (i10 == 0) {
                                        c0026a2.b(23, 0);
                                        c0026a2.a(parseFloat, 39);
                                    } else {
                                        c0026a2.b(21, 0);
                                        c0026a2.a(parseFloat, 40);
                                    }
                                }
                            } else if ("parent".equalsIgnoreCase(trim)) {
                                float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                                if (obj instanceof ConstraintLayout.a) {
                                    ConstraintLayout.a aVar4 = (ConstraintLayout.a) obj;
                                    if (i10 == 0) {
                                        ((ViewGroup.MarginLayoutParams) aVar4).width = 0;
                                        aVar4.R = max;
                                        aVar4.L = 2;
                                    } else {
                                        ((ViewGroup.MarginLayoutParams) aVar4).height = 0;
                                        aVar4.S = max;
                                        aVar4.M = 2;
                                    }
                                } else if (obj instanceof C0027b) {
                                    C0027b c0027b3 = (C0027b) obj;
                                    if (i10 == 0) {
                                        c0027b3.f1842c = 0;
                                        c0027b3.e0 = max;
                                        c0027b3.Y = 2;
                                    } else {
                                        c0027b3.f1843d = 0;
                                        c0027b3.f1846f0 = max;
                                        c0027b3.Z = 2;
                                    }
                                } else if (obj instanceof a.C0026a) {
                                    a.C0026a c0026a3 = (a.C0026a) obj;
                                    if (i10 == 0) {
                                        c0026a3.b(23, 0);
                                        c0026a3.b(54, 2);
                                    } else {
                                        c0026a3.b(21, 0);
                                        c0026a3.b(55, 2);
                                    }
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
    }

    public static void q(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i6 = 0;
            int i10 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i6 = 1;
                    } else {
                        i6 = -1;
                    }
                }
                i10 = i6;
                i6 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i6, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i6);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public static void r(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0026a c0026a = new a.C0026a();
        aVar.f1825h = c0026a;
        c cVar = aVar.f1822d;
        cVar.f1877a = false;
        C0027b c0027b = aVar.f1823e;
        c0027b.f1840b = false;
        d dVar = aVar.f1821c;
        dVar.f1889a = false;
        e eVar = aVar.f;
        eVar.f1895a = false;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArray.getIndex(i6);
            int i10 = f1813i.get(index);
            SparseIntArray sparseIntArray = f1812h;
            switch (i10) {
                case 2:
                    c0026a.b(2, typedArray.getDimensionPixelSize(index, c0027b.J));
                    continue;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case 36:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                case 90:
                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    continue;
                case 5:
                    c0026a.c(5, typedArray.getString(index));
                    continue;
                case 6:
                    c0026a.b(6, typedArray.getDimensionPixelOffset(index, c0027b.D));
                    continue;
                case 7:
                    c0026a.b(7, typedArray.getDimensionPixelOffset(index, c0027b.E));
                    continue;
                case 8:
                    c0026a.b(8, typedArray.getDimensionPixelSize(index, c0027b.K));
                    continue;
                case 11:
                    c0026a.b(11, typedArray.getDimensionPixelSize(index, c0027b.Q));
                    continue;
                case 12:
                    c0026a.b(12, typedArray.getDimensionPixelSize(index, c0027b.R));
                    continue;
                case 13:
                    c0026a.b(13, typedArray.getDimensionPixelSize(index, c0027b.N));
                    continue;
                case 14:
                    c0026a.b(14, typedArray.getDimensionPixelSize(index, c0027b.P));
                    continue;
                case 15:
                    c0026a.b(15, typedArray.getDimensionPixelSize(index, c0027b.S));
                    continue;
                case 16:
                    c0026a.b(16, typedArray.getDimensionPixelSize(index, c0027b.O));
                    continue;
                case 17:
                    c0026a.b(17, typedArray.getDimensionPixelOffset(index, c0027b.f1845e));
                    continue;
                case 18:
                    c0026a.b(18, typedArray.getDimensionPixelOffset(index, c0027b.f));
                    continue;
                case 19:
                    c0026a.a(typedArray.getFloat(index, c0027b.f1847g), 19);
                    continue;
                case 20:
                    c0026a.a(typedArray.getFloat(index, c0027b.f1873x), 20);
                    continue;
                case 21:
                    c0026a.b(21, typedArray.getLayoutDimension(index, c0027b.f1843d));
                    continue;
                case 22:
                    c0026a.b(22, f1811g[typedArray.getInt(index, dVar.f1890b)]);
                    continue;
                case 23:
                    c0026a.b(23, typedArray.getLayoutDimension(index, c0027b.f1842c));
                    continue;
                case 24:
                    c0026a.b(24, typedArray.getDimensionPixelSize(index, c0027b.G));
                    continue;
                case 27:
                    c0026a.b(27, typedArray.getInt(index, c0027b.F));
                    continue;
                case 28:
                    c0026a.b(28, typedArray.getDimensionPixelSize(index, c0027b.H));
                    continue;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    c0026a.b(31, typedArray.getDimensionPixelSize(index, c0027b.L));
                    continue;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    c0026a.b(34, typedArray.getDimensionPixelSize(index, c0027b.I));
                    continue;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    c0026a.a(typedArray.getFloat(index, c0027b.f1874y), 37);
                    continue;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    int resourceId = typedArray.getResourceId(index, aVar.f1819a);
                    aVar.f1819a = resourceId;
                    c0026a.b(38, resourceId);
                    continue;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    c0026a.a(typedArray.getFloat(index, c0027b.V), 39);
                    continue;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    c0026a.a(typedArray.getFloat(index, c0027b.U), 40);
                    continue;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    c0026a.b(41, typedArray.getInt(index, c0027b.W));
                    continue;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    c0026a.b(42, typedArray.getInt(index, c0027b.X));
                    continue;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    c0026a.a(typedArray.getFloat(index, dVar.f1892d), 43);
                    continue;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    c0026a.d(44, true);
                    c0026a.a(typedArray.getDimension(index, eVar.f1907n), 44);
                    continue;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    c0026a.a(typedArray.getFloat(index, eVar.f1897c), 45);
                    continue;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    c0026a.a(typedArray.getFloat(index, eVar.f1898d), 46);
                    continue;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    c0026a.a(typedArray.getFloat(index, eVar.f1899e), 47);
                    continue;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    c0026a.a(typedArray.getFloat(index, eVar.f), 48);
                    continue;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    c0026a.a(typedArray.getDimension(index, eVar.f1900g), 49);
                    continue;
                case 50:
                    c0026a.a(typedArray.getDimension(index, eVar.f1901h), 50);
                    continue;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    c0026a.a(typedArray.getDimension(index, eVar.f1903j), 51);
                    continue;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    c0026a.a(typedArray.getDimension(index, eVar.f1904k), 52);
                    continue;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    c0026a.a(typedArray.getDimension(index, eVar.f1905l), 53);
                    continue;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    c0026a.b(54, typedArray.getInt(index, c0027b.Y));
                    continue;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    c0026a.b(55, typedArray.getInt(index, c0027b.Z));
                    continue;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    c0026a.b(56, typedArray.getDimensionPixelSize(index, c0027b.f1839a0));
                    continue;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    c0026a.b(57, typedArray.getDimensionPixelSize(index, c0027b.f1841b0));
                    continue;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    c0026a.b(58, typedArray.getDimensionPixelSize(index, c0027b.c0));
                    continue;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    c0026a.b(59, typedArray.getDimensionPixelSize(index, c0027b.f1844d0));
                    continue;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    c0026a.a(typedArray.getFloat(index, eVar.f1896b), 60);
                    continue;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    c0026a.b(62, typedArray.getDimensionPixelSize(index, c0027b.B));
                    continue;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    c0026a.a(typedArray.getFloat(index, c0027b.C), 63);
                    continue;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    c0026a.b(64, o(typedArray, index, cVar.f1878b));
                    continue;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        c0026a.c(65, typedArray.getString(index));
                        continue;
                    } else {
                        c0026a.c(65, w.c.f36203c[typedArray.getInteger(index, 0)]);
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    c0026a.b(66, typedArray.getInt(index, 0));
                    continue;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    c0026a.a(typedArray.getFloat(index, cVar.f1883h), 67);
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    c0026a.a(typedArray.getFloat(index, dVar.f1893e), 68);
                    break;
                case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    c0026a.a(typedArray.getFloat(index, 1.0f), 69);
                    break;
                case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                    c0026a.a(typedArray.getFloat(index, 1.0f), 70);
                    break;
                case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    c0026a.b(72, typedArray.getInt(index, c0027b.f1848g0));
                    break;
                case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                    c0026a.b(73, typedArray.getDimensionPixelSize(index, c0027b.f1850h0));
                    break;
                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    c0026a.c(74, typedArray.getString(index));
                    break;
                case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                    c0026a.d(75, typedArray.getBoolean(index, c0027b.f1864o0));
                    break;
                case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                    c0026a.b(76, typedArray.getInt(index, cVar.f1881e));
                    break;
                case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                    c0026a.c(77, typedArray.getString(index));
                    break;
                case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                    c0026a.b(78, typedArray.getInt(index, dVar.f1891c));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                    c0026a.a(typedArray.getFloat(index, cVar.f1882g), 79);
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    c0026a.d(80, typedArray.getBoolean(index, c0027b.f1860m0));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    c0026a.d(81, typedArray.getBoolean(index, c0027b.f1862n0));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    c0026a.b(82, typedArray.getInteger(index, cVar.f1879c));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    c0026a.b(83, o(typedArray, index, eVar.f1902i));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                    c0026a.b(84, typedArray.getInteger(index, cVar.f1885j));
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                    c0026a.a(typedArray.getFloat(index, cVar.f1884i), 85);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.f1888m = resourceId2;
                        c0026a.b(89, resourceId2);
                        if (cVar.f1888m != -1) {
                            cVar.f1887l = -2;
                            c0026a.b(88, -2);
                            break;
                        }
                    } else if (i11 == 3) {
                        String string = typedArray.getString(index);
                        cVar.f1886k = string;
                        c0026a.c(90, string);
                        if (cVar.f1886k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.f1888m = resourceId3;
                            c0026a.b(89, resourceId3);
                            cVar.f1887l = -2;
                            c0026a.b(88, -2);
                            break;
                        } else {
                            cVar.f1887l = -1;
                            c0026a.b(88, -1);
                            break;
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.f1888m);
                        cVar.f1887l = integer;
                        c0026a.b(88, integer);
                        break;
                    }
                    break;
                case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                    c0026a.b(93, typedArray.getDimensionPixelSize(index, c0027b.M));
                    break;
                case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                    c0026a.b(94, typedArray.getDimensionPixelSize(index, c0027b.T));
                    break;
                case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                    p(c0026a, typedArray, index, 0);
                    break;
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    p(c0026a, typedArray, index, 1);
                    break;
                case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    c0026a.b(97, typedArray.getInt(index, c0027b.f1866p0));
                    break;
                case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    if (MotionLayout.Y0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.f1819a);
                        aVar.f1819a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.f1820b = typedArray.getString(index);
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f1820b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f1819a = typedArray.getResourceId(index, aVar.f1819a);
                        break;
                    }
                    break;
                case 99:
                    c0026a.d(99, typedArray.getBoolean(index, c0027b.f1849h));
                    break;
            }
        }
    }

    public static String s(int i6) {
        switch (i6) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            int id2 = childAt.getId();
            HashMap<Integer, a> hashMap = this.f;
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + a0.a.d(childAt));
            } else if (this.f1818e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (hashMap.containsKey(Integer.valueOf(id2)) && (aVar = hashMap.get(Integer.valueOf(id2))) != null) {
                    b0.a.e(childAt, aVar.f1824g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.f;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + a0.a.d(childAt));
            } else if (this.f1818e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = hashMap.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                C0027b c0027b = aVar.f1823e;
                                c0027b.f1852i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(c0027b.f1848g0);
                                barrier.setMargin(c0027b.f1850h0);
                                barrier.setAllowsGoneWidget(c0027b.f1864o0);
                                int[] iArr = c0027b.f1854j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c0027b.f1856k0;
                                    if (str != null) {
                                        int[] i10 = i(barrier, str);
                                        c0027b.f1854j0 = i10;
                                        barrier.setReferencedIds(i10);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            b0.a.e(childAt, aVar.f1824g);
                            childAt.setLayoutParams(aVar2);
                            d dVar = aVar.f1821c;
                            if (dVar.f1891c == 0) {
                                childAt.setVisibility(dVar.f1890b);
                            }
                            childAt.setAlpha(dVar.f1892d);
                            e eVar = aVar.f;
                            childAt.setRotation(eVar.f1896b);
                            childAt.setRotationX(eVar.f1897c);
                            childAt.setRotationY(eVar.f1898d);
                            childAt.setScaleX(eVar.f1899e);
                            childAt.setScaleY(eVar.f);
                            if (eVar.f1902i != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(eVar.f1902i);
                                if (findViewById != null) {
                                    float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                    float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f1900g)) {
                                    childAt.setPivotX(eVar.f1900g);
                                }
                                if (!Float.isNaN(eVar.f1901h)) {
                                    childAt.setPivotY(eVar.f1901h);
                                }
                            }
                            childAt.setTranslationX(eVar.f1903j);
                            childAt.setTranslationY(eVar.f1904k);
                            childAt.setTranslationZ(eVar.f1905l);
                            if (eVar.f1906m) {
                                childAt.setElevation(eVar.f1907n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = hashMap.get(num);
            if (aVar3 != null) {
                C0027b c0027b2 = aVar3.f1823e;
                if (c0027b2.f1852i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0027b2.f1854j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0027b2.f1856k0;
                        if (str2 != null) {
                            int[] i11 = i(barrier2, str2);
                            c0027b2.f1854j0 = i11;
                            barrier2.setReferencedIds(i11);
                        }
                    }
                    barrier2.setType(c0027b2.f1848g0);
                    barrier2.setMargin(c0027b2.f1850h0);
                    b0.e eVar2 = ConstraintLayout.J;
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a();
                    barrier2.q();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (c0027b2.f1838a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    b0.e eVar3 = ConstraintLayout.J;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    aVar3.a(aVar5);
                    constraintLayout.addView(guideline, aVar5);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).j(constraintLayout);
            }
        }
    }

    public final void e(int i6, Context context) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i6, (ViewGroup) null));
    }

    public final void f(ConstraintLayout constraintLayout) {
        int i6;
        int i10;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = bVar.f;
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (bVar.f1818e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = hashMap.get(Integer.valueOf(id2));
            if (aVar2 == null) {
                i6 = childCount;
            } else {
                HashMap<String, b0.a> hashMap2 = bVar.f1817d;
                HashMap<String, b0.a> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    b0.a aVar3 = hashMap2.get(str);
                    try {
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        i10 = childCount;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        i10 = childCount;
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        i10 = childCount;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new b0.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        i10 = childCount;
                        try {
                            hashMap3.put(str, new b0.a(aVar3, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e13) {
                            e = e13;
                            e.printStackTrace();
                            childCount = i10;
                        } catch (NoSuchMethodException e14) {
                            e = e14;
                            e.printStackTrace();
                            childCount = i10;
                        } catch (InvocationTargetException e15) {
                            e = e15;
                            e.printStackTrace();
                            childCount = i10;
                        }
                        childCount = i10;
                    }
                }
                i6 = childCount;
                aVar2.f1824g = hashMap3;
                aVar2.c(id2, aVar);
                int visibility = childAt.getVisibility();
                d dVar = aVar2.f1821c;
                dVar.f1890b = visibility;
                dVar.f1892d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar2.f;
                eVar.f1896b = rotation;
                eVar.f1897c = childAt.getRotationX();
                eVar.f1898d = childAt.getRotationY();
                eVar.f1899e = childAt.getScaleX();
                eVar.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f1900g = pivotX;
                    eVar.f1901h = pivotY;
                }
                eVar.f1903j = childAt.getTranslationX();
                eVar.f1904k = childAt.getTranslationY();
                eVar.f1905l = childAt.getTranslationZ();
                if (eVar.f1906m) {
                    eVar.f1907n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    C0027b c0027b = aVar2.f1823e;
                    c0027b.f1864o0 = allowsGoneWidget;
                    c0027b.f1854j0 = barrier.getReferencedIds();
                    c0027b.f1848g0 = barrier.getType();
                    c0027b.f1850h0 = barrier.getMargin();
                }
            }
            i11++;
            bVar = this;
            childCount = i6;
        }
    }

    public final void g(int i6, int i10) {
        HashMap<Integer, a> hashMap = this.f;
        Integer valueOf = Integer.valueOf((int) com.theinnerhour.b2b.R.id.trackerLogActivitiesContainer);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new a());
        }
        a aVar = hashMap.get(valueOf);
        if (aVar == null) {
            return;
        }
        C0027b c0027b = aVar.f1823e;
        if (i10 == 4) {
            c0027b.f1865p = i6;
            c0027b.f1863o = -1;
            c0027b.f1867q = -1;
            c0027b.r = -1;
            c0027b.f1868s = -1;
        } else if (i10 == 3) {
            c0027b.f1863o = i6;
            c0027b.f1865p = -1;
            c0027b.f1867q = -1;
            c0027b.r = -1;
            c0027b.f1868s = -1;
        } else {
            throw new IllegalArgumentException("right to " + s(i10) + " undefined");
        }
        c0027b.J = 40;
    }

    public final void h(int i6, int i10, int i11, int i12) {
        HashMap<Integer, a> hashMap = this.f;
        if (!hashMap.containsKey(Integer.valueOf(i6))) {
            hashMap.put(Integer.valueOf(i6), new a());
        }
        a aVar = hashMap.get(Integer.valueOf(i6));
        if (aVar == null) {
            return;
        }
        C0027b c0027b = aVar.f1823e;
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    c0027b.f1851i = i11;
                    c0027b.f1853j = -1;
                    return;
                } else if (i12 == 2) {
                    c0027b.f1853j = i11;
                    c0027b.f1851i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + s(i12) + " undefined");
                }
            case 2:
                if (i12 == 1) {
                    c0027b.f1855k = i11;
                    c0027b.f1857l = -1;
                    return;
                } else if (i12 == 2) {
                    c0027b.f1857l = i11;
                    c0027b.f1855k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i12) + " undefined");
                }
            case 3:
                if (i12 == 3) {
                    c0027b.f1859m = i11;
                    c0027b.f1861n = -1;
                    c0027b.f1867q = -1;
                    c0027b.r = -1;
                    c0027b.f1868s = -1;
                    return;
                } else if (i12 == 4) {
                    c0027b.f1861n = i11;
                    c0027b.f1859m = -1;
                    c0027b.f1867q = -1;
                    c0027b.r = -1;
                    c0027b.f1868s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i12) + " undefined");
                }
            case 4:
                if (i12 == 4) {
                    c0027b.f1865p = i11;
                    c0027b.f1863o = -1;
                    c0027b.f1867q = -1;
                    c0027b.r = -1;
                    c0027b.f1868s = -1;
                    return;
                } else if (i12 == 3) {
                    c0027b.f1863o = i11;
                    c0027b.f1865p = -1;
                    c0027b.f1867q = -1;
                    c0027b.r = -1;
                    c0027b.f1868s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i12) + " undefined");
                }
            case 5:
                if (i12 == 5) {
                    c0027b.f1867q = i11;
                    c0027b.f1865p = -1;
                    c0027b.f1863o = -1;
                    c0027b.f1859m = -1;
                    c0027b.f1861n = -1;
                    return;
                } else if (i12 == 3) {
                    c0027b.r = i11;
                    c0027b.f1865p = -1;
                    c0027b.f1863o = -1;
                    c0027b.f1859m = -1;
                    c0027b.f1861n = -1;
                    return;
                } else if (i12 == 4) {
                    c0027b.f1868s = i11;
                    c0027b.f1865p = -1;
                    c0027b.f1863o = -1;
                    c0027b.f1859m = -1;
                    c0027b.f1861n = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i12) + " undefined");
                }
            case 6:
                if (i12 == 6) {
                    c0027b.f1870u = i11;
                    c0027b.f1869t = -1;
                    return;
                } else if (i12 == 7) {
                    c0027b.f1869t = i11;
                    c0027b.f1870u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i12) + " undefined");
                }
            case 7:
                if (i12 == 7) {
                    c0027b.f1872w = i11;
                    c0027b.f1871v = -1;
                    return;
                } else if (i12 == 6) {
                    c0027b.f1871v = i11;
                    c0027b.f1872w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i12) + " undefined");
                }
            default:
                throw new IllegalArgumentException(s(i10) + " to " + s(i12) + " unknown");
        }
    }

    public final a k(int i6) {
        HashMap<Integer, a> hashMap = this.f;
        if (!hashMap.containsKey(Integer.valueOf(i6))) {
            hashMap.put(Integer.valueOf(i6), new a());
        }
        return hashMap.get(Integer.valueOf(i6));
    }

    public final a l(int i6) {
        HashMap<Integer, a> hashMap = this.f;
        if (hashMap.containsKey(Integer.valueOf(i6))) {
            return hashMap.get(Integer.valueOf(i6));
        }
        return null;
    }

    public final void m(int i6, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        a j10 = j(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            j10.f1823e.f1838a = true;
                        }
                        this.f.put(Integer.valueOf(j10.f1819a), j10);
                        continue;
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cd, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Context context, XmlResourceParser xmlResourceParser) {
        a j10;
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c10 = 0;
                    char c11 = 2;
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            if (c10 != 0) {
                                if (c10 == 1 || c10 == 2 || c10 == 3) {
                                    this.f.put(Integer.valueOf(aVar.f1819a), aVar);
                                    aVar = null;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                j10 = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                                aVar = j10;
                                break;
                            case 1:
                                j10 = j(context, Xml.asAttributeSet(xmlResourceParser), true);
                                aVar = j10;
                                break;
                            case 2:
                                j10 = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                                C0027b c0027b = j10.f1823e;
                                c0027b.f1838a = true;
                                c0027b.f1840b = true;
                                aVar = j10;
                                break;
                            case 3:
                                j10 = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                                j10.f1823e.f1852i0 = 1;
                                aVar = j10;
                                break;
                            case 4:
                                if (aVar != null) {
                                    aVar.f1821c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case 5:
                                if (aVar != null) {
                                    aVar.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case 6:
                                if (aVar != null) {
                                    aVar.f1823e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case 7:
                                if (aVar != null) {
                                    aVar.f1822d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case '\b':
                            case '\t':
                                if (aVar != null) {
                                    b0.a.d(context, xmlResourceParser, aVar.f1824g);
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                        }
                    }
                } else {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
