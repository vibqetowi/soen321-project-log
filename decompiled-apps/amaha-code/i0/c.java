package i0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f19613a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f19614b;

    /* renamed from: c  reason: collision with root package name */
    public int f19615c;

    public c(Shader shader, ColorStateList colorStateList, int i6) {
        this.f19613a = shader;
        this.f19614b = colorStateList;
        this.f19615c = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017e, code lost:
        if (r8.size() <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0180, code lost:
        r0 = new i0.e(r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018a, code lost:
        if (r19 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018c, code lost:
        r0 = new i0.e(r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0192, code lost:
        r0 = new i0.e(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
        if (r11 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019b, code lost:
        if (r11 == 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
        r4 = r0.f19626a;
        r0 = r0.f19627b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a3, code lost:
        if (r7 == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a5, code lost:
        if (r7 == 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a7, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01aa, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ad, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01af, code lost:
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r15, r4, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c0, code lost:
        r3 = new android.graphics.SweepGradient(r7, r9, r0.f19626a, r0.f19627b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d5, code lost:
        if (r8 <= 0.0f) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d7, code lost:
        r1 = r0.f19626a;
        r0 = r0.f19627b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01de, code lost:
        if (r7 == 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e1, code lost:
        if (r7 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e3, code lost:
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e6, code lost:
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e9, code lost:
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01eb, code lost:
        r3 = new android.graphics.RadialGradient(r7, r9, r8, r1, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0203, code lost:
        return new i0.c(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(Resources resources, int i6, Resources.Theme theme) {
        int next;
        int color;
        int color2;
        int color3;
        float f;
        XmlResourceParser xml = resources.getXml(i6);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    ColorStateList b10 = b.b(resources, xml, asAttributeSet, theme);
                    return new c(null, b10, b10.getDefaultColor());
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            String name2 = xml.getName();
            if (name2.equals("gradient")) {
                TypedArray f2 = h.f(resources, theme, asAttributeSet, sc.b.A);
                float b11 = h.b(f2, xml, "startX", 8, 0.0f);
                float b12 = h.b(f2, xml, "startY", 9, 0.0f);
                float b13 = h.b(f2, xml, "endX", 10, 0.0f);
                float b14 = h.b(f2, xml, "endY", 11, 0.0f);
                float b15 = h.b(f2, xml, "centerX", 3, 0.0f);
                float b16 = h.b(f2, xml, "centerY", 4, 0.0f);
                int c10 = h.c(f2, xml, "type", 2, 0);
                if (!h.e(xml, "startColor")) {
                    color = 0;
                } else {
                    color = f2.getColor(0, 0);
                }
                boolean e10 = h.e(xml, "centerColor");
                if (!h.e(xml, "centerColor")) {
                    color2 = 0;
                } else {
                    color2 = f2.getColor(7, 0);
                }
                if (!h.e(xml, "endColor")) {
                    color3 = 0;
                } else {
                    color3 = f2.getColor(1, 0);
                }
                int c11 = h.c(f2, xml, "tileMode", 6, 0);
                float b17 = h.b(f2, xml, "gradientRadius", 5, 0.0f);
                f2.recycle();
                int depth = xml.getDepth() + 1;
                ArrayList arrayList = new ArrayList(20);
                ArrayList arrayList2 = new ArrayList(20);
                while (true) {
                    int next2 = xml.next();
                    float f10 = b13;
                    if (next2 != 1) {
                        int depth2 = xml.getDepth();
                        f = b12;
                        if (depth2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                            TypedArray f11 = h.f(resources, theme, asAttributeSet, sc.b.B);
                            boolean hasValue = f11.hasValue(0);
                            boolean hasValue2 = f11.hasValue(1);
                            if (!hasValue || !hasValue2) {
                                break;
                            }
                            int color4 = f11.getColor(0, 0);
                            float f12 = f11.getFloat(1, 0.0f);
                            f11.recycle();
                            arrayList2.add(Integer.valueOf(color4));
                            arrayList.add(Float.valueOf(f12));
                        }
                        b13 = f10;
                        b12 = f;
                    } else {
                        f = b12;
                        break;
                    }
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        if (this.f19613a == null && (colorStateList = this.f19614b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }
}
