package i2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import i0.f;
import i2.i;
import java.io.IOException;
import java.util.ArrayList;
import k0.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class d extends h implements Animatable {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public final b f19669v;

    /* renamed from: w  reason: collision with root package name */
    public final Context f19670w;

    /* renamed from: x  reason: collision with root package name */
    public e f19671x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<i2.c> f19672y;

    /* renamed from: z  reason: collision with root package name */
    public final a f19673z;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            d.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f19675a;

        /* renamed from: b  reason: collision with root package name */
        public AnimatorSet f19676b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Animator> f19677c;

        /* renamed from: d  reason: collision with root package name */
        public t.b<Animator, String> f19678d;

        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public d() {
        this(null);
    }

    @Override // i2.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f19669v;
        bVar.f19675a.draw(canvas);
        if (bVar.f19676b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return a.C0349a.a(drawable);
        }
        return this.f19669v.f19675a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f19669v.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f19669v.f19675a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f19683u != null && Build.VERSION.SDK_INT >= 24) {
            return new c(this.f19683u.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f19669v.f19675a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f19669v.f19675a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f19669v.f19675a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0187, code lost:
        if (r8.f19676b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0189, code lost:
        r8.f19676b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0190, code lost:
        r8.f19676b.playTogether(r8.f19677c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator a10;
        i iVar;
        int next;
        i iVar2;
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            a.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            b bVar = this.f19669v;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f = i0.h.f(resources, theme, attributeSet, i2.a.f19661e);
                    int resourceId = f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = i.D;
                        if (Build.VERSION.SDK_INT >= 24) {
                            iVar = new i();
                            ThreadLocal<TypedValue> threadLocal = i0.f.f19628a;
                            iVar.f19683u = f.a.a(resources, resourceId, theme);
                            new i.h(iVar.f19683u.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                while (true) {
                                    next = xml.next();
                                    if (next == 2 || next == 1) {
                                        break;
                                    }
                                }
                                if (next == 2) {
                                    iVar = new i();
                                    iVar.inflate(resources, xml, asAttributeSet, theme);
                                } else {
                                    throw new XmlPullParserException("No start tag found");
                                    break;
                                }
                            } catch (IOException e10) {
                                Log.e("VectorDrawableCompat", "parser error", e10);
                                iVar = null;
                                iVar.f19688z = false;
                                iVar.setCallback(this.f19673z);
                                iVar2 = bVar.f19675a;
                                if (iVar2 != null) {
                                }
                                bVar.f19675a = iVar;
                                f.recycle();
                                eventType = xmlPullParser.next();
                            } catch (XmlPullParserException e11) {
                                Log.e("VectorDrawableCompat", "parser error", e11);
                                iVar = null;
                                iVar.f19688z = false;
                                iVar.setCallback(this.f19673z);
                                iVar2 = bVar.f19675a;
                                if (iVar2 != null) {
                                }
                                bVar.f19675a = iVar;
                                f.recycle();
                                eventType = xmlPullParser.next();
                            }
                        }
                        iVar.f19688z = false;
                        iVar.setCallback(this.f19673z);
                        iVar2 = bVar.f19675a;
                        if (iVar2 != null) {
                            iVar2.setCallback(null);
                        }
                        bVar.f19675a = iVar;
                    }
                    f.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, i2.a.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        XmlResourceParser xmlResourceParser = this.f19670w;
                        if (xmlResourceParser != 0) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                a10 = AnimatorInflater.loadAnimator(xmlResourceParser, resourceId2);
                            } else {
                                Resources resources2 = xmlResourceParser.getResources();
                                Resources.Theme theme2 = xmlResourceParser.getTheme();
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        a10 = f.a(xmlResourceParser, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e12) {
                                        e = e12;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e13) {
                                        e = e13;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != 0) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                } catch (XmlPullParserException e15) {
                                    e = e15;
                                } catch (Throwable th4) {
                                    th = th4;
                                    xmlResourceParser = 0;
                                }
                            }
                            a10.setTarget(bVar.f19675a.f19684v.f19730b.f19728o.getOrDefault(string, null));
                            if (bVar.f19677c == null) {
                                bVar.f19677c = new ArrayList<>();
                                bVar.f19678d = new t.b<>();
                            }
                            bVar.f19677c.add(a10);
                            bVar.f19678d.put(a10, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return a.C0349a.d(drawable);
        }
        return this.f19669v.f19675a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f19669v.f19676b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f19669v.f19675a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f19669v.f19675a.setBounds(rect);
        }
    }

    @Override // i2.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.setLevel(i6);
        }
        return this.f19669v.f19675a.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f19669v.f19675a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else {
            this.f19669v.f19675a.setAlpha(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            a.C0349a.e(drawable, z10);
        } else {
            this.f19669v.f19675a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f19669v.f19675a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            k0.a.d(drawable, i6);
        } else {
            this.f19669v.f19675a.setTint(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            k0.a.e(drawable, colorStateList);
        } else {
            this.f19669v.f19675a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            k0.a.f(drawable, mode);
        } else {
            this.f19669v.f19675a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f19669v.f19675a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f19669v;
        if (bVar.f19676b.isStarted()) {
            return;
        }
        bVar.f19676b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f19669v.f19676b.end();
        }
    }

    public d(Context context) {
        this.f19671x = null;
        this.f19672y = null;
        a aVar = new a();
        this.f19673z = aVar;
        this.f19670w = context;
        this.f19669v = new b(aVar);
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f19679a;

        public c(Drawable.ConstantState constantState) {
            this.f19679a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f19679a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f19679a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable newDrawable = this.f19679a.newDrawable();
            dVar.f19683u = newDrawable;
            newDrawable.setCallback(dVar.f19673z);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable newDrawable = this.f19679a.newDrawable(resources);
            dVar.f19683u = newDrawable;
            newDrawable.setCallback(dVar.f19673z);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable newDrawable = this.f19679a.newDrawable(resources, theme);
            dVar.f19683u = newDrawable;
            newDrawable.setCallback(dVar.f19673z);
            return dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
