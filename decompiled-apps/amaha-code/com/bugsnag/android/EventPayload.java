package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import hs.k;
import is.u;
import is.y;
import java.io.File;
import java.util.Set;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: EventPayload.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\b\u0001\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R.\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/bugsnag/android/EventPayload;", "Lcom/bugsnag/android/JsonStream$Streamable;", "", "Lcom/bugsnag/android/ErrorType;", "getErrorTypes$bugsnag_android_core_release", "()Ljava/util/Set;", "getErrorTypes", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "Lcom/bugsnag/android/Event;", "value", "event", "Lcom/bugsnag/android/Event;", "getEvent", "()Lcom/bugsnag/android/Event;", "setEvent$bugsnag_android_core_release", "(Lcom/bugsnag/android/Event;)V", "Lcom/bugsnag/android/Notifier;", "notifier", "Lcom/bugsnag/android/Notifier;", "getNotifier$bugsnag_android_core_release", "()Lcom/bugsnag/android/Notifier;", "", "apiKey", "Ljava/lang/String;", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "Ljava/io/File;", "eventFile", "Ljava/io/File;", "getEventFile$bugsnag_android_core_release", "()Ljava/io/File;", "Lcom/bugsnag/android/internal/ImmutableConfig;", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "<init>", "(Ljava/lang/String;Lcom/bugsnag/android/Event;Ljava/io/File;Lcom/bugsnag/android/Notifier;Lcom/bugsnag/android/internal/ImmutableConfig;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EventPayload implements JsonStream.Streamable {
    private String apiKey;
    private final ImmutableConfig config;
    private Event event;
    private final File eventFile;
    private final Notifier notifier;

    public EventPayload(String str, Event event, Notifier notifier, ImmutableConfig immutableConfig) {
        this(str, event, null, notifier, immutableConfig, 4, null);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final Set<ErrorType> getErrorTypes$bugsnag_android_core_release() {
        Event event = this.event;
        if (event != null) {
            return event.getImpl().getErrorTypesFromStackframes$bugsnag_android_core_release();
        }
        File file = this.eventFile;
        if (file != null) {
            return EventFilenameInfo.Companion.fromFile(file, this.config).getErrorTypes();
        }
        return y.f20678u;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final File getEventFile$bugsnag_android_core_release() {
        return this.eventFile;
    }

    public final Notifier getNotifier$bugsnag_android_core_release() {
        return this.notifier;
    }

    public final void setApiKey(String str) {
        this.apiKey = str;
    }

    public final void setEvent$bugsnag_android_core_release(Event event) {
        this.event = event;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        writer.name("apiKey").value(this.apiKey);
        writer.name("payloadVersion").value("4.0");
        writer.name("notifier").value(this.notifier);
        writer.name("events").beginArray();
        Event event = this.event;
        if (event != null) {
            writer.value(event);
        } else {
            File file = this.eventFile;
            if (file != null) {
                writer.value(file);
            }
        }
        writer.endArray();
        writer.endObject();
    }

    public EventPayload(String str, Notifier notifier, ImmutableConfig immutableConfig) {
        this(str, null, null, notifier, immutableConfig, 6, null);
    }

    public EventPayload(String str, Event event, File file, Notifier notifier, ImmutableConfig config) {
        i.h(notifier, "notifier");
        i.h(config, "config");
        this.apiKey = str;
        this.eventFile = file;
        this.config = config;
        this.event = event;
        Notifier notifier2 = new Notifier(notifier.getName(), notifier.getVersion(), notifier.getUrl());
        notifier2.setDependencies(u.J2(notifier.getDependencies()));
        k kVar = k.f19476a;
        this.notifier = notifier2;
    }

    public /* synthetic */ EventPayload(String str, Event event, File file, Notifier notifier, ImmutableConfig immutableConfig, int i6, d dVar) {
        this(str, (i6 & 2) != 0 ? null : event, (i6 & 4) != 0 ? null : file, notifier, immutableConfig);
    }
}
