package i2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import j0.g;
import java.util.ArrayList;
/* compiled from: AnimatorInflaterCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: AnimatorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<g.a[]> {

        /* renamed from: a  reason: collision with root package name */
        public g.a[] f19681a;

        @Override // android.animation.TypeEvaluator
        public final g.a[] evaluate(float f, g.a[] aVarArr, g.a[] aVarArr2) {
            g.a[] aVarArr3 = aVarArr;
            g.a[] aVarArr4 = aVarArr2;
            if (j0.g.a(aVarArr3, aVarArr4)) {
                if (!j0.g.a(this.f19681a, aVarArr3)) {
                    this.f19681a = j0.g.e(aVarArr3);
                }
                for (int i6 = 0; i6 < aVarArr3.length; i6++) {
                    g.a aVar = this.f19681a[i6];
                    g.a aVar2 = aVarArr3[i6];
                    g.a aVar3 = aVarArr4[i6];
                    aVar.getClass();
                    aVar.f21628a = aVar2.f21628a;
                    int i10 = 0;
                    while (true) {
                        float[] fArr = aVar2.f21629b;
                        if (i10 < fArr.length) {
                            aVar.f21629b[i10] = (aVar3.f21629b[i10] * f) + ((1.0f - f) * fArr[i10]);
                            i10++;
                        }
                    }
                }
                return this.f19681a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0334, code lost:
        if (r32 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0336, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0338, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0347, code lost:
        if (r2.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0349, code lost:
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0355, code lost:
        if (r33 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0357, code lost:
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x035b, code lost:
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x035e, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i6) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i10;
        String str2;
        TypedValue peekValue;
        boolean z10;
        int i11;
        Keyframe ofInt;
        int resourceId;
        TypedValue peekValue2;
        boolean z11;
        ObjectAnimator objectAnimator;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i12 = 3;
            boolean z12 = false;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i13 = 1;
            if (next == 1) {
                break;
            }
            int i14 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator2 = new ObjectAnimator();
                    e(context, resources, theme, attributeSet, objectAnimator2, xmlResourceParser);
                    objectAnimator = objectAnimator2;
                } else if (name.equals("animator")) {
                    objectAnimator = e(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else {
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray f = i0.h.f(resources2, theme2, attributeSet, i2.a.f19663h);
                        a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, i0.h.c(f, xmlResourceParser, "ordering", 0, 0));
                        f.recycle();
                        valueAnimator = animatorSet2;
                    } else {
                        String str3 = "propertyValuesHolder";
                        if (name.equals("propertyValuesHolder")) {
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                            ArrayList arrayList2 = null;
                            while (true) {
                                int eventType = xmlResourceParser.getEventType();
                                if (eventType == i12 || eventType == i13) {
                                    break;
                                } else if (eventType != i14) {
                                    xmlResourceParser.next();
                                } else {
                                    if (xmlResourceParser.getName().equals(str3)) {
                                        TypedArray f2 = i0.h.f(resources2, theme2, asAttributeSet, i2.a.f19664i);
                                        String d10 = i0.h.d(f2, xmlResourceParser, "propertyName", i12);
                                        int c10 = i0.h.c(f2, xmlResourceParser, "valueType", i14, 4);
                                        int i15 = c10;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            int next2 = xmlResourceParser.next();
                                            attributeSet2 = asAttributeSet;
                                            if (next2 == i12 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlResourceParser.getName().equals("keyframe")) {
                                                int[] iArr = i2.a.f19665j;
                                                if (i15 == 4) {
                                                    TypedArray f10 = i0.h.f(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                    if (!i0.h.e(xmlResourceParser, "value")) {
                                                        peekValue2 = null;
                                                    } else {
                                                        peekValue2 = f10.peekValue(0);
                                                    }
                                                    if (peekValue2 != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11 && d(peekValue2.type)) {
                                                        i15 = 3;
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    f10.recycle();
                                                }
                                                TypedArray f11 = i0.h.f(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                str2 = str3;
                                                float b10 = i0.h.b(f11, xmlResourceParser, "fraction", 3, -1.0f);
                                                if (!i0.h.e(xmlResourceParser, "value")) {
                                                    peekValue = null;
                                                } else {
                                                    peekValue = f11.peekValue(0);
                                                }
                                                if (peekValue != null) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (i15 == 4) {
                                                    if (z10 && d(peekValue.type)) {
                                                        i11 = 3;
                                                    } else {
                                                        i11 = 0;
                                                    }
                                                } else {
                                                    i11 = i15;
                                                }
                                                if (z10) {
                                                    if (i11 != 0) {
                                                        if (i11 != 1 && i11 != 3) {
                                                            ofInt = null;
                                                        } else {
                                                            ofInt = Keyframe.ofInt(b10, i0.h.c(f11, xmlResourceParser, "value", 0, 0));
                                                        }
                                                    } else {
                                                        ofInt = Keyframe.ofFloat(b10, i0.h.b(f11, xmlResourceParser, "value", 0, 0.0f));
                                                    }
                                                } else if (i11 == 0) {
                                                    ofInt = Keyframe.ofFloat(b10);
                                                } else {
                                                    ofInt = Keyframe.ofInt(b10);
                                                }
                                                if (!i0.h.e(xmlResourceParser, "interpolator")) {
                                                    resourceId = 0;
                                                } else {
                                                    resourceId = f11.getResourceId(1, 0);
                                                }
                                                if (resourceId > 0) {
                                                    ofInt.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                f11.recycle();
                                                ArrayList arrayList4 = arrayList3;
                                                if (ofInt != null) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    arrayList4.add(ofInt);
                                                    arrayList3 = arrayList4;
                                                }
                                                xmlResourceParser.next();
                                            } else {
                                                str2 = str3;
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            asAttributeSet = attributeSet2;
                                            str3 = str2;
                                            i12 = 3;
                                        }
                                        str = str3;
                                        ArrayList arrayList5 = arrayList3;
                                        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
                                            Keyframe keyframe = (Keyframe) arrayList5.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList5.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList5.add(arrayList5.size(), b(keyframe2, 1.0f));
                                                    size++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList5.add(0, b(keyframe, 0.0f));
                                                    size++;
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[size];
                                            arrayList5.toArray(keyframeArr);
                                            int i16 = 0;
                                            while (i16 < size) {
                                                Keyframe keyframe3 = keyframeArr[i16];
                                                if (keyframe3.getFraction() < 0.0f) {
                                                    if (i16 == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else {
                                                        int i17 = size - 1;
                                                        if (i16 == i17) {
                                                            keyframe3.setFraction(1.0f);
                                                        } else {
                                                            int i18 = i16;
                                                            for (int i19 = i16 + 1; i19 < i17 && keyframeArr[i19].getFraction() < 0.0f; i19++) {
                                                                i18 = i19;
                                                            }
                                                            float fraction3 = (keyframeArr[i18 + 1].getFraction() - keyframeArr[i16 - 1].getFraction()) / ((i18 - i16) + 2);
                                                            int i20 = i16;
                                                            while (true) {
                                                                i10 = size;
                                                                if (i20 <= i18) {
                                                                    keyframeArr[i20].setFraction(keyframeArr[i20 - 1].getFraction() + fraction3);
                                                                    i20++;
                                                                    size = i10;
                                                                    i18 = i18;
                                                                }
                                                            }
                                                            i16++;
                                                            size = i10;
                                                        }
                                                    }
                                                }
                                                i10 = size;
                                                i16++;
                                                size = i10;
                                            }
                                            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(d10, keyframeArr);
                                            i12 = 3;
                                            if (i15 == 3) {
                                                propertyValuesHolder.setEvaluator(g.f19682a);
                                            }
                                        } else {
                                            i12 = 3;
                                            propertyValuesHolder = null;
                                        }
                                        if (propertyValuesHolder == null) {
                                            propertyValuesHolder = c(f2, c10, 0, 1, d10);
                                        }
                                        if (propertyValuesHolder != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolder);
                                        }
                                        f2.recycle();
                                    } else {
                                        attributeSet2 = asAttributeSet;
                                        str = str3;
                                    }
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    asAttributeSet = attributeSet2;
                                    str3 = str;
                                    i13 = 1;
                                    i14 = 2;
                                }
                            }
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i21 = 0; i21 < size2; i21++) {
                                    propertyValuesHolderArr[i21] = (PropertyValuesHolder) arrayList2.get(i21);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (valueAnimator instanceof ValueAnimator)) {
                                valueAnimator.setValues(propertyValuesHolderArr);
                            }
                            z12 = true;
                        } else {
                            throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                        }
                    }
                    if (animatorSet != null && !z12) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAnimator);
                    }
                    resources2 = resources;
                    theme2 = theme;
                }
                valueAnimator = objectAnimator;
                if (animatorSet != null) {
                    if (arrayList == null) {
                    }
                    arrayList.add(valueAnimator);
                }
                resources2 = resources;
                theme2 = theme;
            }
        }
    }

    public static Keyframe b(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i6, int i10, int i11, String str) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        g gVar;
        int i14;
        int i15;
        int i16;
        float f;
        PropertyValuesHolder ofFloat;
        float f2;
        float f10;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = peekValue.type;
        } else {
            i12 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i11);
        if (peekValue2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = peekValue2.type;
        } else {
            i13 = 0;
        }
        if (i6 == 4) {
            if ((z10 && d(i12)) || (z11 && d(i13))) {
                i6 = 3;
            } else {
                i6 = 0;
            }
        }
        if (i6 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i6 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            g.a[] c10 = j0.g.c(string);
            g.a[] c11 = j0.g.c(string2);
            if (c10 == null && c11 == null) {
                return null;
            }
            if (c10 != null) {
                a aVar = new a();
                if (c11 != null) {
                    if (j0.g.a(c10, c11)) {
                        ofObject = PropertyValuesHolder.ofObject(str, aVar, c10, c11);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, c10);
                }
                return ofObject;
            } else if (c11 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new a(), c11);
            }
        }
        if (i6 == 3) {
            gVar = g.f19682a;
        } else {
            gVar = null;
        }
        if (z12) {
            if (z10) {
                if (i12 == 5) {
                    f2 = typedArray.getDimension(i10, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i10, 0.0f);
                }
                if (z11) {
                    if (i13 == 5) {
                        f10 = typedArray.getDimension(i11, 0.0f);
                    } else {
                        f10 = typedArray.getFloat(i11, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2, f10);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i13 == 5) {
                    f = typedArray.getDimension(i11, 0.0f);
                } else {
                    f = typedArray.getFloat(i11, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i12 == 5) {
                i15 = (int) typedArray.getDimension(i10, 0.0f);
            } else if (d(i12)) {
                i15 = typedArray.getColor(i10, 0);
            } else {
                i15 = typedArray.getInt(i10, 0);
            }
            if (z11) {
                if (i13 == 5) {
                    i16 = (int) typedArray.getDimension(i11, 0.0f);
                } else if (d(i13)) {
                    i16 = typedArray.getColor(i11, 0);
                } else {
                    i16 = typedArray.getInt(i11, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15, i16);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
            }
        } else if (z11) {
            if (i13 == 5) {
                i14 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (d(i13)) {
                i14 = typedArray.getColor(i11, 0);
            } else {
                i14 = typedArray.getInt(i11, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
        }
        if (propertyValuesHolder != null && gVar != null) {
            propertyValuesHolder.setEvaluator(gVar);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public static boolean d(int i6) {
        if (i6 >= 28 && i6 <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z10;
        int i6;
        boolean z11;
        int i10;
        TypedArray f = i0.h.f(resources, theme, attributeSet, i2.a.f19662g);
        TypedArray f2 = i0.h.f(resources, theme, attributeSet, i2.a.f19666k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long c10 = i0.h.c(f, xmlResourceParser, "duration", 1, 300);
        int i11 = 0;
        long c11 = i0.h.c(f, xmlResourceParser, "startOffset", 2, 0);
        int c12 = i0.h.c(f, xmlResourceParser, "valueType", 7, 4);
        if (i0.h.e(xmlResourceParser, "valueFrom") && i0.h.e(xmlResourceParser, "valueTo")) {
            if (c12 == 4) {
                TypedValue peekValue = f.peekValue(5);
                if (peekValue != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i6 = peekValue.type;
                } else {
                    i6 = 0;
                }
                TypedValue peekValue2 = f.peekValue(6);
                if (peekValue2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i10 = peekValue2.type;
                } else {
                    i10 = 0;
                }
                if ((z10 && d(i6)) || (z11 && d(i10))) {
                    c12 = 3;
                } else {
                    c12 = 0;
                }
            }
            PropertyValuesHolder c13 = c(f, c12, 5, 6, "");
            if (c13 != null) {
                valueAnimator.setValues(c13);
            }
        }
        valueAnimator.setDuration(c10);
        valueAnimator.setStartDelay(c11);
        valueAnimator.setRepeatCount(i0.h.c(f, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(i0.h.c(f, xmlResourceParser, "repeatMode", 4, 1));
        if (f2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String d10 = i0.h.d(f2, xmlResourceParser, "pathData", 1);
            if (d10 != null) {
                String d11 = i0.h.d(f2, xmlResourceParser, "propertyXName", 2);
                String d12 = i0.h.d(f2, xmlResourceParser, "propertyYName", 3);
                if (d11 == null && d12 == null) {
                    throw new InflateException(f2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d13 = j0.g.d(d10);
                PathMeasure pathMeasure = new PathMeasure(d13, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f10 = 0.0f;
                do {
                    f10 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f10));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d13, false);
                int min = Math.min(100, ((int) (f10 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f11 = f10 / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = f;
                int i12 = 0;
                float f12 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i11 >= min) {
                        break;
                    }
                    int i13 = min;
                    pathMeasure2.getPosTan(f12 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
                    fArr[i11] = fArr3[0];
                    fArr2[i11] = fArr3[1];
                    f12 += f11;
                    int i14 = i12 + 1;
                    if (i14 < arrayList.size() && f12 > ((Float) arrayList.get(i14)).floatValue()) {
                        pathMeasure2.nextContour();
                        i12 = i14;
                    }
                    i11++;
                    min = i13;
                }
                if (d11 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(d11, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (d12 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(d12, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i11 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i11 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = f;
                objectAnimator2.setPropertyName(i0.h.d(f2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = f;
        }
        if (!i0.h.e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i11 = typedArray2.getResourceId(i11, i11);
        }
        if (i11 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i11));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (f2 != null) {
            f2.recycle();
        }
        return valueAnimator3;
    }
}
