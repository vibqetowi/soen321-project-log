package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
/* loaded from: classes.dex */
interface TypeLookup {
    <T> JsonReader.BindObject<T> tryFindBinder(Class<T> cls);

    <T> JsonReader.ReadObject<T> tryFindReader(Class<T> cls);
}
