package com.bugsnag.android;

import java.util.Map;
import r1.b0;
/* loaded from: classes.dex */
public final class FeatureFlag implements Map.Entry<String, String> {
    private final String name;
    private final String variant;

    public FeatureFlag(String str) {
        this(str, null);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (getKey().equals(entry.getKey())) {
            if (getValue() == null) {
                if (entry.getValue() == null) {
                    return true;
                }
            } else if (getValue().equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String getVariant() {
        return this.variant;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        int hashCode2 = getKey().hashCode();
        if (getValue() == null) {
            hashCode = 0;
        } else {
            hashCode = getValue().hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureFlag{name='");
        sb2.append(this.name);
        sb2.append("', variant='");
        return b0.b(sb2, this.variant, "'}");
    }

    public FeatureFlag(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.variant = str2;
            return;
        }
        throw new NullPointerException("FeatureFlags cannot have null name");
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.name;
    }

    @Override // java.util.Map.Entry
    public String getValue() {
        return this.variant;
    }

    @Override // java.util.Map.Entry
    public String setValue(String str) {
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    public FeatureFlag(Map.Entry<String, String> entry) {
        this(entry.getKey(), entry.getValue());
    }
}
