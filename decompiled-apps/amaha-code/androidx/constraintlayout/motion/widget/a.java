package androidx.constraintlayout.motion.widget;

import a0.g;
import a0.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import b0.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import r1.b0;
import tr.r;
/* compiled from: MotionScene.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f1654a;

    /* renamed from: b  reason: collision with root package name */
    public f f1655b;

    /* renamed from: c  reason: collision with root package name */
    public b f1656c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f1657d;

    /* renamed from: e  reason: collision with root package name */
    public b f1658e;
    public final ArrayList<b> f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.b> f1659g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<String, Integer> f1660h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseIntArray f1661i;

    /* renamed from: j  reason: collision with root package name */
    public int f1662j;

    /* renamed from: k  reason: collision with root package name */
    public int f1663k;

    /* renamed from: l  reason: collision with root package name */
    public MotionEvent f1664l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1665m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1666n;

    /* renamed from: o  reason: collision with root package name */
    public MotionLayout.f f1667o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1668p;

    /* renamed from: q  reason: collision with root package name */
    public final d f1669q;
    public float r;

    /* renamed from: s  reason: collision with root package name */
    public float f1670s;

    /* compiled from: MotionScene.java */
    /* renamed from: androidx.constraintlayout.motion.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class animation.InterpolatorC0023a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w.c f1671a;

        public animation.InterpolatorC0023a(w.c cVar) {
            this.f1671a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.f1671a.a(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a(Context context, MotionLayout motionLayout, int i6) {
        this.f1655b = null;
        this.f1656c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f1657d = arrayList;
        this.f1658e = null;
        this.f = new ArrayList<>();
        this.f1659g = new SparseArray<>();
        this.f1660h = new HashMap<>();
        this.f1661i = new SparseIntArray();
        this.f1662j = 400;
        this.f1663k = 0;
        this.f1665m = false;
        this.f1666n = false;
        this.f1654a = motionLayout;
        this.f1669q = new d(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    char c10 = 2;
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -687739768:
                                if (name.equals("Include")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 61998586:
                                if (name.equals("ViewTransition")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 269306229:
                                if (name.equals("Transition")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 312750793:
                                if (name.equals("OnClick")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 327855227:
                                if (name.equals("OnSwipe")) {
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1942574248:
                                if (name.equals("include")) {
                                    c10 = 6;
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
                                k(context, xml);
                                continue;
                            case 1:
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.f1656c == null && !bVar.f1673b) {
                                    this.f1656c = bVar;
                                    androidx.constraintlayout.motion.widget.b bVar2 = bVar.f1682l;
                                    if (bVar2 != null) {
                                        bVar2.c(this.f1668p);
                                    }
                                }
                                if (bVar.f1673b) {
                                    if (bVar.f1674c == -1) {
                                        this.f1658e = bVar;
                                    } else {
                                        this.f.add(bVar);
                                    }
                                    arrayList.remove(bVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 2:
                                if (bVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i6) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (bVar != null) {
                                    bVar.f1682l = new androidx.constraintlayout.motion.widget.b(context, this.f1654a, xml);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 3:
                                if (bVar != null) {
                                    bVar.f1683m.add(new b.View$OnClickListenerC0024a(context, bVar, xml));
                                    continue;
                                } else {
                                    continue;
                                }
                            case 4:
                                this.f1655b = new f(context, xml);
                                continue;
                            case 5:
                                h(context, xml);
                                continue;
                            case 6:
                            case 7:
                                j(context, xml);
                                continue;
                            case '\b':
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.f1681k.add(gVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case '\t':
                                c cVar = new c(context, xml);
                                d dVar = this.f1669q;
                                dVar.f1747b.add(cVar);
                                dVar.f1748c = null;
                                int i10 = cVar.f1716b;
                                if (i10 == 4) {
                                    d.a(cVar, true);
                                    continue;
                                } else if (i10 == 5) {
                                    d.a(cVar, false);
                                    continue;
                                } else {
                                    continue;
                                }
                            default:
                                continue;
                        }
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        this.f1659g.put(R.id.motion_base, new androidx.constraintlayout.widget.b());
        this.f1660h.put("motion_base", Integer.valueOf((int) R.id.motion_base));
    }

    public final boolean a(int i6, MotionLayout motionLayout) {
        boolean z10;
        boolean z11;
        if (this.f1667o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        Iterator<b> it = this.f1657d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i10 = next.f1684n;
            if (i10 != 0) {
                b bVar = this.f1656c;
                if (bVar == next) {
                    if ((bVar.r & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        continue;
                    }
                }
                int i11 = next.f1675d;
                MotionLayout.i iVar = MotionLayout.i.FINISHED;
                MotionLayout.i iVar2 = MotionLayout.i.MOVING;
                MotionLayout.i iVar3 = MotionLayout.i.SETUP;
                if (i6 == i11 && (i10 == 4 || i10 == 2)) {
                    motionLayout.setState(iVar);
                    motionLayout.setTransition(next);
                    if (next.f1684n == 4) {
                        motionLayout.A();
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.o(true);
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                        motionLayout.setState(iVar);
                        motionLayout.u();
                    }
                    return true;
                } else if (i6 == next.f1674c && (i10 == 3 || i10 == 1)) {
                    motionLayout.setState(iVar);
                    motionLayout.setTransition(next);
                    if (next.f1684n == 3) {
                        motionLayout.m(0.0f);
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.o(true);
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                        motionLayout.setState(iVar);
                        motionLayout.u();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.b b(int i6) {
        int a10;
        f fVar = this.f1655b;
        if (fVar != null && (a10 = fVar.a(i6)) != -1) {
            i6 = a10;
        }
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.f1659g;
        if (sparseArray.get(i6) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + a0.a.c(i6, this.f1654a.getContext()) + " In MotionScene");
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return sparseArray.get(i6);
    }

    public final int c(Context context, String str) {
        int i6;
        if (str.contains("/")) {
            i6 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i6 = -1;
        }
        if (i6 == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
            return i6;
        }
        return i6;
    }

    public final Interpolator d() {
        b bVar = this.f1656c;
        int i6 = bVar.f1676e;
        if (i6 != -2) {
            if (i6 != -1) {
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                    if (i6 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animation.InterpolatorC0023a(w.c.c(bVar.f));
        }
        return AnimationUtils.loadInterpolator(this.f1654a.getContext(), this.f1656c.f1677g);
    }

    public final void e(n nVar) {
        b bVar = this.f1656c;
        if (bVar == null) {
            b bVar2 = this.f1658e;
            if (bVar2 != null) {
                Iterator<g> it = bVar2.f1681k.iterator();
                while (it.hasNext()) {
                    it.next().a(nVar);
                }
                return;
            }
            return;
        }
        Iterator<g> it2 = bVar.f1681k.iterator();
        while (it2.hasNext()) {
            it2.next().a(nVar);
        }
    }

    public final float f() {
        androidx.constraintlayout.motion.widget.b bVar;
        b bVar2 = this.f1656c;
        if (bVar2 != null && (bVar = bVar2.f1682l) != null) {
            return bVar.f1708t;
        }
        return 0.0f;
    }

    public final int g() {
        b bVar = this.f1656c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1675d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        char c10;
        char c11;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f1818e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i6 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            attributeName.getClass();
            int hashCode = attributeName.hashCode();
            if (hashCode != -1496482599) {
                if (hashCode != -1153153640) {
                    if (hashCode == 3355 && attributeName.equals("id")) {
                        c10 = 2;
                    }
                    c10 = 65535;
                } else {
                    if (attributeName.equals("constraintRotate")) {
                        c10 = 1;
                    }
                    c10 = 65535;
                }
            } else {
                if (attributeName.equals("deriveConstraintsFrom")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 == 2) {
                        i6 = c(context, attributeValue);
                        int indexOf = attributeValue.indexOf(47);
                        if (indexOf >= 0) {
                            attributeValue = attributeValue.substring(indexOf + 1);
                        }
                        this.f1660h.put(attributeValue, Integer.valueOf(i6));
                        bVar.f1814a = a0.a.c(i6, context);
                    }
                } else {
                    try {
                        bVar.f1816c = Integer.parseInt(attributeValue);
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3387192:
                                if (attributeValue.equals(Constants.SUBSCRIPTION_NONE)) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        if (c11 != 0) {
                            if (c11 != 1) {
                                if (c11 != 2) {
                                    if (c11 != 3) {
                                        if (c11 == 4) {
                                            bVar.f1816c = 3;
                                        }
                                    } else {
                                        bVar.f1816c = 1;
                                    }
                                } else {
                                    bVar.f1816c = 0;
                                }
                            } else {
                                bVar.f1816c = 2;
                            }
                        } else {
                            bVar.f1816c = 4;
                        }
                    }
                }
            } else {
                i10 = c(context, attributeValue);
            }
        }
        if (i6 != -1) {
            int i12 = this.f1654a.f1598h0;
            bVar.n(context, xmlResourceParser);
            if (i10 != -1) {
                this.f1661i.put(i6, i10);
            }
            this.f1659g.put(i6, bVar);
        }
        return i6;
    }

    public final int i(int i6, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.V);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                i(obtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.L);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                int i10 = obtainStyledAttributes.getInt(index, this.f1662j);
                this.f1662j = i10;
                if (i10 < 8) {
                    this.f1662j = 8;
                }
            } else if (index == 1) {
                this.f1663k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void l(int i6, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.f1659g;
        androidx.constraintlayout.widget.b bVar = sparseArray.get(i6);
        bVar.f1815b = bVar.f1814a;
        int i10 = this.f1661i.get(i6);
        HashMap<Integer, b.a> hashMap = bVar.f;
        if (i10 > 0) {
            l(i10, motionLayout);
            androidx.constraintlayout.widget.b bVar2 = sparseArray.get(i10);
            if (bVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + a0.a.c(i10, this.f1654a.getContext()));
                return;
            }
            bVar.f1815b += "/" + bVar2.f1815b;
            HashMap<Integer, b.a> hashMap2 = bVar2.f;
            for (Integer num : hashMap2.keySet()) {
                int intValue = num.intValue();
                b.a aVar = hashMap2.get(num);
                if (!hashMap.containsKey(Integer.valueOf(intValue))) {
                    hashMap.put(Integer.valueOf(intValue), new b.a());
                }
                b.a aVar2 = hashMap.get(Integer.valueOf(intValue));
                if (aVar2 != null) {
                    b.C0027b c0027b = aVar2.f1823e;
                    if (!c0027b.f1840b) {
                        c0027b.a(aVar.f1823e);
                    }
                    b.d dVar = aVar2.f1821c;
                    if (!dVar.f1889a) {
                        b.d dVar2 = aVar.f1821c;
                        dVar.f1889a = dVar2.f1889a;
                        dVar.f1890b = dVar2.f1890b;
                        dVar.f1892d = dVar2.f1892d;
                        dVar.f1893e = dVar2.f1893e;
                        dVar.f1891c = dVar2.f1891c;
                    }
                    b.e eVar = aVar2.f;
                    if (!eVar.f1895a) {
                        eVar.a(aVar.f);
                    }
                    b.c cVar = aVar2.f1822d;
                    if (!cVar.f1877a) {
                        cVar.a(aVar.f1822d);
                    }
                    for (String str : aVar.f1824g.keySet()) {
                        if (!aVar2.f1824g.containsKey(str)) {
                            aVar2.f1824g.put(str, aVar.f1824g.get(str));
                        }
                    }
                }
            }
        } else {
            bVar.f1815b = b0.b(new StringBuilder(), bVar.f1815b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = motionLayout.getChildAt(i11);
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (bVar.f1818e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!hashMap.containsKey(Integer.valueOf(id2))) {
                    hashMap.put(Integer.valueOf(id2), new b.a());
                }
                b.a aVar4 = hashMap.get(Integer.valueOf(id2));
                if (aVar4 != null) {
                    b.C0027b c0027b2 = aVar4.f1823e;
                    if (!c0027b2.f1840b) {
                        aVar4.c(id2, aVar3);
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            c0027b2.f1854j0 = ((androidx.constraintlayout.widget.a) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                c0027b2.f1864o0 = barrier.getAllowsGoneWidget();
                                c0027b2.f1848g0 = barrier.getType();
                                c0027b2.f1850h0 = barrier.getMargin();
                            }
                        }
                        c0027b2.f1840b = true;
                    }
                    b.d dVar3 = aVar4.f1821c;
                    if (!dVar3.f1889a) {
                        dVar3.f1890b = childAt.getVisibility();
                        dVar3.f1892d = childAt.getAlpha();
                        dVar3.f1889a = true;
                    }
                    b.e eVar2 = aVar4.f;
                    if (!eVar2.f1895a) {
                        eVar2.f1895a = true;
                        eVar2.f1896b = childAt.getRotation();
                        eVar2.f1897c = childAt.getRotationX();
                        eVar2.f1898d = childAt.getRotationY();
                        eVar2.f1899e = childAt.getScaleX();
                        eVar2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.f1900g = pivotX;
                            eVar2.f1901h = pivotY;
                        }
                        eVar2.f1903j = childAt.getTranslationX();
                        eVar2.f1904k = childAt.getTranslationY();
                        eVar2.f1905l = childAt.getTranslationZ();
                        if (eVar2.f1906m) {
                            eVar2.f1907n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (b.a aVar5 : hashMap.values()) {
            if (aVar5.f1825h != null) {
                if (aVar5.f1820b != null) {
                    for (Integer num2 : hashMap.keySet()) {
                        b.a l2 = bVar.l(num2.intValue());
                        String str2 = l2.f1823e.f1858l0;
                        if (str2 != null && aVar5.f1820b.matches(str2)) {
                            aVar5.f1825h.e(l2);
                            l2.f1824g.putAll((HashMap) aVar5.f1824g.clone());
                        }
                    }
                } else {
                    aVar5.f1825h.e(bVar.l(aVar5.f1819a));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i6, int i10) {
        int i11;
        int i12;
        f fVar = this.f1655b;
        if (fVar != null) {
            i11 = fVar.a(i6);
            if (i11 == -1) {
                i11 = i6;
            }
            i12 = this.f1655b.a(i10);
        } else {
            i11 = i6;
        }
        i12 = i10;
        b bVar = this.f1656c;
        if (bVar != null && bVar.f1674c == i10 && bVar.f1675d == i6) {
            return;
        }
        ArrayList<b> arrayList = this.f1657d;
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i13 = next.f1674c;
            if ((i13 == i12 && next.f1675d == i11) || (i13 == i10 && next.f1675d == i6)) {
                this.f1656c = next;
                androidx.constraintlayout.motion.widget.b bVar2 = next.f1682l;
                if (bVar2 != null) {
                    bVar2.c(this.f1668p);
                    return;
                }
                return;
            }
        }
        b bVar3 = this.f1658e;
        Iterator<b> it2 = this.f.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (next2.f1674c == i10) {
                bVar3 = next2;
            }
        }
        b bVar4 = new b(this, bVar3);
        bVar4.f1675d = i11;
        bVar4.f1674c = i12;
        if (i11 != -1) {
            arrayList.add(bVar4);
        }
        this.f1656c = bVar4;
    }

    public final boolean n() {
        Iterator<b> it = this.f1657d.iterator();
        while (it.hasNext()) {
            if (it.next().f1682l != null) {
                return true;
            }
        }
        b bVar = this.f1656c;
        if (bVar != null && bVar.f1682l != null) {
            return true;
        }
        return false;
    }

    /* compiled from: MotionScene.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1672a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1673b;

        /* renamed from: c  reason: collision with root package name */
        public int f1674c;

        /* renamed from: d  reason: collision with root package name */
        public int f1675d;

        /* renamed from: e  reason: collision with root package name */
        public int f1676e;
        public String f;

        /* renamed from: g  reason: collision with root package name */
        public int f1677g;

        /* renamed from: h  reason: collision with root package name */
        public int f1678h;

        /* renamed from: i  reason: collision with root package name */
        public float f1679i;

        /* renamed from: j  reason: collision with root package name */
        public final a f1680j;

        /* renamed from: k  reason: collision with root package name */
        public final ArrayList<g> f1681k;

        /* renamed from: l  reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.b f1682l;

        /* renamed from: m  reason: collision with root package name */
        public final ArrayList<View$OnClickListenerC0024a> f1683m;

        /* renamed from: n  reason: collision with root package name */
        public int f1684n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1685o;

        /* renamed from: p  reason: collision with root package name */
        public int f1686p;

        /* renamed from: q  reason: collision with root package name */
        public int f1687q;
        public int r;

        /* compiled from: MotionScene.java */
        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class View$OnClickListenerC0024a implements View.OnClickListener {

            /* renamed from: u  reason: collision with root package name */
            public final b f1688u;

            /* renamed from: v  reason: collision with root package name */
            public final int f1689v;

            /* renamed from: w  reason: collision with root package name */
            public final int f1690w;

            public View$OnClickListenerC0024a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.f1689v = -1;
                this.f1690w = 17;
                this.f1688u = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.M);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i6 = 0; i6 < indexCount; i6++) {
                    int index = obtainStyledAttributes.getIndex(i6);
                    if (index == 1) {
                        this.f1689v = obtainStyledAttributes.getResourceId(index, this.f1689v);
                    } else if (index == 0) {
                        this.f1690w = obtainStyledAttributes.getInt(index, this.f1690w);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
            public final void a(MotionLayout motionLayout, int i6, b bVar) {
                boolean z10;
                boolean z11;
                boolean z12;
                boolean z13;
                int i10 = this.f1689v;
                MotionLayout motionLayout2 = motionLayout;
                if (i10 != -1) {
                    motionLayout2 = motionLayout.findViewById(i10);
                }
                if (motionLayout2 == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i10);
                    return;
                }
                int i11 = bVar.f1675d;
                int i12 = bVar.f1674c;
                if (i11 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i13 = this.f1690w;
                int i14 = i13 & 1;
                boolean z14 = false;
                if (i14 != 0 && i6 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i13 & 256) != 0 && i6 == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z15 = z10 | z11;
                if (i14 != 0 && i6 == i11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z16 = z12 | z15;
                if ((i13 & 16) != 0 && i6 == i12) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z17 = z16 | z13;
                if ((i13 & 4096) != 0 && i6 == i12) {
                    z14 = true;
                }
                if (z17 | z14) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i6 = this.f1689v;
                if (i6 == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i6);
                if (findViewById == null) {
                    Log.e("MotionScene", " (*)  could not find id " + i6);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                boolean z11;
                boolean z12;
                int i6;
                b bVar = this.f1688u;
                a aVar = bVar.f1680j;
                MotionLayout motionLayout = aVar.f1654a;
                if (!motionLayout.T) {
                    return;
                }
                if (bVar.f1675d == -1) {
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.B(bVar.f1674c);
                        return;
                    }
                    b bVar2 = new b(bVar.f1680j, bVar);
                    bVar2.f1675d = currentState;
                    bVar2.f1674c = bVar.f1674c;
                    motionLayout.setTransition(bVar2);
                    motionLayout.A();
                    return;
                }
                b bVar3 = aVar.f1656c;
                int i10 = this.f1690w;
                boolean z13 = true;
                if ((i10 & 1) == 0 && (i10 & 256) == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if ((i10 & 16) == 0 && (i10 & 4096) == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 && z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (bVar3 != bVar) {
                        motionLayout.setTransition(bVar);
                    }
                    if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                        z11 = false;
                    } else {
                        z10 = false;
                    }
                }
                if (bVar != bVar3) {
                    int i11 = bVar.f1674c;
                    int i12 = bVar.f1675d;
                    if (i12 != -1 ? !((i6 = motionLayout.P) == i12 || i6 == i11) : motionLayout.P == i11) {
                        z13 = false;
                    }
                }
                if (z13) {
                    if (z10 && (i10 & 1) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.A();
                    } else if (z11 && (i10 & 16) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.m(0.0f);
                    } else if (z10 && (i10 & 256) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(1.0f);
                    } else if (z11 && (i10 & 4096) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public b(a aVar, b bVar) {
            this.f1672a = -1;
            this.f1673b = false;
            this.f1674c = -1;
            this.f1675d = -1;
            this.f1676e = 0;
            this.f = null;
            this.f1677g = -1;
            this.f1678h = 400;
            this.f1679i = 0.0f;
            this.f1681k = new ArrayList<>();
            this.f1682l = null;
            this.f1683m = new ArrayList<>();
            this.f1684n = 0;
            this.f1685o = false;
            this.f1686p = -1;
            this.f1687q = 0;
            this.r = 0;
            this.f1680j = aVar;
            this.f1678h = aVar.f1662j;
            if (bVar != null) {
                this.f1686p = bVar.f1686p;
                this.f1676e = bVar.f1676e;
                this.f = bVar.f;
                this.f1677g = bVar.f1677g;
                this.f1678h = bVar.f1678h;
                this.f1681k = bVar.f1681k;
                this.f1679i = bVar.f1679i;
                this.f1687q = bVar.f1687q;
            }
        }

        public b(a aVar, int i6) {
            this.f1672a = -1;
            this.f1673b = false;
            this.f1674c = -1;
            this.f1675d = -1;
            this.f1676e = 0;
            this.f = null;
            this.f1677g = -1;
            this.f1678h = 400;
            this.f1679i = 0.0f;
            this.f1681k = new ArrayList<>();
            this.f1682l = null;
            this.f1683m = new ArrayList<>();
            this.f1684n = 0;
            this.f1685o = false;
            this.f1686p = -1;
            this.f1687q = 0;
            this.r = 0;
            this.f1672a = -1;
            this.f1680j = aVar;
            this.f1675d = R.id.view_transition;
            this.f1674c = i6;
            this.f1678h = aVar.f1662j;
            this.f1687q = aVar.f1663k;
        }

        public b(a aVar, Context context, XmlResourceParser xmlResourceParser) {
            this.f1672a = -1;
            this.f1673b = false;
            this.f1674c = -1;
            this.f1675d = -1;
            this.f1676e = 0;
            this.f = null;
            this.f1677g = -1;
            this.f1678h = 400;
            this.f1679i = 0.0f;
            this.f1681k = new ArrayList<>();
            this.f1682l = null;
            this.f1683m = new ArrayList<>();
            this.f1684n = 0;
            this.f1685o = false;
            this.f1686p = -1;
            this.f1687q = 0;
            this.r = 0;
            this.f1678h = aVar.f1662j;
            this.f1687q = aVar.f1663k;
            this.f1680j = aVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.S);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar.f1659g;
                if (index == 2) {
                    this.f1674c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1674c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        bVar.m(this.f1674c, context);
                        sparseArray.append(this.f1674c, bVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f1674c = aVar.i(this.f1674c, context);
                    }
                } else if (index == 3) {
                    this.f1675d = obtainStyledAttributes.getResourceId(index, this.f1675d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f1675d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        bVar2.m(this.f1675d, context);
                        sparseArray.append(this.f1675d, bVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f1675d = aVar.i(this.f1675d, context);
                    }
                } else if (index == 6) {
                    int i10 = obtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f1677g = resourceId;
                        if (resourceId != -1) {
                            this.f1676e = -2;
                        }
                    } else if (i10 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f1677g = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1676e = -2;
                            } else {
                                this.f1676e = -1;
                            }
                        }
                    } else {
                        this.f1676e = obtainStyledAttributes.getInteger(index, this.f1676e);
                    }
                } else if (index == 4) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f1678h);
                    this.f1678h = i11;
                    if (i11 < 8) {
                        this.f1678h = 8;
                    }
                } else if (index == 8) {
                    this.f1679i = obtainStyledAttributes.getFloat(index, this.f1679i);
                } else if (index == 1) {
                    this.f1684n = obtainStyledAttributes.getInteger(index, this.f1684n);
                } else if (index == 0) {
                    this.f1672a = obtainStyledAttributes.getResourceId(index, this.f1672a);
                } else if (index == 9) {
                    this.f1685o = obtainStyledAttributes.getBoolean(index, this.f1685o);
                } else if (index == 7) {
                    this.f1686p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f1687q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f1675d == -1) {
                this.f1673b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
