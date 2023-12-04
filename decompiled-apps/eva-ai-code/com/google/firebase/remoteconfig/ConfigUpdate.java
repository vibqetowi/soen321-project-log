package com.google.firebase.remoteconfig;

import java.util.Set;
/* loaded from: classes7.dex */
public abstract class ConfigUpdate {
    public abstract Set<String> getUpdatedKeys();

    public static ConfigUpdate create(Set<String> set) {
        return new AutoValue_ConfigUpdate(set);
    }
}
