package androidx.constraintlayout.motion.widget;

import a0.g;
import a0.l;
import a0.n;
import a0.q;
import a0.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.theinnerhour.b2b.R;
import g.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import tr.r;
/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f1715a;

    /* renamed from: e  reason: collision with root package name */
    public int f1719e;
    public final g f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f1720g;

    /* renamed from: j  reason: collision with root package name */
    public int f1723j;

    /* renamed from: k  reason: collision with root package name */
    public String f1724k;

    /* renamed from: o  reason: collision with root package name */
    public final Context f1728o;

    /* renamed from: b  reason: collision with root package name */
    public int f1716b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1717c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f1718d = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f1721h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f1722i = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f1725l = 0;

    /* renamed from: m  reason: collision with root package name */
    public String f1726m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f1727n = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f1729p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f1730q = -1;
    public int r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f1731s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f1732t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f1733u = -1;

    /* compiled from: ViewTransition.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f1734a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1735b;

        /* renamed from: c  reason: collision with root package name */
        public final n f1736c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1737d;
        public final d f;

        /* renamed from: g  reason: collision with root package name */
        public final Interpolator f1739g;

        /* renamed from: i  reason: collision with root package name */
        public float f1741i;

        /* renamed from: j  reason: collision with root package name */
        public float f1742j;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f1745m;

        /* renamed from: e  reason: collision with root package name */
        public final w.d f1738e = new w.d(0);

        /* renamed from: h  reason: collision with root package name */
        public boolean f1740h = false;

        /* renamed from: l  reason: collision with root package name */
        public final Rect f1744l = new Rect();

        /* renamed from: k  reason: collision with root package name */
        public long f1743k = System.nanoTime();

        public a(d dVar, n nVar, int i6, int i10, int i11, Interpolator interpolator, int i12, int i13) {
            float f;
            this.f1745m = false;
            this.f = dVar;
            this.f1736c = nVar;
            this.f1737d = i10;
            if (dVar.f1750e == null) {
                dVar.f1750e = new ArrayList<>();
            }
            dVar.f1750e.add(this);
            this.f1739g = interpolator;
            this.f1734a = i12;
            this.f1735b = i13;
            if (i11 == 3) {
                this.f1745m = true;
            }
            if (i6 == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / i6;
            }
            this.f1742j = f;
            a();
        }

        public final void a() {
            float interpolation;
            boolean z10 = this.f1740h;
            int i6 = this.f1735b;
            int i10 = this.f1734a;
            d dVar = this.f;
            Interpolator interpolator = this.f1739g;
            n nVar = this.f1736c;
            if (z10) {
                long nanoTime = System.nanoTime();
                this.f1743k = nanoTime;
                float f = this.f1741i - (((float) ((nanoTime - this.f1743k) * 1.0E-6d)) * this.f1742j);
                this.f1741i = f;
                if (f < 0.0f) {
                    this.f1741i = 0.0f;
                }
                float f2 = this.f1741i;
                if (interpolator != null) {
                    f2 = interpolator.getInterpolation(f2);
                }
                boolean c10 = nVar.c(f2, nanoTime, nVar.f98b, this.f1738e);
                if (this.f1741i <= 0.0f) {
                    if (i10 != -1) {
                        nVar.f98b.setTag(i10, Long.valueOf(System.nanoTime()));
                    }
                    if (i6 != -1) {
                        nVar.f98b.setTag(i6, null);
                    }
                    dVar.f.add(this);
                }
                if (this.f1741i > 0.0f || c10) {
                    dVar.f1746a.invalidate();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            this.f1743k = nanoTime2;
            float f10 = (((float) ((nanoTime2 - this.f1743k) * 1.0E-6d)) * this.f1742j) + this.f1741i;
            this.f1741i = f10;
            if (f10 >= 1.0f) {
                this.f1741i = 1.0f;
            }
            if (interpolator == null) {
                interpolation = this.f1741i;
            } else {
                interpolation = interpolator.getInterpolation(this.f1741i);
            }
            boolean c11 = nVar.c(interpolation, nanoTime2, nVar.f98b, this.f1738e);
            if (this.f1741i >= 1.0f) {
                if (i10 != -1) {
                    nVar.f98b.setTag(i10, Long.valueOf(System.nanoTime()));
                }
                if (i6 != -1) {
                    nVar.f98b.setTag(i6, null);
                }
                if (!this.f1745m) {
                    dVar.f.add(this);
                }
            }
            if (this.f1741i < 1.0f || c11) {
                dVar.f1746a.invalidate();
            }
        }

        public final void b() {
            float f;
            this.f1740h = true;
            int i6 = this.f1737d;
            if (i6 != -1) {
                if (i6 == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / i6;
                }
                this.f1742j = f;
            }
            this.f.f1746a.invalidate();
            this.f1743k = System.nanoTime();
        }
    }

    public c(Context context, XmlResourceParser xmlResourceParser) {
        char c10;
        this.f1728o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("ViewTransition".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 != 0) {
                        if (c10 != 1) {
                            if (c10 != 2) {
                                if (c10 != 3 && c10 != 4) {
                                    Log.e("ViewTransition", a0.a.a() + " unknown tag " + name);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(".xml:");
                                    sb2.append(xmlResourceParser.getLineNumber());
                                    Log.e("ViewTransition", sb2.toString());
                                } else {
                                    b0.a.d(context, xmlResourceParser, this.f1720g.f1824g);
                                }
                            } else {
                                this.f1720g = androidx.constraintlayout.widget.b.d(context, xmlResourceParser);
                            }
                        } else {
                            this.f = new g(context, xmlResourceParser);
                        }
                    } else {
                        d(context, xmlResourceParser);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(d dVar, MotionLayout motionLayout, int i6, androidx.constraintlayout.widget.b bVar, View... viewArr) {
        int[] constraintSetIds;
        androidx.constraintlayout.widget.b b10;
        float alpha;
        Interpolator loadInterpolator;
        t tVar;
        if (this.f1717c) {
            return;
        }
        int i10 = this.f1719e;
        g gVar = this.f;
        if (i10 == 2) {
            View view = viewArr[0];
            n nVar = new n(view);
            q qVar = nVar.f;
            float f = 0.0f;
            qVar.f123w = 0.0f;
            qVar.f124x = 0.0f;
            nVar.H = true;
            qVar.i(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            nVar.f102g.i(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            l lVar = nVar.f103h;
            lVar.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            lVar.f92w = view.getVisibility();
            if (view.getVisibility() != 0) {
                alpha = 0.0f;
            } else {
                alpha = view.getAlpha();
            }
            lVar.f90u = alpha;
            lVar.f93x = view.getElevation();
            lVar.f94y = view.getRotation();
            lVar.f95z = view.getRotationX();
            lVar.A = view.getRotationY();
            lVar.B = view.getScaleX();
            lVar.C = view.getScaleY();
            lVar.D = view.getPivotX();
            lVar.E = view.getPivotY();
            lVar.F = view.getTranslationX();
            lVar.G = view.getTranslationY();
            lVar.H = view.getTranslationZ();
            l lVar2 = nVar.f104i;
            lVar2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            lVar2.f92w = view.getVisibility();
            if (view.getVisibility() == 0) {
                f = view.getAlpha();
            }
            lVar2.f90u = f;
            lVar2.f93x = view.getElevation();
            lVar2.f94y = view.getRotation();
            lVar2.f95z = view.getRotationX();
            lVar2.A = view.getRotationY();
            lVar2.B = view.getScaleX();
            lVar2.C = view.getScaleY();
            lVar2.D = view.getPivotX();
            lVar2.E = view.getPivotY();
            lVar2.F = view.getTranslationX();
            lVar2.G = view.getTranslationY();
            lVar2.H = view.getTranslationZ();
            ArrayList<a0.d> arrayList = gVar.f44a.get(-1);
            if (arrayList != null) {
                nVar.f117w.addAll(arrayList);
            }
            nVar.f(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i11 = this.f1721h;
            int i12 = this.f1722i;
            int i13 = this.f1716b;
            Context context = motionLayout.getContext();
            int i14 = this.f1725l;
            if (i14 != -2) {
                if (i14 != -1) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 4) {
                                    if (i14 != 5) {
                                        if (i14 != 6) {
                                            loadInterpolator = null;
                                        } else {
                                            loadInterpolator = new AnticipateInterpolator();
                                        }
                                    } else {
                                        loadInterpolator = new OvershootInterpolator();
                                    }
                                } else {
                                    loadInterpolator = new BounceInterpolator();
                                }
                            } else {
                                loadInterpolator = new DecelerateInterpolator();
                            }
                        } else {
                            loadInterpolator = new AccelerateInterpolator();
                        }
                    } else {
                        loadInterpolator = new AccelerateDecelerateInterpolator();
                    }
                } else {
                    tVar = new t(w.c.c(this.f1726m));
                    new a(dVar, nVar, i11, i12, i13, tVar, this.f1729p, this.f1730q);
                    return;
                }
            } else {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.f1727n);
            }
            tVar = loadInterpolator;
            new a(dVar, nVar, i11, i12, i13, tVar, this.f1729p, this.f1730q);
            return;
        }
        b.a aVar = this.f1720g;
        if (i10 == 1) {
            for (int i15 : motionLayout.getConstraintSetIds()) {
                if (i15 != i6) {
                    androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.K;
                    if (aVar2 == null) {
                        b10 = null;
                    } else {
                        b10 = aVar2.b(i15);
                    }
                    for (View view2 : viewArr) {
                        b.a l2 = b10.l(view2.getId());
                        if (aVar != null) {
                            b.a.C0026a c0026a = aVar.f1825h;
                            if (c0026a != null) {
                                c0026a.e(l2);
                            }
                            l2.f1824g.putAll(aVar.f1824g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        HashMap<Integer, b.a> hashMap = bVar2.f;
        hashMap.clear();
        for (Integer num : bVar.f.keySet()) {
            b.a aVar3 = bVar.f.get(num);
            if (aVar3 != null) {
                hashMap.put(num, aVar3.clone());
            }
        }
        for (View view3 : viewArr) {
            b.a l10 = bVar2.l(view3.getId());
            if (aVar != null) {
                b.a.C0026a c0026a2 = aVar.f1825h;
                if (c0026a2 != null) {
                    c0026a2.e(l10);
                }
                l10.f1824g.putAll(aVar.f1824g);
            }
        }
        motionLayout.C(i6, bVar2);
        motionLayout.C(R.id.view_transition, bVar);
        motionLayout.x(R.id.view_transition);
        a.b bVar3 = new a.b(motionLayout.K, i6);
        for (View view4 : viewArr) {
            int i16 = this.f1721h;
            if (i16 != -1) {
                bVar3.f1678h = Math.max(i16, 8);
            }
            bVar3.f1686p = this.f1718d;
            int i17 = this.f1725l;
            String str = this.f1726m;
            int i18 = this.f1727n;
            bVar3.f1676e = i17;
            bVar3.f = str;
            bVar3.f1677g = i18;
            int id2 = view4.getId();
            if (gVar != null) {
                g gVar2 = new g();
                Iterator<a0.d> it = gVar.f44a.get(-1).iterator();
                while (it.hasNext()) {
                    a0.d clone = it.next().clone();
                    clone.f8b = id2;
                    gVar2.b(clone);
                }
                bVar3.f1681k.add(gVar2);
            }
        }
        motionLayout.setTransition(bVar3);
        v vVar = new v(this, 1, viewArr);
        motionLayout.m(1.0f);
        motionLayout.O0 = vVar;
    }

    public final boolean b(View view) {
        boolean z10;
        boolean z11;
        int i6 = this.r;
        if (i6 == -1 || view.getTag(i6) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f1731s;
        if (i10 == -1 || view.getTag(i10) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f1723j == -1 && this.f1724k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f1723j) {
            return true;
        }
        if (this.f1724k == null || !(view.getLayoutParams() instanceof ConstraintLayout.a) || (str = ((ConstraintLayout.a) view.getLayoutParams()).Y) == null || !str.matches(this.f1724k)) {
            return false;
        }
        return true;
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.U);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                this.f1715a = obtainStyledAttributes.getResourceId(index, this.f1715a);
            } else if (index == 8) {
                if (MotionLayout.Y0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f1723j);
                    this.f1723j = resourceId;
                    if (resourceId == -1) {
                        this.f1724k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f1724k = obtainStyledAttributes.getString(index);
                } else {
                    this.f1723j = obtainStyledAttributes.getResourceId(index, this.f1723j);
                }
            } else if (index == 9) {
                this.f1716b = obtainStyledAttributes.getInt(index, this.f1716b);
            } else if (index == 12) {
                this.f1717c = obtainStyledAttributes.getBoolean(index, this.f1717c);
            } else if (index == 10) {
                this.f1718d = obtainStyledAttributes.getInt(index, this.f1718d);
            } else if (index == 4) {
                this.f1721h = obtainStyledAttributes.getInt(index, this.f1721h);
            } else if (index == 13) {
                this.f1722i = obtainStyledAttributes.getInt(index, this.f1722i);
            } else if (index == 14) {
                this.f1719e = obtainStyledAttributes.getInt(index, this.f1719e);
            } else if (index == 7) {
                int i10 = obtainStyledAttributes.peekValue(index).type;
                if (i10 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f1727n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f1725l = -2;
                    }
                } else if (i10 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1726m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.f1727n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f1725l = -2;
                    } else {
                        this.f1725l = -1;
                    }
                } else {
                    this.f1725l = obtainStyledAttributes.getInteger(index, this.f1725l);
                }
            } else if (index == 11) {
                this.f1729p = obtainStyledAttributes.getResourceId(index, this.f1729p);
            } else if (index == 3) {
                this.f1730q = obtainStyledAttributes.getResourceId(index, this.f1730q);
            } else if (index == 6) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.f1731s = obtainStyledAttributes.getResourceId(index, this.f1731s);
            } else if (index == 2) {
                this.f1733u = obtainStyledAttributes.getResourceId(index, this.f1733u);
            } else if (index == 1) {
                this.f1732t = obtainStyledAttributes.getInteger(index, this.f1732t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + a0.a.c(this.f1715a, this.f1728o) + ")";
    }
}
