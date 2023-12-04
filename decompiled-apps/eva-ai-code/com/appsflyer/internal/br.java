package com.appsflyer.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class br<Body> {
    public final Map<String, List<String>> AFInAppEventParameterName;
    public final bk AFInAppEventType;
    final boolean AFKeystoreWrapper;
    public final Body valueOf;
    public final int values;

    public br(Body body, int i, boolean z, Map<String, List<String>> map, bk bkVar) {
        this.valueOf = body;
        this.values = i;
        this.AFKeystoreWrapper = z;
        this.AFInAppEventParameterName = new HashMap(map);
        this.AFInAppEventType = bkVar;
    }

    public final boolean values() {
        return this.AFKeystoreWrapper;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        br brVar = (br) obj;
        if (this.values == brVar.values && this.AFKeystoreWrapper == brVar.AFKeystoreWrapper && this.valueOf.equals(brVar.valueOf) && this.AFInAppEventParameterName.equals(brVar.AFInAppEventParameterName)) {
            return this.AFInAppEventType.equals(brVar.AFInAppEventType);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.valueOf.hashCode() * 31) + this.values) * 31) + (this.AFKeystoreWrapper ? 1 : 0)) * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + this.AFInAppEventType.hashCode();
    }
}
