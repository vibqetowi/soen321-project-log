package com.airbnb.lottie.compose;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LottieDynamicProperties.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\u0010\u0005B¿\u0001\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00040\u0003\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003\u0012\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001fR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "", "properties", "", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "(Ljava/util/List;)V", "intProperties", "", "pointFProperties", "Landroid/graphics/PointF;", "floatProperties", "", "scaleProperties", "Lcom/airbnb/lottie/value/ScaleXY;", "colorFilterProperties", "Landroid/graphics/ColorFilter;", "intArrayProperties", "", "typefaceProperties", "Landroid/graphics/Typeface;", "bitmapProperties", "Landroid/graphics/Bitmap;", "charSequenceProperties", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "addTo", "", "drawable", "Lcom/airbnb/lottie/LottieDrawable;", "addTo$lottie_compose_release", "removeFrom", "removeFrom$lottie_compose_release", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieDynamicProperties {
    public static final int $stable = 8;
    private final List<LottieDynamicProperty<Bitmap>> bitmapProperties;
    private final List<LottieDynamicProperty<CharSequence>> charSequenceProperties;
    private final List<LottieDynamicProperty<ColorFilter>> colorFilterProperties;
    private final List<LottieDynamicProperty<Float>> floatProperties;
    private final List<LottieDynamicProperty<Object[]>> intArrayProperties;
    private final List<LottieDynamicProperty<Integer>> intProperties;
    private final List<LottieDynamicProperty<PointF>> pointFProperties;
    private final List<LottieDynamicProperty<ScaleXY>> scaleProperties;
    private final List<LottieDynamicProperty<Typeface>> typefaceProperties;

    public LottieDynamicProperties(List<LottieDynamicProperty<Integer>> intProperties, List<LottieDynamicProperty<PointF>> pointFProperties, List<LottieDynamicProperty<Float>> floatProperties, List<LottieDynamicProperty<ScaleXY>> scaleProperties, List<LottieDynamicProperty<ColorFilter>> colorFilterProperties, List<LottieDynamicProperty<Object[]>> intArrayProperties, List<LottieDynamicProperty<Typeface>> typefaceProperties, List<LottieDynamicProperty<Bitmap>> bitmapProperties, List<LottieDynamicProperty<CharSequence>> charSequenceProperties) {
        Intrinsics.checkNotNullParameter(intProperties, "intProperties");
        Intrinsics.checkNotNullParameter(pointFProperties, "pointFProperties");
        Intrinsics.checkNotNullParameter(floatProperties, "floatProperties");
        Intrinsics.checkNotNullParameter(scaleProperties, "scaleProperties");
        Intrinsics.checkNotNullParameter(colorFilterProperties, "colorFilterProperties");
        Intrinsics.checkNotNullParameter(intArrayProperties, "intArrayProperties");
        Intrinsics.checkNotNullParameter(typefaceProperties, "typefaceProperties");
        Intrinsics.checkNotNullParameter(bitmapProperties, "bitmapProperties");
        Intrinsics.checkNotNullParameter(charSequenceProperties, "charSequenceProperties");
        this.intProperties = intProperties;
        this.pointFProperties = pointFProperties;
        this.floatProperties = floatProperties;
        this.scaleProperties = scaleProperties;
        this.colorFilterProperties = colorFilterProperties;
        this.intArrayProperties = intArrayProperties;
        this.typefaceProperties = typefaceProperties;
        this.bitmapProperties = bitmapProperties;
        this.charSequenceProperties = charSequenceProperties;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LottieDynamicProperties(List<? extends LottieDynamicProperty<?>> properties) {
        this(r5, r6, r7, r8, r9, r10, r11, r12, r0);
        Intrinsics.checkNotNullParameter(properties, "properties");
        List<? extends LottieDynamicProperty<?>> list = properties;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((LottieDynamicProperty) obj).getProperty$lottie_compose_release() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (((LottieDynamicProperty) obj2).getProperty$lottie_compose_release() instanceof PointF) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list) {
            if (((LottieDynamicProperty) obj3).getProperty$lottie_compose_release() instanceof Float) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : list) {
            if (((LottieDynamicProperty) obj4).getProperty$lottie_compose_release() instanceof ScaleXY) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = arrayList7;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj5 : list) {
            if (((LottieDynamicProperty) obj5).getProperty$lottie_compose_release() instanceof ColorFilter) {
                arrayList9.add(obj5);
            }
        }
        ArrayList arrayList10 = arrayList9;
        ArrayList arrayList11 = new ArrayList();
        for (Object obj6 : list) {
            if (((LottieDynamicProperty) obj6).getProperty$lottie_compose_release() instanceof Object[]) {
                arrayList11.add(obj6);
            }
        }
        ArrayList arrayList12 = arrayList11;
        ArrayList arrayList13 = new ArrayList();
        for (Object obj7 : list) {
            if (((LottieDynamicProperty) obj7).getProperty$lottie_compose_release() instanceof Typeface) {
                arrayList13.add(obj7);
            }
        }
        ArrayList arrayList14 = arrayList13;
        ArrayList arrayList15 = new ArrayList();
        for (Object obj8 : list) {
            if (((LottieDynamicProperty) obj8).getProperty$lottie_compose_release() instanceof Bitmap) {
                arrayList15.add(obj8);
            }
        }
        ArrayList arrayList16 = arrayList15;
        ArrayList arrayList17 = new ArrayList();
        for (Object obj9 : list) {
            if (((LottieDynamicProperty) obj9).getProperty$lottie_compose_release() instanceof CharSequence) {
                arrayList17.add(obj9);
            }
        }
    }

    public final void addTo$lottie_compose_release(LottieDrawable drawable) {
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback;
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback2;
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback3;
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback4;
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback5;
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback6;
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback7;
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback8;
        LottieDynamicPropertiesKt$toValueCallback$1 valueCallback9;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty = (LottieDynamicProperty) it.next();
            KeyPath keyPath$lottie_compose_release = lottieDynamicProperty.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release = lottieDynamicProperty.getProperty$lottie_compose_release();
            valueCallback9 = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release, (KeyPath) property$lottie_compose_release, (LottieValueCallback<KeyPath>) valueCallback9);
        }
        Iterator<T> it2 = this.pointFProperties.iterator();
        while (it2.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty2 = (LottieDynamicProperty) it2.next();
            KeyPath keyPath$lottie_compose_release2 = lottieDynamicProperty2.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release2 = lottieDynamicProperty2.getProperty$lottie_compose_release();
            valueCallback8 = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty2.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release2, (KeyPath) property$lottie_compose_release2, (LottieValueCallback<KeyPath>) valueCallback8);
        }
        Iterator<T> it3 = this.floatProperties.iterator();
        while (it3.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty3 = (LottieDynamicProperty) it3.next();
            KeyPath keyPath$lottie_compose_release3 = lottieDynamicProperty3.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release3 = lottieDynamicProperty3.getProperty$lottie_compose_release();
            valueCallback7 = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty3.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release3, (KeyPath) property$lottie_compose_release3, (LottieValueCallback<KeyPath>) valueCallback7);
        }
        Iterator<T> it4 = this.scaleProperties.iterator();
        while (it4.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty4 = (LottieDynamicProperty) it4.next();
            KeyPath keyPath$lottie_compose_release4 = lottieDynamicProperty4.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release4 = lottieDynamicProperty4.getProperty$lottie_compose_release();
            valueCallback6 = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty4.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release4, (KeyPath) property$lottie_compose_release4, (LottieValueCallback<KeyPath>) valueCallback6);
        }
        Iterator<T> it5 = this.colorFilterProperties.iterator();
        while (it5.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty5 = (LottieDynamicProperty) it5.next();
            KeyPath keyPath$lottie_compose_release5 = lottieDynamicProperty5.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release5 = lottieDynamicProperty5.getProperty$lottie_compose_release();
            valueCallback5 = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty5.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release5, (KeyPath) property$lottie_compose_release5, (LottieValueCallback<KeyPath>) valueCallback5);
        }
        Iterator<T> it6 = this.intArrayProperties.iterator();
        while (it6.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty6 = (LottieDynamicProperty) it6.next();
            KeyPath keyPath$lottie_compose_release6 = lottieDynamicProperty6.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release6 = lottieDynamicProperty6.getProperty$lottie_compose_release();
            valueCallback4 = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty6.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release6, (KeyPath) property$lottie_compose_release6, (LottieValueCallback<KeyPath>) valueCallback4);
        }
        Iterator<T> it7 = this.typefaceProperties.iterator();
        while (it7.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty7 = (LottieDynamicProperty) it7.next();
            KeyPath keyPath$lottie_compose_release7 = lottieDynamicProperty7.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release7 = lottieDynamicProperty7.getProperty$lottie_compose_release();
            valueCallback3 = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty7.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release7, (KeyPath) property$lottie_compose_release7, (LottieValueCallback<KeyPath>) valueCallback3);
        }
        Iterator<T> it8 = this.bitmapProperties.iterator();
        while (it8.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty8 = (LottieDynamicProperty) it8.next();
            KeyPath keyPath$lottie_compose_release8 = lottieDynamicProperty8.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release8 = lottieDynamicProperty8.getProperty$lottie_compose_release();
            valueCallback2 = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty8.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release8, (KeyPath) property$lottie_compose_release8, (LottieValueCallback<KeyPath>) valueCallback2);
        }
        Iterator<T> it9 = this.charSequenceProperties.iterator();
        while (it9.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty9 = (LottieDynamicProperty) it9.next();
            KeyPath keyPath$lottie_compose_release9 = lottieDynamicProperty9.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release9 = lottieDynamicProperty9.getProperty$lottie_compose_release();
            valueCallback = LottieDynamicPropertiesKt.toValueCallback(lottieDynamicProperty9.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release9, (KeyPath) property$lottie_compose_release9, (LottieValueCallback<KeyPath>) valueCallback);
        }
    }

    public final void removeFrom$lottie_compose_release(LottieDrawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty = (LottieDynamicProperty) it.next();
            drawable.addValueCallback(lottieDynamicProperty.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        Iterator<T> it2 = this.pointFProperties.iterator();
        while (it2.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty2 = (LottieDynamicProperty) it2.next();
            drawable.addValueCallback(lottieDynamicProperty2.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty2.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        Iterator<T> it3 = this.floatProperties.iterator();
        while (it3.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty3 = (LottieDynamicProperty) it3.next();
            drawable.addValueCallback(lottieDynamicProperty3.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty3.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        Iterator<T> it4 = this.scaleProperties.iterator();
        while (it4.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty4 = (LottieDynamicProperty) it4.next();
            drawable.addValueCallback(lottieDynamicProperty4.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty4.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        Iterator<T> it5 = this.colorFilterProperties.iterator();
        while (it5.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty5 = (LottieDynamicProperty) it5.next();
            drawable.addValueCallback(lottieDynamicProperty5.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty5.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        Iterator<T> it6 = this.intArrayProperties.iterator();
        while (it6.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty6 = (LottieDynamicProperty) it6.next();
            drawable.addValueCallback(lottieDynamicProperty6.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty6.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        Iterator<T> it7 = this.typefaceProperties.iterator();
        while (it7.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty7 = (LottieDynamicProperty) it7.next();
            drawable.addValueCallback(lottieDynamicProperty7.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty7.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        Iterator<T> it8 = this.bitmapProperties.iterator();
        while (it8.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty8 = (LottieDynamicProperty) it8.next();
            drawable.addValueCallback(lottieDynamicProperty8.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty8.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        Iterator<T> it9 = this.charSequenceProperties.iterator();
        while (it9.hasNext()) {
            LottieDynamicProperty lottieDynamicProperty9 = (LottieDynamicProperty) it9.next();
            drawable.addValueCallback(lottieDynamicProperty9.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty9.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
    }
}
