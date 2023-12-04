package com.google.api.resourcenames;

import com.google.api.resourcenames.ResourceName;
/* loaded from: classes7.dex */
public interface ResourceNameFactory<T extends ResourceName> {
    T parse(String str);
}
