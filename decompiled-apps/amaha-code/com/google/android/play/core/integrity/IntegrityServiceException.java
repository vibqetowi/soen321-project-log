package com.google.android.play.core.integrity;

import com.appsflyer.R;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import lc.a;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public class IntegrityServiceException extends ApiException {

    /* renamed from: v  reason: collision with root package name */
    public final Throwable f9345v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntegrityServiceException(Throwable th2, int i6) {
        super(new Status(i6, String.format(r1, "Integrity API error (%d): %s.", r2)));
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i6);
        HashMap hashMap = a.f24202a;
        Integer valueOf = Integer.valueOf(i6);
        if (hashMap.containsKey(valueOf)) {
            HashMap hashMap2 = a.f24203b;
            if (hashMap2.containsKey(valueOf)) {
                String str2 = (String) hashMap.get(valueOf);
                String str3 = (String) hashMap2.get(valueOf);
                int length = String.valueOf(str2).length();
                StringBuilder sb2 = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle + String.valueOf(str3).length());
                sb2.append(str2);
                sb2.append(" (https://developer.android.com/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#");
                sb2.append(str3);
                sb2.append(")");
                str = sb2.toString();
                objArr[1] = str;
                if (i6 == 0) {
                    this.f9345v = th2;
                    return;
                }
                throw new IllegalArgumentException("ErrorCode should not be 0.");
            }
        }
        str = "";
        objArr[1] = str;
        if (i6 == 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f9345v;
    }
}
