package com.ifriend.platform.tools.api;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ResourceProvider.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\tH&J\u0012\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\tH'J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\b\u001a\u00020\tH&J\u0012\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\tH&J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\b\b\u0001\u0010\b\u001a\u00020\tH&J\u001a\u0010\u0014\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH&J3\u0010\u0014\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0018\"\u00020\u0001H&¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\tH&J+\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0018\"\u00020\u0001H&¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\b\b\u0001\u0010\u0015\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001d"}, d2 = {"Lcom/ifriend/platform/tools/api/ResourceProvider;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ResourceProvider {
    boolean getBoolean(int i);

    ColorStateList getColorStateList(int i);

    int getDimensionPixelSize(int i);

    Typeface getFont(int i);

    int getInteger(int i);

    List<Integer> getIntegerArray(int i);

    String getPackageName();

    String getQuantityString(int i, int i2);

    String getQuantityString(int i, int i2, Object... objArr);

    String getString(int i);

    String getString(int i, Object... objArr);

    List<String> getStringArray(int i);
}
