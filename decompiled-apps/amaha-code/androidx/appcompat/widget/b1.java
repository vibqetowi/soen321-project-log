package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.j;
import com.theinnerhour.b2b.R;
import g0.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k0.a;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: i  reason: collision with root package name */
    public static b1 f1351i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, t.i<ColorStateList>> f1353a;

    /* renamed from: b  reason: collision with root package name */
    public t.h<String, e> f1354b;

    /* renamed from: c  reason: collision with root package name */
    public t.i<String> f1355c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, t.e<WeakReference<Drawable.ConstantState>>> f1356d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1357e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public f f1358g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1350h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final c f1352j = new c();

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // androidx.appcompat.widget.b1.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a.g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // androidx.appcompat.widget.b1.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                i2.d dVar = new i2.d(context);
                dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return dVar;
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class c extends t.f<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // androidx.appcompat.widget.b1.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    i.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                    return null;
                }
            }
            return null;
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface f {
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // androidx.appcompat.widget.b1.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                i2.i iVar = new i2.i();
                iVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return iVar;
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static synchronized b1 d() {
        b1 b1Var;
        synchronized (b1.class) {
            if (f1351i == null) {
                b1 b1Var2 = new b1();
                f1351i = b1Var2;
                j(b1Var2);
            }
            b1Var = f1351i;
        }
        return b1Var;
    }

    public static synchronized PorterDuffColorFilter h(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter b10;
        synchronized (b1.class) {
            c cVar = f1352j;
            cVar.getClass();
            int i10 = (i6 + 31) * 31;
            b10 = cVar.b(Integer.valueOf(mode.hashCode() + i10));
            if (b10 == null) {
                b10 = new PorterDuffColorFilter(i6, mode);
                cVar.c(Integer.valueOf(mode.hashCode() + i10), b10);
            }
        }
        return b10;
    }

    public static void j(b1 b1Var) {
        if (Build.VERSION.SDK_INT < 24) {
            b1Var.a("vector", new g());
            b1Var.a("animated-vector", new b());
            b1Var.a("animated-selector", new a());
            b1Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1354b == null) {
            this.f1354b = new t.h<>();
        }
        this.f1354b.put(str, eVar);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            t.e<WeakReference<Drawable.ConstantState>> eVar = this.f1356d.get(context);
            if (eVar == null) {
                eVar = new t.e<>();
                this.f1356d.put(context, eVar);
            }
            eVar.h(j10, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable c(int i6, Context context) {
        LayerDrawable layerDrawable;
        if (this.f1357e == null) {
            this.f1357e = new TypedValue();
        }
        TypedValue typedValue = this.f1357e;
        context.getResources().getValue(i6, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        if (this.f1358g != null) {
            if (i6 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i6 == R.drawable.abc_ratingbar_material) {
                layerDrawable = j.a.c(this, context, R.dimen.abc_star_big);
            } else if (i6 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = j.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i6 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = j.a.c(this, context, R.dimen.abc_star_small);
            }
            if (layerDrawable != null) {
                layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                b(context, j10, layerDrawable);
            }
            return layerDrawable;
        }
        layerDrawable = null;
        if (layerDrawable != null) {
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j10) {
        t.e<WeakReference<Drawable.ConstantState>> eVar = this.f1356d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.e(j10, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.i(j10);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i6) {
        return g(context, i6, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
        k0.a.b.i(r13, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable g(Context context, int i6, boolean z10) {
        boolean z11;
        Drawable drawable;
        int next;
        try {
            boolean z12 = false;
            if (!this.f) {
                this.f = true;
                Drawable f2 = f(context, R.drawable.abc_vector_test);
                if (f2 != null) {
                    if (!(f2 instanceof i2.i) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName())) {
                        z11 = false;
                    }
                    z11 = true;
                }
                this.f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
            t.h<String, e> hVar = this.f1354b;
            Drawable drawable2 = null;
            r3 = null;
            PorterDuff.Mode mode = null;
            if (hVar != null && !hVar.isEmpty()) {
                t.i<String> iVar = this.f1355c;
                if (iVar != null) {
                    String str = (String) iVar.d(i6, null);
                    if (!"appcompat_skip_skip".equals(str)) {
                        if (str != null && this.f1354b.getOrDefault(str, null) == null) {
                        }
                    }
                } else {
                    this.f1355c = new t.i<>();
                }
                if (this.f1357e == null) {
                    this.f1357e = new TypedValue();
                }
                TypedValue typedValue = this.f1357e;
                Resources resources = context.getResources();
                resources.getValue(i6, typedValue, true);
                long j10 = (typedValue.assetCookie << 32) | typedValue.data;
                drawable = e(context, j10);
                if (drawable == null) {
                    CharSequence charSequence = typedValue.string;
                    if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                        try {
                            XmlResourceParser xml = resources.getXml(i6);
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                            while (true) {
                                next = xml.next();
                                if (next == 2 || next == 1) {
                                    break;
                                }
                            }
                            if (next == 2) {
                                String name = xml.getName();
                                this.f1355c.a(i6, name);
                                e orDefault = this.f1354b.getOrDefault(name, null);
                                if (orDefault != null) {
                                    drawable = orDefault.a(context, xml, asAttributeSet, context.getTheme());
                                }
                                if (drawable != null) {
                                    drawable.setChangingConfigurations(typedValue.changingConfigurations);
                                    b(context, j10, drawable);
                                }
                            } else {
                                throw new XmlPullParserException("No start tag found");
                            }
                        } catch (Exception e10) {
                            Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
                        }
                    }
                    if (drawable == null) {
                        this.f1355c.a(i6, "appcompat_skip_skip");
                    }
                }
                if (drawable == null) {
                    drawable = c(i6, context);
                }
                if (drawable == null) {
                    Object obj = g0.a.f16164a;
                    drawable = a.c.b(context, i6);
                }
                if (drawable != null) {
                    ColorStateList i10 = i(i6, context);
                    if (i10 != null) {
                        int[] iArr = q0.f1510a;
                        Drawable g5 = k0.a.g(drawable.mutate());
                        a.b.h(g5, i10);
                        if (this.f1358g != null && i6 == R.drawable.abc_switch_thumb_material) {
                            mode = PorterDuff.Mode.MULTIPLY;
                        }
                        drawable2 = g5;
                    } else {
                        if (this.f1358g != null) {
                            if (i6 == R.drawable.abc_seekbar_track_material) {
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                                int c10 = g1.c(R.attr.colorControlNormal, context);
                                PorterDuff.Mode mode2 = j.f1439b;
                                j.a.e(findDrawableByLayerId, c10, mode2);
                                j.a.e(layerDrawable.findDrawableByLayerId(16908303), g1.c(R.attr.colorControlNormal, context), mode2);
                                j.a.e(layerDrawable.findDrawableByLayerId(16908301), g1.c(R.attr.colorControlActivated, context), mode2);
                            } else {
                                if (i6 == R.drawable.abc_ratingbar_material || i6 == R.drawable.abc_ratingbar_indicator_material || i6 == R.drawable.abc_ratingbar_small_material) {
                                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                                    int b10 = g1.b(R.attr.colorControlNormal, context);
                                    PorterDuff.Mode mode3 = j.f1439b;
                                    j.a.e(findDrawableByLayerId2, b10, mode3);
                                    j.a.e(layerDrawable2.findDrawableByLayerId(16908303), g1.c(R.attr.colorControlActivated, context), mode3);
                                    j.a.e(layerDrawable2.findDrawableByLayerId(16908301), g1.c(R.attr.colorControlActivated, context), mode3);
                                }
                                if (z12) {
                                    drawable2 = drawable;
                                }
                            }
                            z12 = true;
                            if (z12) {
                            }
                        }
                        if (!m(context, i6, drawable) && z10) {
                        }
                        drawable2 = drawable;
                    }
                    drawable = drawable2;
                }
                if (drawable != null) {
                    q0.a(drawable);
                }
            }
            drawable = null;
            if (drawable == null) {
            }
            if (drawable == null) {
            }
            if (drawable != null) {
            }
            if (drawable != null) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawable;
    }

    public final synchronized ColorStateList i(int i6, Context context) {
        ColorStateList colorStateList;
        t.i<ColorStateList> iVar;
        try {
            WeakHashMap<Context, t.i<ColorStateList>> weakHashMap = this.f1353a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (iVar = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) iVar.d(i6, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                f fVar = this.f1358g;
                if (fVar != null) {
                    colorStateList2 = ((j.a) fVar).d(i6, context);
                }
                if (colorStateList2 != null) {
                    if (this.f1353a == null) {
                        this.f1353a = new WeakHashMap<>();
                    }
                    t.i<ColorStateList> iVar2 = this.f1353a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new t.i<>();
                        this.f1353a.put(context, iVar2);
                    }
                    iVar2.a(i6, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        t.e<WeakReference<Drawable.ConstantState>> eVar = this.f1356d.get(context);
        if (eVar != null) {
            eVar.b();
        }
    }

    public final synchronized void l(j.a aVar) {
        this.f1358g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Context context, int i6, Drawable drawable) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        f fVar = this.f1358g;
        if (fVar == null) {
            return false;
        }
        j.a aVar = (j.a) fVar;
        PorterDuff.Mode mode = j.f1439b;
        if (j.a.a(aVar.f1442a, i6)) {
            i12 = R.attr.colorControlNormal;
        } else if (j.a.a(aVar.f1444c, i6)) {
            i12 = R.attr.colorControlActivated;
        } else {
            if (j.a.a(aVar.f1445d, i6)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i6 == R.drawable.abc_list_divider_mtrl_alpha) {
                i10 = Math.round(40.8f);
                i11 = 16842800;
                z10 = true;
                if (z10) {
                    int[] iArr = q0.f1510a;
                    Drawable mutate = drawable.mutate();
                    mutate.setColorFilter(j.c(g1.c(i11, context), mode));
                    if (i10 != -1) {
                        mutate.setAlpha(i10);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
                return true;
            } else if (i6 != R.drawable.abc_dialog_material_background) {
                i10 = -1;
                i11 = 0;
                z10 = false;
                if (z10) {
                }
                if (!z11) {
                }
            }
            i12 = 16842801;
        }
        i11 = i12;
        i10 = -1;
        z10 = true;
        if (z10) {
        }
        if (!z11) {
        }
    }
}
