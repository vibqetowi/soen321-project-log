package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: KeyTrigger.java */
/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: q  reason: collision with root package name */
    public float f82q;

    /* renamed from: e  reason: collision with root package name */
    public String f71e = null;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f72g = null;

    /* renamed from: h  reason: collision with root package name */
    public String f73h = null;

    /* renamed from: i  reason: collision with root package name */
    public int f74i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f75j = -1;

    /* renamed from: k  reason: collision with root package name */
    public View f76k = null;

    /* renamed from: l  reason: collision with root package name */
    public float f77l = 0.1f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f78m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f79n = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f80o = true;

    /* renamed from: p  reason: collision with root package name */
    public float f81p = Float.NaN;
    public boolean r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f83s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f84t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f85u = -1;

    /* renamed from: v  reason: collision with root package name */
    public RectF f86v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    public RectF f87w = new RectF();

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, Method> f88x = new HashMap<>();

    /* compiled from: KeyTrigger.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f89a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f89a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public k() {
        this.f10d = new HashMap<>();
    }

    public static void i(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // a0.d
    /* renamed from: b */
    public final d clone() {
        k kVar = new k();
        super.c(this);
        kVar.f71e = this.f71e;
        kVar.f = this.f;
        kVar.f72g = this.f72g;
        kVar.f73h = this.f73h;
        kVar.f74i = this.f74i;
        kVar.f75j = this.f75j;
        kVar.f76k = this.f76k;
        kVar.f77l = this.f77l;
        kVar.f78m = this.f78m;
        kVar.f79n = this.f79n;
        kVar.f80o = this.f80o;
        kVar.f81p = this.f81p;
        kVar.f82q = this.f82q;
        kVar.r = this.r;
        kVar.f86v = this.f86v;
        kVar.f87w = this.f87w;
        kVar.f88x = this.f88x;
        return kVar;
    }

    @Override // a0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tr.r.G);
        SparseIntArray sparseIntArray = a.f89a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            SparseIntArray sparseIntArray2 = a.f89a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f72g = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f73h = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f71e = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f77l = obtainStyledAttributes.getFloat(index, this.f77l);
                    break;
                case 6:
                    this.f74i = obtainStyledAttributes.getResourceId(index, this.f74i);
                    break;
                case 7:
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
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.f7a);
                    this.f7a = integer;
                    this.f81p = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f75j = obtainStyledAttributes.getResourceId(index, this.f75j);
                    break;
                case 10:
                    this.r = obtainStyledAttributes.getBoolean(index, this.r);
                    break;
                case 11:
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    break;
                case 12:
                    this.f85u = obtainStyledAttributes.getResourceId(index, this.f85u);
                    break;
                case 13:
                    this.f83s = obtainStyledAttributes.getResourceId(index, this.f83s);
                    break;
                case 14:
                    this.f84t = obtainStyledAttributes.getResourceId(index, this.f84t);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, float f) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        MotionLayout.h hVar;
        CopyOnWriteArrayList<MotionLayout.h> copyOnWriteArrayList;
        View findViewById;
        if (this.f75j != -1) {
            if (this.f76k == null) {
                this.f76k = ((ViewGroup) view.getParent()).findViewById(this.f75j);
            }
            i(this.f86v, this.f76k, this.r);
            i(this.f87w, view, this.r);
            if (this.f86v.intersect(this.f87w)) {
                if (this.f78m) {
                    this.f78m = false;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f80o) {
                    this.f80o = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f79n = true;
                z11 = false;
                this.f82q = f;
                if (!z11 || z10 || z13) {
                    MotionLayout motionLayout = (MotionLayout) view.getParent();
                    hVar = motionLayout.f1597g0;
                    if (hVar != null) {
                        hVar.d();
                    }
                    copyOnWriteArrayList = motionLayout.f1614x0;
                    if (copyOnWriteArrayList != null) {
                        Iterator<MotionLayout.h> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            it.next().d();
                        }
                    }
                }
                if (this.f == -1) {
                    findViewById = view;
                } else {
                    findViewById = ((MotionLayout) view.getParent()).findViewById(this.f);
                }
                if (z11) {
                    String str = this.f72g;
                    if (str != null) {
                        h(findViewById, str);
                    }
                    if (this.f83s != -1) {
                        ((MotionLayout) view.getParent()).D(this.f83s, findViewById);
                    }
                }
                if (z13) {
                    String str2 = this.f73h;
                    if (str2 != null) {
                        h(findViewById, str2);
                    }
                    if (this.f84t != -1) {
                        ((MotionLayout) view.getParent()).D(this.f84t, findViewById);
                    }
                }
                if (z10) {
                    String str3 = this.f71e;
                    if (str3 != null) {
                        h(findViewById, str3);
                    }
                    if (this.f85u != -1) {
                        ((MotionLayout) view.getParent()).D(this.f85u, findViewById);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.f78m) {
                this.f78m = true;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f79n) {
                this.f79n = false;
                z12 = true;
            } else {
                z12 = false;
            }
            this.f80o = true;
            z11 = z12;
        } else {
            if (this.f78m) {
                float f2 = this.f81p;
                if ((this.f82q - f2) * (f - f2) < 0.0f) {
                    this.f78m = false;
                    z10 = true;
                    if (!this.f79n) {
                        float f10 = this.f81p;
                        float f11 = f - f10;
                        if ((this.f82q - f10) * f11 < 0.0f && f11 < 0.0f) {
                            this.f79n = false;
                            z11 = true;
                            if (this.f80o) {
                                float f12 = this.f81p;
                                float f13 = f - f12;
                                if ((this.f82q - f12) * f13 < 0.0f && f13 > 0.0f) {
                                    this.f80o = false;
                                    z13 = true;
                                    this.f82q = f;
                                    if (!z11) {
                                    }
                                    MotionLayout motionLayout2 = (MotionLayout) view.getParent();
                                    hVar = motionLayout2.f1597g0;
                                    if (hVar != null) {
                                    }
                                    copyOnWriteArrayList = motionLayout2.f1614x0;
                                    if (copyOnWriteArrayList != null) {
                                    }
                                    if (this.f == -1) {
                                    }
                                    if (z11) {
                                    }
                                    if (z13) {
                                    }
                                    if (z10) {
                                    }
                                }
                            } else {
                                if (Math.abs(f - this.f81p) > this.f77l) {
                                    this.f80o = true;
                                }
                                z12 = z11;
                                z11 = z12;
                            }
                        }
                    } else if (Math.abs(f - this.f81p) > this.f77l) {
                        this.f79n = true;
                    }
                    z11 = false;
                    if (this.f80o) {
                    }
                }
            } else if (Math.abs(f - this.f81p) > this.f77l) {
                this.f78m = true;
            }
            z10 = false;
            if (!this.f79n) {
            }
            z11 = false;
            if (this.f80o) {
            }
        }
        z13 = false;
        this.f82q = f;
        if (!z11) {
        }
        MotionLayout motionLayout22 = (MotionLayout) view.getParent();
        hVar = motionLayout22.f1597g0;
        if (hVar != null) {
        }
        copyOnWriteArrayList = motionLayout22.f1614x0;
        if (copyOnWriteArrayList != null) {
        }
        if (this.f == -1) {
        }
        if (z11) {
        }
        if (z13) {
        }
        if (z10) {
        }
    }

    public final void h(View view, String str) {
        Method method;
        boolean z10;
        String str2;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            if (str.length() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                str = str.substring(1).toLowerCase(Locale.ROOT);
            }
            for (String str3 : this.f10d.keySet()) {
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                if (z10 || lowerCase.matches(str)) {
                    b0.a aVar = this.f10d.get(str3);
                    if (aVar != null) {
                        Class<?> cls = view.getClass();
                        boolean z11 = aVar.f3904a;
                        String str4 = aVar.f3905b;
                        if (!z11) {
                            str2 = defpackage.c.r("set", str4);
                        } else {
                            str2 = str4;
                        }
                        try {
                            switch (v.h.d(aVar.f3906c)) {
                                case 0:
                                case 7:
                                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f3907d));
                                    break;
                                case 1:
                                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f3908e));
                                    break;
                                case 2:
                                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f3910h));
                                    break;
                                case 3:
                                    Method method2 = cls.getMethod(str2, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(aVar.f3910h);
                                    method2.invoke(view, colorDrawable);
                                    break;
                                case 4:
                                    cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f);
                                    break;
                                case 5:
                                    cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f3909g));
                                    break;
                                case 6:
                                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f3908e));
                                    break;
                            }
                        } catch (IllegalAccessException e10) {
                            StringBuilder g5 = defpackage.d.g(" Custom Attribute \"", str4, "\" not found on ");
                            g5.append(cls.getName());
                            Log.e("TransitionLayout", g5.toString());
                            e10.printStackTrace();
                        } catch (NoSuchMethodException e11) {
                            Log.e("TransitionLayout", e11.getMessage());
                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2);
                        } catch (InvocationTargetException e12) {
                            StringBuilder g10 = defpackage.d.g(" Custom Attribute \"", str4, "\" not found on ");
                            g10.append(cls.getName());
                            Log.e("TransitionLayout", g10.toString());
                            e12.printStackTrace();
                        }
                    }
                }
            }
            return;
        }
        if (this.f88x.containsKey(str)) {
            method = this.f88x.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.f88x.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f88x.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + a0.a.d(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f71e + "\"on class " + view.getClass().getSimpleName() + " " + a0.a.d(view));
        }
    }

    @Override // a0.d
    public final void a(HashMap<String, z.c> hashMap) {
    }

    @Override // a0.d
    public final void d(HashSet<String> hashSet) {
    }
}
