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
/* compiled from: KeyTimeCycle.java */
/* loaded from: classes.dex */
public final class j extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f56e = -1;
    public float f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f57g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f58h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f59i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f60j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f61k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f62l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f63m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f64n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f65o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f66p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f67q = Float.NaN;
    public int r = 0;

    /* renamed from: s  reason: collision with root package name */
    public float f68s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f69t = 0.0f;

    /* compiled from: KeyTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f70a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f70a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public j() {
        this.f10d = new HashMap<>();
    }

    @Override // a0.d
    public final void a(HashMap<String, z.c> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // a0.d
    /* renamed from: b */
    public final d clone() {
        j jVar = new j();
        super.c(this);
        jVar.f56e = this.f56e;
        jVar.r = this.r;
        jVar.f68s = this.f68s;
        jVar.f69t = this.f69t;
        jVar.f67q = this.f67q;
        jVar.f = this.f;
        jVar.f57g = this.f57g;
        jVar.f58h = this.f58h;
        jVar.f61k = this.f61k;
        jVar.f59i = this.f59i;
        jVar.f60j = this.f60j;
        jVar.f62l = this.f62l;
        jVar.f63m = this.f63m;
        jVar.f64n = this.f64n;
        jVar.f65o = this.f65o;
        jVar.f66p = this.f66p;
        return jVar;
    }

    @Override // a0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f57g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f58h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f59i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f60j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f64n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f65o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f66p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f61k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f62l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f63m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f67q)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tr.r.F);
        SparseIntArray sparseIntArray = a.f70a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            SparseIntArray sparseIntArray2 = a.f70a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.f57g = obtainStyledAttributes.getDimension(index, this.f57g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f58h = obtainStyledAttributes.getFloat(index, this.f58h);
                    break;
                case 5:
                    this.f59i = obtainStyledAttributes.getFloat(index, this.f59i);
                    break;
                case 6:
                    this.f60j = obtainStyledAttributes.getFloat(index, this.f60j);
                    break;
                case 7:
                    this.f62l = obtainStyledAttributes.getFloat(index, this.f62l);
                    break;
                case 8:
                    this.f61k = obtainStyledAttributes.getFloat(index, this.f61k);
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
                    this.f56e = obtainStyledAttributes.getInteger(index, this.f56e);
                    break;
                case 14:
                    this.f63m = obtainStyledAttributes.getFloat(index, this.f63m);
                    break;
                case 15:
                    this.f64n = obtainStyledAttributes.getDimension(index, this.f64n);
                    break;
                case 16:
                    this.f65o = obtainStyledAttributes.getDimension(index, this.f65o);
                    break;
                case 17:
                    this.f66p = obtainStyledAttributes.getDimension(index, this.f66p);
                    break;
                case 18:
                    this.f67q = obtainStyledAttributes.getFloat(index, this.f67q);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.r = 7;
                        break;
                    } else {
                        this.r = obtainStyledAttributes.getInt(index, this.r);
                        break;
                    }
                case 20:
                    this.f68s = obtainStyledAttributes.getFloat(index, this.f68s);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.f69t = obtainStyledAttributes.getDimension(index, this.f69t);
                        break;
                    } else {
                        this.f69t = obtainStyledAttributes.getFloat(index, this.f69t);
                        break;
                    }
            }
        }
    }

    @Override // a0.d
    public final void f(HashMap<String, Integer> hashMap) {
        if (this.f56e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            hashMap.put("alpha", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f57g)) {
            hashMap.put("elevation", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f58h)) {
            hashMap.put("rotation", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f59i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f60j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f64n)) {
            hashMap.put("translationX", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f65o)) {
            hashMap.put("translationY", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f66p)) {
            hashMap.put("translationZ", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f61k)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f62l)) {
            hashMap.put("scaleX", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f62l)) {
            hashMap.put("scaleY", Integer.valueOf(this.f56e));
        }
        if (!Float.isNaN(this.f67q)) {
            hashMap.put(Constants.SCREEN_PROGRESS, Integer.valueOf(this.f56e));
        }
        if (this.f10d.size() > 0) {
            for (String str : this.f10d.keySet()) {
                hashMap.put(defpackage.c.r("CUSTOM,", str), Integer.valueOf(this.f56e));
            }
        }
    }
}
