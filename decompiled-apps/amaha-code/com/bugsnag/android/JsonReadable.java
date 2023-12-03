package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.JsonStream.Streamable;
/* compiled from: JsonReadable.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/JsonReadable;", "T", "Lcom/bugsnag/android/JsonStream$Streamable;", "", "fromReader", "reader", "Landroid/util/JsonReader;", "(Landroid/util/JsonReader;)Lcom/bugsnag/android/JsonStream$Streamable;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public interface JsonReadable<T extends JsonStream.Streamable> {
    T fromReader(JsonReader jsonReader);
}
