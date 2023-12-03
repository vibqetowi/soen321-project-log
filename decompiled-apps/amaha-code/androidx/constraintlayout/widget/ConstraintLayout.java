package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import b0.e;
import b0.g;
import com.appsflyer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tr.r;
import x.d;
import x.e;
import x.f;
import x.h;
import x.i;
import x.k;
import x.m;
import y.b;
import y.j;
import y.l;
import y.n;
import y.p;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static e J;
    public int A;
    public boolean B;
    public int C;
    public androidx.constraintlayout.widget.b D;
    public b0.b E;
    public int F;
    public HashMap<String, Integer> G;
    public final SparseArray<x.e> H;
    public final b I;

    /* renamed from: u  reason: collision with root package name */
    public final SparseArray<View> f1751u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<androidx.constraintlayout.widget.a> f1752v;

    /* renamed from: w  reason: collision with root package name */
    public final f f1753w;

    /* renamed from: x  reason: collision with root package name */
    public int f1754x;

    /* renamed from: y  reason: collision with root package name */
    public int f1755y;

    /* renamed from: z  reason: collision with root package name */
    public int f1756z;

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0647b {

        /* renamed from: a  reason: collision with root package name */
        public final ConstraintLayout f1797a;

        /* renamed from: b  reason: collision with root package name */
        public int f1798b;

        /* renamed from: c  reason: collision with root package name */
        public int f1799c;

        /* renamed from: d  reason: collision with root package name */
        public int f1800d;

        /* renamed from: e  reason: collision with root package name */
        public int f1801e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f1802g;

        public b(ConstraintLayout constraintLayout) {
            this.f1797a = constraintLayout;
        }

        public static boolean a(int i6, int i10, int i11) {
            if (i6 == i10) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i6);
            View.MeasureSpec.getSize(i6);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i11 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final void b(x.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            int i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int baseline;
            int i14;
            int i15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            int i16;
            boolean z23;
            boolean z24;
            boolean z25;
            int i17;
            if (eVar == null) {
                return;
            }
            if (eVar.f37376j0 == 8 && !eVar.G) {
                aVar.f38139e = 0;
                aVar.f = 0;
                aVar.f38140g = 0;
            } else if (eVar.W == null) {
            } else {
                e.a aVar2 = aVar.f38135a;
                e.a aVar3 = aVar.f38136b;
                int i18 = aVar.f38137c;
                int i19 = aVar.f38138d;
                int i20 = this.f1798b + this.f1799c;
                int i21 = this.f1800d;
                View view = (View) eVar.f37374i0;
                int ordinal = aVar2.ordinal();
                x.d dVar = eVar.M;
                x.d dVar2 = eVar.K;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                makeMeasureSpec = 0;
                            } else {
                                int i22 = this.f;
                                if (dVar2 != null) {
                                    i17 = dVar2.f37351g + 0;
                                } else {
                                    i17 = 0;
                                }
                                if (dVar != null) {
                                    i17 += dVar.f37351g;
                                }
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i22, i21 + i17, -1);
                            }
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i21, -2);
                            if (eVar.f37392s == 1) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            int i23 = aVar.f38143j;
                            if (i23 == 1 || i23 == 2) {
                                if (view.getMeasuredHeight() == eVar.o()) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (aVar.f38143j != 2 && z23 && ((!z23 || !z24) && !(view instanceof d) && !eVar.E())) {
                                    z25 = false;
                                } else {
                                    z25 = true;
                                }
                                if (z25) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.u(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i21, -2);
                    }
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                }
                int ordinal2 = aVar3.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                makeMeasureSpec2 = 0;
                            } else {
                                int i24 = this.f1802g;
                                if (dVar2 != null) {
                                    i16 = eVar.L.f37351g + 0;
                                } else {
                                    i16 = 0;
                                }
                                if (dVar != null) {
                                    i16 += eVar.N.f37351g;
                                }
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i24, i20 + i16, -1);
                            }
                        } else {
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1802g, i20, -2);
                            if (eVar.f37394t == 1) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            int i25 = aVar.f38143j;
                            if (i25 == 1 || i25 == 2) {
                                if (view.getMeasuredWidth() == eVar.u()) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (aVar.f38143j != 2 && z20 && ((!z20 || !z21) && !(view instanceof d) && !eVar.F())) {
                                    z22 = false;
                                } else {
                                    z22 = true;
                                }
                                if (z22) {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.o(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1802g, i20, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                }
                f fVar = (f) eVar.W;
                ConstraintLayout constraintLayout = ConstraintLayout.this;
                if (fVar != null && k.b(constraintLayout.C, 256) && view.getMeasuredWidth() == eVar.u() && view.getMeasuredWidth() < fVar.u() && view.getMeasuredHeight() == eVar.o() && view.getMeasuredHeight() < fVar.o() && view.getBaseline() == eVar.f37366d0 && !eVar.D()) {
                    if (a(eVar.I, makeMeasureSpec, eVar.u()) && a(eVar.J, makeMeasureSpec2, eVar.o())) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        aVar.f38139e = eVar.u();
                        aVar.f = eVar.o();
                        aVar.f38140g = eVar.f37366d0;
                        return;
                    }
                }
                e.a aVar4 = e.a.MATCH_CONSTRAINT;
                if (aVar2 == aVar4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (aVar3 == aVar4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e.a aVar5 = e.a.MATCH_PARENT;
                e.a aVar6 = e.a.FIXED;
                if (aVar3 != aVar5 && aVar3 != aVar6) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (aVar2 != aVar5 && aVar2 != aVar6) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z10 && eVar.Z > 0.0f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z11 && eVar.Z > 0.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (view == null) {
                    return;
                }
                a aVar7 = (a) view.getLayoutParams();
                int i26 = aVar.f38143j;
                if (i26 != 1 && i26 != 2 && z10 && eVar.f37392s == 0 && z11 && eVar.f37394t == 0) {
                    i14 = 0;
                    i15 = -1;
                    i6 = 0;
                    i11 = 0;
                } else {
                    if ((view instanceof g) && (eVar instanceof m)) {
                        ((g) view).r((m) eVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    eVar.I = makeMeasureSpec;
                    eVar.J = makeMeasureSpec2;
                    eVar.f37369g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i27 = eVar.f37398v;
                    if (i27 > 0) {
                        i6 = Math.max(i27, measuredWidth);
                    } else {
                        i6 = measuredWidth;
                    }
                    int i28 = eVar.f37400w;
                    if (i28 > 0) {
                        i6 = Math.min(i28, i6);
                    }
                    int i29 = eVar.f37402y;
                    if (i29 > 0) {
                        i11 = Math.max(i29, measuredHeight);
                        i10 = makeMeasureSpec2;
                    } else {
                        i10 = makeMeasureSpec2;
                        i11 = measuredHeight;
                    }
                    int i30 = eVar.f37403z;
                    if (i30 > 0) {
                        i11 = Math.min(i30, i11);
                    }
                    if (!k.b(constraintLayout.C, 1)) {
                        if (z14 && z12) {
                            i6 = (int) ((i11 * eVar.Z) + 0.5f);
                        } else if (z15 && z13) {
                            i11 = (int) ((i6 / eVar.Z) + 0.5f);
                        }
                    }
                    if (measuredWidth == i6 && measuredHeight == i11) {
                        baseline = baseline2;
                    } else {
                        if (measuredWidth != i6) {
                            i12 = 1073741824;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                        } else {
                            i12 = 1073741824;
                        }
                        if (measuredHeight != i11) {
                            i13 = View.MeasureSpec.makeMeasureSpec(i11, i12);
                        } else {
                            i13 = i10;
                        }
                        view.measure(makeMeasureSpec, i13);
                        eVar.I = makeMeasureSpec;
                        eVar.J = i13;
                        eVar.f37369g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        i6 = measuredWidth2;
                        i11 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i14 = baseline;
                    i15 = -1;
                }
                if (i14 != i15) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i6 == aVar.f38137c && i11 == aVar.f38138d) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                aVar.f38142i = z17;
                if (aVar7.c0) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                if (z18 && i14 != -1 && eVar.f37366d0 != i14) {
                    aVar.f38142i = true;
                }
                aVar.f38139e = i6;
                aVar.f = i11;
                aVar.f38141h = z18;
                aVar.f38140g = i14;
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1751u = new SparseArray<>();
        this.f1752v = new ArrayList<>(4);
        this.f1753w = new f();
        this.f1754x = 0;
        this.f1755y = 0;
        this.f1756z = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.A = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.B = true;
        this.C = 257;
        this.D = null;
        this.E = null;
        this.F = -1;
        this.G = new HashMap<>();
        this.H = new SparseArray<>();
        this.I = new b(this);
        e(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static b0.e getSharedValues() {
        if (J == null) {
            J = new b0.e();
        }
        return J;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x02e7 -> B:155:0x02e8). Please submit an issue!!! */
    public final void b(boolean z10, View view, x.e eVar, a aVar, SparseArray<x.e> sparseArray) {
        d.a aVar2;
        d.a aVar3;
        x.e eVar2;
        x.e eVar3;
        x.e eVar4;
        x.e eVar5;
        float f;
        int i6;
        int i10;
        float f2;
        int i11;
        d.a aVar4;
        d.a aVar5;
        aVar.a();
        eVar.f37376j0 = view.getVisibility();
        if (aVar.f1765f0) {
            eVar.G = true;
            eVar.f37376j0 = 8;
        }
        eVar.f37374i0 = view;
        if (view instanceof androidx.constraintlayout.widget.a) {
            ((androidx.constraintlayout.widget.a) view).o(eVar, this.f1753w.B0);
        }
        int i12 = -1;
        if (aVar.f1763d0) {
            h hVar = (h) eVar;
            int i13 = aVar.f1781n0;
            int i14 = aVar.f1783o0;
            float f10 = aVar.f1785p0;
            int i15 = (f10 > (-1.0f) ? 1 : (f10 == (-1.0f) ? 0 : -1));
            if (i15 != 0) {
                if (i15 > 0) {
                    hVar.f37434w0 = f10;
                    hVar.f37435x0 = -1;
                    hVar.f37436y0 = -1;
                    return;
                }
                return;
            } else if (i13 != -1) {
                if (i13 > -1) {
                    hVar.f37434w0 = -1.0f;
                    hVar.f37435x0 = i13;
                    hVar.f37436y0 = -1;
                    return;
                }
                return;
            } else if (i14 != -1 && i14 > -1) {
                hVar.f37434w0 = -1.0f;
                hVar.f37435x0 = -1;
                hVar.f37436y0 = i14;
                return;
            } else {
                return;
            }
        }
        int i16 = aVar.f1767g0;
        int i17 = aVar.f1769h0;
        int i18 = aVar.f1771i0;
        int i19 = aVar.f1773j0;
        int i20 = aVar.f1775k0;
        int i21 = aVar.f1777l0;
        float f11 = aVar.f1779m0;
        int i22 = aVar.f1784p;
        d.a aVar6 = d.a.RIGHT;
        d.a aVar7 = d.a.LEFT;
        d.a aVar8 = d.a.BOTTOM;
        d.a aVar9 = d.a.TOP;
        if (i22 != -1) {
            x.e eVar6 = sparseArray.get(i22);
            if (eVar6 != null) {
                float f12 = aVar.r;
                int i23 = aVar.f1786q;
                d.a aVar10 = d.a.CENTER;
                aVar4 = aVar7;
                aVar5 = aVar6;
                eVar.z(aVar10, eVar6, aVar10, i23, 0);
                eVar.E = f12;
            } else {
                aVar4 = aVar7;
                aVar5 = aVar6;
            }
            aVar3 = aVar5;
            aVar2 = aVar4;
            f = 0.0f;
        } else {
            if (i16 != -1) {
                x.e eVar7 = sparseArray.get(i16);
                if (eVar7 != null) {
                    aVar2 = aVar7;
                    aVar3 = aVar6;
                    eVar.z(aVar7, eVar7, aVar7, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i20);
                } else {
                    aVar2 = aVar7;
                    aVar3 = aVar6;
                }
            } else {
                aVar2 = aVar7;
                aVar3 = aVar6;
                if (i17 != -1 && (eVar2 = sparseArray.get(i17)) != null) {
                    eVar.z(aVar2, eVar2, aVar3, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i20);
                }
            }
            if (i18 != -1) {
                x.e eVar8 = sparseArray.get(i18);
                if (eVar8 != null) {
                    eVar.z(aVar3, eVar8, aVar2, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i21);
                }
            } else if (i19 != -1 && (eVar3 = sparseArray.get(i19)) != null) {
                eVar.z(aVar3, eVar3, aVar3, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i21);
            }
            int i24 = aVar.f1770i;
            if (i24 != -1) {
                x.e eVar9 = sparseArray.get(i24);
                if (eVar9 != null) {
                    eVar.z(aVar9, eVar9, aVar9, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.f1793x);
                }
            } else {
                int i25 = aVar.f1772j;
                if (i25 != -1 && (eVar4 = sparseArray.get(i25)) != null) {
                    eVar.z(aVar9, eVar4, aVar8, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.f1793x);
                }
            }
            int i26 = aVar.f1774k;
            if (i26 != -1) {
                x.e eVar10 = sparseArray.get(i26);
                if (eVar10 != null) {
                    eVar.z(aVar8, eVar10, aVar9, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.f1795z);
                }
            } else {
                int i27 = aVar.f1776l;
                if (i27 != -1 && (eVar5 = sparseArray.get(i27)) != null) {
                    eVar.z(aVar8, eVar5, aVar8, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.f1795z);
                }
            }
            int i28 = aVar.f1778m;
            if (i28 != -1) {
                k(eVar, aVar, sparseArray, i28, d.a.BASELINE);
            } else {
                int i29 = aVar.f1780n;
                if (i29 != -1) {
                    k(eVar, aVar, sparseArray, i29, aVar9);
                } else {
                    int i30 = aVar.f1782o;
                    if (i30 != -1) {
                        k(eVar, aVar, sparseArray, i30, aVar8);
                    }
                }
            }
            f = 0.0f;
            if (f11 >= 0.0f) {
                eVar.f37370g0 = f11;
            }
            float f13 = aVar.F;
            if (f13 >= 0.0f) {
                eVar.f37372h0 = f13;
            }
        }
        if (z10 && ((i11 = aVar.T) != -1 || aVar.U != -1)) {
            int i31 = aVar.U;
            eVar.f37363b0 = i11;
            eVar.c0 = i31;
        }
        boolean z11 = aVar.f1758a0;
        e.a aVar11 = e.a.MATCH_PARENT;
        e.a aVar12 = e.a.WRAP_CONTENT;
        e.a aVar13 = e.a.FIXED;
        e.a aVar14 = e.a.MATCH_CONSTRAINT;
        int i32 = 0;
        if (!z11) {
            if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                if (aVar.W) {
                    eVar.P(aVar14);
                } else {
                    eVar.P(aVar11);
                }
                eVar.m(aVar2).f37351g = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                eVar.m(aVar3).f37351g = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            } else {
                eVar.P(aVar14);
                eVar.R(0);
            }
        } else {
            eVar.P(aVar13);
            eVar.R(((ViewGroup.MarginLayoutParams) aVar).width);
            if (((ViewGroup.MarginLayoutParams) aVar).width == -2) {
                eVar.P(aVar12);
            }
        }
        if (!aVar.f1760b0) {
            if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                if (aVar.X) {
                    eVar.Q(aVar14);
                } else {
                    eVar.Q(aVar11);
                }
                eVar.m(aVar9).f37351g = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                eVar.m(aVar8).f37351g = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            } else {
                eVar.Q(aVar14);
                eVar.O(0);
            }
        } else {
            eVar.Q(aVar13);
            eVar.O(((ViewGroup.MarginLayoutParams) aVar).height);
            if (((ViewGroup.MarginLayoutParams) aVar).height == -2) {
                eVar.Q(aVar12);
            }
        }
        String str = aVar.G;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i6 = 1;
                    i12 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i6 = 1;
                    i12 = 1;
                } else {
                    i6 = 1;
                }
                i10 = indexOf + i6;
            } else {
                i6 = 1;
                i10 = 0;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - i6) {
                String substring2 = str.substring(i10, indexOf2);
                String substring3 = str.substring(indexOf2 + i6);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > f && parseFloat2 > f) {
                        if (i12 == 1) {
                            f2 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f2 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f2 = 0.0f;
            } else {
                String substring4 = str.substring(i10);
                if (substring4.length() > 0) {
                    f2 = Float.parseFloat(substring4);
                }
                f2 = 0.0f;
            }
            if (f2 > f) {
                eVar.Z = f2;
                eVar.f37361a0 = i12;
            }
        } else {
            eVar.Z = f;
        }
        float f14 = aVar.H;
        float[] fArr = eVar.f37388p0;
        fArr[0] = f14;
        fArr[1] = aVar.I;
        eVar.f37384n0 = aVar.J;
        eVar.f37386o0 = aVar.K;
        int i33 = aVar.Z;
        if (i33 >= 0 && i33 <= 3) {
            eVar.r = i33;
        }
        int i34 = aVar.L;
        int i35 = aVar.N;
        int i36 = aVar.P;
        float f15 = aVar.R;
        eVar.f37392s = i34;
        eVar.f37398v = i35;
        if (i36 == Integer.MAX_VALUE) {
            i36 = 0;
        }
        eVar.f37400w = i36;
        eVar.f37401x = f15;
        if (f15 > f && f15 < 1.0f && i34 == 0) {
            eVar.f37392s = 2;
        }
        int i37 = aVar.M;
        int i38 = aVar.O;
        int i39 = aVar.Q;
        float f16 = aVar.S;
        eVar.f37394t = i37;
        eVar.f37402y = i38;
        if (i39 != Integer.MAX_VALUE) {
            i32 = i39;
        }
        eVar.f37403z = i32;
        eVar.A = f16;
        if (f16 > f && f16 < 1.0f && i37 == 0) {
            eVar.f37394t = 2;
        }
    }

    public final View c(int i6) {
        return this.f1751u.get(i6);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final x.e d(View view) {
        if (view == this) {
            return this.f1753w;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof a) {
                return ((a) view.getLayoutParams()).f1787q0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof a) {
                return ((a) view.getLayoutParams()).f1787q0;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f1752v;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((parseInt / 1080.0f) * width);
                        int i12 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i11;
                        float f2 = i12;
                        float f10 = i11 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f10, f2, paint);
                        float parseInt4 = i12 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f2, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f10, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f10, f2, paint);
                    }
                }
            }
        }
    }

    public final void e(AttributeSet attributeSet, int i6) {
        f fVar = this.f1753w;
        fVar.f37374i0 = this;
        b bVar = this.I;
        fVar.A0 = bVar;
        fVar.f37410y0.f = bVar;
        this.f1751u.put(getId(), this);
        this.D = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f33565y, i6, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f1754x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1754x);
                } else if (index == 17) {
                    this.f1755y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1755y);
                } else if (index == 14) {
                    this.f1756z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1756z);
                } else if (index == 15) {
                    this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                } else if (index == 113) {
                    this.C = obtainStyledAttributes.getInt(index, this.C);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            g(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.E = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        this.D = bVar2;
                        bVar2.m(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.D = null;
                    }
                    this.F = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        fVar.J0 = this.C;
        v.d.f34635p = fVar.Z(512);
    }

    public final boolean f() {
        boolean z10;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.B = true;
        super.forceLayout();
    }

    public void g(int i6) {
        this.E = new b0.b(getContext(), this, i6);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.A;
    }

    public int getMaxWidth() {
        return this.f1756z;
    }

    public int getMinHeight() {
        return this.f1755y;
    }

    public int getMinWidth() {
        return this.f1754x;
    }

    public int getOptimizationLevel() {
        return this.f1753w.J0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        f fVar = this.f1753w;
        if (fVar.f37377k == null) {
            int id3 = getId();
            if (id3 != -1) {
                fVar.f37377k = getContext().getResources().getResourceEntryName(id3);
            } else {
                fVar.f37377k = "parent";
            }
        }
        if (fVar.f37380l0 == null) {
            fVar.f37380l0 = fVar.f37377k;
            Log.v("ConstraintLayout", " setDebugName " + fVar.f37380l0);
        }
        Iterator<x.e> it = fVar.f37443w0.iterator();
        while (it.hasNext()) {
            x.e next = it.next();
            View view = (View) next.f37374i0;
            if (view != null) {
                if (next.f37377k == null && (id2 = view.getId()) != -1) {
                    next.f37377k = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f37380l0 == null) {
                    next.f37380l0 = next.f37377k;
                    Log.v("ConstraintLayout", " setDebugName " + next.f37380l0);
                }
            }
        }
        fVar.r(sb2);
        return sb2.toString();
    }

    public final void h(int i6, int i10, int i11, int i12, boolean z10, boolean z11) {
        b bVar = this.I;
        int i13 = bVar.f1801e;
        int resolveSizeAndState = View.resolveSizeAndState(i11 + bVar.f1800d, i6, 0);
        int min = Math.min(this.f1756z, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.A, View.resolveSizeAndState(i12 + i13, i10, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(f fVar, int i6, int i10, int i11) {
        int i12;
        int i13;
        e.a aVar;
        e.a aVar2;
        int i14;
        int i15;
        e.a aVar3;
        e.a aVar4;
        int u10;
        y.e eVar;
        int i16;
        int i17;
        int i18;
        int size;
        boolean b10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        y.b bVar;
        b.InterfaceC0647b interfaceC0647b;
        int i19;
        e.a aVar5;
        int i20;
        e.a aVar6;
        e.a aVar7;
        int i21;
        boolean z14;
        y.b bVar2;
        int size2;
        int i22;
        boolean z15;
        boolean z16;
        d.a aVar8;
        d.a aVar9;
        ArrayList<x.e> arrayList;
        int i23;
        boolean z17;
        int i24;
        b.InterfaceC0647b interfaceC0647b2;
        int i25;
        boolean z18;
        boolean z19;
        e.a aVar10;
        y.b bVar3;
        boolean z20;
        l lVar;
        n nVar;
        y.e eVar2;
        int i26;
        int i27;
        int i28;
        boolean z21;
        boolean z22;
        boolean z23;
        int i29;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        int i30;
        f fVar2 = fVar;
        int mode = View.MeasureSpec.getMode(i10);
        int size3 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size4 = View.MeasureSpec.getSize(i11);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i31 = max + max2;
        int paddingWidth = getPaddingWidth();
        b bVar4 = this.I;
        bVar4.f1798b = max;
        bVar4.f1799c = max2;
        bVar4.f1800d = paddingWidth;
        bVar4.f1801e = i31;
        bVar4.f = i10;
        bVar4.f1802g = i11;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (f()) {
            max3 = max4;
        }
        int i32 = size3 - paddingWidth;
        int i33 = size4 - i31;
        int i34 = bVar4.f1801e;
        int i35 = bVar4.f1800d;
        e.a aVar11 = e.a.FIXED;
        int childCount = getChildCount();
        e.a aVar12 = e.a.WRAP_CONTENT;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    aVar2 = aVar11;
                } else {
                    i30 = Math.min(this.f1756z - i35, i32);
                    aVar2 = aVar11;
                    aVar = aVar11;
                    i13 = i30;
                    if (mode2 != Integer.MIN_VALUE) {
                        if (mode2 != 0) {
                            if (mode2 != 1073741824) {
                                aVar3 = aVar;
                                i15 = 0;
                            } else {
                                i15 = Math.min(this.A - i34, i33);
                                aVar4 = aVar12;
                                aVar3 = aVar;
                                u10 = fVar.u();
                                eVar = fVar2.f37410y0;
                                if (i13 == u10 || i15 != fVar.o()) {
                                    eVar.f38148c = true;
                                }
                                fVar2.f37363b0 = 0;
                                fVar2.c0 = 0;
                                int[] iArr = fVar2.D;
                                iArr[0] = this.f1756z - i35;
                                iArr[1] = this.A - i34;
                                fVar2.e0 = 0;
                                fVar2.f37368f0 = 0;
                                fVar2.P(aVar2);
                                fVar2.R(i13);
                                fVar2.Q(aVar3);
                                fVar2.O(i15);
                                i16 = this.f1754x - i35;
                                if (i16 < 0) {
                                    i17 = 0;
                                    fVar2.e0 = 0;
                                } else {
                                    i17 = 0;
                                    fVar2.e0 = i16;
                                }
                                i18 = this.f1755y - i34;
                                if (i18 < 0) {
                                    fVar2.f37368f0 = i17;
                                } else {
                                    fVar2.f37368f0 = i18;
                                }
                                fVar2.D0 = max3;
                                fVar2.E0 = max;
                                y.b bVar5 = fVar2.f37409x0;
                                bVar5.getClass();
                                b.InterfaceC0647b interfaceC0647b3 = fVar2.A0;
                                size = fVar2.f37443w0.size();
                                int u11 = fVar.u();
                                int o10 = fVar.o();
                                b10 = k.b(i6, 128);
                                if (b10 && !k.b(i6, 64)) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                e.a aVar13 = e.a.MATCH_CONSTRAINT;
                                if (z10) {
                                    for (int i36 = 0; i36 < size; i36++) {
                                        x.e eVar3 = fVar2.f37443w0.get(i36);
                                        e.a[] aVarArr = eVar3.V;
                                        if (aVarArr[0] == aVar13) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        if (aVarArr[1] == aVar13) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        if (z26 && z27 && eVar3.Z > 0.0f) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        if ((eVar3.B() && z28) || ((eVar3.C() && z28) || (eVar3 instanceof m) || eVar3.B() || eVar3.C())) {
                                            z10 = false;
                                            break;
                                        }
                                    }
                                }
                                if ((mode != 1073741824 && mode2 == 1073741824) || b10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z10 & z11;
                                if (z12) {
                                    int min = Math.min(fVar2.D[0], i32);
                                    int min2 = Math.min(fVar2.D[1], i33);
                                    int i37 = 1073741824;
                                    if (mode == 1073741824) {
                                        if (fVar.u() != min) {
                                            fVar2.R(min);
                                            eVar2 = eVar;
                                            eVar2.f38147b = true;
                                        } else {
                                            eVar2 = eVar;
                                        }
                                        i37 = 1073741824;
                                    } else {
                                        eVar2 = eVar;
                                    }
                                    if (mode2 == i37 && fVar.o() != min2) {
                                        fVar2.O(min2);
                                        eVar2.f38147b = true;
                                    }
                                    if (mode == 1073741824 && mode2 == 1073741824) {
                                        boolean z29 = b10 & true;
                                        boolean z30 = eVar2.f38147b;
                                        f fVar3 = eVar2.f38146a;
                                        if (!z30 && !eVar2.f38148c) {
                                            i29 = 0;
                                        } else {
                                            Iterator<x.e> it = fVar3.f37443w0.iterator();
                                            while (it.hasNext()) {
                                                x.e next = it.next();
                                                next.l();
                                                next.f37360a = false;
                                                next.f37365d.n();
                                                next.f37367e.m();
                                            }
                                            fVar3.l();
                                            i29 = 0;
                                            fVar3.f37360a = false;
                                            fVar3.f37365d.n();
                                            fVar3.f37367e.m();
                                            eVar2.f38148c = false;
                                        }
                                        eVar2.b(eVar2.f38149d);
                                        fVar3.f37363b0 = i29;
                                        fVar3.c0 = i29;
                                        e.a n10 = fVar3.n(i29);
                                        e.a n11 = fVar3.n(1);
                                        if (eVar2.f38147b) {
                                            eVar2.c();
                                        }
                                        int v10 = fVar3.v();
                                        z13 = z12;
                                        int w10 = fVar3.w();
                                        interfaceC0647b = interfaceC0647b3;
                                        fVar3.f37365d.f38182h.d(v10);
                                        fVar3.f37367e.f38182h.d(w10);
                                        eVar2.g();
                                        ArrayList<p> arrayList2 = eVar2.f38150e;
                                        i19 = u11;
                                        aVar5 = aVar4;
                                        if (n10 != aVar5 && n11 != aVar5) {
                                            bVar = bVar5;
                                            i20 = o10;
                                            aVar6 = aVar;
                                            aVar7 = aVar13;
                                        } else {
                                            if (z29) {
                                                Iterator<p> it2 = arrayList2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        if (!it2.next().k()) {
                                                            z29 = false;
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                            if (z29 && n10 == aVar5) {
                                                i20 = o10;
                                                aVar6 = aVar;
                                                fVar3.P(aVar6);
                                                bVar = bVar5;
                                                aVar7 = aVar13;
                                                fVar3.R(eVar2.d(fVar3, 0));
                                                fVar3.f37365d.f38180e.d(fVar3.u());
                                            } else {
                                                bVar = bVar5;
                                                i20 = o10;
                                                aVar6 = aVar;
                                                aVar7 = aVar13;
                                            }
                                            if (z29 && n11 == aVar5) {
                                                fVar3.Q(aVar6);
                                                fVar3.O(eVar2.d(fVar3, 1));
                                                fVar3.f37367e.f38180e.d(fVar3.o());
                                            }
                                        }
                                        e.a aVar14 = fVar3.V[0];
                                        e.a aVar15 = e.a.MATCH_PARENT;
                                        if (aVar14 != aVar6 && aVar14 != aVar15) {
                                            z24 = false;
                                        } else {
                                            int u12 = fVar3.u() + v10;
                                            fVar3.f37365d.f38183i.d(u12);
                                            fVar3.f37365d.f38180e.d(u12 - v10);
                                            eVar2.g();
                                            e.a aVar16 = fVar3.V[1];
                                            if (aVar16 == aVar6 || aVar16 == aVar15) {
                                                int o11 = fVar3.o() + w10;
                                                fVar3.f37367e.f38183i.d(o11);
                                                fVar3.f37367e.f38180e.d(o11 - w10);
                                            }
                                            eVar2.g();
                                            z24 = true;
                                        }
                                        Iterator<p> it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            p next2 = it3.next();
                                            if (next2.f38177b != fVar3 || next2.f38181g) {
                                                next2.e();
                                            }
                                        }
                                        Iterator<p> it4 = arrayList2.iterator();
                                        while (it4.hasNext()) {
                                            p next3 = it4.next();
                                            if (z24 || next3.f38177b != fVar3) {
                                                if (!next3.f38182h.f38161j || ((!next3.f38183i.f38161j && !(next3 instanceof j)) || (!next3.f38180e.f38161j && !(next3 instanceof y.c) && !(next3 instanceof j)))) {
                                                    z25 = false;
                                                    break;
                                                }
                                            }
                                        }
                                        z25 = true;
                                        fVar3.P(n10);
                                        fVar3.Q(n11);
                                        z14 = z25;
                                        i27 = 1073741824;
                                        i21 = 2;
                                    } else {
                                        z13 = z12;
                                        bVar = bVar5;
                                        interfaceC0647b = interfaceC0647b3;
                                        i19 = u11;
                                        aVar5 = aVar4;
                                        i20 = o10;
                                        aVar6 = aVar;
                                        aVar7 = aVar13;
                                        boolean z31 = eVar2.f38147b;
                                        f fVar4 = eVar2.f38146a;
                                        if (z31) {
                                            Iterator<x.e> it5 = fVar4.f37443w0.iterator();
                                            while (it5.hasNext()) {
                                                x.e next4 = it5.next();
                                                next4.l();
                                                next4.f37360a = false;
                                                l lVar2 = next4.f37365d;
                                                lVar2.f38180e.f38161j = false;
                                                lVar2.f38181g = false;
                                                lVar2.n();
                                                n nVar2 = next4.f37367e;
                                                nVar2.f38180e.f38161j = false;
                                                nVar2.f38181g = false;
                                                nVar2.m();
                                            }
                                            i26 = 0;
                                            fVar4.l();
                                            fVar4.f37360a = false;
                                            l lVar3 = fVar4.f37365d;
                                            lVar3.f38180e.f38161j = false;
                                            lVar3.f38181g = false;
                                            lVar3.n();
                                            n nVar3 = fVar4.f37367e;
                                            nVar3.f38180e.f38161j = false;
                                            nVar3.f38181g = false;
                                            nVar3.m();
                                            eVar2.c();
                                        } else {
                                            i26 = 0;
                                        }
                                        eVar2.b(eVar2.f38149d);
                                        fVar4.f37363b0 = i26;
                                        fVar4.c0 = i26;
                                        fVar4.f37365d.f38182h.d(i26);
                                        fVar4.f37367e.f38182h.d(i26);
                                        i27 = 1073741824;
                                        if (mode == 1073741824) {
                                            i28 = 1;
                                            z21 = fVar2.X(i26, b10) & true;
                                            i21 = 1;
                                        } else {
                                            i28 = 1;
                                            i21 = 0;
                                            z21 = true;
                                        }
                                        if (mode2 == 1073741824) {
                                            z14 = fVar2.X(i28, b10) & z21;
                                            i21++;
                                        } else {
                                            z14 = z21;
                                        }
                                    }
                                    if (z14) {
                                        if (mode == i27) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        if (mode2 == i27) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        fVar2.S(z22, z23);
                                    }
                                } else {
                                    z13 = z12;
                                    bVar = bVar5;
                                    interfaceC0647b = interfaceC0647b3;
                                    i19 = u11;
                                    aVar5 = aVar4;
                                    i20 = o10;
                                    aVar6 = aVar;
                                    aVar7 = aVar13;
                                    i21 = 0;
                                    z14 = false;
                                }
                                if (z14 || i21 != 2) {
                                    int i38 = fVar2.J0;
                                    if (size > 0) {
                                        int size5 = fVar2.f37443w0.size();
                                        boolean Z = fVar2.Z(64);
                                        b.InterfaceC0647b interfaceC0647b4 = fVar2.A0;
                                        int i39 = 0;
                                        while (i39 < size5) {
                                            x.e eVar4 = fVar2.f37443w0.get(i39);
                                            if ((eVar4 instanceof h) || (eVar4 instanceof x.a) || eVar4.H || (Z && (lVar = eVar4.f37365d) != null && (nVar = eVar4.f37367e) != null && lVar.f38180e.f38161j && nVar.f38180e.f38161j)) {
                                                aVar10 = aVar7;
                                                bVar3 = bVar;
                                            } else {
                                                e.a n12 = eVar4.n(0);
                                                e.a n13 = eVar4.n(1);
                                                aVar10 = aVar7;
                                                if (n12 == aVar10 && eVar4.f37392s != 1 && n13 == aVar10 && eVar4.f37394t != 1) {
                                                    z20 = true;
                                                } else {
                                                    z20 = false;
                                                }
                                                if (!z20 && fVar2.Z(1) && !(eVar4 instanceof m)) {
                                                    if (n12 == aVar10 && eVar4.f37392s == 0 && n13 != aVar10 && !eVar4.B()) {
                                                        z20 = true;
                                                    }
                                                    if (n13 == aVar10 && eVar4.f37394t == 0 && n12 != aVar10 && !eVar4.B()) {
                                                        z20 = true;
                                                    }
                                                    if (n12 == aVar10 || n13 == aVar10) {
                                                        if (eVar4.Z > 0.0f) {
                                                            z20 = true;
                                                        }
                                                        if (!z20) {
                                                            bVar3 = bVar;
                                                        } else {
                                                            bVar3 = bVar;
                                                            bVar3.a(0, eVar4, interfaceC0647b4);
                                                        }
                                                    }
                                                }
                                                if (!z20) {
                                                }
                                            }
                                            i39++;
                                            bVar = bVar3;
                                            aVar7 = aVar10;
                                        }
                                        bVar2 = bVar;
                                        ConstraintLayout constraintLayout = ((b) interfaceC0647b4).f1797a;
                                        int childCount2 = constraintLayout.getChildCount();
                                        for (int i40 = 0; i40 < childCount2; i40++) {
                                            View childAt = constraintLayout.getChildAt(i40);
                                            if (childAt instanceof d) {
                                                d dVar = (d) childAt;
                                                if (dVar.f1919v != null) {
                                                    a aVar17 = (a) dVar.getLayoutParams();
                                                    a aVar18 = (a) dVar.f1919v.getLayoutParams();
                                                    x.e eVar5 = aVar18.f1787q0;
                                                    eVar5.f37376j0 = 0;
                                                    x.e eVar6 = aVar17.f1787q0;
                                                    if (eVar6.V[0] != aVar6) {
                                                        eVar6.R(eVar5.u());
                                                    }
                                                    x.e eVar7 = aVar17.f1787q0;
                                                    if (eVar7.V[1] != aVar6) {
                                                        eVar7.O(aVar18.f1787q0.o());
                                                    }
                                                    aVar18.f1787q0.f37376j0 = 8;
                                                }
                                            }
                                        }
                                        ArrayList<androidx.constraintlayout.widget.a> arrayList3 = constraintLayout.f1752v;
                                        int size6 = arrayList3.size();
                                        if (size6 > 0) {
                                            for (int i41 = 0; i41 < size6; i41++) {
                                                arrayList3.get(i41).getClass();
                                            }
                                        }
                                    } else {
                                        bVar2 = bVar;
                                    }
                                    bVar2.c(fVar2);
                                    ArrayList<x.e> arrayList4 = bVar2.f38132a;
                                    size2 = arrayList4.size();
                                    int i42 = i20;
                                    int i43 = i19;
                                    if (size > 0) {
                                        bVar2.b(fVar2, 0, i43, i42);
                                    }
                                    if (size2 > 0) {
                                        e.a[] aVarArr2 = fVar2.V;
                                        if (aVarArr2[0] == aVar5) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (aVarArr2[1] == aVar5) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        int u13 = fVar.u();
                                        f fVar5 = bVar2.f38134c;
                                        int max5 = Math.max(u13, fVar5.e0);
                                        int max6 = Math.max(fVar.o(), fVar5.f37368f0);
                                        int i44 = 0;
                                        boolean z32 = false;
                                        while (true) {
                                            aVar8 = d.a.BOTTOM;
                                            aVar9 = d.a.RIGHT;
                                            if (i44 >= size2) {
                                                break;
                                            }
                                            x.e eVar8 = arrayList4.get(i44);
                                            int i45 = i38;
                                            if (!(eVar8 instanceof m)) {
                                                i24 = i43;
                                                interfaceC0647b2 = interfaceC0647b;
                                                i25 = i42;
                                            } else {
                                                int u14 = eVar8.u();
                                                int o12 = eVar8.o();
                                                i24 = i43;
                                                interfaceC0647b2 = interfaceC0647b;
                                                i25 = i42;
                                                boolean a10 = z32 | bVar2.a(1, eVar8, interfaceC0647b2);
                                                int u15 = eVar8.u();
                                                int o13 = eVar8.o();
                                                if (u15 != u14) {
                                                    eVar8.R(u15);
                                                    if (z15 && eVar8.v() + eVar8.X > max5) {
                                                        max5 = Math.max(max5, eVar8.m(aVar9).e() + eVar8.v() + eVar8.X);
                                                    }
                                                    z18 = true;
                                                } else {
                                                    z18 = a10;
                                                }
                                                if (o13 != o12) {
                                                    eVar8.O(o13);
                                                    if (z16 && eVar8.w() + eVar8.Y > max6) {
                                                        max6 = Math.max(max6, eVar8.m(aVar8).e() + eVar8.w() + eVar8.Y);
                                                    }
                                                    z19 = true;
                                                } else {
                                                    z19 = z18;
                                                }
                                                z32 = ((m) eVar8).E0 | z19;
                                            }
                                            i44++;
                                            i38 = i45;
                                            i42 = i25;
                                            interfaceC0647b = interfaceC0647b2;
                                            i43 = i24;
                                        }
                                        i22 = i38;
                                        int i46 = i43;
                                        b.InterfaceC0647b interfaceC0647b5 = interfaceC0647b;
                                        int i47 = i42;
                                        int i48 = 0;
                                        int i49 = 2;
                                        while (i48 < i49) {
                                            int i50 = 0;
                                            while (i50 < size2) {
                                                x.e eVar9 = arrayList4.get(i50);
                                                if ((!(eVar9 instanceof i) || (eVar9 instanceof m)) && !(eVar9 instanceof h)) {
                                                    if (eVar9.f37376j0 != 8 && ((!z13 || !eVar9.f37365d.f38180e.f38161j || !eVar9.f37367e.f38180e.f38161j) && !(eVar9 instanceof m))) {
                                                        int u16 = eVar9.u();
                                                        int o14 = eVar9.o();
                                                        arrayList = arrayList4;
                                                        int i51 = eVar9.f37366d0;
                                                        i23 = size2;
                                                        int i52 = 1;
                                                        if (i48 == 1) {
                                                            i52 = 2;
                                                        }
                                                        boolean a11 = bVar2.a(i52, eVar9, interfaceC0647b5) | z32;
                                                        int u17 = eVar9.u();
                                                        int o15 = eVar9.o();
                                                        if (u17 != u16) {
                                                            eVar9.R(u17);
                                                            if (z15 && eVar9.v() + eVar9.X > max5) {
                                                                max5 = Math.max(max5, eVar9.m(aVar9).e() + eVar9.v() + eVar9.X);
                                                            }
                                                            z17 = true;
                                                        } else {
                                                            z17 = a11;
                                                        }
                                                        if (o15 != o14) {
                                                            eVar9.O(o15);
                                                            if (z16 && eVar9.w() + eVar9.Y > max6) {
                                                                max6 = Math.max(max6, eVar9.m(aVar8).e() + eVar9.w() + eVar9.Y);
                                                            }
                                                            z17 = true;
                                                        }
                                                        if (eVar9.F && i51 != eVar9.f37366d0) {
                                                            z32 = true;
                                                        } else {
                                                            z32 = z17;
                                                        }
                                                        i50++;
                                                        size2 = i23;
                                                        arrayList4 = arrayList;
                                                    }
                                                }
                                                arrayList = arrayList4;
                                                i23 = size2;
                                                i50++;
                                                size2 = i23;
                                                arrayList4 = arrayList;
                                            }
                                            ArrayList<x.e> arrayList5 = arrayList4;
                                            int i53 = size2;
                                            if (!z32) {
                                                break;
                                            }
                                            i48++;
                                            bVar2.b(fVar, i48, i46, i47);
                                            size2 = i53;
                                            arrayList4 = arrayList5;
                                            i49 = 2;
                                            z32 = false;
                                        }
                                        fVar2 = fVar;
                                    } else {
                                        i22 = i38;
                                    }
                                    fVar2.J0 = i22;
                                    v.d.f34635p = fVar2.Z(512);
                                }
                                return;
                            }
                        } else if (childCount == 0) {
                            i14 = Math.max(0, this.f1755y);
                        } else {
                            i15 = 0;
                            aVar3 = aVar12;
                        }
                        aVar4 = aVar12;
                        u10 = fVar.u();
                        eVar = fVar2.f37410y0;
                        if (i13 == u10) {
                        }
                        eVar.f38148c = true;
                        fVar2.f37363b0 = 0;
                        fVar2.c0 = 0;
                        int[] iArr2 = fVar2.D;
                        iArr2[0] = this.f1756z - i35;
                        iArr2[1] = this.A - i34;
                        fVar2.e0 = 0;
                        fVar2.f37368f0 = 0;
                        fVar2.P(aVar2);
                        fVar2.R(i13);
                        fVar2.Q(aVar3);
                        fVar2.O(i15);
                        i16 = this.f1754x - i35;
                        if (i16 < 0) {
                        }
                        i18 = this.f1755y - i34;
                        if (i18 < 0) {
                        }
                        fVar2.D0 = max3;
                        fVar2.E0 = max;
                        y.b bVar52 = fVar2.f37409x0;
                        bVar52.getClass();
                        b.InterfaceC0647b interfaceC0647b32 = fVar2.A0;
                        size = fVar2.f37443w0.size();
                        int u112 = fVar.u();
                        int o102 = fVar.o();
                        b10 = k.b(i6, 128);
                        if (b10) {
                        }
                        z10 = true;
                        e.a aVar132 = e.a.MATCH_CONSTRAINT;
                        if (z10) {
                        }
                        if (mode != 1073741824) {
                        }
                        z11 = false;
                        z12 = z10 & z11;
                        if (z12) {
                        }
                        if (z14) {
                        }
                        int i382 = fVar2.J0;
                        if (size > 0) {
                        }
                        bVar2.c(fVar2);
                        ArrayList<x.e> arrayList42 = bVar2.f38132a;
                        size2 = arrayList42.size();
                        int i422 = i20;
                        int i432 = i19;
                        if (size > 0) {
                        }
                        if (size2 > 0) {
                        }
                        fVar2.J0 = i22;
                        v.d.f34635p = fVar2.Z(512);
                    } else if (childCount == 0) {
                        i14 = Math.max(0, this.f1755y);
                    } else {
                        i14 = i33;
                    }
                    i15 = i14;
                    aVar3 = aVar12;
                    aVar4 = aVar3;
                    u10 = fVar.u();
                    eVar = fVar2.f37410y0;
                    if (i13 == u10) {
                    }
                    eVar.f38148c = true;
                    fVar2.f37363b0 = 0;
                    fVar2.c0 = 0;
                    int[] iArr22 = fVar2.D;
                    iArr22[0] = this.f1756z - i35;
                    iArr22[1] = this.A - i34;
                    fVar2.e0 = 0;
                    fVar2.f37368f0 = 0;
                    fVar2.P(aVar2);
                    fVar2.R(i13);
                    fVar2.Q(aVar3);
                    fVar2.O(i15);
                    i16 = this.f1754x - i35;
                    if (i16 < 0) {
                    }
                    i18 = this.f1755y - i34;
                    if (i18 < 0) {
                    }
                    fVar2.D0 = max3;
                    fVar2.E0 = max;
                    y.b bVar522 = fVar2.f37409x0;
                    bVar522.getClass();
                    b.InterfaceC0647b interfaceC0647b322 = fVar2.A0;
                    size = fVar2.f37443w0.size();
                    int u1122 = fVar.u();
                    int o1022 = fVar.o();
                    b10 = k.b(i6, 128);
                    if (b10) {
                    }
                    z10 = true;
                    e.a aVar1322 = e.a.MATCH_CONSTRAINT;
                    if (z10) {
                    }
                    if (mode != 1073741824) {
                    }
                    z11 = false;
                    z12 = z10 & z11;
                    if (z12) {
                    }
                    if (z14) {
                    }
                    int i3822 = fVar2.J0;
                    if (size > 0) {
                    }
                    bVar2.c(fVar2);
                    ArrayList<x.e> arrayList422 = bVar2.f38132a;
                    size2 = arrayList422.size();
                    int i4222 = i20;
                    int i4322 = i19;
                    if (size > 0) {
                    }
                    if (size2 > 0) {
                    }
                    fVar2.J0 = i22;
                    v.d.f34635p = fVar2.Z(512);
                }
            } else if (childCount == 0) {
                i12 = Math.max(0, this.f1754x);
            } else {
                aVar2 = aVar12;
            }
            i30 = 0;
            aVar = aVar11;
            i13 = i30;
            if (mode2 != Integer.MIN_VALUE) {
            }
            i15 = i14;
            aVar3 = aVar12;
            aVar4 = aVar3;
            u10 = fVar.u();
            eVar = fVar2.f37410y0;
            if (i13 == u10) {
            }
            eVar.f38148c = true;
            fVar2.f37363b0 = 0;
            fVar2.c0 = 0;
            int[] iArr222 = fVar2.D;
            iArr222[0] = this.f1756z - i35;
            iArr222[1] = this.A - i34;
            fVar2.e0 = 0;
            fVar2.f37368f0 = 0;
            fVar2.P(aVar2);
            fVar2.R(i13);
            fVar2.Q(aVar3);
            fVar2.O(i15);
            i16 = this.f1754x - i35;
            if (i16 < 0) {
            }
            i18 = this.f1755y - i34;
            if (i18 < 0) {
            }
            fVar2.D0 = max3;
            fVar2.E0 = max;
            y.b bVar5222 = fVar2.f37409x0;
            bVar5222.getClass();
            b.InterfaceC0647b interfaceC0647b3222 = fVar2.A0;
            size = fVar2.f37443w0.size();
            int u11222 = fVar.u();
            int o10222 = fVar.o();
            b10 = k.b(i6, 128);
            if (b10) {
            }
            z10 = true;
            e.a aVar13222 = e.a.MATCH_CONSTRAINT;
            if (z10) {
            }
            if (mode != 1073741824) {
            }
            z11 = false;
            z12 = z10 & z11;
            if (z12) {
            }
            if (z14) {
            }
            int i38222 = fVar2.J0;
            if (size > 0) {
            }
            bVar2.c(fVar2);
            ArrayList<x.e> arrayList4222 = bVar2.f38132a;
            size2 = arrayList4222.size();
            int i42222 = i20;
            int i43222 = i19;
            if (size > 0) {
            }
            if (size2 > 0) {
            }
            fVar2.J0 = i22;
            v.d.f34635p = fVar2.Z(512);
        } else if (childCount == 0) {
            i12 = Math.max(0, this.f1754x);
        } else {
            i12 = i32;
        }
        i13 = i12;
        aVar = aVar11;
        aVar2 = aVar12;
        if (mode2 != Integer.MIN_VALUE) {
        }
        i15 = i14;
        aVar3 = aVar12;
        aVar4 = aVar3;
        u10 = fVar.u();
        eVar = fVar2.f37410y0;
        if (i13 == u10) {
        }
        eVar.f38148c = true;
        fVar2.f37363b0 = 0;
        fVar2.c0 = 0;
        int[] iArr2222 = fVar2.D;
        iArr2222[0] = this.f1756z - i35;
        iArr2222[1] = this.A - i34;
        fVar2.e0 = 0;
        fVar2.f37368f0 = 0;
        fVar2.P(aVar2);
        fVar2.R(i13);
        fVar2.Q(aVar3);
        fVar2.O(i15);
        i16 = this.f1754x - i35;
        if (i16 < 0) {
        }
        i18 = this.f1755y - i34;
        if (i18 < 0) {
        }
        fVar2.D0 = max3;
        fVar2.E0 = max;
        y.b bVar52222 = fVar2.f37409x0;
        bVar52222.getClass();
        b.InterfaceC0647b interfaceC0647b32222 = fVar2.A0;
        size = fVar2.f37443w0.size();
        int u112222 = fVar.u();
        int o102222 = fVar.o();
        b10 = k.b(i6, 128);
        if (b10) {
        }
        z10 = true;
        e.a aVar132222 = e.a.MATCH_CONSTRAINT;
        if (z10) {
        }
        if (mode != 1073741824) {
        }
        z11 = false;
        z12 = z10 & z11;
        if (z12) {
        }
        if (z14) {
        }
        int i382222 = fVar2.J0;
        if (size > 0) {
        }
        bVar2.c(fVar2);
        ArrayList<x.e> arrayList42222 = bVar2.f38132a;
        size2 = arrayList42222.size();
        int i422222 = i20;
        int i432222 = i19;
        if (size > 0) {
        }
        if (size2 > 0) {
        }
        fVar2.J0 = i22;
        v.d.f34635p = fVar2.Z(512);
    }

    public final void j(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.G == null) {
                this.G = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.G.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void k(x.e eVar, a aVar, SparseArray<x.e> sparseArray, int i6, d.a aVar2) {
        View view = this.f1751u.get(i6);
        x.e eVar2 = sparseArray.get(i6);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof a)) {
            aVar.c0 = true;
            d.a aVar3 = d.a.BASELINE;
            if (aVar2 == aVar3) {
                a aVar4 = (a) view.getLayoutParams();
                aVar4.c0 = true;
                aVar4.f1787q0.F = true;
            }
            eVar.m(aVar3).b(eVar2.m(aVar2), aVar.D, aVar.C, true);
            eVar.F = true;
            eVar.m(d.a.TOP).j();
            eVar.m(d.a.BOTTOM).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            a aVar = (a) childAt.getLayoutParams();
            x.e eVar = aVar.f1787q0;
            if ((childAt.getVisibility() != 8 || aVar.f1763d0 || aVar.e0 || isInEditMode) && !aVar.f1765f0) {
                int v10 = eVar.v();
                int w10 = eVar.w();
                int u10 = eVar.u() + v10;
                int o10 = eVar.o() + w10;
                childAt.layout(v10, w10, u10, o10);
                if ((childAt instanceof d) && (content = ((d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(v10, w10, u10, o10);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f1752v;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.get(i14).p();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i10) {
        boolean z10;
        String resourceName;
        int id2;
        x.e eVar;
        if (!this.B) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                } else if (getChildAt(i11).isLayoutRequested()) {
                    this.B = true;
                    break;
                } else {
                    i11++;
                }
            }
        }
        boolean f = f();
        f fVar = this.f1753w;
        fVar.B0 = f;
        if (this.B) {
            this.B = false;
            int childCount2 = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 < childCount2) {
                    if (getChildAt(i12).isLayoutRequested()) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    x.e d10 = d(getChildAt(i13));
                    if (d10 != null) {
                        d10.G();
                    }
                }
                if (isInEditMode) {
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt = getChildAt(i14);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            j(resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            id2 = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id2 != 0) {
                            View view = this.f1751u.get(id2);
                            if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                if (view == null) {
                                    eVar = null;
                                } else {
                                    eVar = ((a) view.getLayoutParams()).f1787q0;
                                }
                                eVar.f37380l0 = resourceName;
                            }
                        }
                        eVar = fVar;
                        eVar.f37380l0 = resourceName;
                    }
                }
                if (this.F != -1) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt2 = getChildAt(i15);
                        if (childAt2.getId() == this.F && (childAt2 instanceof c)) {
                            this.D = ((c) childAt2).getConstraintSet();
                        }
                    }
                }
                androidx.constraintlayout.widget.b bVar = this.D;
                if (bVar != null) {
                    bVar.c(this);
                }
                fVar.f37443w0.clear();
                ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f1752v;
                int size = arrayList.size();
                if (size > 0) {
                    for (int i16 = 0; i16 < size; i16++) {
                        androidx.constraintlayout.widget.a aVar = arrayList.get(i16);
                        if (aVar.isInEditMode()) {
                            aVar.setIds(aVar.f1809y);
                        }
                        x.j jVar = aVar.f1808x;
                        if (jVar != null) {
                            jVar.a();
                            for (int i17 = 0; i17 < aVar.f1806v; i17++) {
                                int i18 = aVar.f1805u[i17];
                                View c10 = c(i18);
                                if (c10 == null) {
                                    Integer valueOf = Integer.valueOf(i18);
                                    HashMap<Integer, String> hashMap = aVar.B;
                                    String str = hashMap.get(valueOf);
                                    int k10 = aVar.k(this, str);
                                    if (k10 != 0) {
                                        aVar.f1805u[i17] = k10;
                                        hashMap.put(Integer.valueOf(k10), str);
                                        c10 = c(k10);
                                    }
                                }
                                if (c10 != null) {
                                    aVar.f1808x.b(d(c10));
                                }
                            }
                            aVar.f1808x.c();
                        }
                    }
                }
                for (int i19 = 0; i19 < childCount3; i19++) {
                    View childAt3 = getChildAt(i19);
                    if (childAt3 instanceof d) {
                        d dVar = (d) childAt3;
                        if (dVar.f1918u == -1 && !dVar.isInEditMode()) {
                            dVar.setVisibility(dVar.f1920w);
                        }
                        View findViewById = findViewById(dVar.f1918u);
                        dVar.f1919v = findViewById;
                        if (findViewById != null) {
                            ((a) findViewById.getLayoutParams()).f1765f0 = true;
                            dVar.f1919v.setVisibility(0);
                            dVar.setVisibility(0);
                        }
                    }
                }
                SparseArray<x.e> sparseArray = this.H;
                sparseArray.clear();
                sparseArray.put(0, fVar);
                sparseArray.put(getId(), fVar);
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt4 = getChildAt(i20);
                    sparseArray.put(childAt4.getId(), d(childAt4));
                }
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt5 = getChildAt(i21);
                    x.e d11 = d(childAt5);
                    if (d11 != null) {
                        a aVar2 = (a) childAt5.getLayoutParams();
                        fVar.f37443w0.add(d11);
                        x.e eVar2 = d11.W;
                        if (eVar2 != null) {
                            ((x.n) eVar2).f37443w0.remove(d11);
                            d11.G();
                        }
                        d11.W = fVar;
                        b(isInEditMode, childAt5, d11, aVar2, sparseArray);
                    }
                }
            }
            if (z10) {
                fVar.f37409x0.c(fVar);
            }
        }
        i(fVar, this.C, i6, i10);
        h(i6, i10, fVar.u(), fVar.o(), fVar.K0, fVar.L0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        x.e d10 = d(view);
        if ((view instanceof Guideline) && !(d10 instanceof h)) {
            a aVar = (a) view.getLayoutParams();
            h hVar = new h();
            aVar.f1787q0 = hVar;
            aVar.f1763d0 = true;
            hVar.V(aVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) view;
            aVar2.q();
            ((a) view.getLayoutParams()).e0 = true;
            ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f1752v;
            if (!arrayList.contains(aVar2)) {
                arrayList.add(aVar2);
            }
        }
        this.f1751u.put(view.getId(), view);
        this.B = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1751u.remove(view.getId());
        x.e d10 = d(view);
        this.f1753w.f37443w0.remove(d10);
        d10.G();
        this.f1752v.remove(view);
        this.B = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.B = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.b bVar) {
        this.D = bVar;
    }

    @Override // android.view.View
    public void setId(int i6) {
        int id2 = getId();
        SparseArray<View> sparseArray = this.f1751u;
        sparseArray.remove(id2);
        super.setId(i6);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i6) {
        if (i6 == this.A) {
            return;
        }
        this.A = i6;
        requestLayout();
    }

    public void setMaxWidth(int i6) {
        if (i6 == this.f1756z) {
            return;
        }
        this.f1756z = i6;
        requestLayout();
    }

    public void setMinHeight(int i6) {
        if (i6 == this.f1755y) {
            return;
        }
        this.f1755y = i6;
        requestLayout();
    }

    public void setMinWidth(int i6) {
        if (i6 == this.f1754x) {
            return;
        }
        this.f1754x = i6;
        requestLayout();
    }

    public void setOnConstraintsChanged(b0.c cVar) {
        b0.b bVar = this.E;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i6) {
        this.C = i6;
        f fVar = this.f1753w;
        fVar.J0 = i6;
        v.d.f34635p = fVar.Z(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f1751u = new SparseArray<>();
        this.f1752v = new ArrayList<>(4);
        this.f1753w = new f();
        this.f1754x = 0;
        this.f1755y = 0;
        this.f1756z = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.A = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.B = true;
        this.C = 257;
        this.D = null;
        this.E = null;
        this.F = -1;
        this.G = new HashMap<>();
        this.H = new SparseArray<>();
        this.I = new b(this);
        e(attributeSet, i6);
    }

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a  reason: collision with root package name */
        public int f1757a;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1758a0;

        /* renamed from: b  reason: collision with root package name */
        public int f1759b;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1760b0;

        /* renamed from: c  reason: collision with root package name */
        public float f1761c;
        public boolean c0;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1762d;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f1763d0;

        /* renamed from: e  reason: collision with root package name */
        public int f1764e;
        public boolean e0;
        public int f;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f1765f0;

        /* renamed from: g  reason: collision with root package name */
        public int f1766g;

        /* renamed from: g0  reason: collision with root package name */
        public int f1767g0;

        /* renamed from: h  reason: collision with root package name */
        public int f1768h;

        /* renamed from: h0  reason: collision with root package name */
        public int f1769h0;

        /* renamed from: i  reason: collision with root package name */
        public int f1770i;

        /* renamed from: i0  reason: collision with root package name */
        public int f1771i0;

        /* renamed from: j  reason: collision with root package name */
        public int f1772j;

        /* renamed from: j0  reason: collision with root package name */
        public int f1773j0;

        /* renamed from: k  reason: collision with root package name */
        public int f1774k;

        /* renamed from: k0  reason: collision with root package name */
        public int f1775k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1776l;

        /* renamed from: l0  reason: collision with root package name */
        public int f1777l0;

        /* renamed from: m  reason: collision with root package name */
        public int f1778m;

        /* renamed from: m0  reason: collision with root package name */
        public float f1779m0;

        /* renamed from: n  reason: collision with root package name */
        public int f1780n;

        /* renamed from: n0  reason: collision with root package name */
        public int f1781n0;

        /* renamed from: o  reason: collision with root package name */
        public int f1782o;

        /* renamed from: o0  reason: collision with root package name */
        public int f1783o0;

        /* renamed from: p  reason: collision with root package name */
        public int f1784p;

        /* renamed from: p0  reason: collision with root package name */
        public float f1785p0;

        /* renamed from: q  reason: collision with root package name */
        public int f1786q;

        /* renamed from: q0  reason: collision with root package name */
        public x.e f1787q0;
        public float r;

        /* renamed from: s  reason: collision with root package name */
        public int f1788s;

        /* renamed from: t  reason: collision with root package name */
        public int f1789t;

        /* renamed from: u  reason: collision with root package name */
        public int f1790u;

        /* renamed from: v  reason: collision with root package name */
        public int f1791v;

        /* renamed from: w  reason: collision with root package name */
        public final int f1792w;

        /* renamed from: x  reason: collision with root package name */
        public int f1793x;

        /* renamed from: y  reason: collision with root package name */
        public final int f1794y;

        /* renamed from: z  reason: collision with root package name */
        public int f1795z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0025a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1796a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1796a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItem, 49);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 21);
                sparseIntArray.append(R.styleable.AppCompatTheme_textColorSearchUrl, 22);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 23);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 24);
                sparseIntArray.append(R.styleable.AppCompatTheme_textColorAlertDialogListItem, 25);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 26);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSmall, 55);
                sparseIntArray.append(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(R.styleable.AppCompatTheme_switchStyle, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(R.styleable.AppCompatTheme_tooltipForegroundColor, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1757a = -1;
            this.f1759b = -1;
            this.f1761c = -1.0f;
            this.f1762d = true;
            this.f1764e = -1;
            this.f = -1;
            this.f1766g = -1;
            this.f1768h = -1;
            this.f1770i = -1;
            this.f1772j = -1;
            this.f1774k = -1;
            this.f1776l = -1;
            this.f1778m = -1;
            this.f1780n = -1;
            this.f1782o = -1;
            this.f1784p = -1;
            this.f1786q = 0;
            this.r = 0.0f;
            this.f1788s = -1;
            this.f1789t = -1;
            this.f1790u = -1;
            this.f1791v = -1;
            this.f1792w = LinearLayoutManager.INVALID_OFFSET;
            this.f1793x = LinearLayoutManager.INVALID_OFFSET;
            this.f1794y = LinearLayoutManager.INVALID_OFFSET;
            this.f1795z = LinearLayoutManager.INVALID_OFFSET;
            this.A = LinearLayoutManager.INVALID_OFFSET;
            this.B = LinearLayoutManager.INVALID_OFFSET;
            this.C = LinearLayoutManager.INVALID_OFFSET;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1758a0 = true;
            this.f1760b0 = true;
            this.c0 = false;
            this.f1763d0 = false;
            this.e0 = false;
            this.f1765f0 = false;
            this.f1767g0 = -1;
            this.f1769h0 = -1;
            this.f1771i0 = -1;
            this.f1773j0 = -1;
            this.f1775k0 = LinearLayoutManager.INVALID_OFFSET;
            this.f1777l0 = LinearLayoutManager.INVALID_OFFSET;
            this.f1779m0 = 0.5f;
            this.f1787q0 = new x.e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f33565y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                int i10 = C0025a.f1796a.get(index);
                switch (i10) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1784p);
                        this.f1784p = resourceId;
                        if (resourceId == -1) {
                            this.f1784p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1786q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1786q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1757a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1757a);
                        break;
                    case 6:
                        this.f1759b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1759b);
                        break;
                    case 7:
                        this.f1761c = obtainStyledAttributes.getFloat(index, this.f1761c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1764e);
                        this.f1764e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1764e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1766g);
                        this.f1766g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1766g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1768h);
                        this.f1768h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1768h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1770i);
                        this.f1770i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1770i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1772j);
                        this.f1772j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1772j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1774k);
                        this.f1774k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1774k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1776l);
                        this.f1776l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1776l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1778m);
                        this.f1778m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1778m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1788s);
                        this.f1788s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1788s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1789t);
                        this.f1789t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1789t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1790u);
                        this.f1790u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1790u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1791v);
                        this.f1791v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1791v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f1792w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1792w);
                        break;
                    case 22:
                        this.f1793x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1793x);
                        break;
                    case 23:
                        this.f1794y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1794y);
                        break;
                    case 24:
                        this.f1795z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1795z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        int i11 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i11;
                        if (i11 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i10) {
                            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                androidx.constraintlayout.widget.b.q(this, obtainStyledAttributes.getString(index));
                                continue;
                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1780n);
                                this.f1780n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1780n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1782o);
                                this.f1782o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1782o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i10) {
                                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                        androidx.constraintlayout.widget.b.p(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                        androidx.constraintlayout.widget.b.p(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                        this.f1762d = obtainStyledAttributes.getBoolean(index, this.f1762d);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f1763d0 = false;
            this.f1758a0 = true;
            this.f1760b0 = true;
            int i6 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i6 == -2 && this.W) {
                this.f1758a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i10 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i10 == -2 && this.X) {
                this.f1760b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i6 == 0 || i6 == -1) {
                this.f1758a0 = false;
                if (i6 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1760b0 = false;
                if (i10 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f1761c != -1.0f || this.f1757a != -1 || this.f1759b != -1) {
                this.f1763d0 = true;
                this.f1758a0 = true;
                this.f1760b0 = true;
                if (!(this.f1787q0 instanceof h)) {
                    this.f1787q0 = new h();
                }
                ((h) this.f1787q0).V(this.V);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i6) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i15 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i6);
            boolean z11 = false;
            if (1 == getLayoutDirection()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f1771i0 = -1;
            this.f1773j0 = -1;
            this.f1767g0 = -1;
            this.f1769h0 = -1;
            this.f1775k0 = this.f1792w;
            this.f1777l0 = this.f1794y;
            float f = this.E;
            this.f1779m0 = f;
            int i16 = this.f1757a;
            this.f1781n0 = i16;
            int i17 = this.f1759b;
            this.f1783o0 = i17;
            float f2 = this.f1761c;
            this.f1785p0 = f2;
            if (z10) {
                int i18 = this.f1788s;
                if (i18 != -1) {
                    this.f1771i0 = i18;
                } else {
                    int i19 = this.f1789t;
                    if (i19 != -1) {
                        this.f1773j0 = i19;
                    }
                    i10 = this.f1790u;
                    if (i10 != -1) {
                        this.f1769h0 = i10;
                        z11 = true;
                    }
                    i11 = this.f1791v;
                    if (i11 != -1) {
                        this.f1767g0 = i11;
                        z11 = true;
                    }
                    i12 = this.A;
                    if (i12 != Integer.MIN_VALUE) {
                        this.f1777l0 = i12;
                    }
                    i13 = this.B;
                    if (i13 != Integer.MIN_VALUE) {
                        this.f1775k0 = i13;
                    }
                    if (z11) {
                        this.f1779m0 = 1.0f - f;
                    }
                    if (this.f1763d0 && this.V == 1 && this.f1762d) {
                        if (f2 == -1.0f) {
                            this.f1785p0 = 1.0f - f2;
                            this.f1781n0 = -1;
                            this.f1783o0 = -1;
                        } else if (i16 != -1) {
                            this.f1783o0 = i16;
                            this.f1781n0 = -1;
                            this.f1785p0 = -1.0f;
                        } else if (i17 != -1) {
                            this.f1781n0 = i17;
                            this.f1783o0 = -1;
                            this.f1785p0 = -1.0f;
                        }
                    }
                }
                z11 = true;
                i10 = this.f1790u;
                if (i10 != -1) {
                }
                i11 = this.f1791v;
                if (i11 != -1) {
                }
                i12 = this.A;
                if (i12 != Integer.MIN_VALUE) {
                }
                i13 = this.B;
                if (i13 != Integer.MIN_VALUE) {
                }
                if (z11) {
                }
                if (this.f1763d0) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i20 = this.f1788s;
                if (i20 != -1) {
                    this.f1769h0 = i20;
                }
                int i21 = this.f1789t;
                if (i21 != -1) {
                    this.f1767g0 = i21;
                }
                int i22 = this.f1790u;
                if (i22 != -1) {
                    this.f1771i0 = i22;
                }
                int i23 = this.f1791v;
                if (i23 != -1) {
                    this.f1773j0 = i23;
                }
                int i24 = this.A;
                if (i24 != Integer.MIN_VALUE) {
                    this.f1775k0 = i24;
                }
                int i25 = this.B;
                if (i25 != Integer.MIN_VALUE) {
                    this.f1777l0 = i25;
                }
            }
            if (this.f1790u == -1 && this.f1791v == -1 && this.f1789t == -1 && this.f1788s == -1) {
                int i26 = this.f1766g;
                if (i26 != -1) {
                    this.f1771i0 = i26;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                    }
                } else {
                    int i27 = this.f1768h;
                    if (i27 != -1) {
                        this.f1773j0 = i27;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                        }
                    }
                }
                int i28 = this.f1764e;
                if (i28 != -1) {
                    this.f1767g0 = i28;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i14 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                        return;
                    }
                    return;
                }
                int i29 = this.f;
                if (i29 != -1) {
                    this.f1769h0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i14 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                    }
                }
            }
        }

        public a() {
            super(-2, -2);
            this.f1757a = -1;
            this.f1759b = -1;
            this.f1761c = -1.0f;
            this.f1762d = true;
            this.f1764e = -1;
            this.f = -1;
            this.f1766g = -1;
            this.f1768h = -1;
            this.f1770i = -1;
            this.f1772j = -1;
            this.f1774k = -1;
            this.f1776l = -1;
            this.f1778m = -1;
            this.f1780n = -1;
            this.f1782o = -1;
            this.f1784p = -1;
            this.f1786q = 0;
            this.r = 0.0f;
            this.f1788s = -1;
            this.f1789t = -1;
            this.f1790u = -1;
            this.f1791v = -1;
            this.f1792w = LinearLayoutManager.INVALID_OFFSET;
            this.f1793x = LinearLayoutManager.INVALID_OFFSET;
            this.f1794y = LinearLayoutManager.INVALID_OFFSET;
            this.f1795z = LinearLayoutManager.INVALID_OFFSET;
            this.A = LinearLayoutManager.INVALID_OFFSET;
            this.B = LinearLayoutManager.INVALID_OFFSET;
            this.C = LinearLayoutManager.INVALID_OFFSET;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1758a0 = true;
            this.f1760b0 = true;
            this.c0 = false;
            this.f1763d0 = false;
            this.e0 = false;
            this.f1765f0 = false;
            this.f1767g0 = -1;
            this.f1769h0 = -1;
            this.f1771i0 = -1;
            this.f1773j0 = -1;
            this.f1775k0 = LinearLayoutManager.INVALID_OFFSET;
            this.f1777l0 = LinearLayoutManager.INVALID_OFFSET;
            this.f1779m0 = 0.5f;
            this.f1787q0 = new x.e();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1757a = -1;
            this.f1759b = -1;
            this.f1761c = -1.0f;
            this.f1762d = true;
            this.f1764e = -1;
            this.f = -1;
            this.f1766g = -1;
            this.f1768h = -1;
            this.f1770i = -1;
            this.f1772j = -1;
            this.f1774k = -1;
            this.f1776l = -1;
            this.f1778m = -1;
            this.f1780n = -1;
            this.f1782o = -1;
            this.f1784p = -1;
            this.f1786q = 0;
            this.r = 0.0f;
            this.f1788s = -1;
            this.f1789t = -1;
            this.f1790u = -1;
            this.f1791v = -1;
            this.f1792w = LinearLayoutManager.INVALID_OFFSET;
            this.f1793x = LinearLayoutManager.INVALID_OFFSET;
            this.f1794y = LinearLayoutManager.INVALID_OFFSET;
            this.f1795z = LinearLayoutManager.INVALID_OFFSET;
            this.A = LinearLayoutManager.INVALID_OFFSET;
            this.B = LinearLayoutManager.INVALID_OFFSET;
            this.C = LinearLayoutManager.INVALID_OFFSET;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1758a0 = true;
            this.f1760b0 = true;
            this.c0 = false;
            this.f1763d0 = false;
            this.e0 = false;
            this.f1765f0 = false;
            this.f1767g0 = -1;
            this.f1769h0 = -1;
            this.f1771i0 = -1;
            this.f1773j0 = -1;
            this.f1775k0 = LinearLayoutManager.INVALID_OFFSET;
            this.f1777l0 = LinearLayoutManager.INVALID_OFFSET;
            this.f1779m0 = 0.5f;
            this.f1787q0 = new x.e();
        }
    }
}
