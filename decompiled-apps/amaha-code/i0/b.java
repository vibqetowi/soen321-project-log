package i0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.theinnerhour.b2b.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ColorStateListInflaterCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f19612a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray obtainStyledAttributes;
        int color;
        float f;
        float f2;
        int attributeCount;
        int i6;
        boolean z10;
        int i10;
        float min;
        float f10;
        float cbrt;
        float f11;
        int i11;
        int i12;
        TypedValue typedValue;
        boolean z11;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (name.equals("selector")) {
            ?? r42 = 1;
            int depth2 = xmlResourceParser.getDepth() + 1;
            int[][] iArr = new int[20];
            int[] iArr2 = new int[20];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == r42 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                    break;
                } else if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                    int[] iArr3 = sc.b.f31423x;
                    if (theme2 == null) {
                        obtainStyledAttributes = resources2.obtainAttributes(attributeSet2, iArr3);
                    } else {
                        obtainStyledAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr3, i13, i13);
                    }
                    int resourceId = obtainStyledAttributes.getResourceId(i13, -1);
                    if (resourceId != -1) {
                        ThreadLocal<TypedValue> threadLocal = f19612a;
                        TypedValue typedValue2 = threadLocal.get();
                        if (typedValue2 == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        } else {
                            typedValue = typedValue2;
                        }
                        resources2.getValue(resourceId, typedValue, r42);
                        int i15 = typedValue.type;
                        if (i15 >= 28 && i15 <= 31) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            try {
                                color = a(resources2, resources2.getXml(resourceId), theme2).getDefaultColor();
                            } catch (Exception unused) {
                                color = obtainStyledAttributes.getColor(i13, -65281);
                            }
                            if (!obtainStyledAttributes.hasValue(r42)) {
                                f = obtainStyledAttributes.getFloat(r42, 1.0f);
                            } else if (obtainStyledAttributes.hasValue(3)) {
                                f = obtainStyledAttributes.getFloat(3, 1.0f);
                            } else {
                                f = 1.0f;
                            }
                            if (Build.VERSION.SDK_INT < 31 && obtainStyledAttributes.hasValue(2)) {
                                f2 = obtainStyledAttributes.getFloat(2, -1.0f);
                            } else {
                                f2 = obtainStyledAttributes.getFloat(4, -1.0f);
                            }
                            obtainStyledAttributes.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr4 = new int[attributeCount];
                            int i16 = 0;
                            for (i6 = 0; i6 < attributeCount; i6++) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i6);
                                if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                    int i17 = i16 + 1;
                                    if (!attributeSet2.getAttributeBooleanValue(i6, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr4[i16] = attributeNameResource;
                                    i16 = i17;
                                }
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr4, i16);
                            if (f2 < 0.0f && f2 <= 100.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (f != 1.0f && !z10) {
                                i10 = depth2;
                            } else {
                                int j10 = hc.d.j((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                                if (!z10) {
                                    a a10 = a.a(color);
                                    i iVar = i.f19642k;
                                    float f12 = a10.f19608b;
                                    if (f12 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                                        float f13 = a10.f19607a;
                                        if (f13 < 0.0f) {
                                            min = 0.0f;
                                        } else {
                                            min = Math.min(360.0f, f13);
                                        }
                                        float f14 = f12;
                                        a aVar = null;
                                        boolean z12 = true;
                                        float f15 = 0.0f;
                                        while (true) {
                                            if (Math.abs(f15 - f12) >= 0.4f) {
                                                float f16 = 1000.0f;
                                                float f17 = 1000.0f;
                                                float f18 = 0.0f;
                                                float f19 = 100.0f;
                                                a aVar2 = null;
                                                while (true) {
                                                    if (Math.abs(f18 - f19) > 0.01f) {
                                                        float f20 = ((f19 - f18) / 2.0f) + f18;
                                                        int c10 = a.b(f20, f14, min).c(i.f19642k);
                                                        float S = sc.b.S(Color.red(c10));
                                                        float S2 = sc.b.S(Color.green(c10));
                                                        float S3 = sc.b.S(Color.blue(c10));
                                                        float[] fArr = sc.b.F[1];
                                                        float f21 = ((S3 * fArr[2]) + ((S2 * fArr[1]) + (S * fArr[0]))) / 100.0f;
                                                        if (f21 <= 0.008856452f) {
                                                            cbrt = f21 * 903.2963f;
                                                            i10 = depth2;
                                                        } else {
                                                            i10 = depth2;
                                                            cbrt = (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                                        }
                                                        float abs = Math.abs(f2 - cbrt);
                                                        if (abs < 0.2f) {
                                                            a a11 = a.a(c10);
                                                            a b10 = a.b(a11.f19609c, a11.f19608b, min);
                                                            f11 = f20;
                                                            float f22 = a11.f19610d - b10.f19610d;
                                                            f10 = min;
                                                            float f23 = a11.f19611e - b10.f19611e;
                                                            float f24 = a11.f - b10.f;
                                                            float pow = (float) (Math.pow(Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22)), 0.63d) * 1.41d);
                                                            if (pow <= 1.0f) {
                                                                aVar2 = a11;
                                                                f17 = pow;
                                                                f16 = abs;
                                                            }
                                                        } else {
                                                            f11 = f20;
                                                            f10 = min;
                                                        }
                                                        if (f16 == 0.0f && f17 == 0.0f) {
                                                            break;
                                                        }
                                                        if (cbrt < f2) {
                                                            f18 = f11;
                                                        } else {
                                                            f19 = f11;
                                                        }
                                                        depth2 = i10;
                                                        min = f10;
                                                    } else {
                                                        i10 = depth2;
                                                        f10 = min;
                                                        break;
                                                    }
                                                }
                                                a aVar3 = aVar2;
                                                if (z12) {
                                                    if (aVar3 != null) {
                                                        color = aVar3.c(iVar);
                                                        break;
                                                    }
                                                    f14 = ((f12 - f15) / 2.0f) + f15;
                                                    depth2 = i10;
                                                    min = f10;
                                                    z12 = false;
                                                } else {
                                                    if (aVar3 == null) {
                                                        f12 = f14;
                                                    } else {
                                                        aVar = aVar3;
                                                        f15 = f14;
                                                    }
                                                    f14 = ((f12 - f15) / 2.0f) + f15;
                                                    depth2 = i10;
                                                    min = f10;
                                                }
                                            } else {
                                                i10 = depth2;
                                                if (aVar == null) {
                                                    color = sc.b.N(f2);
                                                } else {
                                                    color = aVar.c(iVar);
                                                }
                                            }
                                        }
                                    } else {
                                        i10 = depth2;
                                        color = sc.b.N(f2);
                                    }
                                } else {
                                    i10 = depth2;
                                }
                                color = (16777215 & color) | (j10 << 24);
                            }
                            i11 = i14 + 1;
                            int i18 = 8;
                            if (i11 > iArr2.length) {
                                if (i14 <= 4) {
                                    i12 = 8;
                                } else {
                                    i12 = i14 * 2;
                                }
                                int[] iArr5 = new int[i12];
                                System.arraycopy(iArr2, 0, iArr5, 0, i14);
                                iArr2 = iArr5;
                            }
                            iArr2[i14] = color;
                            if (i11 > iArr.length) {
                                Class<?> componentType = iArr.getClass().getComponentType();
                                if (i14 > 4) {
                                    i18 = i14 * 2;
                                }
                                ?? r22 = (Object[]) Array.newInstance(componentType, i18);
                                System.arraycopy(iArr, 0, r22, 0, i14);
                                iArr = r22;
                            }
                            iArr[i14] = trimStateSet;
                            iArr = iArr;
                            resources2 = resources;
                            theme2 = theme;
                            i14 = i11;
                            depth2 = i10;
                            r42 = 1;
                            i13 = 0;
                            attributeSet2 = attributeSet;
                        }
                    }
                    color = obtainStyledAttributes.getColor(i13, -65281);
                    if (!obtainStyledAttributes.hasValue(r42)) {
                    }
                    if (Build.VERSION.SDK_INT < 31) {
                    }
                    f2 = obtainStyledAttributes.getFloat(4, -1.0f);
                    obtainStyledAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr42 = new int[attributeCount];
                    int i162 = 0;
                    while (i6 < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr42, i162);
                    if (f2 < 0.0f) {
                    }
                    z10 = false;
                    if (f != 1.0f) {
                    }
                    int j102 = hc.d.j((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (!z10) {
                    }
                    color = (16777215 & color) | (j102 << 24);
                    i11 = i14 + 1;
                    int i182 = 8;
                    if (i11 > iArr2.length) {
                    }
                    iArr2[i14] = color;
                    if (i11 > iArr.length) {
                    }
                    iArr[i14] = trimStateSet2;
                    iArr = iArr;
                    resources2 = resources;
                    theme2 = theme;
                    i14 = i11;
                    depth2 = i10;
                    r42 = 1;
                    i13 = 0;
                    attributeSet2 = attributeSet;
                } else {
                    resources2 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    depth2 = depth2;
                    r42 = 1;
                    i13 = 0;
                }
            }
            int[] iArr6 = new int[i14];
            int[][] iArr7 = new int[i14];
            System.arraycopy(iArr2, 0, iArr6, 0, i14);
            System.arraycopy(iArr, 0, iArr7, 0, i14);
            return new ColorStateList(iArr7, iArr6);
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
