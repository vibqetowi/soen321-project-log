package com.google.api.resourcenames;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
/* loaded from: classes7.dex */
public class UntypedResourceName implements ResourceName {
    private volatile Map<String, String> fieldValuesMap;
    private final String rawValue;

    public static boolean isParsableFrom(String str) {
        return str != null;
    }

    private UntypedResourceName(String str) {
        this.rawValue = (String) Preconditions.checkNotNull(str);
    }

    public static UntypedResourceName of(ResourceName resourceName) {
        return new UntypedResourceName(resourceName.toString());
    }

    public static UntypedResourceName parse(String str) {
        return new UntypedResourceName(str);
    }

    @Override // com.google.api.resourcenames.ResourceName
    public Map<String, String> getFieldValuesMap() {
        if (this.fieldValuesMap == null) {
            synchronized (this) {
                if (this.fieldValuesMap == null) {
                    this.fieldValuesMap = ImmutableMap.of("", this.rawValue);
                }
            }
        }
        return this.fieldValuesMap;
    }

    @Override // com.google.api.resourcenames.ResourceName
    public String getFieldValue(String str) {
        return getFieldValuesMap().get("");
    }

    public String toString() {
        return this.rawValue;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UntypedResourceName) {
            return this.rawValue.equals(((UntypedResourceName) obj).rawValue);
        }
        return false;
    }

    public int hashCode() {
        return this.rawValue.hashCode();
    }
}
