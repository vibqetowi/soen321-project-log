package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1hSDK;
/* loaded from: classes.dex */
public final class AFe1jSDK extends AFe1hSDK {
    private final AFc1zSDK AFInAppEventParameterName;
    final ProviderInfo valueOf;

    public AFe1jSDK(ProviderInfo providerInfo, Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.AFInAppEventParameterName = aFc1zSDK;
        this.valueOf = providerInfo;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final void valueOf(final Context context) {
        this.AFInAppEventParameterName.values().execute(new Runnable() { // from class: com.appsflyer.internal.AFe1jSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                AFe1jSDK aFe1jSDK = AFe1jSDK.this;
                aFe1jSDK.afDebugLog = System.currentTimeMillis();
                aFe1jSDK.afRDLog = AFe1hSDK.AFa1zSDK.STARTED;
                aFe1jSDK.addObserver(new AFe1hSDK.AnonymousClass2());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFe1jSDK.this.valueOf.authority);
                sb2.append("/transaction_id");
                Uri parse = Uri.parse(sb2.toString());
                ContentResolver contentResolver = context.getContentResolver();
                StringBuilder sb3 = new StringBuilder("app_id=");
                sb3.append(context.getPackageName());
                Cursor query = contentResolver.query(parse, null, sb3.toString(), null, null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("transaction_id");
                    if (columnIndex == -1) {
                        AFLogger.afWarnLog("[Preinstall]: Wrong column name");
                        AFe1jSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFe1jSDK.this.AFInAppEventType.put("response", "OK");
                        if (query.moveToFirst()) {
                            String string = query.getString(columnIndex);
                            query.close();
                            if (string != null && !string.isEmpty()) {
                                AFe1jSDK.this.AFInAppEventType.put("referrer", string);
                            }
                        }
                    }
                } else {
                    AFLogger.afWarnLog("[Preinstall]: ContentProvider query failed, got null Cursor");
                    AFe1jSDK.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                }
                AFe1jSDK aFe1jSDK2 = AFe1jSDK.this;
                aFe1jSDK2.AFInAppEventType.put("api_ver", Long.valueOf(AFb1wSDK.AFKeystoreWrapper(context, ((PackageItemInfo) aFe1jSDK2.valueOf).packageName)));
                AFe1jSDK aFe1jSDK3 = AFe1jSDK.this;
                aFe1jSDK3.AFInAppEventType.put("api_ver_name", AFb1wSDK.AFInAppEventParameterName(context, ((PackageItemInfo) aFe1jSDK3.valueOf).packageName));
                AFe1jSDK.this.AFKeystoreWrapper();
            }
        });
    }
}
