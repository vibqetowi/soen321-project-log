package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.utils.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import w.f;
/* compiled from: KeyCycle.java */
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f25e = 0;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f26g = null;

    /* renamed from: h  reason: collision with root package name */
    public float f27h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f28i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f29j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f30k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public int f31l = -1;

    /* renamed from: m  reason: collision with root package name */
    public float f32m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f33n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f34o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f35p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f36q = Float.NaN;
    public float r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f37s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f38t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    public float f39u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    public float f40v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f41w = Float.NaN;

    /* compiled from: KeyCycle.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f42a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f42a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public f() {
        this.f10d = new HashMap<>();
    }

    @Override // a0.d
    public final void a(HashMap<String, z.c> hashMap) {
        String str = "add " + hashMap.size() + " values";
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str2 = " ";
        for (int i6 = 1; i6 <= min; i6++) {
            StackTraceElement stackTraceElement = stackTrace[i6];
            str2 = pl.a.f(str2, " ");
            Log.v("KeyCycle", str + str2 + (".(" + stackTrace[i6].getFileName() + ":" + stackTrace[i6].getLineNumber() + ") " + stackTrace[i6].getMethodName()) + str2);
        }
        for (String str3 : hashMap.keySet()) {
            z.c cVar = hashMap.get(str3);
            if (cVar != null) {
                str3.getClass();
                str3.hashCode();
                char c10 = 65535;
                switch (str3.hashCode()) {
                    case -1249320806:
                        if (str3.equals("rotationX")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str3.equals("rotationY")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str3.equals("translationX")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str3.equals("translationY")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str3.equals("translationZ")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str3.equals(Constants.SCREEN_PROGRESS)) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str3.equals("scaleX")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str3.equals("scaleY")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str3.equals("rotation")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str3.equals("elevation")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str3.equals("transitionPathRotate")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str3.equals("alpha")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str3.equals("waveOffset")) {
                            c10 = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str3.equals("wavePhase")) {
                            c10 = '\r';
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        cVar.b(this.f36q, this.f7a);
                        continue;
                    case 1:
                        cVar.b(this.r, this.f7a);
                        continue;
                    case 2:
                        cVar.b(this.f39u, this.f7a);
                        continue;
                    case 3:
                        cVar.b(this.f40v, this.f7a);
                        continue;
                    case 4:
                        cVar.b(this.f41w, this.f7a);
                        continue;
                    case 5:
                        cVar.b(this.f30k, this.f7a);
                        continue;
                    case 6:
                        cVar.b(this.f37s, this.f7a);
                        continue;
                    case 7:
                        cVar.b(this.f38t, this.f7a);
                        continue;
                    case '\b':
                        cVar.b(this.f34o, this.f7a);
                        continue;
                    case '\t':
                        cVar.b(this.f33n, this.f7a);
                        continue;
                    case '\n':
                        cVar.b(this.f35p, this.f7a);
                        continue;
                    case 11:
                        cVar.b(this.f32m, this.f7a);
                        continue;
                    case '\f':
                        cVar.b(this.f28i, this.f7a);
                        continue;
                    case '\r':
                        cVar.b(this.f29j, this.f7a);
                        continue;
                    default:
                        if (!str3.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  ".concat(str3));
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    @Override // a0.d
    /* renamed from: b */
    public final d clone() {
        f fVar = new f();
        super.c(this);
        fVar.f25e = this.f25e;
        fVar.f = this.f;
        fVar.f26g = this.f26g;
        fVar.f27h = this.f27h;
        fVar.f28i = this.f28i;
        fVar.f29j = this.f29j;
        fVar.f30k = this.f30k;
        fVar.f31l = this.f31l;
        fVar.f32m = this.f32m;
        fVar.f33n = this.f33n;
        fVar.f34o = this.f34o;
        fVar.f35p = this.f35p;
        fVar.f36q = this.f36q;
        fVar.r = this.r;
        fVar.f37s = this.f37s;
        fVar.f38t = this.f38t;
        fVar.f39u = this.f39u;
        fVar.f40v = this.f40v;
        fVar.f41w = this.f41w;
        return fVar;
    }

    @Override // a0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f32m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f33n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f34o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f36q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f37s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f38t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f35p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f39u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f40v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41w)) {
            hashSet.add("translationZ");
        }
        if (this.f10d.size() > 0) {
            Iterator<String> it = this.f10d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // a0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tr.r.D);
        SparseIntArray sparseIntArray = a.f42a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            SparseIntArray sparseIntArray2 = a.f42a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.Y0) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f8b);
                        this.f8b = resourceId;
                        if (resourceId == -1) {
                            this.f9c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f9c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f8b = obtainStyledAttributes.getResourceId(index, this.f8b);
                        break;
                    }
                case 2:
                    this.f7a = obtainStyledAttributes.getInt(index, this.f7a);
                    break;
                case 3:
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f25e = obtainStyledAttributes.getInteger(index, this.f25e);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f26g = obtainStyledAttributes.getString(index);
                        this.f = 7;
                        break;
                    } else {
                        this.f = obtainStyledAttributes.getInt(index, this.f);
                        break;
                    }
                case 6:
                    this.f27h = obtainStyledAttributes.getFloat(index, this.f27h);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.f28i = obtainStyledAttributes.getDimension(index, this.f28i);
                        break;
                    } else {
                        this.f28i = obtainStyledAttributes.getFloat(index, this.f28i);
                        break;
                    }
                case 8:
                    this.f31l = obtainStyledAttributes.getInt(index, this.f31l);
                    break;
                case 9:
                    this.f32m = obtainStyledAttributes.getFloat(index, this.f32m);
                    break;
                case 10:
                    this.f33n = obtainStyledAttributes.getDimension(index, this.f33n);
                    break;
                case 11:
                    this.f34o = obtainStyledAttributes.getFloat(index, this.f34o);
                    break;
                case 12:
                    this.f36q = obtainStyledAttributes.getFloat(index, this.f36q);
                    break;
                case 13:
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 14:
                    this.f35p = obtainStyledAttributes.getFloat(index, this.f35p);
                    break;
                case 15:
                    this.f37s = obtainStyledAttributes.getFloat(index, this.f37s);
                    break;
                case 16:
                    this.f38t = obtainStyledAttributes.getFloat(index, this.f38t);
                    break;
                case 17:
                    this.f39u = obtainStyledAttributes.getDimension(index, this.f39u);
                    break;
                case 18:
                    this.f40v = obtainStyledAttributes.getDimension(index, this.f40v);
                    break;
                case 19:
                    this.f41w = obtainStyledAttributes.getDimension(index, this.f41w);
                    break;
                case 20:
                    this.f30k = obtainStyledAttributes.getFloat(index, this.f30k);
                    break;
                case 21:
                    this.f29j = obtainStyledAttributes.getFloat(index, this.f29j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0103, code lost:
        if (r3.equals("translationX") == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(HashMap<String, z.b> hashMap) {
        z.b bVar;
        float f;
        float f2;
        z.b bVar2;
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            char c10 = 2;
            if (next.startsWith("CUSTOM")) {
                b0.a aVar = this.f10d.get(next.substring(7));
                if (aVar != null && aVar.f3906c == 2 && (bVar = hashMap.get(next)) != null) {
                    int i6 = this.f7a;
                    int i10 = this.f;
                    String str = this.f26g;
                    int i11 = this.f31l;
                    bVar.f.add(new f.b(i6, this.f27h, this.f28i, this.f29j, aVar.a()));
                    if (i11 != -1) {
                        bVar.f36213e = i11;
                    }
                    bVar.f36211c = i10;
                    bVar.b(aVar);
                    bVar.f36212d = str;
                }
            } else {
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1225497657:
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1001078227:
                        if (next.equals(Constants.SCREEN_PROGRESS)) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -40300674:
                        if (next.equals("rotation")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c10 = 11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c10 = '\f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c10 = '\r';
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
                        f = this.f36q;
                        f2 = f;
                        break;
                    case 1:
                        f = this.r;
                        f2 = f;
                        break;
                    case 2:
                        f = this.f39u;
                        f2 = f;
                        break;
                    case 3:
                        f = this.f40v;
                        f2 = f;
                        break;
                    case 4:
                        f = this.f41w;
                        f2 = f;
                        break;
                    case 5:
                        f = this.f30k;
                        f2 = f;
                        break;
                    case 6:
                        f = this.f37s;
                        f2 = f;
                        break;
                    case 7:
                        f = this.f38t;
                        f2 = f;
                        break;
                    case '\b':
                        f = this.f34o;
                        f2 = f;
                        break;
                    case '\t':
                        f = this.f33n;
                        f2 = f;
                        break;
                    case '\n':
                        f = this.f35p;
                        f2 = f;
                        break;
                    case 11:
                        f = this.f32m;
                        f2 = f;
                        break;
                    case '\f':
                        f = this.f28i;
                        f2 = f;
                        break;
                    case '\r':
                        f = this.f29j;
                        f2 = f;
                        break;
                    default:
                        if (!next.startsWith("CUSTOM")) {
                            Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(next));
                        }
                        f2 = Float.NaN;
                        break;
                }
                if (!Float.isNaN(f2) && (bVar2 = hashMap.get(next)) != null) {
                    int i12 = this.f7a;
                    int i13 = this.f;
                    String str2 = this.f26g;
                    int i14 = this.f31l;
                    bVar2.f.add(new f.b(i12, this.f27h, this.f28i, this.f29j, f2));
                    if (i14 != -1) {
                        bVar2.f36213e = i14;
                    }
                    bVar2.f36211c = i13;
                    bVar2.f36212d = str2;
                }
            }
        }
    }
}
