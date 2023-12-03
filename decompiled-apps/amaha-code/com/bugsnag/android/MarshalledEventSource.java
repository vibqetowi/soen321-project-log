package com.bugsnag.android;

import com.bugsnag.android.internal.JsonHelper;
import java.io.File;
import kotlin.jvm.internal.i;
import ss.a;
/* compiled from: MarshalledEventSource.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0004\u001a\u00020\u0002H\u0096\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/MarshalledEventSource;", "Lkotlin/Function0;", "Lcom/bugsnag/android/Event;", "unmarshall", "invoke", "Lhs/k;", "clear", "<set-?>", "event", "Lcom/bugsnag/android/Event;", "getEvent", "()Lcom/bugsnag/android/Event;", "Ljava/io/File;", "eventFile", "Ljava/io/File;", "", "apiKey", "Ljava/lang/String;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "<init>", "(Ljava/io/File;Ljava/lang/String;Lcom/bugsnag/android/Logger;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class MarshalledEventSource implements a<Event> {
    private final String apiKey;
    private Event event;
    private final File eventFile;
    private final Logger logger;

    public MarshalledEventSource(File eventFile, String apiKey, Logger logger) {
        i.h(eventFile, "eventFile");
        i.h(apiKey, "apiKey");
        i.h(logger, "logger");
        this.eventFile = eventFile;
        this.apiKey = apiKey;
        this.logger = logger;
    }

    private final Event unmarshall() {
        return new Event(new BugsnagEventMapper(this.logger).convertToEventImpl$bugsnag_android_core_release(JsonHelper.INSTANCE.deserialize(this.eventFile), this.apiKey), this.logger);
    }

    public final void clear() {
        this.event = null;
    }

    public final Event getEvent() {
        return this.event;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public Event invoke() {
        Event event = this.event;
        if (event == null) {
            Event unmarshall = unmarshall();
            this.event = unmarshall;
            return unmarshall;
        }
        return event;
    }
}
