package cc.cloudist.acplibrary.components;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class FlowerDataCalc {
    private double[] mCosValues;
    private double[] mSinValues;

    public FlowerDataCalc(int i) {
        this.mCosValues = new double[i];
        this.mSinValues = new double[i];
        double d = 6.283185307179586d / i;
        for (int i2 = 0; i2 < i; i2++) {
            double d2 = i2 * d;
            this.mCosValues[i2] = Math.cos(d2);
            this.mSinValues[i2] = Math.sin(d2);
        }
    }

    public List<PetalCoordinate> getSegmentsCoordinates(int i, int i2, int i3, int i4, int i5) {
        int i6 = i4;
        ArrayList arrayList = new ArrayList(i6);
        double d = i / 2.0d;
        double d2 = i5 / 2.0d;
        double d3 = (i - i2) / 2.0d;
        double d4 = i3 / 2.0d;
        int i7 = 0;
        while (i7 < i6) {
            double d5 = this.mCosValues[i7];
            double d6 = this.mSinValues[i7];
            arrayList.add(new PetalCoordinate((int) (d2 - (d3 * d5)), (int) (d + (d3 * d6)), (int) (d2 - (d5 * d4)), (int) (d + (d6 * d4))));
            i7++;
            i6 = i4;
        }
        return arrayList;
    }

    public int[] getSegmentsColors(int i, int i2, int i3, int i4) {
        int[] iArr = new int[i3];
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int red2 = Color.red(i2);
        double d = i3 - 1;
        double d2 = (red2 - red) / d;
        double green2 = (Color.green(i2) - green) / d;
        double blue2 = (Color.blue(i2) - blue) / d;
        int i5 = 0;
        while (i5 < i3) {
            double d3 = i5;
            iArr[i5] = Color.argb(i4, (int) (red + (d2 * d3)), (int) (green + (green2 * d3)), (int) (blue + (d3 * blue2)));
            i5++;
            red = red;
            green = green;
            d2 = d2;
        }
        return iArr;
    }
}
