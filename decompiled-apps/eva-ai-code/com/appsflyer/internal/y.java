package com.appsflyer.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class y {
    public final String[] AFInAppEventParameterName;

    y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> AFInAppEventType(Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put("size", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.valueOf("Couldn't aggregate screen stats: ", th);
        }
        return hashMap;
    }

    public y(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFInAppEventParameterName = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null && compile.matcher(str).matches()) {
                arrayList.add(str.toLowerCase());
            } else {
                AFLogger.AppsFlyer2dXConversionCallback("Invalid partner name: ".concat(String.valueOf(str)));
            }
        }
        if (arrayList.contains(TtmlNode.COMBINE_ALL)) {
            this.AFInAppEventParameterName = new String[]{TtmlNode.COMBINE_ALL};
        } else if (arrayList.isEmpty()) {
            this.AFInAppEventParameterName = null;
        } else {
            this.AFInAppEventParameterName = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
