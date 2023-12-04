package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class cy extends cz {
    public cy(Runnable runnable) {
        super("huawei", runnable);
    }

    @Override // com.appsflyer.internal.dd
    public final void AFInAppEventParameterName(Context context) {
        values(context, new aw<Map<String, Object>>(context, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.cy.5
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00f9, code lost:
                if (r2 != null) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x010d, code lost:
                if (0 == 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x010f, code lost:
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0112, code lost:
                r11.values.valueOf();
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x011b, code lost:
                return r11.values.AFInAppEventType;
             */
            @Override // com.appsflyer.internal.aw
            /* renamed from: valueOf */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> AFInAppEventType() {
                String str = ((PackageItemInfo) this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128)).packageName;
                cy.this.AFInAppEventType.put("api_ver", Long.valueOf(z.values(this.AFInAppEventParameterName, str)));
                cy.this.AFInAppEventType.put("api_ver_name", z.AFKeystoreWrapper(this.AFInAppEventParameterName, str));
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventParameterName.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.AFKeystoreWrapper);
                        sb.append("/item/5");
                        cursor = contentResolver.query(Uri.parse(sb.toString()), null, null, new String[]{this.AFInAppEventParameterName.getPackageName()}, null);
                        if (cursor != null) {
                            if (cursor.moveToFirst()) {
                                cy.this.AFInAppEventType.put("response", "OK");
                                cy.this.AFInAppEventType.put("referrer", cursor.getString(0));
                                cy.this.AFInAppEventType.put("click_ts", Long.valueOf(cursor.getLong(1)));
                                cy.this.AFInAppEventType.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                                if (cursor.getColumnCount() > 3) {
                                    cy.this.AFInAppEventType.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                                    HashMap hashMap = new HashMap();
                                    String string = cursor.getString(4);
                                    if (string != null) {
                                        hashMap.put("track_id", string);
                                    }
                                    hashMap.put("referrer_ex", cursor.getString(5));
                                    cy.this.AFInAppEventType.put("huawei_custom", hashMap);
                                }
                            } else {
                                cy.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            cy.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        cy.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.valueOf(e.getMessage(), e);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        });
    }
}
