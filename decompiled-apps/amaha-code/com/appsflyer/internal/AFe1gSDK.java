package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFe1gSDK extends AFe1oSDK {
    private final AFc1zSDK valueOf;

    public AFe1gSDK(Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("store", "huawei", runnable);
        this.valueOf = aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final void valueOf(Context context) {
        values(context, new AFb1gSDK<Map<String, Object>>(context, this.valueOf, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFe1gSDK.1
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00f8, code lost:
                if (r2 != null) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x010c, code lost:
                if (0 == 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x010e, code lost:
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0111, code lost:
                r11.AFKeystoreWrapper.AFKeystoreWrapper();
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x011a, code lost:
                return r11.AFKeystoreWrapper.AFInAppEventType;
             */
            @Override // com.appsflyer.internal.AFb1gSDK
            /* renamed from: values */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFInAppEventParameterName() {
                String str = ((PackageItemInfo) this.valueOf.getPackageManager().resolveContentProvider(this.values, 128)).packageName;
                AFe1gSDK.this.AFInAppEventType.put("api_ver", Long.valueOf(AFb1wSDK.AFKeystoreWrapper(this.valueOf, str)));
                AFe1gSDK.this.AFInAppEventType.put("api_ver_name", AFb1wSDK.AFInAppEventParameterName(this.valueOf, str));
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.valueOf.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.values);
                        sb2.append("/item/5");
                        cursor = contentResolver.query(Uri.parse(sb2.toString()), null, null, new String[]{this.valueOf.getPackageName()}, null);
                        if (cursor != null) {
                            if (cursor.moveToFirst()) {
                                AFe1gSDK.this.AFInAppEventType.put("response", "OK");
                                AFe1gSDK.this.AFInAppEventType.put("referrer", cursor.getString(0));
                                AFe1gSDK.this.AFInAppEventType.put("click_ts", Long.valueOf(cursor.getLong(1)));
                                AFe1gSDK.this.AFInAppEventType.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                                if (cursor.getColumnCount() > 3) {
                                    AFe1gSDK.this.AFInAppEventType.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                                    HashMap hashMap = new HashMap();
                                    String string = cursor.getString(4);
                                    if (string != null) {
                                        hashMap.put("track_id", string);
                                    }
                                    hashMap.put("referrer_ex", cursor.getString(5));
                                    AFe1gSDK.this.AFInAppEventType.put("huawei_custom", hashMap);
                                }
                            } else {
                                AFe1gSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            AFe1gSDK.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e10) {
                        AFe1gSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e10.getMessage(), e10);
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th2;
                }
            }
        });
    }
}
