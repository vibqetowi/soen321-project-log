package b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import tr.r;
/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f3911a;

    /* renamed from: b  reason: collision with root package name */
    public int f3912b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3913c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<a> f3914d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.b> f3915e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3916a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<C0072b> f3917b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final int f3918c;

        /* renamed from: d  reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f3919d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f3918c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.P);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.f3916a = obtainStyledAttributes.getResourceId(index, this.f3916a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f3918c);
                    this.f3918c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f3919d = bVar;
                        bVar.e(resourceId, context);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: b0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0072b {

        /* renamed from: a  reason: collision with root package name */
        public final float f3920a;

        /* renamed from: b  reason: collision with root package name */
        public final float f3921b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3922c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3923d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3924e;
        public final androidx.constraintlayout.widget.b f;

        public C0072b(Context context, XmlResourceParser xmlResourceParser) {
            this.f3920a = Float.NaN;
            this.f3921b = Float.NaN;
            this.f3922c = Float.NaN;
            this.f3923d = Float.NaN;
            this.f3924e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.T);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f3924e);
                    this.f3924e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f = bVar;
                        bVar.e(resourceId, context);
                    }
                } else if (index == 1) {
                    this.f3923d = obtainStyledAttributes.getDimension(index, this.f3923d);
                } else if (index == 2) {
                    this.f3921b = obtainStyledAttributes.getDimension(index, this.f3921b);
                } else if (index == 3) {
                    this.f3922c = obtainStyledAttributes.getDimension(index, this.f3922c);
                } else if (index == 4) {
                    this.f3920a = obtainStyledAttributes.getDimension(index, this.f3920a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f, float f2) {
            float f10 = this.f3920a;
            if (!Float.isNaN(f10) && f < f10) {
                return false;
            }
            float f11 = this.f3921b;
            if (!Float.isNaN(f11) && f2 < f11) {
                return false;
            }
            float f12 = this.f3922c;
            if (!Float.isNaN(f12) && f > f12) {
                return false;
            }
            float f13 = this.f3923d;
            if (!Float.isNaN(f13) && f2 > f13) {
                return false;
            }
            return true;
        }
    }

    public b(Context context, ConstraintLayout constraintLayout, int i6) {
        this.f3911a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c10 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            if (c10 != 2) {
                                if (c10 != 3) {
                                    if (c10 != 4) {
                                        continue;
                                    } else {
                                        a(context, xml);
                                        continue;
                                    }
                                } else {
                                    C0072b c0072b = new C0072b(context, xml);
                                    if (aVar != null) {
                                        aVar.f3917b.add(c0072b);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                a aVar2 = new a(context, xml);
                                this.f3914d.put(aVar2.f3916a, aVar2);
                                aVar = aVar2;
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        int i6;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i6 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i6 = -1;
                }
                if (i6 == -1) {
                    if (attributeValue.length() > 1) {
                        i6 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                bVar.n(context, xmlResourceParser);
                this.f3915e.put(i6, bVar);
                return;
            }
        }
    }
}
