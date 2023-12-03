package wu;

import com.appsflyer.R;
import dt.n;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TypeSubstitutor.java */
/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: b */
    public static final j1 f37255b = e(g1.f37244a);

    /* renamed from: a */
    public final g1 f37256a;

    /* compiled from: TypeSubstitutor.java */
    /* loaded from: classes2.dex */
    public static final class a extends Exception {
        public a() {
            super("Out-projection in in-position");
        }
    }

    public j1(g1 g1Var) {
        if (g1Var != null) {
            this.f37256a = g1Var;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 1 && i6 != 2 && i6 != 8 && i6 != 34 && i6 != 37) {
            switch (i6) {
                default:
                    switch (i6) {
                        default:
                            switch (i6) {
                                default:
                                    switch (i6) {
                                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i6 != 1 && i6 != 2 && i6 != 8 && i6 != 34 && i6 != 37) {
                switch (i6) {
                    default:
                        switch (i6) {
                            default:
                                switch (i6) {
                                    default:
                                        switch (i6) {
                                            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                break;
                                            default:
                                                i10 = 3;
                                                break;
                                        }
                                    case 29:
                                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                    case 32:
                                        i10 = 2;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                Object[] objArr = new Object[i10];
                switch (i6) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    case 32:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case 3:
                        objArr[0] = "first";
                        break;
                    case 4:
                        objArr[0] = "second";
                        break;
                    case 5:
                        objArr[0] = "substitutionContext";
                        break;
                    case 6:
                        objArr[0] = "context";
                        break;
                    case 7:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case 9:
                    case 14:
                        objArr[0] = "type";
                        break;
                    case 10:
                    case 15:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case 16:
                    case 17:
                    case 36:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case 26:
                        objArr[0] = "originalType";
                        break;
                    case 27:
                        objArr[0] = "substituted";
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        objArr[0] = "annotations";
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i6 == 1) {
                    if (i6 != 2) {
                        if (i6 != 8) {
                            if (i6 != 34) {
                                if (i6 != 37) {
                                    switch (i6) {
                                        case 11:
                                        case 12:
                                        case 13:
                                            objArr[1] = "safeSubstitute";
                                            break;
                                        default:
                                            switch (i6) {
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                    objArr[1] = "unsafeSubstitute";
                                                    break;
                                                default:
                                                    switch (i6) {
                                                        case 29:
                                                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                                        case 32:
                                                            objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                            break;
                                                        default:
                                                            switch (i6) {
                                                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                                    break;
                                                                default:
                                                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                                }
                                objArr[1] = "combine";
                            } else {
                                objArr[1] = "filterOutUnsafeVariance";
                            }
                        } else {
                            objArr[1] = "getSubstitution";
                        }
                    } else {
                        objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                    }
                } else {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                }
                switch (i6) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    case 32:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case 5:
                    case 6:
                    default:
                        objArr[2] = "create";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "safeSubstitute";
                        break;
                    case 14:
                    case 15:
                    case 16:
                        objArr[2] = "substitute";
                        break;
                    case 17:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case 26:
                    case 27:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case 36:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        objArr[2] = "combine";
                        break;
                }
                String format = String.format(str, objArr);
                if (i6 != 1 && i6 != 2 && i6 != 8 && i6 != 34 && i6 != 37) {
                    switch (i6) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i6) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    break;
                                default:
                                    switch (i6) {
                                        case 29:
                                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                        case 32:
                                            break;
                                        default:
                                            switch (i6) {
                                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i10 = 2;
            Object[] objArr2 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 1) {
            }
            switch (i6) {
            }
            String format2 = String.format(str, objArr2);
            if (i6 != 1) {
                switch (i6) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i6 != 1) {
            switch (i6) {
            }
            Object[] objArr22 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 1) {
            }
            switch (i6) {
            }
            String format22 = String.format(str, objArr22);
            if (i6 != 1) {
            }
            throw new IllegalStateException(format22);
        }
        i10 = 2;
        Object[] objArr222 = new Object[i10];
        switch (i6) {
        }
        if (i6 == 1) {
        }
        switch (i6) {
        }
        String format222 = String.format(str, objArr222);
        if (i6 != 1) {
        }
        throw new IllegalStateException(format222);
    }

    public static n1 b(n1 n1Var, n1 n1Var2) {
        if (n1Var != null) {
            if (n1Var2 != null) {
                n1 n1Var3 = n1.INVARIANT;
                if (n1Var == n1Var3) {
                    return n1Var2;
                }
                if (n1Var2 == n1Var3) {
                    return n1Var;
                }
                if (n1Var == n1Var2) {
                    return n1Var2;
                }
                throw new AssertionError("Variance conflict: type parameter variance '" + n1Var + "' and projection kind '" + n1Var2 + "' cannot be combined");
            }
            a(39);
            throw null;
        }
        a(38);
        throw null;
    }

    public static int c(n1 n1Var, n1 n1Var2) {
        n1 n1Var3 = n1.IN_VARIANCE;
        n1 n1Var4 = n1.OUT_VARIANCE;
        if (n1Var == n1Var3 && n1Var2 == n1Var4) {
            return 3;
        }
        if (n1Var == n1Var4 && n1Var2 == n1Var3) {
            return 2;
        }
        return 1;
    }

    public static j1 d(b0 b0Var) {
        if (b0Var != null) {
            return e(z0.f37326b.b(b0Var.O0(), b0Var.M0()));
        }
        a(6);
        throw null;
    }

    public static j1 e(g1 g1Var) {
        if (g1Var != null) {
            return new j1(g1Var);
        }
        a(0);
        throw null;
    }

    public static j1 f(g1 g1Var, g1 g1Var2) {
        if (g1Var != null) {
            if (g1Var2 != null) {
                int i6 = s.f37293d;
                if (g1Var.e()) {
                    g1Var = g1Var2;
                } else if (!g1Var2.e()) {
                    g1Var = new s(g1Var, g1Var2);
                }
                return e(g1Var);
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static String j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!ta.v.F(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    public final g1 g() {
        g1 g1Var = this.f37256a;
        if (g1Var != null) {
            return g1Var;
        }
        a(8);
        throw null;
    }

    public final boolean h() {
        return this.f37256a.e();
    }

    public final b0 i(b0 b0Var, n1 n1Var) {
        if (b0Var != null) {
            if (h()) {
                return b0Var;
            }
            try {
                b0 a10 = l(new f1(b0Var, n1Var), null, 0).a();
                if (a10 != null) {
                    return a10;
                }
                a(12);
                throw null;
            } catch (a e10) {
                return yu.i.c(yu.h.E, e10.getMessage());
            }
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x002c, code lost:
        if (r6.b() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b0 k(b0 b0Var, n1 n1Var) {
        f1 l2;
        f1 f1Var;
        if (b0Var != null) {
            if (n1Var != null) {
                d1 f1Var2 = new f1(g().f(b0Var, n1Var), n1Var);
                if (!h()) {
                    try {
                        f1Var2 = l(f1Var2, null, 0);
                    } catch (a unused) {
                        f1Var2 = null;
                    }
                }
                g1 g1Var = this.f37256a;
                if (!g1Var.a()) {
                    l2 = f1Var2;
                }
                boolean b10 = g1Var.b();
                if (f1Var2 != null) {
                    boolean d10 = f1Var2.d();
                    l2 = f1Var2;
                    if (!d10) {
                        b0 a10 = f1Var2.a();
                        kotlin.jvm.internal.i.f(a10, "typeProjection.type");
                        l2 = f1Var2;
                        if (k1.c(a10, bv.b.f4721u)) {
                            n1 b11 = f1Var2.b();
                            kotlin.jvm.internal.i.f(b11, "typeProjection.projectionKind");
                            if (b11 == n1.OUT_VARIANCE) {
                                f1Var = new f1((b0) kotlin.jvm.internal.h.e(a10).f4720b, b11);
                            } else if (b10) {
                                f1Var = new f1((b0) kotlin.jvm.internal.h.e(a10).f4719a, b11);
                            } else {
                                j1 e10 = e(new bv.c());
                                l2 = f1Var2;
                                if (!e10.h()) {
                                    try {
                                        l2 = e10.l(f1Var2, null, 0);
                                    } catch (a unused2) {
                                    }
                                }
                            }
                            l2 = f1Var;
                        }
                    }
                    if (l2 != null) {
                        return null;
                    }
                    return l2.a();
                }
                l2 = null;
                if (l2 != null) {
                }
            } else {
                a(15);
                throw null;
            }
        } else {
            a(14);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x0288, code lost:
        if (r0 != 2) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d1 l(d1 d1Var, gt.v0 v0Var, int i6) {
        wu.a aVar;
        i0 i0Var;
        j1 j1Var;
        m mVar;
        b0 k10;
        m mVar2;
        boolean z10;
        j1 j1Var2 = this;
        b0 b0Var = null;
        if (d1Var != null) {
            g1 g1Var = j1Var2.f37256a;
            if (i6 <= 100) {
                if (d1Var.d()) {
                    return d1Var;
                }
                b0 a10 = d1Var.a();
                if (a10 instanceof l1) {
                    l1 l1Var = (l1) a10;
                    m1 I0 = l1Var.I0();
                    b0 I = l1Var.I();
                    d1 l2 = j1Var2.l(new f1(I0, d1Var.b()), v0Var, i6 + 1);
                    if (l2.d()) {
                        return l2;
                    }
                    return new f1(ca.a.C1(l2.a().R0(), j1Var2.k(I, d1Var.b())), l2.b());
                }
                if (!ta.v.D(a10) && !(a10.R0() instanceof h0)) {
                    d1 d10 = g1Var.d(a10);
                    if (d10 != null) {
                        if (a10.getAnnotations().H(n.a.f13419y)) {
                            x0 O0 = d10.a().O0();
                            if (O0 instanceof xu.i) {
                                d1 d1Var2 = ((xu.i) O0).f38105a;
                                n1 b10 = d1Var2.b();
                                if (c(d1Var.b(), b10) == 3) {
                                    d10 = new f1(d1Var2.a());
                                } else if (v0Var != null && c(v0Var.O(), b10) == 3) {
                                    d10 = new f1(d1Var2.a());
                                }
                            }
                        }
                    } else {
                        d10 = null;
                    }
                    n1 b11 = d1Var.b();
                    int i10 = 0;
                    if (d10 == null && ca.a.J0(a10)) {
                        m1 R0 = a10.R0();
                        if (R0 instanceof m) {
                            mVar2 = (m) R0;
                        } else {
                            mVar2 = null;
                        }
                        if (mVar2 != null) {
                            z10 = mVar2.D0();
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            v m10 = ca.a.m(a10);
                            i0 i0Var2 = m10.f37298v;
                            int i11 = i6 + 1;
                            d1 l10 = j1Var2.l(new f1(i0Var2, b11), v0Var, i11);
                            i0 i0Var3 = m10.f37299w;
                            d1 l11 = j1Var2.l(new f1(i0Var3, b11), v0Var, i11);
                            n1 b12 = l10.b();
                            if (l10.a() == i0Var2 && l11.a() == i0Var3) {
                                return d1Var;
                            }
                            return new f1(c0.c(kotlin.jvm.internal.h.f(l10.a()), kotlin.jvm.internal.h.f(l11.a())), b12);
                        }
                    }
                    if (!dt.j.F(a10) && !ta.v.E(a10)) {
                        if (d10 != null) {
                            int c10 = c(b11, d10.b());
                            if (!(a10.O0() instanceof ju.b)) {
                                int d11 = v.h.d(c10);
                                if (d11 != 1) {
                                    if (d11 == 2) {
                                        throw new a();
                                    }
                                } else {
                                    return new f1(a10.O0().o().p(), n1.OUT_VARIANCE);
                                }
                            }
                            m1 R02 = a10.R0();
                            if (R02 instanceof m) {
                                mVar = (m) R02;
                            } else {
                                mVar = null;
                            }
                            if (mVar == null || !mVar.D0()) {
                                mVar = null;
                            }
                            if (d10.d()) {
                                return d10;
                            }
                            if (mVar != null) {
                                k10 = mVar.C0(d10.a());
                            } else {
                                k10 = k1.k(d10.a(), a10.P0());
                            }
                            if (!a10.getAnnotations().isEmpty()) {
                                ht.h c11 = g1Var.c(a10.getAnnotations());
                                if (c11 != null) {
                                    if (c11.H(n.a.f13419y)) {
                                        c11 = new ht.l(c11, new i1());
                                    }
                                    k10 = hc.d.f0(k10, new ht.k(k10.getAnnotations(), c11));
                                } else {
                                    a(33);
                                    throw null;
                                }
                            }
                            if (c10 == 1) {
                                b11 = b(b11, d10.b());
                            }
                            return new f1(k10, b11);
                        }
                        b0 a11 = d1Var.a();
                        n1 b13 = d1Var.b();
                        if (a11.O0().a() instanceof gt.v0) {
                            return d1Var;
                        }
                        m1 R03 = a11.R0();
                        if (R03 instanceof wu.a) {
                            aVar = (wu.a) R03;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            i0Var = aVar.f37200w;
                        } else {
                            i0Var = null;
                        }
                        n1 n1Var = n1.INVARIANT;
                        if (i0Var != null) {
                            if ((g1Var instanceof y) && g1Var.b()) {
                                y yVar = (y) g1Var;
                                j1Var = new j1(new y(yVar.f37315b, yVar.f37316c, false));
                            } else {
                                j1Var = j1Var2;
                            }
                            b0Var = j1Var.k(i0Var, n1Var);
                        }
                        List<gt.v0> parameters = a11.O0().getParameters();
                        List<d1> newArguments = a11.M0();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z11 = false;
                        while (i10 < parameters.size()) {
                            gt.v0 v0Var2 = parameters.get(i10);
                            d1 d1Var3 = newArguments.get(i10);
                            d1 l12 = j1Var2.l(d1Var3, v0Var2, i6 + 1);
                            int d12 = v.h.d(c(v0Var2.O(), l12.b()));
                            if (d12 != 0) {
                                if (d12 == 1) {
                                }
                                l12 = k1.m(v0Var2);
                            } else if (v0Var2.O() != n1Var && !l12.d()) {
                                l12 = new f1(l12.a(), n1Var);
                            }
                            if (l12 != d1Var3) {
                                z11 = true;
                            }
                            arrayList.add(l12);
                            i10++;
                            j1Var2 = this;
                        }
                        if (z11) {
                            newArguments = arrayList;
                        }
                        ht.h newAnnotations = g1Var.c(a11.getAnnotations());
                        kotlin.jvm.internal.i.g(newArguments, "newArguments");
                        kotlin.jvm.internal.i.g(newAnnotations, "newAnnotations");
                        b0 c0 = kotlin.jvm.internal.h.c0(a11, newArguments, newAnnotations, 4);
                        if ((c0 instanceof i0) && (b0Var instanceof i0)) {
                            c0 = kotlin.jvm.internal.h.m0((i0) c0, (i0) b0Var);
                        }
                        return new f1(c0, b13);
                    }
                }
                return d1Var;
            }
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + j(d1Var) + "; substitution: " + j(g1Var));
        }
        a(18);
        throw null;
    }
}
