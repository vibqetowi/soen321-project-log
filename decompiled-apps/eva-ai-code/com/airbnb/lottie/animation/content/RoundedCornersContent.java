package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class RoundedCornersContent implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {
    private static final float ROUNDED_CORNER_MAGIC_NUMBER = 0.5519f;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Float, Float> roundedCorners;
    private ShapeData shapeData;

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public RoundedCornersContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RoundedCorners roundedCorners) {
        this.lottieDrawable = lottieDrawable;
        this.name = roundedCorners.getName();
        BaseKeyframeAnimation<Float, Float> createAnimation = roundedCorners.getCornerRadius().createAnimation();
        this.roundedCorners = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    public BaseKeyframeAnimation<Float, Float> getRoundedCorners() {
        return this.roundedCorners;
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public ShapeData modifyShape(ShapeData shapeData) {
        List<CubicCurveData> list;
        boolean z;
        List<CubicCurveData> curves = shapeData.getCurves();
        if (curves.size() <= 2) {
            return shapeData;
        }
        float floatValue = this.roundedCorners.getValue().floatValue();
        if (floatValue == 0.0f) {
            return shapeData;
        }
        ShapeData shapeData2 = getShapeData(shapeData);
        shapeData2.setInitialPoint(shapeData.getInitialPoint().x, shapeData.getInitialPoint().y);
        List<CubicCurveData> curves2 = shapeData2.getCurves();
        boolean isClosed = shapeData.isClosed();
        int i = 0;
        int i2 = 0;
        while (i < curves.size()) {
            CubicCurveData cubicCurveData = curves.get(i);
            CubicCurveData cubicCurveData2 = curves.get(floorMod(i - 1, curves.size()));
            CubicCurveData cubicCurveData3 = curves.get(floorMod(i - 2, curves.size()));
            PointF vertex = (i != 0 || isClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
            PointF controlPoint2 = (i != 0 || isClosed) ? cubicCurveData2.getControlPoint2() : vertex;
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            PointF vertex2 = cubicCurveData3.getVertex();
            PointF vertex3 = cubicCurveData.getVertex();
            boolean z2 = !shapeData.isClosed() && i == 0 && i == curves.size() + (-1);
            if (controlPoint2.equals(vertex) && controlPoint1.equals(vertex) && !z2) {
                float f = vertex.x - vertex2.x;
                float f2 = vertex.y - vertex2.y;
                float f3 = vertex3.x - vertex.x;
                float f4 = vertex3.y - vertex.y;
                list = curves;
                z = isClosed;
                float min = Math.min(floatValue / ((float) Math.hypot(f, f2)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f3, f4)), 0.5f);
                float f5 = vertex.x + ((vertex2.x - vertex.x) * min);
                float f6 = vertex.y + ((vertex2.y - vertex.y) * min);
                float f7 = vertex.x + ((vertex3.x - vertex.x) * min2);
                float f8 = vertex.y + ((vertex3.y - vertex.y) * min2);
                float f9 = f5 - ((f5 - vertex.x) * ROUNDED_CORNER_MAGIC_NUMBER);
                float f10 = f6 - ((f6 - vertex.y) * ROUNDED_CORNER_MAGIC_NUMBER);
                float f11 = f7 - ((f7 - vertex.x) * ROUNDED_CORNER_MAGIC_NUMBER);
                float f12 = f8 - ((f8 - vertex.y) * ROUNDED_CORNER_MAGIC_NUMBER);
                CubicCurveData cubicCurveData4 = curves2.get(floorMod(i2 - 1, curves2.size()));
                CubicCurveData cubicCurveData5 = curves2.get(i2);
                cubicCurveData4.setControlPoint2(f5, f6);
                cubicCurveData4.setVertex(f5, f6);
                if (i == 0) {
                    shapeData2.setInitialPoint(f5, f6);
                }
                cubicCurveData5.setControlPoint1(f9, f10);
                i2++;
                cubicCurveData5.setControlPoint2(f11, f12);
                cubicCurveData5.setVertex(f7, f8);
                curves2.get(i2).setControlPoint1(f7, f8);
            } else {
                list = curves;
                z = isClosed;
                CubicCurveData cubicCurveData6 = curves2.get(floorMod(i2 - 1, curves2.size()));
                cubicCurveData6.setControlPoint2(cubicCurveData2.getControlPoint2().x, cubicCurveData2.getControlPoint2().y);
                cubicCurveData6.setVertex(cubicCurveData2.getVertex().x, cubicCurveData2.getVertex().y);
                curves2.get(i2).setControlPoint1(cubicCurveData.getControlPoint1().x, cubicCurveData.getControlPoint1().y);
            }
            i2++;
            i++;
            curves = list;
            isClosed = z;
        }
        return shapeData2;
    }

    private ShapeData getShapeData(ShapeData shapeData) {
        List<CubicCurveData> curves = shapeData.getCurves();
        boolean isClosed = shapeData.isClosed();
        int size = curves.size() - 1;
        int i = 0;
        while (size >= 0) {
            CubicCurveData cubicCurveData = curves.get(size);
            CubicCurveData cubicCurveData2 = curves.get(floorMod(size - 1, curves.size()));
            PointF vertex = (size != 0 || isClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
            i = (((size != 0 || isClosed) ? cubicCurveData2.getControlPoint2() : vertex).equals(vertex) && cubicCurveData.getControlPoint1().equals(vertex) && !(!shapeData.isClosed() && size == 0 && size == curves.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        ShapeData shapeData2 = this.shapeData;
        if (shapeData2 == null || shapeData2.getCurves().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new CubicCurveData());
            }
            this.shapeData = new ShapeData(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.shapeData.setClosed(isClosed);
        return this.shapeData;
    }

    private static int floorMod(int i, int i2) {
        return i - (floorDiv(i, i2) * i2);
    }

    private static int floorDiv(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
