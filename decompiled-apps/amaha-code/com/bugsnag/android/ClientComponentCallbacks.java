package com.bugsnag.android;

import android.content.ComponentCallbacks2;
import hs.k;
import kotlin.jvm.internal.i;
import ss.p;
/* compiled from: ClientComponentCallbacks.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00040\r\u0012\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R+\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/ClientComponentCallbacks;", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "Lhs/k;", "onConfigurationChanged", "", "level", "onTrimMemory", "onLowMemory", "Lcom/bugsnag/android/DeviceDataCollector;", "deviceDataCollector", "Lcom/bugsnag/android/DeviceDataCollector;", "Lkotlin/Function2;", "", "cb", "Lss/p;", "", "memoryCallback", "getMemoryCallback", "()Lss/p;", "<init>", "(Lcom/bugsnag/android/DeviceDataCollector;Lss/p;Lss/p;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ClientComponentCallbacks implements ComponentCallbacks2 {

    /* renamed from: cb  reason: collision with root package name */
    private final p<String, String, k> f5908cb;
    private final DeviceDataCollector deviceDataCollector;
    private final p<Boolean, Integer, k> memoryCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientComponentCallbacks(DeviceDataCollector deviceDataCollector, p<? super String, ? super String, k> cb2, p<? super Boolean, ? super Integer, k> memoryCallback) {
        i.h(deviceDataCollector, "deviceDataCollector");
        i.h(cb2, "cb");
        i.h(memoryCallback, "memoryCallback");
        this.deviceDataCollector = deviceDataCollector;
        this.f5908cb = cb2;
        this.memoryCallback = memoryCallback;
    }

    public final p<Boolean, Integer, k> getMemoryCallback() {
        return this.memoryCallback;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        i.h(newConfig, "newConfig");
        String orientationAsString$bugsnag_android_core_release = this.deviceDataCollector.getOrientationAsString$bugsnag_android_core_release();
        if (this.deviceDataCollector.updateOrientation$bugsnag_android_core_release(newConfig.orientation)) {
            this.f5908cb.invoke(orientationAsString$bugsnag_android_core_release, this.deviceDataCollector.getOrientationAsString$bugsnag_android_core_release());
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.memoryCallback.invoke(Boolean.TRUE, null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        boolean z10;
        p<Boolean, Integer, k> pVar = this.memoryCallback;
        if (i6 >= 80) {
            z10 = true;
        } else {
            z10 = false;
        }
        pVar.invoke(Boolean.valueOf(z10), Integer.valueOf(i6));
    }
}
