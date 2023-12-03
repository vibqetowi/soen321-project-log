package com.google.android.gms.internal.measurement;

import com.appsflyer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class t extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8604b;

    public t(int i6) {
        this.f8604b = i6;
        switch (i6) {
            case 1:
                ArrayList arrayList = this.f8618a;
                arrayList.add(x.EQUALS);
                arrayList.add(x.GREATER_THAN);
                arrayList.add(x.GREATER_THAN_EQUALS);
                arrayList.add(x.IDENTITY_EQUALS);
                arrayList.add(x.IDENTITY_NOT_EQUALS);
                arrayList.add(x.LESS_THAN);
                arrayList.add(x.LESS_THAN_EQUALS);
                arrayList.add(x.NOT_EQUALS);
                return;
            case 2:
                ArrayList arrayList2 = this.f8618a;
                arrayList2.add(x.APPLY);
                arrayList2.add(x.BLOCK);
                arrayList2.add(x.BREAK);
                arrayList2.add(x.CASE);
                arrayList2.add(x.DEFAULT);
                arrayList2.add(x.CONTINUE);
                arrayList2.add(x.DEFINE_FUNCTION);
                arrayList2.add(x.FN);
                arrayList2.add(x.IF);
                arrayList2.add(x.QUOTE);
                arrayList2.add(x.RETURN);
                arrayList2.add(x.SWITCH);
                arrayList2.add(x.TERNARY);
                return;
            case 3:
                ArrayList arrayList3 = this.f8618a;
                arrayList3.add(x.AND);
                arrayList3.add(x.NOT);
                arrayList3.add(x.OR);
                return;
            case 4:
                ArrayList arrayList4 = this.f8618a;
                arrayList4.add(x.FOR_IN);
                arrayList4.add(x.FOR_IN_CONST);
                arrayList4.add(x.FOR_IN_LET);
                arrayList4.add(x.FOR_LET);
                arrayList4.add(x.FOR_OF);
                arrayList4.add(x.FOR_OF_CONST);
                arrayList4.add(x.FOR_OF_LET);
                arrayList4.add(x.WHILE);
                return;
            case 5:
                ArrayList arrayList5 = this.f8618a;
                arrayList5.add(x.ADD);
                arrayList5.add(x.DIVIDE);
                arrayList5.add(x.MODULUS);
                arrayList5.add(x.MULTIPLY);
                arrayList5.add(x.NEGATE);
                arrayList5.add(x.POST_DECREMENT);
                arrayList5.add(x.POST_INCREMENT);
                arrayList5.add(x.PRE_DECREMENT);
                arrayList5.add(x.PRE_INCREMENT);
                arrayList5.add(x.SUBTRACT);
                return;
            case 6:
                return;
            case 7:
                ArrayList arrayList6 = this.f8618a;
                arrayList6.add(x.ASSIGN);
                arrayList6.add(x.CONST);
                arrayList6.add(x.CREATE_ARRAY);
                arrayList6.add(x.CREATE_OBJECT);
                arrayList6.add(x.EXPRESSION_LIST);
                arrayList6.add(x.GET);
                arrayList6.add(x.GET_INDEX);
                arrayList6.add(x.GET_PROPERTY);
                arrayList6.add(x.NULL);
                arrayList6.add(x.SET_PROPERTY);
                arrayList6.add(x.TYPEOF);
                arrayList6.add(x.UNDEFINED);
                arrayList6.add(x.VAR);
                return;
            default:
                ArrayList arrayList7 = this.f8618a;
                arrayList7.add(x.BITWISE_AND);
                arrayList7.add(x.BITWISE_LEFT_SHIFT);
                arrayList7.add(x.BITWISE_NOT);
                arrayList7.add(x.BITWISE_OR);
                arrayList7.add(x.BITWISE_RIGHT_SHIFT);
                arrayList7.add(x.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList7.add(x.BITWISE_XOR);
                return;
        }
    }

    public static n c(v.c cVar, ArrayList arrayList) {
        x xVar = x.ADD;
        l3.i(2, "FN", arrayList);
        o i6 = cVar.i((o) arrayList.get(0));
        o i10 = cVar.i((o) arrayList.get(1));
        if (i10 instanceof e) {
            ArrayList I = ((e) i10).I();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new n(i6.g(), I, arrayList2, cVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", i10.getClass().getCanonicalName()));
    }

    public static o d(w wVar, Iterator it, o oVar) {
        if (it != null) {
            while (it.hasNext()) {
                o oVar2 = (o) it.next();
                int i6 = wVar.f8636a;
                String str = wVar.f8638c;
                v.c cVar = wVar.f8637b;
                switch (i6) {
                    case 0:
                        cVar = cVar.h();
                        cVar.o(str, oVar2);
                        ((Map) cVar.f34634y).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        cVar = cVar.h();
                        cVar.o(str, oVar2);
                        break;
                    default:
                        cVar.o(str, oVar2);
                        break;
                }
                o k10 = cVar.k((e) oVar);
                if (k10 instanceof g) {
                    g gVar = (g) k10;
                    if ("break".equals(gVar.f8388v)) {
                        return o.f8520d;
                    }
                    if ("return".equals(gVar.f8388v)) {
                        return gVar;
                    }
                }
            }
        }
        return o.f8520d;
    }

    public static boolean e(o oVar, o oVar2) {
        if (oVar.getClass().equals(oVar2.getClass())) {
            if ((oVar instanceof s) || (oVar instanceof m)) {
                return true;
            }
            if (oVar instanceof h) {
                if (Double.isNaN(oVar.f().doubleValue()) || Double.isNaN(oVar2.f().doubleValue()) || oVar.f().doubleValue() != oVar2.f().doubleValue()) {
                    return false;
                }
                return true;
            } else if (oVar instanceof r) {
                return oVar.g().equals(oVar2.g());
            } else {
                if (oVar instanceof f) {
                    return oVar.i().equals(oVar2.i());
                }
                if (oVar != oVar2) {
                    return false;
                }
                return true;
            }
        } else if (((oVar instanceof s) || (oVar instanceof m)) && ((oVar2 instanceof s) || (oVar2 instanceof m))) {
            return true;
        } else {
            boolean z10 = oVar instanceof h;
            if (z10 && (oVar2 instanceof r)) {
                return e(oVar, new h(oVar2.f()));
            }
            boolean z11 = oVar instanceof r;
            if (z11 && (oVar2 instanceof h)) {
                return e(new h(oVar.f()), oVar2);
            }
            if (oVar instanceof f) {
                return e(new h(oVar.f()), oVar2);
            }
            if (oVar2 instanceof f) {
                return e(oVar, new h(oVar2.f()));
            }
            if ((!z11 && !z10) || !(oVar2 instanceof k)) {
                if (!(oVar instanceof k) || (!(oVar2 instanceof r) && !(oVar2 instanceof h))) {
                    return false;
                }
                return e(new r(oVar.g()), oVar2);
            }
            return e(oVar, new r(oVar2.g()));
        }
    }

    public static boolean f(o oVar, o oVar2) {
        int i6;
        if (oVar instanceof k) {
            oVar = new r(oVar.g());
        }
        if (oVar2 instanceof k) {
            oVar2 = new r(oVar2.g());
        }
        if ((oVar instanceof r) && (oVar2 instanceof r)) {
            if (oVar.g().compareTo(oVar2.g()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = oVar.f().doubleValue();
        double doubleValue2 = oVar2.f().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((i6 != 0 || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static o g(w wVar, o oVar, o oVar2) {
        if (oVar instanceof Iterable) {
            return d(wVar, ((Iterable) oVar).iterator(), oVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean h(o oVar, o oVar2) {
        if (oVar instanceof k) {
            oVar = new r(oVar.g());
        }
        if (oVar2 instanceof k) {
            oVar2 = new r(oVar2.g());
        }
        if (((!(oVar instanceof r) || !(oVar2 instanceof r)) && (Double.isNaN(oVar.f().doubleValue()) || Double.isNaN(oVar2.f().doubleValue()))) || f(oVar2, oVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0494, code lost:
        if ("return".equals(r3.f8388v) != false) goto L142;
     */
    @Override // com.google.android.gms.internal.measurement.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o a(String str, v.c cVar, ArrayList arrayList) {
        o i6;
        o i10;
        String str2;
        h hVar;
        boolean e10;
        boolean e11;
        o oVar;
        g gVar;
        o rVar;
        o oVar2 = null;
        int i11 = 0;
        switch (this.f8604b) {
            case 0:
                x xVar = x.ADD;
                switch (l3.e(str).ordinal()) {
                    case 4:
                        l3.h(2, "BITWISE_AND", arrayList);
                        return new h(Double.valueOf(l3.b(cVar.i((o) arrayList.get(0)).f().doubleValue()) & l3.b(cVar.i((o) arrayList.get(1)).f().doubleValue())));
                    case 5:
                        l3.h(2, "BITWISE_LEFT_SHIFT", arrayList);
                        hVar = new h(Double.valueOf(l3.b(cVar.i((o) arrayList.get(0)).f().doubleValue()) << ((int) (l3.d(cVar.i((o) arrayList.get(1)).f().doubleValue()) & 31))));
                        break;
                    case 6:
                        l3.h(1, "BITWISE_NOT", arrayList);
                        return new h(Double.valueOf(~l3.b(cVar.i((o) arrayList.get(0)).f().doubleValue())));
                    case 7:
                        l3.h(2, "BITWISE_OR", arrayList);
                        return new h(Double.valueOf(l3.b(cVar.i((o) arrayList.get(0)).f().doubleValue()) | l3.b(cVar.i((o) arrayList.get(1)).f().doubleValue())));
                    case 8:
                        l3.h(2, "BITWISE_RIGHT_SHIFT", arrayList);
                        hVar = new h(Double.valueOf(l3.b(cVar.i((o) arrayList.get(0)).f().doubleValue()) >> ((int) (l3.d(cVar.i((o) arrayList.get(1)).f().doubleValue()) & 31))));
                        break;
                    case 9:
                        l3.h(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                        return new h(Double.valueOf(l3.d(cVar.i((o) arrayList.get(0)).f().doubleValue()) >>> ((int) (l3.d(cVar.i((o) arrayList.get(1)).f().doubleValue()) & 31))));
                    case 10:
                        l3.h(2, "BITWISE_XOR", arrayList);
                        return new h(Double.valueOf(l3.b(cVar.i((o) arrayList.get(0)).f().doubleValue()) ^ l3.b(cVar.i((o) arrayList.get(1)).f().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
                return hVar;
            case 1:
                l3.h(2, l3.e(str).name(), arrayList);
                o i12 = cVar.i((o) arrayList.get(0));
                o i13 = cVar.i((o) arrayList.get(1));
                int ordinal = l3.e(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal != 48) {
                        if (ordinal != 42) {
                            if (ordinal != 43) {
                                switch (ordinal) {
                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                        e10 = f(i13, i12);
                                        break;
                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                        e10 = h(i13, i12);
                                        break;
                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                        e10 = l3.l(i12, i13);
                                        break;
                                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                        e11 = l3.l(i12, i13);
                                        break;
                                    default:
                                        b(str);
                                        throw null;
                                }
                            } else {
                                e10 = h(i12, i13);
                            }
                        } else {
                            e10 = f(i12, i13);
                        }
                    } else {
                        e11 = e(i12, i13);
                    }
                    e10 = !e11;
                } else {
                    e10 = e(i12, i13);
                }
                if (e10) {
                    return o.f8524i;
                }
                return o.f8525j;
            case 2:
                x xVar2 = x.ADD;
                int ordinal2 = l3.e(str).ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 15) {
                        if (ordinal2 != 25) {
                            if (ordinal2 != 41) {
                                if (ordinal2 != 54) {
                                    if (ordinal2 != 57) {
                                        if (ordinal2 != 19) {
                                            if (ordinal2 != 20) {
                                                if (ordinal2 != 60) {
                                                    if (ordinal2 != 61) {
                                                        switch (ordinal2) {
                                                            case 11:
                                                                return cVar.h().k(new e(arrayList));
                                                            case 12:
                                                                l3.h(0, "BREAK", arrayList);
                                                                return o.f8522g;
                                                            case 13:
                                                                break;
                                                            default:
                                                                b(str);
                                                                throw null;
                                                        }
                                                    } else {
                                                        l3.h(3, "TERNARY", arrayList);
                                                        if (cVar.i((o) arrayList.get(0)).i().booleanValue()) {
                                                            return cVar.i((o) arrayList.get(1));
                                                        }
                                                        return cVar.i((o) arrayList.get(2));
                                                    }
                                                } else {
                                                    l3.h(3, "SWITCH", arrayList);
                                                    o i14 = cVar.i((o) arrayList.get(0));
                                                    o i15 = cVar.i((o) arrayList.get(1));
                                                    o i16 = cVar.i((o) arrayList.get(2));
                                                    if (i15 instanceof e) {
                                                        if (i16 instanceof e) {
                                                            e eVar = (e) i15;
                                                            e eVar2 = (e) i16;
                                                            boolean z10 = false;
                                                            for (int i17 = 0; i17 < eVar.t(); i17++) {
                                                                if (!z10 && !i14.equals(cVar.i(eVar.v(i17)))) {
                                                                    z10 = false;
                                                                } else {
                                                                    o i18 = cVar.i(eVar2.v(i17));
                                                                    if (i18 instanceof g) {
                                                                        if (((g) i18).f8388v.equals("break")) {
                                                                            return o.f8520d;
                                                                        }
                                                                        return i18;
                                                                    }
                                                                    z10 = true;
                                                                }
                                                            }
                                                            if (eVar.t() + 1 == eVar2.t()) {
                                                                o i19 = cVar.i(eVar2.v(eVar.t()));
                                                                if (i19 instanceof g) {
                                                                    String str3 = ((g) i19).f8388v;
                                                                    if (str3.equals("return") || str3.equals("continue")) {
                                                                        return i19;
                                                                    }
                                                                }
                                                            }
                                                            return o.f8520d;
                                                        }
                                                        throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                                                    }
                                                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                                                }
                                            } else {
                                                l3.i(2, "DEFINE_FUNCTION", arrayList);
                                                n c10 = c(cVar, arrayList);
                                                String str4 = c10.f8419u;
                                                if (str4 == null) {
                                                    cVar.r("", c10);
                                                    return c10;
                                                }
                                                cVar.r(str4, c10);
                                                return c10;
                                            }
                                        }
                                        if (arrayList.isEmpty()) {
                                            return o.f8520d;
                                        }
                                        o i20 = cVar.i((o) arrayList.get(0));
                                        if (i20 instanceof e) {
                                            return cVar.k((e) i20);
                                        }
                                        return o.f8520d;
                                    } else if (arrayList.isEmpty()) {
                                        return o.f8523h;
                                    } else {
                                        l3.h(1, "RETURN", arrayList);
                                        return new g("return", cVar.i((o) arrayList.get(0)));
                                    }
                                }
                                return new e(arrayList);
                            }
                            l3.i(2, "IF", arrayList);
                            o i21 = cVar.i((o) arrayList.get(0));
                            o i22 = cVar.i((o) arrayList.get(1));
                            if (arrayList.size() > 2) {
                                oVar2 = cVar.i((o) arrayList.get(2));
                            }
                            o oVar3 = o.f8520d;
                            if (i21.i().booleanValue()) {
                                oVar = cVar.k((e) i22);
                            } else if (oVar2 != null) {
                                oVar = cVar.k((e) oVar2);
                            } else {
                                oVar = oVar3;
                            }
                            if (!(oVar instanceof g)) {
                                return oVar3;
                            }
                            return oVar;
                        }
                        return c(cVar, arrayList);
                    }
                    l3.h(0, "BREAK", arrayList);
                    return o.f;
                }
                l3.h(3, "APPLY", arrayList);
                o i23 = cVar.i((o) arrayList.get(0));
                String g5 = cVar.i((o) arrayList.get(1)).g();
                o i24 = cVar.i((o) arrayList.get(2));
                if (i24 instanceof e) {
                    if (!g5.isEmpty()) {
                        return i23.s(g5, cVar, ((e) i24).I());
                    }
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", i24.getClass().getCanonicalName()));
            case 3:
                x xVar3 = x.ADD;
                int ordinal3 = l3.e(str).ordinal();
                if (ordinal3 != 1) {
                    if (ordinal3 != 47) {
                        if (ordinal3 == 50) {
                            l3.h(2, "OR", arrayList);
                            o i25 = cVar.i((o) arrayList.get(0));
                            if (!i25.i().booleanValue()) {
                                return cVar.i((o) arrayList.get(1));
                            }
                            return i25;
                        }
                        b(str);
                        throw null;
                    }
                    l3.h(1, "NOT", arrayList);
                    return new f(Boolean.valueOf(!cVar.i((o) arrayList.get(0)).i().booleanValue()));
                }
                l3.h(2, "AND", arrayList);
                o i26 = cVar.i((o) arrayList.get(0));
                if (i26.i().booleanValue()) {
                    return cVar.i((o) arrayList.get(1));
                }
                return i26;
            case 4:
                x xVar4 = x.ADD;
                int ordinal4 = l3.e(str).ordinal();
                if (ordinal4 != 65) {
                    switch (ordinal4) {
                        case 26:
                            l3.h(3, "FOR_IN", arrayList);
                            if (arrayList.get(0) instanceof r) {
                                return d(new w(cVar, ((o) arrayList.get(0)).g(), 2), cVar.i((o) arrayList.get(1)).o(), cVar.i((o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                        case 27:
                            l3.h(3, "FOR_IN_CONST", arrayList);
                            if (arrayList.get(0) instanceof r) {
                                return d(new w(cVar, ((o) arrayList.get(0)).g(), 0), cVar.i((o) arrayList.get(1)).o(), cVar.i((o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                        case 28:
                            l3.h(3, "FOR_IN_LET", arrayList);
                            if (arrayList.get(0) instanceof r) {
                                return d(new w(cVar, ((o) arrayList.get(0)).g(), 1), cVar.i((o) arrayList.get(1)).o(), cVar.i((o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                        case 29:
                            l3.h(4, "FOR_LET", arrayList);
                            o i27 = cVar.i((o) arrayList.get(0));
                            if (i27 instanceof e) {
                                e eVar3 = (e) i27;
                                o oVar4 = (o) arrayList.get(1);
                                o oVar5 = (o) arrayList.get(2);
                                o i28 = cVar.i((o) arrayList.get(3));
                                v.c h10 = cVar.h();
                                for (int i29 = 0; i29 < eVar3.t(); i29++) {
                                    String g10 = eVar3.v(i29).g();
                                    h10.r(g10, cVar.m(g10));
                                }
                                while (cVar.i(oVar4).i().booleanValue()) {
                                    o k10 = cVar.k((e) i28);
                                    if (k10 instanceof g) {
                                        g gVar2 = (g) k10;
                                        if ("break".equals(gVar2.f8388v)) {
                                            return o.f8520d;
                                        }
                                        if ("return".equals(gVar2.f8388v)) {
                                            return gVar2;
                                        }
                                    }
                                    v.c h11 = cVar.h();
                                    for (int i30 = 0; i30 < eVar3.t(); i30++) {
                                        String g11 = eVar3.v(i30).g();
                                        h11.r(g11, h10.m(g11));
                                    }
                                    h11.i(oVar5);
                                    h10 = h11;
                                }
                                return o.f8520d;
                            }
                            throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            l3.h(3, "FOR_OF", arrayList);
                            if (arrayList.get(0) instanceof r) {
                                return g(new w(cVar, ((o) arrayList.get(0)).g(), 2), cVar.i((o) arrayList.get(1)), cVar.i((o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            l3.h(3, "FOR_OF_CONST", arrayList);
                            if (arrayList.get(0) instanceof r) {
                                return g(new w(cVar, ((o) arrayList.get(0)).g(), 0), cVar.i((o) arrayList.get(1)), cVar.i((o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                        case 32:
                            l3.h(3, "FOR_OF_LET", arrayList);
                            if (arrayList.get(0) instanceof r) {
                                return g(new w(cVar, ((o) arrayList.get(0)).g(), 1), cVar.i((o) arrayList.get(1)), cVar.i((o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                        default:
                            b(str);
                            throw null;
                    }
                }
                l3.h(4, "WHILE", arrayList);
                o oVar6 = (o) arrayList.get(0);
                o oVar7 = (o) arrayList.get(1);
                o i31 = cVar.i((o) arrayList.get(3));
                if (cVar.i((o) arrayList.get(2)).i().booleanValue()) {
                    o k11 = cVar.k((e) i31);
                    if (k11 instanceof g) {
                        gVar = (g) k11;
                        if (!"break".equals(gVar.f8388v)) {
                            break;
                        } else {
                            return o.f8520d;
                        }
                    }
                }
                while (cVar.i(oVar6).i().booleanValue()) {
                    o k12 = cVar.k((e) i31);
                    if (k12 instanceof g) {
                        gVar = (g) k12;
                        if ("break".equals(gVar.f8388v)) {
                            return o.f8520d;
                        }
                        if ("return".equals(gVar.f8388v)) {
                            return gVar;
                        }
                    }
                    cVar.i(oVar7);
                }
                return o.f8520d;
            case 5:
                x xVar5 = x.ADD;
                int ordinal5 = l3.e(str).ordinal();
                if (ordinal5 != 0) {
                    if (ordinal5 != 21) {
                        if (ordinal5 != 59) {
                            if (ordinal5 != 52 && ordinal5 != 53) {
                                if (ordinal5 != 55 && ordinal5 != 56) {
                                    switch (ordinal5) {
                                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                            l3.h(2, "MODULUS", arrayList);
                                            rVar = new h(Double.valueOf(cVar.i((o) arrayList.get(0)).f().doubleValue() % cVar.i((o) arrayList.get(1)).f().doubleValue()));
                                            break;
                                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                            l3.h(2, "MULTIPLY", arrayList);
                                            rVar = new h(Double.valueOf(cVar.i((o) arrayList.get(0)).f().doubleValue() * cVar.i((o) arrayList.get(1)).f().doubleValue()));
                                            break;
                                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                            l3.h(1, "NEGATE", arrayList);
                                            return new h(Double.valueOf(-cVar.i((o) arrayList.get(0)).f().doubleValue()));
                                        default:
                                            b(str);
                                            throw null;
                                    }
                                } else {
                                    l3.h(1, str, arrayList);
                                    return cVar.i((o) arrayList.get(0));
                                }
                            } else {
                                l3.h(2, str, arrayList);
                                o i32 = cVar.i((o) arrayList.get(0));
                                cVar.i((o) arrayList.get(1));
                                return i32;
                            }
                        } else {
                            l3.h(2, "SUBTRACT", arrayList);
                            o i33 = cVar.i((o) arrayList.get(0));
                            Double valueOf = Double.valueOf(-cVar.i((o) arrayList.get(1)).f().doubleValue());
                            if (valueOf == null) {
                                valueOf = Double.valueOf(Double.NaN);
                            }
                            rVar = new h(Double.valueOf(valueOf.doubleValue() + i33.f().doubleValue()));
                        }
                    } else {
                        l3.h(2, "DIVIDE", arrayList);
                        rVar = new h(Double.valueOf(cVar.i((o) arrayList.get(0)).f().doubleValue() / cVar.i((o) arrayList.get(1)).f().doubleValue()));
                    }
                } else {
                    l3.h(2, "ADD", arrayList);
                    o i34 = cVar.i((o) arrayList.get(0));
                    o i35 = cVar.i((o) arrayList.get(1));
                    if (!(i34 instanceof k) && !(i34 instanceof r) && !(i35 instanceof k) && !(i35 instanceof r)) {
                        rVar = new h(Double.valueOf(i35.f().doubleValue() + i34.f().doubleValue()));
                    } else {
                        rVar = new r(String.valueOf(i34.g()).concat(String.valueOf(i35.g())));
                    }
                }
                return rVar;
            case 6:
                if (str != null && !str.isEmpty() && cVar.s(str)) {
                    o m10 = cVar.m(str);
                    if (m10 instanceof i) {
                        return ((i) m10).a(cVar, arrayList);
                    }
                    throw new IllegalArgumentException(String.format("Function %s is not defined", str));
                }
                throw new IllegalArgumentException(String.format("Command not found: %s", str));
            default:
                x xVar6 = x.ADD;
                int ordinal6 = l3.e(str).ordinal();
                if (ordinal6 != 3) {
                    if (ordinal6 != 14) {
                        if (ordinal6 != 24) {
                            if (ordinal6 != 33) {
                                if (ordinal6 != 49) {
                                    if (ordinal6 != 58) {
                                        if (ordinal6 != 17) {
                                            if (ordinal6 != 18) {
                                                if (ordinal6 != 35 && ordinal6 != 36) {
                                                    switch (ordinal6) {
                                                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                                            l3.h(1, "TYPEOF", arrayList);
                                                            o i36 = cVar.i((o) arrayList.get(0));
                                                            if (i36 instanceof s) {
                                                                str2 = "undefined";
                                                            } else if (i36 instanceof f) {
                                                                str2 = "boolean";
                                                            } else if (i36 instanceof h) {
                                                                str2 = "number";
                                                            } else if (i36 instanceof r) {
                                                                str2 = "string";
                                                            } else if (i36 instanceof n) {
                                                                str2 = "function";
                                                            } else if (!(i36 instanceof p) && !(i36 instanceof g)) {
                                                                str2 = "object";
                                                            } else {
                                                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", i36));
                                                            }
                                                            i10 = new r(str2);
                                                            break;
                                                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                                            l3.h(0, "UNDEFINED", arrayList);
                                                            return o.f8520d;
                                                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                                            l3.i(1, "VAR", arrayList);
                                                            Iterator it = arrayList.iterator();
                                                            while (it.hasNext()) {
                                                                o i37 = cVar.i((o) it.next());
                                                                if (i37 instanceof r) {
                                                                    cVar.o(i37.g(), o.f8520d);
                                                                } else {
                                                                    throw new IllegalArgumentException(String.format("Expected string for var name. got %s", i37.getClass().getCanonicalName()));
                                                                }
                                                            }
                                                            return o.f8520d;
                                                        default:
                                                            b(str);
                                                            throw null;
                                                    }
                                                } else {
                                                    l3.h(2, "GET_PROPERTY", arrayList);
                                                    o i38 = cVar.i((o) arrayList.get(0));
                                                    o i39 = cVar.i((o) arrayList.get(1));
                                                    if ((i38 instanceof e) && l3.k(i39)) {
                                                        return ((e) i38).v(i39.f().intValue());
                                                    }
                                                    if (i38 instanceof k) {
                                                        return ((k) i38).r(i39.g());
                                                    }
                                                    if (i38 instanceof r) {
                                                        if ("length".equals(i39.g())) {
                                                            i10 = new h(Double.valueOf(i38.g().length()));
                                                        } else if (l3.k(i39) && i39.f().doubleValue() < i38.g().length()) {
                                                            i6 = new r(String.valueOf(i38.g().charAt(i39.f().intValue())));
                                                        }
                                                    }
                                                    return o.f8520d;
                                                }
                                            } else if (arrayList.isEmpty()) {
                                                return new l();
                                            } else {
                                                if (arrayList.size() % 2 == 0) {
                                                    l lVar = new l();
                                                    while (i11 < arrayList.size() - 1) {
                                                        o i40 = cVar.i((o) arrayList.get(i11));
                                                        o i41 = cVar.i((o) arrayList.get(i11 + 1));
                                                        if (!(i40 instanceof g) && !(i41 instanceof g)) {
                                                            lVar.q(i40.g(), i41);
                                                            i11 += 2;
                                                        } else {
                                                            throw new IllegalStateException("Failed to evaluate map entry");
                                                        }
                                                    }
                                                    return lVar;
                                                }
                                                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(arrayList.size())));
                                            }
                                        } else if (arrayList.isEmpty()) {
                                            return new e();
                                        } else {
                                            e eVar4 = new e();
                                            Iterator it2 = arrayList.iterator();
                                            while (it2.hasNext()) {
                                                o i42 = cVar.i((o) it2.next());
                                                if (!(i42 instanceof g)) {
                                                    eVar4.K(i11, i42);
                                                    i11++;
                                                } else {
                                                    throw new IllegalStateException("Failed to evaluate array element");
                                                }
                                            }
                                            return eVar4;
                                        }
                                    } else {
                                        l3.h(3, "SET_PROPERTY", arrayList);
                                        o i43 = cVar.i((o) arrayList.get(0));
                                        o i44 = cVar.i((o) arrayList.get(1));
                                        i10 = cVar.i((o) arrayList.get(2));
                                        if (i43 != o.f8520d && i43 != o.f8521e) {
                                            if ((i43 instanceof e) && (i44 instanceof h)) {
                                                ((e) i43).K(i44.f().intValue(), i10);
                                            } else if (i43 instanceof k) {
                                                ((k) i43).q(i44.g(), i10);
                                            }
                                        } else {
                                            throw new IllegalStateException(String.format("Can't set property %s of %s", i44.g(), i43.g()));
                                        }
                                    }
                                    return i10;
                                }
                                l3.h(0, "NULL", arrayList);
                                return o.f8521e;
                            }
                            l3.h(1, "GET", arrayList);
                            o i45 = cVar.i((o) arrayList.get(0));
                            if (i45 instanceof r) {
                                return cVar.m(i45.g());
                            }
                            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", i45.getClass().getCanonicalName()));
                        }
                        l3.i(1, "EXPRESSION_LIST", arrayList);
                        o oVar8 = o.f8520d;
                        while (i11 < arrayList.size()) {
                            oVar8 = cVar.i((o) arrayList.get(i11));
                            if (!(oVar8 instanceof g)) {
                                i11++;
                            } else {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                        }
                        return oVar8;
                    }
                    l3.i(2, "CONST", arrayList);
                    if (arrayList.size() % 2 == 0) {
                        for (int i46 = 0; i46 < arrayList.size() - 1; i46 += 2) {
                            o i47 = cVar.i((o) arrayList.get(i46));
                            if (i47 instanceof r) {
                                String g12 = i47.g();
                                cVar.o(g12, cVar.i((o) arrayList.get(i46 + 1)));
                                ((Map) cVar.f34634y).put(g12, Boolean.TRUE);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for const name. got %s", i47.getClass().getCanonicalName()));
                            }
                        }
                        return o.f8520d;
                    }
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(arrayList.size())));
                }
                l3.h(2, "ASSIGN", arrayList);
                o i48 = cVar.i((o) arrayList.get(0));
                if (i48 instanceof r) {
                    if (cVar.s(i48.g())) {
                        i6 = cVar.i((o) arrayList.get(1));
                        cVar.r(i48.g(), i6);
                    } else {
                        throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", i48.g()));
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", i48.getClass().getCanonicalName()));
                }
                return i6;
        }
    }
}
