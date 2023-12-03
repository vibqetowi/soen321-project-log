package i0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: FontResourcesParserCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(TypedArray typedArray, int i6) {
            return typedArray.getType(i6);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final C0297d[] f19616a;

        public c(C0297d[] c0297dArr) {
            this.f19616a = c0297dArr;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: i0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0297d {

        /* renamed from: a  reason: collision with root package name */
        public final String f19617a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19618b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f19619c;

        /* renamed from: d  reason: collision with root package name */
        public final String f19620d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19621e;
        public final int f;

        public C0297d(int i6, int i10, int i11, String str, String str2, boolean z10) {
            this.f19617a = str;
            this.f19618b = i6;
            this.f19619c = z10;
            this.f19620d = str2;
            this.f19621e = i10;
            this.f = i11;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final p0.f f19622a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19623b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19624c;

        /* renamed from: d  reason: collision with root package name */
        public final String f19625d;

        public e(p0.f fVar, int i6, int i10, String str) {
            this.f19622a = fVar;
            this.f19624c = i6;
            this.f19623b = i10;
            this.f19625d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i6;
        boolean z10;
        int i10;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sc.b.f31424y);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new e(new p0.f(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sc.b.f31425z);
                            int i11 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i11 = 1;
                            }
                            int i12 = obtainAttributes2.getInt(i11, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i6 = 6;
                            } else {
                                i6 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i6, 0)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i13 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i13 = 3;
                            }
                            int i14 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i14 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i14);
                            int i15 = obtainAttributes2.getInt(i13, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i10 = 5;
                            } else {
                                i10 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                            String string6 = obtainAttributes2.getString(i10);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                c(xmlResourceParser);
                            }
                            arrayList.add(new C0297d(i12, i15, resourceId2, string6, string5, z10));
                        } else {
                            c(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new c((C0297d[]) arrayList.toArray(new C0297d[0]));
                }
            } else {
                c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i6) {
        if (i6 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i6);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i6);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i6 = 1;
        while (i6 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i6--;
                }
            } else {
                i6++;
            }
        }
    }
}
