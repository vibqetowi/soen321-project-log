package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFe1dSDK extends AFe1oSDK {
    private final AFc1zSDK AFInAppEventParameterName;

    public AFe1dSDK(Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("store", "samsung", runnable);
        this.AFInAppEventParameterName = aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final void valueOf(Context context) {
        values(context, new AFb1gSDK<Map<String, Object>>(context, this.AFInAppEventParameterName, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFe1dSDK.2
            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j10 = cursor.getLong(columnIndex);
                if (j10 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00bd, code lost:
                if (r2 != null) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
                if (0 == 0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
                r0 = ((android.content.pm.PackageItemInfo) r10.valueOf.getPackageManager().resolveContentProvider(r10.values, 128)).packageName;
                r10.AFKeystoreWrapper.AFInAppEventType.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1wSDK.AFKeystoreWrapper(r10.valueOf, r0)));
                r10.AFKeystoreWrapper.AFInAppEventType.put("api_ver_name", com.appsflyer.internal.AFb1wSDK.AFInAppEventParameterName(r10.valueOf, r0));
                r10.AFKeystoreWrapper.AFKeystoreWrapper();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0111, code lost:
                return r10.AFKeystoreWrapper.AFInAppEventType;
             */
            @Override // com.appsflyer.internal.AFb1gSDK
            /* renamed from: valueOf */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFInAppEventParameterName() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.valueOf.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.values);
                        cursor = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursor != null) {
                            if (cursor.moveToFirst()) {
                                AFe1dSDK.this.AFInAppEventType.put("response", "OK");
                                AFInAppEventParameterName("referrer", AFe1dSDK.this.AFInAppEventType, cursor);
                                AFKeystoreWrapper("click_ts", AFe1dSDK.this.AFInAppEventType, cursor);
                                AFKeystoreWrapper("install_begin_ts", AFe1dSDK.this.AFInAppEventType, cursor);
                                AFKeystoreWrapper("install_end_ts", AFe1dSDK.this.AFInAppEventType, cursor);
                                AFInAppEventParameterName("organic_keywords", AFe1dSDK.this.AFInAppEventType, cursor);
                                AFInAppEventParameterName("attr_type", AFe1dSDK.this.AFInAppEventType, cursor);
                                HashMap hashMap = new HashMap();
                                int columnIndex = cursor.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                    hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                AFKeystoreWrapper("click_server_ts", hashMap, cursor);
                                AFKeystoreWrapper("install_begin_server_ts", hashMap, cursor);
                                AFInAppEventParameterName("install_version", hashMap, cursor);
                                if (!hashMap.isEmpty()) {
                                    AFe1dSDK.this.AFInAppEventType.put("custom", hashMap);
                                }
                            } else {
                                AFe1dSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            AFe1dSDK.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e10) {
                        AFe1dSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e10.getMessage(), e10);
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th2;
                }
            }

            private static void AFInAppEventParameterName(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
