package a0;

import android.graphics.Rect;
import android.util.Log;
import androidx.constraintlayout.widget.b;
import com.theinnerhour.b2b.utils.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import z.c;
/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
public final class l implements Comparable<l> {

    /* renamed from: w  reason: collision with root package name */
    public int f92w;

    /* renamed from: u  reason: collision with root package name */
    public float f90u = 1.0f;

    /* renamed from: v  reason: collision with root package name */
    public int f91v = 0;

    /* renamed from: x  reason: collision with root package name */
    public float f93x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    public float f94y = 0.0f;

    /* renamed from: z  reason: collision with root package name */
    public float f95z = 0.0f;
    public float A = 0.0f;
    public float B = 1.0f;
    public float C = 1.0f;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = 0.0f;
    public float G = 0.0f;
    public float H = 0.0f;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public final LinkedHashMap<String, b0.a> K = new LinkedHashMap<>();

    public static boolean f(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) <= 1.0E-6f) {
                return false;
            }
            return true;
        } else if (Float.isNaN(f) == Float.isNaN(f2)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        lVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d(HashMap<String, z.c> hashMap, int i6) {
        char c10;
        for (String str : hashMap.keySet()) {
            z.c cVar = hashMap.get(str);
            str.getClass();
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1001078227:
                    if (str.equals(Constants.SCREEN_PROGRESS)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c10) {
                case 0:
                    if (!Float.isNaN(this.f95z)) {
                        f2 = this.f95z;
                    }
                    cVar.b(f2, i6);
                    break;
                case 1:
                    if (!Float.isNaN(this.A)) {
                        f2 = this.A;
                    }
                    cVar.b(f2, i6);
                    break;
                case 2:
                    if (!Float.isNaN(this.F)) {
                        f2 = this.F;
                    }
                    cVar.b(f2, i6);
                    break;
                case 3:
                    if (!Float.isNaN(this.G)) {
                        f2 = this.G;
                    }
                    cVar.b(f2, i6);
                    break;
                case 4:
                    if (!Float.isNaN(this.H)) {
                        f2 = this.H;
                    }
                    cVar.b(f2, i6);
                    break;
                case 5:
                    if (!Float.isNaN(this.J)) {
                        f2 = this.J;
                    }
                    cVar.b(f2, i6);
                    break;
                case 6:
                    if (!Float.isNaN(this.B)) {
                        f = this.B;
                    }
                    cVar.b(f, i6);
                    break;
                case 7:
                    if (!Float.isNaN(this.C)) {
                        f = this.C;
                    }
                    cVar.b(f, i6);
                    break;
                case '\b':
                    if (!Float.isNaN(this.D)) {
                        f2 = this.D;
                    }
                    cVar.b(f2, i6);
                    break;
                case '\t':
                    if (!Float.isNaN(this.E)) {
                        f2 = this.E;
                    }
                    cVar.b(f2, i6);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f94y)) {
                        f2 = this.f94y;
                    }
                    cVar.b(f2, i6);
                    break;
                case 11:
                    if (!Float.isNaN(this.f93x)) {
                        f2 = this.f93x;
                    }
                    cVar.b(f2, i6);
                    break;
                case '\f':
                    if (!Float.isNaN(this.I)) {
                        f2 = this.I;
                    }
                    cVar.b(f2, i6);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f90u)) {
                        f = this.f90u;
                    }
                    cVar.b(f, i6);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, b0.a> linkedHashMap = this.K;
                        if (linkedHashMap.containsKey(str2)) {
                            b0.a aVar = linkedHashMap.get(str2);
                            if (cVar instanceof c.b) {
                                ((c.b) cVar).f.append(i6, aVar);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i6 + ", value" + aVar.a() + cVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    }
            }
        }
    }

    public final void h(Rect rect, androidx.constraintlayout.widget.b bVar, int i6, int i10) {
        float f;
        rect.width();
        rect.height();
        b.a k10 = bVar.k(i10);
        b.d dVar = k10.f1821c;
        int i11 = dVar.f1891c;
        this.f91v = i11;
        int i12 = dVar.f1890b;
        this.f92w = i12;
        if (i12 != 0 && i11 == 0) {
            f = 0.0f;
        } else {
            f = dVar.f1892d;
        }
        this.f90u = f;
        b.e eVar = k10.f;
        boolean z10 = eVar.f1906m;
        this.f93x = eVar.f1907n;
        this.f94y = eVar.f1896b;
        this.f95z = eVar.f1897c;
        this.A = eVar.f1898d;
        this.B = eVar.f1899e;
        this.C = eVar.f;
        this.D = eVar.f1900g;
        this.E = eVar.f1901h;
        this.F = eVar.f1903j;
        this.G = eVar.f1904k;
        this.H = eVar.f1905l;
        b.c cVar = k10.f1822d;
        w.c.c(cVar.f1880d);
        this.I = cVar.f1883h;
        this.J = k10.f1821c.f1893e;
        Iterator<String> it = k10.f1824g.keySet().iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            b0.a aVar = k10.f1824g.get(next);
            int d10 = v.h.d(aVar.f3906c);
            if ((d10 == 4 || d10 == 5 || d10 == 7) ? false : false) {
                this.K.put(next, aVar);
            }
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        return;
                    }
                }
            }
            float f2 = this.f94y + 90.0f;
            this.f94y = f2;
            if (f2 > 180.0f) {
                this.f94y = f2 - 360.0f;
                return;
            }
            return;
        }
        this.f94y -= 90.0f;
    }
}
