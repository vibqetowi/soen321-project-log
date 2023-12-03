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
import z.c;
/* compiled from: KeyAttributes.java */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f11e = -1;
    public float f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f12g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f13h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f14i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f15j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f17l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f18m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f19n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f20o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f21p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f22q = Float.NaN;
    public float r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f23s = Float.NaN;

    /* compiled from: KeyAttributes.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f24a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public e() {
        this.f10d = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r1.equals("scaleY") == false) goto L154;
     */
    @Override // a0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(HashMap<String, z.c> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            z.c cVar = hashMap.get(next);
            if (cVar != null) {
                char c10 = 7;
                if (next.startsWith("CUSTOM")) {
                    b0.a aVar = this.f10d.get(next.substring(7));
                    if (aVar != null) {
                        ((c.b) cVar).f.append(this.f7a, aVar);
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
                            if (next.equals("translationX")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
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
                            break;
                        case -760884510:
                            if (next.equals("transformPivotX")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -760884509:
                            if (next.equals("transformPivotY")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c10 = 11;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
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
                            if (!Float.isNaN(this.f14i)) {
                                cVar.b(this.f14i, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.f15j)) {
                                cVar.b(this.f15j, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.f21p)) {
                                cVar.b(this.f21p, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.f22q)) {
                                cVar.b(this.f22q, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.r)) {
                                cVar.b(this.r, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.f23s)) {
                                cVar.b(this.f23s, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.f19n)) {
                                cVar.b(this.f19n, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.f20o)) {
                                cVar.b(this.f20o, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.f14i)) {
                                cVar.b(this.f16k, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.f15j)) {
                                cVar.b(this.f17l, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.f13h)) {
                                cVar.b(this.f13h, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.f12g)) {
                                cVar.b(this.f12g, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.f18m)) {
                                cVar.b(this.f18m, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.f)) {
                                cVar.b(this.f, this.f7a);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    @Override // a0.d
    /* renamed from: b */
    public final d clone() {
        e eVar = new e();
        super.c(this);
        eVar.f11e = this.f11e;
        eVar.f = this.f;
        eVar.f12g = this.f12g;
        eVar.f13h = this.f13h;
        eVar.f14i = this.f14i;
        eVar.f15j = this.f15j;
        eVar.f16k = this.f16k;
        eVar.f17l = this.f17l;
        eVar.f18m = this.f18m;
        eVar.f19n = this.f19n;
        eVar.f20o = this.f20o;
        eVar.f21p = this.f21p;
        eVar.f22q = this.f22q;
        eVar.r = this.r;
        eVar.f23s = this.f23s;
        return eVar;
    }

    @Override // a0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f12g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f13h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f14i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f15j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f16k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f17l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f21p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f22q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f18m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f19n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f20o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f23s)) {
            hashSet.add(Constants.SCREEN_PROGRESS);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tr.r.C);
        SparseIntArray sparseIntArray = a.f24a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            SparseIntArray sparseIntArray2 = a.f24a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.f12g = obtainStyledAttributes.getDimension(index, this.f12g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f13h = obtainStyledAttributes.getFloat(index, this.f13h);
                    break;
                case 5:
                    this.f14i = obtainStyledAttributes.getFloat(index, this.f14i);
                    break;
                case 6:
                    this.f15j = obtainStyledAttributes.getFloat(index, this.f15j);
                    break;
                case 7:
                    this.f19n = obtainStyledAttributes.getFloat(index, this.f19n);
                    break;
                case 8:
                    this.f18m = obtainStyledAttributes.getFloat(index, this.f18m);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f7a = obtainStyledAttributes.getInt(index, this.f7a);
                    break;
                case 13:
                    this.f11e = obtainStyledAttributes.getInteger(index, this.f11e);
                    break;
                case 14:
                    this.f20o = obtainStyledAttributes.getFloat(index, this.f20o);
                    break;
                case 15:
                    this.f21p = obtainStyledAttributes.getDimension(index, this.f21p);
                    break;
                case 16:
                    this.f22q = obtainStyledAttributes.getDimension(index, this.f22q);
                    break;
                case 17:
                    this.r = obtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 18:
                    this.f23s = obtainStyledAttributes.getFloat(index, this.f23s);
                    break;
                case 19:
                    this.f16k = obtainStyledAttributes.getDimension(index, this.f16k);
                    break;
                case 20:
                    this.f17l = obtainStyledAttributes.getDimension(index, this.f17l);
                    break;
            }
        }
    }

    @Override // a0.d
    public final void f(HashMap<String, Integer> hashMap) {
        if (this.f11e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            hashMap.put("alpha", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f12g)) {
            hashMap.put("elevation", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f13h)) {
            hashMap.put("rotation", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f14i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f15j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f16k)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f17l)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f21p)) {
            hashMap.put("translationX", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f22q)) {
            hashMap.put("translationY", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("translationZ", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f18m)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f19n)) {
            hashMap.put("scaleX", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f20o)) {
            hashMap.put("scaleY", Integer.valueOf(this.f11e));
        }
        if (!Float.isNaN(this.f23s)) {
            hashMap.put(Constants.SCREEN_PROGRESS, Integer.valueOf(this.f11e));
        }
        if (this.f10d.size() > 0) {
            for (String str : this.f10d.keySet()) {
                hashMap.put(defpackage.c.r("CUSTOM,", str), Integer.valueOf(this.f11e));
            }
        }
    }
}
