package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public final class AFd1wSDK extends AFc1aSDK<Map<String, String>> {
    private String AFLogger$LogLevel;
    private final AFc1uSDK AFVersionDeclaration;
    public AFa1ySDK afRDLog;
    private String afWarnLog;
    private final boolean getLevel;
    private String init;
    private final UUID onAppOpenAttributionNative;

    /* loaded from: classes.dex */
    public interface AFa1ySDK {
        void valueOf(String str);

        void valueOf(Map<String, String> map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1wSDK(AFc1zSDK aFc1zSDK, UUID uuid, Uri uri) {
        super(AFc1kSDK.ONELINK, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, aFc1zSDK, uuid.toString());
        boolean z10 = false;
        this.AFVersionDeclaration = aFc1zSDK.AFInAppEventType();
        this.onAppOpenAttributionNative = uuid;
        if (!AFb1oSDK.valueOf(uri.getHost()) && !AFb1oSDK.valueOf(uri.getPath())) {
            try {
                try {
                    Object invoke = ((Class) AFb1jSDK.values(Color.rgb(0, 0, 0) + 16777247, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AFInAppEventType", null).invoke(((Class) AFb1jSDK.values(30 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Color.argb(0, 0, 0, 0), (-16777216) - Color.rgb(0, 0, 0))).getDeclaredConstructor(Uri.class).newInstance(uri), null);
                    try {
                        boolean booleanValue = ((Boolean) ((Class) AFb1jSDK.values(40 - Color.green(0), (char) View.MeasureSpec.getSize(0), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("AFKeystoreWrapper", null).invoke(invoke, null)).booleanValue();
                        try {
                            z10 = ((Boolean) ((Class) AFb1jSDK.values(TextUtils.indexOf((CharSequence) "", '0') + 41, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31)).getMethod("values", null).invoke(invoke, null)).booleanValue();
                            String[] split = uri.getPath().split("/");
                            if (booleanValue && split.length == 3) {
                                this.AFLogger$LogLevel = split[1];
                                this.init = split[2];
                                this.afWarnLog = uri.toString();
                            }
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Throwable cause3 = th4.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                Throwable cause4 = th5.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th5;
            }
        }
        this.getLevel = z10;
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final void AFInAppEventParameterName() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventParameterName();
        AFa1ySDK aFa1ySDK = this.afRDLog;
        if (aFa1ySDK != null) {
            if (this.valueOf == AFc1jSDK.SUCCESS && (responseNetwork = this.afDebugLog) != null) {
                aFa1ySDK.valueOf((Map) responseNetwork.getBody());
                return;
            }
            Throwable afErrorLog = afErrorLog();
            String str = "Can't get OneLink data";
            if (afErrorLog instanceof ParsingException) {
                if (((ParsingException) afErrorLog).getRawResponse().isSuccessful()) {
                    aFa1ySDK.valueOf("Can't parse one link data");
                    return;
                }
                String str2 = this.afWarnLog;
                if (str2 != null) {
                    str = str2;
                }
                aFa1ySDK.valueOf(str);
                return;
            }
            String str3 = this.afWarnLog;
            if (str3 != null) {
                str = str3;
            }
            aFa1ySDK.valueOf(str);
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AFc1wSDK<Map<String, String>> AFInAppEventType(String str) {
        return this.AFVersionDeclaration.AFInAppEventParameterName(this.AFLogger$LogLevel, this.init, this.onAppOpenAttributionNative, str);
    }

    public final boolean AFLogger$LogLevel() {
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean afRDLog() {
        return false;
    }

    public final boolean afWarnLog() {
        if (!TextUtils.isEmpty(this.AFLogger$LogLevel) && !TextUtils.isEmpty(this.init) && !this.AFLogger$LogLevel.equals("app")) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final long values() {
        return 3000L;
    }
}
