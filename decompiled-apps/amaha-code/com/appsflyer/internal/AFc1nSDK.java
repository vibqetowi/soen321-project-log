package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class AFc1nSDK<Body> implements ResponseNetwork<Body> {
    public final AFc1sSDK AFInAppEventParameterName;
    private final Body AFInAppEventType;
    final int AFKeystoreWrapper;
    final Map<String, List<String>> valueOf;
    final boolean values;

    public AFc1nSDK(Body body, int i6, boolean z10, Map<String, List<String>> map, AFc1sSDK aFc1sSDK) {
        this.AFInAppEventType = body;
        this.AFKeystoreWrapper = i6;
        this.values = z10;
        this.valueOf = new HashMap(map);
        this.AFInAppEventParameterName = aFc1sSDK;
    }

    public final String AFInAppEventType(String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField != null && !headerField.isEmpty()) {
            Iterator<String> it = headerField.iterator();
            StringBuilder sb2 = new StringBuilder(it.next());
            while (it.hasNext()) {
                sb2.append(", ");
                sb2.append(it.next());
            }
            return sb2.toString();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1nSDK aFc1nSDK = (AFc1nSDK) obj;
        if (this.AFKeystoreWrapper != aFc1nSDK.AFKeystoreWrapper || this.values != aFc1nSDK.values || !this.AFInAppEventType.equals(aFc1nSDK.AFInAppEventType) || !this.valueOf.equals(aFc1nSDK.valueOf)) {
            return false;
        }
        return this.AFInAppEventParameterName.equals(aFc1nSDK.AFInAppEventParameterName);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public Body getBody() {
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(String str) {
        for (String str2 : this.valueOf.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.valueOf.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        return this.AFInAppEventParameterName.hashCode() + ((hashCode + (((((this.AFInAppEventType.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.values ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.values;
    }
}
