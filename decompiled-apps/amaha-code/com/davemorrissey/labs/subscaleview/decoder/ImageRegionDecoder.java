package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
/* loaded from: classes.dex */
public interface ImageRegionDecoder {
    Bitmap decodeRegion(Rect rect, int i6);

    Point init(Context context, Uri uri);

    boolean isReady();

    void recycle();
}
