package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import is.k;
import is.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.i;
/* compiled from: BreadcrumbState.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/bugsnag/android/BreadcrumbState;", "Lcom/bugsnag/android/BaseObservable;", "Lcom/bugsnag/android/JsonStream$Streamable;", "", "getBreadcrumbIndex", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumb", "Lhs/k;", "add", "", "copy", "Lcom/bugsnag/android/JsonStream;", "writer", "toStream", "validIndexMask", "I", "", "store", "[Lcom/bugsnag/android/Breadcrumb;", "Ljava/util/concurrent/atomic/AtomicInteger;", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "maxBreadcrumbs", "Lcom/bugsnag/android/CallbackState;", "callbackState", "Lcom/bugsnag/android/CallbackState;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "<init>", "(ILcom/bugsnag/android/CallbackState;Lcom/bugsnag/android/Logger;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class BreadcrumbState extends BaseObservable implements JsonStream.Streamable {
    private final CallbackState callbackState;
    private final AtomicInteger index;
    private final Logger logger;
    private final int maxBreadcrumbs;
    private final Breadcrumb[] store;
    private final int validIndexMask;

    public BreadcrumbState(int i6, CallbackState callbackState, Logger logger) {
        i.h(callbackState, "callbackState");
        i.h(logger, "logger");
        this.maxBreadcrumbs = i6;
        this.callbackState = callbackState;
        this.logger = logger;
        this.validIndexMask = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.store = new Breadcrumb[i6];
        this.index = new AtomicInteger(0);
    }

    private final int getBreadcrumbIndex() {
        int i6;
        do {
            i6 = this.index.get() & this.validIndexMask;
        } while (!this.index.compareAndSet(i6, (i6 + 1) % this.maxBreadcrumbs));
        return i6;
    }

    public final void add(Breadcrumb breadcrumb) {
        i.h(breadcrumb, "breadcrumb");
        if (this.maxBreadcrumbs != 0 && this.callbackState.runOnBreadcrumbTasks(breadcrumb, this.logger)) {
            this.store[getBreadcrumbIndex()] = breadcrumb;
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                BreadcrumbInternal breadcrumbInternal = breadcrumb.impl;
                String str = breadcrumbInternal.message;
                BreadcrumbType breadcrumbType = breadcrumbInternal.type;
                String str2 = "t" + breadcrumb.impl.timestamp.getTime();
                Map map = breadcrumb.impl.metadata;
                if (map == null) {
                    map = new LinkedHashMap();
                }
                StateEvent.AddBreadcrumb addBreadcrumb = new StateEvent.AddBreadcrumb(str, breadcrumbType, str2, map);
                for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                    stateObserver.onStateChange(addBreadcrumb);
                }
            }
        }
    }

    public final List<Breadcrumb> copy() {
        if (this.maxBreadcrumbs == 0) {
            return w.f20676u;
        }
        int i6 = -1;
        while (i6 == -1) {
            i6 = this.index.getAndSet(-1);
        }
        try {
            int i10 = this.maxBreadcrumbs;
            Breadcrumb[] breadcrumbArr = new Breadcrumb[i10];
            is.i.J1(0, i6, i10, this.store, breadcrumbArr);
            is.i.J1(this.maxBreadcrumbs - i6, 0, i6, this.store, breadcrumbArr);
            return k.R1(breadcrumbArr);
        } finally {
            this.index.set(i6);
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        List<Breadcrumb> copy = copy();
        writer.beginArray();
        for (Breadcrumb breadcrumb : copy) {
            breadcrumb.toStream(writer);
        }
        writer.endArray();
    }
}
