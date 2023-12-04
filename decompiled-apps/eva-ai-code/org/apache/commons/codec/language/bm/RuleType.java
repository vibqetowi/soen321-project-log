package org.apache.commons.codec.language.bm;

import com.ifriend.keychain.KeychainModule;
/* loaded from: classes5.dex */
public enum RuleType {
    APPROX("approx"),
    EXACT("exact"),
    RULES(KeychainModule.Maps.RULES);
    
    private final String name;

    RuleType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
