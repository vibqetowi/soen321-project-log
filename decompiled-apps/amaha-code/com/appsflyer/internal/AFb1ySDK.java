package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AFb1ySDK extends AFb1gSDK<String> {
    public AFb1ySDK(Context context, AFc1zSDK aFc1zSDK) {
        super(context, aFc1zSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1gSDK
    /* renamed from: valueOf */
    public String AFInAppEventParameterName() {
        Cursor cursor;
        Throwable th2;
        try {
            ContentResolver contentResolver = this.valueOf.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.values);
            cursor = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("aid"));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            cursor = null;
            th2 = th4;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final /* synthetic */ String AFKeystoreWrapper() {
        this.AFInAppEventParameterName.values().execute(this.AFInAppEventType);
        return (String) super.AFKeystoreWrapper();
    }

    public final String values() {
        this.AFInAppEventParameterName.values().execute(this.AFInAppEventType);
        return (String) super.AFKeystoreWrapper();
    }
}
