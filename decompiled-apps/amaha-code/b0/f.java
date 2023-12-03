package b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import tr.r;
/* compiled from: StateSet.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f3926a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a> f3927b = new SparseArray<>();

    /* compiled from: StateSet.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3928a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<b> f3929b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final int f3930c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f3930c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.P);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.f3928a = obtainStyledAttributes.getResourceId(index, this.f3928a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f3930c);
                    this.f3930c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: StateSet.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f3931a;

        /* renamed from: b  reason: collision with root package name */
        public final float f3932b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3933c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3934d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3935e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f3931a = Float.NaN;
            this.f3932b = Float.NaN;
            this.f3933c = Float.NaN;
            this.f3934d = Float.NaN;
            this.f3935e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.T);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f3935e);
                    this.f3935e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f3934d = obtainStyledAttributes.getDimension(index, this.f3934d);
                } else if (index == 2) {
                    this.f3932b = obtainStyledAttributes.getDimension(index, this.f3932b);
                } else if (index == 3) {
                    this.f3933c = obtainStyledAttributes.getDimension(index, this.f3933c);
                } else if (index == 4) {
                    this.f3931a = obtainStyledAttributes.getDimension(index, this.f3931a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f, float f2) {
            float f10 = this.f3931a;
            if (!Float.isNaN(f10) && f < f10) {
                return false;
            }
            float f11 = this.f3932b;
            if (!Float.isNaN(f11) && f2 < f11) {
                return false;
            }
            float f12 = this.f3933c;
            if (!Float.isNaN(f12) && f > f12) {
                return false;
            }
            float f13 = this.f3934d;
            if (!Float.isNaN(f13) && f2 > f13) {
                return false;
            }
            return true;
        }
    }

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f3926a = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.Q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                this.f3926a = obtainStyledAttributes.getResourceId(index, this.f3926a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (true) {
                char c10 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlResourceParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        c10 = 0;
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
                                if (c10 == 3) {
                                    b bVar = new b(context, xmlResourceParser);
                                    if (aVar != null) {
                                        aVar.f3929b.add(bVar);
                                    }
                                }
                            } else {
                                a aVar2 = new a(context, xmlResourceParser);
                                this.f3927b.put(aVar2.f3928a, aVar2);
                                aVar = aVar2;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
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

    public final int a(int i6) {
        ArrayList<b> arrayList;
        int i10;
        a aVar;
        ArrayList<b> arrayList2;
        float f = -1;
        SparseArray<a> sparseArray = this.f3927b;
        int i11 = 0;
        if (-1 == i6) {
            if (i6 == -1) {
                aVar = sparseArray.valueAt(0);
            } else {
                aVar = sparseArray.get(-1);
            }
            if (aVar == null) {
                return -1;
            }
            while (true) {
                arrayList2 = aVar.f3929b;
                if (i11 < arrayList2.size()) {
                    if (arrayList2.get(i11).a(f, f)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (-1 == i11) {
                return -1;
            }
            if (i11 == -1) {
                i10 = aVar.f3930c;
            } else {
                i10 = arrayList2.get(i11).f3935e;
            }
        } else {
            a aVar2 = sparseArray.get(i6);
            if (aVar2 == null) {
                return -1;
            }
            while (true) {
                arrayList = aVar2.f3929b;
                if (i11 < arrayList.size()) {
                    if (arrayList.get(i11).a(f, f)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 == -1) {
                i10 = aVar2.f3930c;
            } else {
                i10 = arrayList.get(i11).f3935e;
            }
        }
        return i10;
    }
}
