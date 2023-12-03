package s1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParserException;
import s1.a;
import s1.c0;
/* compiled from: NavInflater.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f31244c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f31245a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f31246b;

    /* compiled from: NavInflater.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static c0 a(TypedValue typedValue, c0 c0Var, c0 c0Var2, String str, String str2) {
            if (c0Var != null && c0Var != c0Var2) {
                throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
            } else if (c0Var == null) {
                return c0Var2;
            } else {
                return c0Var;
            }
        }
    }

    public z(Context context, i0 navigatorProvider) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(navigatorProvider, "navigatorProvider");
        this.f31245a = context;
        this.f31246b = navigatorProvider;
    }

    public static e c(TypedArray typedArray, Resources resources, int i6) {
        boolean z10;
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        Class cls;
        c0 c0Var4;
        boolean z11;
        Object obj;
        c0 c0Var5;
        boolean z12;
        boolean z13;
        String str;
        boolean z14 = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = f31244c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        c0 c0Var6 = c0.f31091c;
        c0 c0Var7 = c0.f31095h;
        c0 c0Var8 = c0.f31099l;
        c0 c0Var9 = c0.f31097j;
        c0 c0Var10 = c0.f;
        c0 c0Var11 = c0.f31092d;
        c0 c0Var12 = c0.f31093e;
        c0 c0Var13 = c0.f31098k;
        c0 c0Var14 = c0.f31096i;
        c0 c0Var15 = c0.f31094g;
        c0 c0Var16 = c0.f31090b;
        c0 c0Var17 = null;
        if (string != null) {
            c0Var = c0Var11;
            String resourcePackageName = resources.getResourcePackageName(i6);
            if (kotlin.jvm.internal.i.b("integer", string)) {
                z10 = z14;
                c0Var3 = c0Var16;
            } else {
                z10 = z14;
                if (kotlin.jvm.internal.i.b("integer[]", string)) {
                    c0Var3 = c0Var;
                } else if (kotlin.jvm.internal.i.b("long", string)) {
                    c0Var3 = c0Var12;
                } else if (kotlin.jvm.internal.i.b("long[]", string)) {
                    c0Var3 = c0Var10;
                } else if (kotlin.jvm.internal.i.b("boolean", string)) {
                    c0Var3 = c0Var14;
                } else if (kotlin.jvm.internal.i.b("boolean[]", string)) {
                    c0Var3 = c0Var9;
                } else if (kotlin.jvm.internal.i.b("string", string)) {
                    c0Var3 = c0Var13;
                } else if (kotlin.jvm.internal.i.b("string[]", string)) {
                    c0Var3 = c0Var8;
                } else if (kotlin.jvm.internal.i.b("float", string)) {
                    c0Var3 = c0Var15;
                } else if (kotlin.jvm.internal.i.b("float[]", string)) {
                    c0Var3 = c0Var7;
                } else if (kotlin.jvm.internal.i.b("reference", string)) {
                    c0Var3 = c0Var6;
                } else {
                    if (string.length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        try {
                            if (gv.n.H0(string, ".") && resourcePackageName != null) {
                                str = resourcePackageName.concat(string);
                            } else {
                                str = string;
                            }
                            if (gv.n.z0(string, "[]")) {
                                c0Var2 = c0Var12;
                                str = str.substring(0, str.length() - 2);
                                kotlin.jvm.internal.i.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                Class<?> cls2 = Class.forName(str);
                                if (Parcelable.class.isAssignableFrom(cls2)) {
                                    c0Var3 = new c0.m(cls2);
                                } else {
                                    if (Serializable.class.isAssignableFrom(cls2)) {
                                        c0Var3 = new c0.o(cls2);
                                    }
                                    throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                }
                            } else {
                                c0Var2 = c0Var12;
                                Class<?> cls3 = Class.forName(str);
                                if (Parcelable.class.isAssignableFrom(cls3)) {
                                    c0Var3 = new c0.n(cls3);
                                } else if (Enum.class.isAssignableFrom(cls3)) {
                                    c0Var3 = new c0.l(cls3);
                                } else {
                                    if (Serializable.class.isAssignableFrom(cls3)) {
                                        c0Var3 = new c0.p(cls3);
                                    }
                                    throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                }
                            }
                        } catch (ClassNotFoundException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        c0Var2 = c0Var12;
                        c0Var3 = c0Var13;
                    }
                }
            }
            c0Var2 = c0Var12;
        } else {
            z10 = z14;
            c0Var = c0Var11;
            c0Var2 = c0Var12;
            c0Var3 = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (c0Var3 == c0Var6) {
                int i10 = typedValue.resourceId;
                if (i10 == 0) {
                    if (typedValue.type == 16 && typedValue.data == 0) {
                        i10 = 0;
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + c0Var3.b() + ". Must be a reference to a resource.");
                    }
                }
                obj = Integer.valueOf(i10);
                z11 = true;
            } else {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    if (c0Var3 == null) {
                        obj = Integer.valueOf(i11);
                        z11 = true;
                        c0Var3 = c0Var6;
                        c0Var4 = c0Var2;
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + c0Var3.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                } else if (c0Var3 == c0Var13) {
                    z11 = true;
                    obj = typedArray.getString(1);
                } else {
                    z11 = true;
                    int i12 = typedValue.type;
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                if (i12 != 18) {
                                    if (i12 >= 16 && i12 <= 31) {
                                        if (c0Var3 == c0Var15) {
                                            c0Var3 = a.a(typedValue, c0Var3, c0Var15, string, "float");
                                            obj = Float.valueOf(typedValue.data);
                                        } else {
                                            c0Var3 = a.a(typedValue, c0Var3, c0Var16, string, "integer");
                                            obj = Integer.valueOf(typedValue.data);
                                        }
                                    } else {
                                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                    }
                                } else {
                                    c0Var3 = a.a(typedValue, c0Var3, c0Var14, string, "boolean");
                                    if (typedValue.data != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    obj = Boolean.valueOf(z12);
                                }
                            } else {
                                c0Var3 = a.a(typedValue, c0Var3, c0Var16, string, "dimension");
                                obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            }
                        } else {
                            c0Var3 = a.a(typedValue, c0Var3, c0Var15, string, "float");
                            obj = Float.valueOf(typedValue.getFloat());
                        }
                        c0Var4 = c0Var2;
                    } else {
                        String value = typedValue.string.toString();
                        if (c0Var3 == null) {
                            kotlin.jvm.internal.i.g(value, "value");
                            try {
                                c0Var16.c(value);
                                c0Var3 = c0Var16;
                            } catch (IllegalArgumentException unused) {
                                c0Var4 = c0Var2;
                                try {
                                    try {
                                        try {
                                            c0Var4.c(value);
                                            c0Var3 = c0Var4;
                                        } catch (IllegalArgumentException unused2) {
                                            c0Var3 = c0Var13;
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        c0Var14.c(value);
                                        c0Var3 = c0Var14;
                                    }
                                } catch (IllegalArgumentException unused4) {
                                    c0Var15.c(value);
                                    c0Var3 = c0Var15;
                                }
                            }
                        }
                        c0Var4 = c0Var2;
                        obj = c0Var3.c(value);
                    }
                }
            }
            c0Var6 = c0Var3;
            c0Var3 = c0Var6;
            c0Var4 = c0Var2;
        } else {
            cls = Serializable.class;
            c0Var4 = c0Var2;
            z11 = true;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z11 = false;
        }
        if (c0Var3 != null) {
            c0Var17 = c0Var3;
        }
        if (c0Var17 == null) {
            if (obj instanceof Integer) {
                c0Var5 = c0Var16;
            } else if (obj instanceof int[]) {
                c0Var5 = c0Var;
            } else if (obj instanceof Long) {
                c0Var5 = c0Var4;
            } else if (obj instanceof long[]) {
                c0Var5 = c0Var10;
            } else {
                if (!(obj instanceof Float)) {
                    if (obj instanceof float[]) {
                        c0Var5 = c0Var7;
                    } else if (obj instanceof Boolean) {
                        c0Var5 = c0Var14;
                    } else if (obj instanceof boolean[]) {
                        c0Var5 = c0Var9;
                    } else if (!(obj instanceof String) && obj != null) {
                        if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                            c0Var5 = c0Var8;
                        } else {
                            if (obj.getClass().isArray()) {
                                Class<?> componentType = obj.getClass().getComponentType();
                                kotlin.jvm.internal.i.d(componentType);
                                if (Parcelable.class.isAssignableFrom(componentType)) {
                                    Class<?> componentType2 = obj.getClass().getComponentType();
                                    if (componentType2 != null) {
                                        c0Var15 = new c0.m(componentType2);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                                    }
                                }
                            }
                            if (obj.getClass().isArray()) {
                                Class<?> componentType3 = obj.getClass().getComponentType();
                                kotlin.jvm.internal.i.d(componentType3);
                                if (cls.isAssignableFrom(componentType3)) {
                                    Class<?> componentType4 = obj.getClass().getComponentType();
                                    if (componentType4 != null) {
                                        c0Var15 = new c0.o(componentType4);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                                    }
                                }
                            }
                            if (obj instanceof Parcelable) {
                                c0Var15 = new c0.n(obj.getClass());
                            } else if (obj instanceof Enum) {
                                c0Var15 = new c0.l(obj.getClass());
                            } else if (obj instanceof Serializable) {
                                c0Var15 = new c0.p(obj.getClass());
                            } else {
                                throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                            }
                        }
                    } else {
                        c0Var5 = c0Var13;
                    }
                }
                c0Var5 = c0Var15;
            }
        } else {
            c0Var5 = c0Var17;
        }
        return new e(c0Var5, z10, obj, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0277, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i6) {
        int depth;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        String str3;
        boolean z12;
        boolean z13;
        Context context;
        int i10;
        z zVar;
        boolean z14;
        int depth2;
        z zVar2 = this;
        int i11 = i6;
        String name = xmlResourceParser.getName();
        kotlin.jvm.internal.i.f(name, "parser.name");
        u a10 = zVar2.f31246b.b(name).a();
        Context context2 = zVar2.f31245a;
        a10.t(context2, attributeSet);
        int i12 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i12 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                boolean b10 = kotlin.jvm.internal.i.b("argument", name2);
                int[] iArr = kc.f.f23220j0;
                boolean z15 = false;
                if (b10) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    kotlin.jvm.internal.i.f(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        a10.A.put(string, c(obtainAttributes, resources, i11));
                        hs.k kVar = hs.k.f19476a;
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if (kotlin.jvm.internal.i.b("deepLink", name2)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, kc.f.f23221k0);
                    kotlin.jvm.internal.i.f(obtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(i12);
                    String string4 = obtainAttributes2.getString(2);
                    if (string2 != null && string2.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        if (string3 != null && string3.length() != 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            if (string4 != null && string4.length() != 0) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (z13) {
                                throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                            }
                        }
                    }
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        kotlin.jvm.internal.i.f(packageName, "context.packageName");
                        str = gv.n.F0(string2, "${applicationId}", packageName);
                    } else {
                        str = null;
                    }
                    if (string3 != null && string3.length() != 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        String packageName2 = context2.getPackageName();
                        kotlin.jvm.internal.i.f(packageName2, "context.packageName");
                        str2 = gv.n.F0(string3, "${applicationId}", packageName2);
                        if (str2.length() > 0) {
                            z15 = true;
                        }
                        if (!z15) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                        }
                    } else {
                        str2 = null;
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        kotlin.jvm.internal.i.f(packageName3, "context.packageName");
                        str3 = gv.n.F0(string4, "${applicationId}", packageName3);
                    } else {
                        str3 = null;
                    }
                    a10.g(new q(str, str2, str3));
                    hs.k kVar2 = hs.k.f19476a;
                    obtainAttributes2.recycle();
                } else {
                    if (kotlin.jvm.internal.i.b("action", name2)) {
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, kc.f.f23219i0, 0, 0);
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        d dVar = new d(obtainStyledAttributes.getResourceId(i12, 0));
                        dVar.f31107b = new a0(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        context = context2;
                        int i13 = 1;
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        i10 = depth3;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i13 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                                break;
                            }
                            if (next2 == 2 && depth2 <= depth4 && kotlin.jvm.internal.i.b("argument", xmlResourceParser.getName())) {
                                TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                kotlin.jvm.internal.i.f(obtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                String string5 = obtainAttributes3.getString(0);
                                if (string5 != null) {
                                    e c10 = c(obtainAttributes3, resources, i11);
                                    boolean z16 = c10.f31111c;
                                    if (z16 && z16) {
                                        c10.f31109a.d(bundle, string5, c10.f31112d);
                                    }
                                    hs.k kVar3 = hs.k.f19476a;
                                    obtainAttributes3.recycle();
                                } else {
                                    throw new XmlPullParserException("Arguments must have a name");
                                }
                            }
                            i13 = 1;
                            i11 = i6;
                        }
                        if (!bundle.isEmpty()) {
                            dVar.f31108c = bundle;
                        }
                        if (!(a10 instanceof a.C0528a)) {
                            if (resourceId != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                a10.f31233z.e(resourceId, dVar);
                                obtainStyledAttributes.recycle();
                                zVar = this;
                            } else {
                                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
                            }
                        } else {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a10 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                    } else {
                        context = context2;
                        i10 = depth3;
                        if (kotlin.jvm.internal.i.b("include", name2) && (a10 instanceof w)) {
                            TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, sp.b.f31858e);
                            kotlin.jvm.internal.i.f(obtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                            zVar = this;
                            ((w) a10).v(zVar.b(obtainAttributes4.getResourceId(0, 0)));
                            hs.k kVar4 = hs.k.f19476a;
                            obtainAttributes4.recycle();
                        } else {
                            zVar = this;
                            if (a10 instanceof w) {
                                ((w) a10).v(a(resources, xmlResourceParser, attributeSet, i6));
                            }
                        }
                    }
                    i11 = i6;
                    zVar2 = zVar;
                    context2 = context;
                    depth3 = i10;
                    i12 = 1;
                }
            }
        }
    }

    public final w b(int i6) {
        int next;
        Resources resources = this.f31245a.getResources();
        XmlResourceParser xml = resources.getXml(i6);
        kotlin.jvm.internal.i.f(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i6) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            kotlin.jvm.internal.i.f(attrs, "attrs");
            u a10 = a(resources, xml, attrs, i6);
            if (a10 instanceof w) {
                return (w) a10;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
