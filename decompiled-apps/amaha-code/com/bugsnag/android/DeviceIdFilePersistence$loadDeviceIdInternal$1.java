package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.DeviceId;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.y;
import ss.l;
/* compiled from: DeviceIdFilePersistence.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/DeviceId;", "p1", "Landroid/util/JsonReader;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final /* synthetic */ class DeviceIdFilePersistence$loadDeviceIdInternal$1 extends f implements l<JsonReader, DeviceId> {
    public DeviceIdFilePersistence$loadDeviceIdInternal$1(DeviceId.Companion companion) {
        super(1, companion);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "fromReader";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return y.a(DeviceId.Companion.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/DeviceId;";
    }

    @Override // ss.l
    public final DeviceId invoke(JsonReader p12) {
        i.h(p12, "p1");
        return ((DeviceId.Companion) this.receiver).fromReader(p12);
    }
}
