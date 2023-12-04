package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.internal.AttributionIdentifiers;
/* loaded from: classes2.dex */
final class ae extends aw<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(Context context) {
        super(context, AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.aw
    /* renamed from: valueOf */
    public String AFInAppEventType() {
        Cursor cursor;
        Throwable th;
        try {
            ContentResolver contentResolver = this.AFInAppEventParameterName.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.AFKeystoreWrapper);
            cursor = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("aid"));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    public final String AFInAppEventParameterName() {
        new Thread(this.AFInAppEventType).start();
        return (String) super.AFKeystoreWrapper();
    }

    @Override // com.appsflyer.internal.aw
    public final /* synthetic */ String AFKeystoreWrapper() {
        new Thread(this.AFInAppEventType).start();
        return (String) super.AFKeystoreWrapper();
    }
}
