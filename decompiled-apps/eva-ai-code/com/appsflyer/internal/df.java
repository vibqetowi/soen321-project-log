package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class df extends cz {
    public df(Runnable runnable) {
        super("samsung", runnable);
    }

    @Override // com.appsflyer.internal.dd
    public final void AFInAppEventParameterName(Context context) {
        values(context, new aw<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.df.4
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
                r0 = ((android.content.pm.PackageItemInfo) r10.AFInAppEventParameterName.getPackageManager().resolveContentProvider(r10.AFKeystoreWrapper, 128)).packageName;
                r10.values.AFInAppEventType.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.z.values(r10.AFInAppEventParameterName, r0)));
                r10.values.AFInAppEventType.put("api_ver_name", com.appsflyer.internal.z.AFKeystoreWrapper(r10.AFInAppEventParameterName, r0));
                r10.values.valueOf();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0111, code lost:
                return r10.values.AFInAppEventType;
             */
            @Override // com.appsflyer.internal.aw
            /* renamed from: valueOf */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFInAppEventType() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventParameterName.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.AFKeystoreWrapper);
                        cursor = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                        if (cursor != null) {
                            if (cursor.moveToFirst()) {
                                df.this.AFInAppEventType.put("response", "OK");
                                valueOf("referrer", df.this.AFInAppEventType, cursor);
                                AFInAppEventType("click_ts", df.this.AFInAppEventType, cursor);
                                AFInAppEventType("install_begin_ts", df.this.AFInAppEventType, cursor);
                                AFInAppEventType("install_end_ts", df.this.AFInAppEventType, cursor);
                                valueOf("organic_keywords", df.this.AFInAppEventType, cursor);
                                valueOf("attr_type", df.this.AFInAppEventType, cursor);
                                HashMap hashMap = new HashMap();
                                int columnIndex = cursor.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                    hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                AFInAppEventType("click_server_ts", hashMap, cursor);
                                AFInAppEventType("install_begin_server_ts", hashMap, cursor);
                                valueOf("install_version", hashMap, cursor);
                                if (!hashMap.isEmpty()) {
                                    df.this.AFInAppEventType.put("custom", hashMap);
                                }
                            } else {
                                df.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            df.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        df.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.valueOf(e.getMessage(), e);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            private static void AFInAppEventType(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            private static void valueOf(String str, Map<String, Object> map, Cursor cursor) {
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
