package com.ifriend.data.config;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.ifriend.domain.config.AppconfigKt;
import com.ifriend.domain.config.BooleanPrimitiveValue;
import com.ifriend.domain.config.ConfigEntity;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.config.LongPrimitiveValue;
import com.ifriend.domain.config.StringPrimitiveValue;
import com.ifriend.platform.tools.api.AppInfoProvider;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
/* compiled from: LocalConfigExtractor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/data/config/LocalConfigExtractor;", "", "context", "Landroid/content/Context;", "appInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "webClientId", "", "okhttpVersion", "(Landroid/content/Context;Lcom/ifriend/platform/tools/api/AppInfoProvider;Ljava/lang/String;Ljava/lang/String;)V", "extract", "", "Lcom/ifriend/domain/config/ConfigEntity;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalConfigExtractor {
    private final AppInfoProvider appInfoProvider;
    private final Context context;
    private final String okhttpVersion;
    private final String webClientId;

    public LocalConfigExtractor(Context context, AppInfoProvider appInfoProvider, String webClientId, String okhttpVersion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appInfoProvider, "appInfoProvider");
        Intrinsics.checkNotNullParameter(webClientId, "webClientId");
        Intrinsics.checkNotNullParameter(okhttpVersion, "okhttpVersion");
        this.context = context;
        this.appInfoProvider = appInfoProvider;
        this.webClientId = webClientId;
        this.okhttpVersion = okhttpVersion;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0167, code lost:
        if (kotlin.text.StringsKt.startsWith$default(r7, "generic", false, 2, (java.lang.Object) null) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x016f, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("google_sdk", android.os.Build.PRODUCT) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ConfigEntity> extract() {
        ConfigEntity[] configEntityArr = new ConfigEntity[10];
        boolean z = false;
        configEntityArr[0] = new ConfigEntity("appId", new StringPrimitiveValue(this.appInfoProvider.getPackageName()), null, null, 12, null);
        configEntityArr[1] = new ConfigEntity(AppconfigKt.appKey("version", "appVersion"), new StringPrimitiveValue(this.appInfoProvider.getVersionName()), null, null, 12, null);
        configEntityArr[2] = new ConfigEntity(AppconfigKt.appKey("version", ConfigKeys.APP_VERSION_CODE), new LongPrimitiveValue(this.appInfoProvider.getVersionCode()), null, null, 12, null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("Android/%s; %s %s", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE, Build.MANUFACTURER, Build.MODEL}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        configEntityArr[3] = new ConfigEntity(ConfigKeys.CURRENT_DEVICE, new StringPrimitiveValue(format), null, null, 12, null);
        configEntityArr[4] = new ConfigEntity(ConfigKeys.HTTP_ENGINE, new StringPrimitiveValue(this.okhttpVersion), null, null, 12, null);
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        configEntityArr[5] = new ConfigEntity(ConfigKeys.FINGERPRINT, new StringPrimitiveValue(string), null, null, 12, null);
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (!StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
            String FINGERPRINT2 = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
            if (!StringsKt.startsWith$default(FINGERPRINT2, "unknown", false, 2, (Object) null)) {
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (!StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
                    String MODEL2 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                    if (!StringsKt.contains$default((CharSequence) MODEL2, (CharSequence) "Emulator", false, 2, (Object) null)) {
                        String MODEL3 = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
                        if (!StringsKt.contains$default((CharSequence) MODEL3, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
                            String MANUFACTURER = Build.MANUFACTURER;
                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            if (!StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
                                String BRAND = Build.BRAND;
                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
                                    String DEVICE = Build.DEVICE;
                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                }
                            }
                        }
                    }
                }
            }
        }
        z = true;
        configEntityArr[6] = new ConfigEntity(ConfigKeys.IS_SIMULATOR, new BooleanPrimitiveValue(z), null, null, 12, null);
        String BRAND2 = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND2, "BRAND");
        configEntityArr[7] = new ConfigEntity(ConfigKeys.DEVICE_BRAND, new StringPrimitiveValue(BRAND2), null, null, 12, null);
        String MODEL4 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL4, "MODEL");
        configEntityArr[8] = new ConfigEntity(ConfigKeys.DEVICE_MODEL, new StringPrimitiveValue(MODEL4), null, null, 12, null);
        configEntityArr[9] = new ConfigEntity(ConfigKeys.CLIENT_ID, new StringPrimitiveValue(this.webClientId), null, null, 12, null);
        return CollectionsKt.listOf((Object[]) configEntityArr);
    }
}
