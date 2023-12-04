package com.ifriend.presentation.common.exception.mappers;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.ui.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FeatureExceptionMapper.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000bH\u0097\u0001J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u001b\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0001J4\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0096\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0096\u0001J,\u0010\u001d\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0096\u0001¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0096\u0001J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ifriend/presentation/common/exception/mappers/FeatureExceptionMapper;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "resourceProvider", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "map", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureExceptionMapper implements ResourceProvider {
    public static final int $stable = 8;
    private final ResourceProvider resourceProvider;

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public boolean getBoolean(int i) {
        return this.resourceProvider.getBoolean(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public ColorStateList getColorStateList(int i) {
        return this.resourceProvider.getColorStateList(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getDimensionPixelSize(int i) {
        return this.resourceProvider.getDimensionPixelSize(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public Typeface getFont(int i) {
        return this.resourceProvider.getFont(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getInteger(int i) {
        return this.resourceProvider.getInteger(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<Integer> getIntegerArray(int i) {
        return this.resourceProvider.getIntegerArray(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getPackageName() {
        return this.resourceProvider.getPackageName();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2) {
        return this.resourceProvider.getQuantityString(i, i2);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getQuantityString(i, i2, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i) {
        return this.resourceProvider.getString(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getString(i, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<String> getStringArray(int i) {
        return this.resourceProvider.getStringArray(i);
    }

    @Inject
    public FeatureExceptionMapper(ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
    }

    public final String map(Throwable model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getString(R.string.errors__default_error);
    }
}
