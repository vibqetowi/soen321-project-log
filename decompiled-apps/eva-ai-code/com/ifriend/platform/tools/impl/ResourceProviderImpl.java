package com.ifriend.platform.tools.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.platform.tools.api.ResourceProvider;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ResourceProviderImpl.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J1\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f\"\u00020 H\u0016¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J)\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00102\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f\"\u00020 H\u0016¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00060\u00060\u001a2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006&"}, d2 = {"Lcom/ifriend/platform/tools/impl/ResourceProviderImpl;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "kotlin.jvm.PlatformType", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResourceProviderImpl implements ResourceProvider {
    private final Context context;

    @Inject
    public ResourceProviderImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Resources getResources() {
        Resources resources = this.context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getPackageName() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i) {
        String string = getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        String string = getResources().getString(i, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2) {
        String quantityString = getResources().getQuantityString(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        String quantityString = getResources().getQuantityString(i, i2, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<String> getStringArray(int i) {
        String[] stringArray = getResources().getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return ArraysKt.asList(stringArray);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getInteger(int i) {
        return getResources().getInteger(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<Integer> getIntegerArray(int i) {
        int[] intArray = getResources().getIntArray(i);
        Intrinsics.checkNotNullExpressionValue(intArray, "getIntArray(...)");
        return ArraysKt.toList(ArraysKt.toTypedArray(intArray));
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public boolean getBoolean(int i) {
        return getResources().getBoolean(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getDimensionPixelSize(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public ColorStateList getColorStateList(int i) {
        ColorStateList colorStateList = getResources().getColorStateList(i, null);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "getColorStateList(...)");
        return colorStateList;
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public Typeface getFont(int i) {
        return ResourcesCompat.getFont(this.context, i);
    }
}
