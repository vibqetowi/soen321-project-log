package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.b1;
import h.b;
import h.d;
import i0.h;
import org.xmlpull.v1.XmlPullParserException;
import t.i;
/* compiled from: AnimatedStateListDrawableCompat.java */
/* loaded from: classes.dex */
public final class a extends h.d implements k0.b {
    public b J;
    public f K;
    public int L;
    public int M;
    public boolean N;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0265a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f16959a;

        public C0265a(Animatable animatable) {
            this.f16959a = animatable;
        }

        @Override // h.a.f
        public final void c() {
            this.f16959a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f16959a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends d.a {
        public t.e<Long> I;
        public i<Integer> J;

        public b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.I = bVar.I;
                this.J = bVar.J;
                return;
            }
            this.I = new t.e<>();
            this.J = new i<>();
        }

        @Override // h.d.a, h.b.c
        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        @Override // h.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // h.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final i2.d f16960a;

        public c(i2.d dVar) {
            this.f16960a = dVar;
        }

        @Override // h.a.f
        public final void c() {
            this.f16960a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f16960a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f16961a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16962b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int i6;
            int i10;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z10) {
                i6 = numberOfFrames - 1;
            } else {
                i6 = 0;
            }
            if (z10) {
                i10 = 0;
            } else {
                i10 = numberOfFrames - 1;
            }
            e eVar = new e(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i6, i10);
            i.a.a(ofInt, true);
            ofInt.setDuration(eVar.f16965c);
            ofInt.setInterpolator(eVar);
            this.f16962b = z11;
            this.f16961a = ofInt;
        }

        @Override // h.a.f
        public final boolean a() {
            return this.f16962b;
        }

        @Override // h.a.f
        public final void b() {
            this.f16961a.reverse();
        }

        @Override // h.a.f
        public final void c() {
            this.f16961a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f16961a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class e implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f16963a;

        /* renamed from: b  reason: collision with root package name */
        public int f16964b;

        /* renamed from: c  reason: collision with root package name */
        public int f16965c;

        public e(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f16964b = numberOfFrames;
            int[] iArr = this.f16963a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f16963a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f16963a;
            int i6 = 0;
            for (int i10 = 0; i10 < numberOfFrames; i10++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i10) - 1 : i10);
                iArr2[i10] = duration;
                i6 += duration;
            }
            this.f16965c = i6;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2;
            int i6 = (int) ((f * this.f16965c) + 0.5f);
            int i10 = this.f16964b;
            int[] iArr = this.f16963a;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = iArr[i11];
                if (i6 < i12) {
                    break;
                }
                i6 -= i12;
                i11++;
            }
            if (i11 < i10) {
                f2 = i6 / this.f16965c;
            } else {
                f2 = 0.0f;
            }
            return (i11 / i10) + f2;
        }
    }

    public a() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x026d, code lost:
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0274, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a g(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlResourceParser xmlResourceParser) {
        int depth;
        Context context2;
        long j10;
        int next;
        int next2;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            TypedArray f2 = h.f(resources2, theme2, attributeSet, ca.a.F);
            int i6 = 1;
            aVar.setVisible(f2.getBoolean(1, true), true);
            b bVar = aVar.J;
            bVar.f16977d |= i.b.b(f2);
            int i10 = 2;
            bVar.f16981i = f2.getBoolean(2, bVar.f16981i);
            int i11 = 3;
            bVar.f16984l = f2.getBoolean(3, bVar.f16984l);
            bVar.f16996y = f2.getInt(4, bVar.f16996y);
            bVar.f16997z = f2.getInt(5, bVar.f16997z);
            boolean z10 = false;
            aVar.setDither(f2.getBoolean(0, bVar.f16994w));
            b.c cVar = aVar.f16966u;
            if (resources2 != null) {
                cVar.f16975b = resources2;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = cVar.f16976c;
                cVar.f16976c = i12;
                if (i13 != i12) {
                    cVar.f16985m = false;
                    cVar.f16982j = false;
                }
            } else {
                cVar.getClass();
            }
            f2.recycle();
            int depth2 = xmlResourceParser.getDepth() + 1;
            Context context3 = context;
            Resources.Theme theme3 = theme2;
            while (true) {
                int next3 = xmlResourceParser.next();
                if (next3 == i6 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i11)) {
                    break;
                } else if (next3 == i10 && depth <= depth2) {
                    Drawable drawable = null;
                    if (xmlResourceParser.getName().equals("item")) {
                        TypedArray f10 = h.f(resources2, theme3, attributeSet, ca.a.G);
                        int resourceId = f10.getResourceId(z10 ? 1 : 0, z10 ? 1 : 0);
                        int resourceId2 = f10.getResourceId(i6, -1);
                        if (resourceId2 > 0) {
                            drawable = b1.d().f(context3, resourceId2);
                        }
                        f10.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i14 = 0;
                        for (int i15 = 0; i15 < attributeCount; i15++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i15);
                            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                                int i16 = i14 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i15, z10)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i14] = attributeNameResource;
                                i14 = i16;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr, i14);
                        if (drawable == null) {
                            do {
                                next2 = xmlResourceParser.next();
                            } while (next2 == 4);
                            if (next2 == 2) {
                                if (xmlResourceParser.getName().equals("vector")) {
                                    drawable = new i2.i();
                                    drawable.inflate(resources2, xmlResourceParser, attributeSet, theme3);
                                } else {
                                    drawable = i.b.a(resources2, xmlResourceParser, attributeSet, theme3);
                                }
                            } else {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        if (drawable != null) {
                            b bVar2 = aVar.J;
                            int a10 = bVar2.a(drawable);
                            bVar2.H[a10] = trimStateSet;
                            bVar2.J.e(a10, Integer.valueOf(resourceId));
                        } else {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                    } else {
                        if (xmlResourceParser.getName().equals("transition")) {
                            TypedArray f11 = h.f(resources2, theme3, attributeSet, ca.a.H);
                            int resourceId3 = f11.getResourceId(2, -1);
                            int resourceId4 = f11.getResourceId(1, -1);
                            int resourceId5 = f11.getResourceId(z10 ? 1 : 0, -1);
                            if (resourceId5 > 0) {
                                drawable = b1.d().f(context3, resourceId5);
                            }
                            boolean z11 = f11.getBoolean(3, z10);
                            f11.recycle();
                            if (drawable == null) {
                                while (true) {
                                    next = xmlResourceParser.next();
                                    if (next != 4) {
                                        break;
                                    }
                                }
                                if (next == 2) {
                                    if (xmlResourceParser.getName().equals("animated-vector")) {
                                        context2 = context;
                                        drawable = new i2.d(context2);
                                        drawable.inflate(resources2, xmlResourceParser, attributeSet, theme2);
                                    } else {
                                        context2 = context;
                                        drawable = i.b.a(resources2, xmlResourceParser, attributeSet, theme3);
                                    }
                                } else {
                                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                                }
                            } else {
                                context2 = context;
                            }
                            if (drawable != null) {
                                if (resourceId3 == -1 || resourceId4 == -1) {
                                    break;
                                }
                                b bVar3 = aVar.J;
                                int a11 = bVar3.a(drawable);
                                long j11 = resourceId3;
                                long j12 = resourceId4;
                                long j13 = j12 | (j11 << 32);
                                if (z11) {
                                    j10 = 8589934592L;
                                } else {
                                    j10 = 0;
                                }
                                long j14 = a11;
                                bVar3.I.a(j13, Long.valueOf(j14 | j10));
                                if (z11) {
                                    bVar3.I.a((j12 << 32) | j11, Long.valueOf(j14 | 4294967296L | j10));
                                }
                            } else {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        } else {
                            context2 = context;
                        }
                        theme3 = theme;
                        context3 = context2;
                    }
                    theme2 = theme;
                    resources2 = resources;
                    i6 = 1;
                    z10 = false;
                    i10 = 2;
                    i11 = 3;
                }
            }
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // h.d, h.b
    public final b.c b() {
        return new b(this.J, this, null);
    }

    @Override // h.d, h.b
    public final void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.J = (b) cVar;
        }
    }

    @Override // h.d
    public final d.a f() {
        return new b(this.J, this, null);
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.K;
        if (fVar != null) {
            fVar.d();
            this.K = null;
            d(this.L);
            this.L = -1;
            this.M = -1;
        }
    }

    @Override // h.d, h.b, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.N) {
            super.mutate();
            this.J.e();
            this.N = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // h.d, h.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int intValue;
        int intValue2;
        boolean z10;
        boolean z11;
        f c0265a;
        boolean z12;
        b bVar = this.J;
        int f2 = bVar.f(iArr);
        if (f2 < 0) {
            f2 = bVar.f(StateSet.WILD_CARD);
        }
        int i6 = this.A;
        boolean z13 = false;
        if (f2 != i6) {
            f fVar = this.K;
            if (fVar != null) {
                if (f2 != this.L) {
                    if (f2 == this.M && fVar.a()) {
                        fVar.b();
                        this.L = this.M;
                        this.M = f2;
                    } else {
                        i6 = this.L;
                        fVar.d();
                    }
                }
                z10 = true;
                if (!z10 || d(f2)) {
                    z13 = true;
                }
            }
            this.K = null;
            this.M = -1;
            this.L = -1;
            b bVar2 = this.J;
            if (i6 < 0) {
                bVar2.getClass();
                intValue = 0;
            } else {
                intValue = ((Integer) bVar2.J.d(i6, 0)).intValue();
            }
            if (f2 < 0) {
                intValue2 = 0;
            } else {
                intValue2 = ((Integer) bVar2.J.d(f2, 0)).intValue();
            }
            if (intValue2 != 0 && intValue != 0) {
                long j10 = intValue2 | (intValue << 32);
                int longValue = (int) ((Long) bVar2.I.e(j10, -1L)).longValue();
                if (longValue >= 0) {
                    if ((((Long) bVar2.I.e(j10, -1L)).longValue() & 8589934592L) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d(longValue);
                    Drawable drawable = this.f16968w;
                    if (drawable instanceof AnimationDrawable) {
                        if ((((Long) bVar2.I.e(j10, -1L)).longValue() & 4294967296L) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c0265a = new d((AnimationDrawable) drawable, z12, z11);
                    } else if (drawable instanceof i2.d) {
                        c0265a = new c((i2.d) drawable);
                    } else if (drawable instanceof Animatable) {
                        c0265a = new C0265a((Animatable) drawable);
                    }
                    c0265a.c();
                    this.K = c0265a;
                    this.M = i6;
                    this.L = f2;
                    z10 = true;
                    if (!z10) {
                    }
                    z13 = true;
                }
            }
            z10 = false;
            if (!z10) {
            }
            z13 = true;
        }
        Drawable drawable2 = this.f16968w;
        if (drawable2 != null) {
            return z13 | drawable2.setState(iArr);
        }
        return z13;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.K;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public a(b bVar, Resources resources) {
        this.L = -1;
        this.M = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
