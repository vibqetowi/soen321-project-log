package b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import tr.r;
import v.h;
/* compiled from: ConstraintAttribute.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3904a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3905b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3906c;

    /* renamed from: d  reason: collision with root package name */
    public int f3907d;

    /* renamed from: e  reason: collision with root package name */
    public float f3908e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3909g;

    /* renamed from: h  reason: collision with root package name */
    public int f3910h;

    public a(String str, int i6, Object obj, boolean z10) {
        this.f3904a = false;
        this.f3905b = str;
        this.f3906c = i6;
        this.f3904a = z10;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.B);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i6 = 0;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i6 = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i6 = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i6 = 4;
            } else {
                if (index == 7) {
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    i6 = 2;
                } else if (index == 6) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    i6 = 1;
                } else if (index == 9) {
                    obj = obtainStyledAttributes.getString(index);
                    i6 = 5;
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                    i6 = 8;
                }
                i6 = 7;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, i6, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, a> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            a aVar = hashMap.get(str2);
            if (!aVar.f3904a) {
                str = defpackage.c.r("set", str2);
            } else {
                str = str2;
            }
            try {
                switch (h.d(aVar.f3906c)) {
                    case 0:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f3907d));
                        break;
                    case 1:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(aVar.f3908e));
                        break;
                    case 2:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f3910h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f3910h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str, CharSequence.class).invoke(view, aVar.f);
                        break;
                    case 5:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f3909g));
                        break;
                    case 6:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(aVar.f3908e));
                        break;
                    case 7:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f3907d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder g5 = defpackage.d.g(" Custom Attribute \"", str2, "\" not found on ");
                g5.append(cls.getName());
                Log.e("TransitionLayout", g5.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
            } catch (InvocationTargetException e12) {
                StringBuilder g10 = defpackage.d.g(" Custom Attribute \"", str2, "\" not found on ");
                g10.append(cls.getName());
                Log.e("TransitionLayout", g10.toString());
                e12.printStackTrace();
            }
        }
    }

    public final float a() {
        switch (h.d(this.f3906c)) {
            case 0:
                return this.f3907d;
            case 1:
                return this.f3908e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                if (this.f3909g) {
                    return 1.0f;
                }
                return 0.0f;
            case 6:
                return this.f3908e;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        float f;
        switch (h.d(this.f3906c)) {
            case 0:
                fArr[0] = this.f3907d;
                return;
            case 1:
                fArr[0] = this.f3908e;
                return;
            case 2:
            case 3:
                int i6 = this.f3910h;
                float pow = (float) Math.pow(((i6 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i6 >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i6 & 255) / 255.0f, 2.2d);
                fArr[3] = ((i6 >> 24) & 255) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (this.f3909g) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 6:
                fArr[0] = this.f3908e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int d10 = h.d(this.f3906c);
        if (d10 != 2 && d10 != 3) {
            return 1;
        }
        return 4;
    }

    public final void f(Object obj) {
        switch (h.d(this.f3906c)) {
            case 0:
            case 7:
                this.f3907d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f3908e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f3910h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f = (String) obj;
                return;
            case 5:
                this.f3909g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f3908e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f3904a = false;
        this.f3905b = aVar.f3905b;
        this.f3906c = aVar.f3906c;
        f(obj);
    }
}
