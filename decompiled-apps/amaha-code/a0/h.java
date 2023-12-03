package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
/* compiled from: KeyPosition.java */
/* loaded from: classes.dex */
public final class h extends i {
    public String f = null;

    /* renamed from: g  reason: collision with root package name */
    public int f45g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f46h = 0;

    /* renamed from: i  reason: collision with root package name */
    public float f47i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f48j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f49k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f50l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f51m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f52n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public int f53o = 0;

    /* compiled from: KeyPosition.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f54a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f54a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    @Override // a0.d
    public final d b() {
        h hVar = new h();
        super.c(this);
        hVar.f = this.f;
        hVar.f45g = this.f45g;
        hVar.f46h = this.f46h;
        hVar.f47i = this.f47i;
        hVar.f48j = Float.NaN;
        hVar.f49k = this.f49k;
        hVar.f50l = this.f50l;
        hVar.f51m = this.f51m;
        hVar.f52n = this.f52n;
        return hVar;
    }

    @Override // a0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tr.r.E);
        SparseIntArray sparseIntArray = a.f54a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            SparseIntArray sparseIntArray2 = a.f54a;
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
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f = w.c.f36203c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f55e = obtainStyledAttributes.getInteger(index, this.f55e);
                    break;
                case 5:
                    this.f46h = obtainStyledAttributes.getInt(index, this.f46h);
                    break;
                case 6:
                    this.f49k = obtainStyledAttributes.getFloat(index, this.f49k);
                    break;
                case 7:
                    this.f50l = obtainStyledAttributes.getFloat(index, this.f50l);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.f48j);
                    this.f47i = f;
                    this.f48j = f;
                    break;
                case 9:
                    this.f53o = obtainStyledAttributes.getInt(index, this.f53o);
                    break;
                case 10:
                    this.f45g = obtainStyledAttributes.getInt(index, this.f45g);
                    break;
                case 11:
                    this.f47i = obtainStyledAttributes.getFloat(index, this.f47i);
                    break;
                case 12:
                    this.f48j = obtainStyledAttributes.getFloat(index, this.f48j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f7a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    @Override // a0.d
    public final void a(HashMap<String, z.c> hashMap) {
    }
}
