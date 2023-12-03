package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.theinnerhour.b2b.utils.SessionManager;
import is.u;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: ThreadInternal.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020\u0015\u0012\u0006\u0010\b\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\"\u0010'\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/bugsnag/android/ThreadInternal;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "", "Lcom/bugsnag/android/Stackframe;", "stacktrace", "Ljava/util/List;", "getStacktrace", "()Ljava/util/List;", "setStacktrace", "(Ljava/util/List;)V", "", "id", "J", "getId", "()J", "setId", "(J)V", "", SessionManager.KEY_NAME, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Lcom/bugsnag/android/ThreadType;", "type", "Lcom/bugsnag/android/ThreadType;", "getType", "()Lcom/bugsnag/android/ThreadType;", "setType", "(Lcom/bugsnag/android/ThreadType;)V", "", "isErrorReportingThread", "Z", "()Z", "state", "getState", "setState", "Lcom/bugsnag/android/Stacktrace;", "<init>", "(JLjava/lang/String;Lcom/bugsnag/android/ThreadType;ZLjava/lang/String;Lcom/bugsnag/android/Stacktrace;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ThreadInternal implements JsonStream.Streamable {

    /* renamed from: id  reason: collision with root package name */
    private long f5919id;
    private final boolean isErrorReportingThread;
    private String name;
    private List<Stackframe> stacktrace;
    private String state;
    private ThreadType type;

    public ThreadInternal(long j10, String name, ThreadType type, boolean z10, String state, Stacktrace stacktrace) {
        i.h(name, "name");
        i.h(type, "type");
        i.h(state, "state");
        i.h(stacktrace, "stacktrace");
        this.f5919id = j10;
        this.name = name;
        this.type = type;
        this.isErrorReportingThread = z10;
        this.state = state;
        this.stacktrace = u.J2(stacktrace.getTrace());
    }

    public final long getId() {
        return this.f5919id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Stackframe> getStacktrace() {
        return this.stacktrace;
    }

    public final String getState() {
        return this.state;
    }

    public final ThreadType getType() {
        return this.type;
    }

    public final boolean isErrorReportingThread() {
        return this.isErrorReportingThread;
    }

    public final void setId(long j10) {
        this.f5919id = j10;
    }

    public final void setName(String str) {
        i.h(str, "<set-?>");
        this.name = str;
    }

    public final void setStacktrace(List<Stackframe> list) {
        i.h(list, "<set-?>");
        this.stacktrace = list;
    }

    public final void setState(String str) {
        i.h(str, "<set-?>");
        this.state = str;
    }

    public final void setType(ThreadType threadType) {
        i.h(threadType, "<set-?>");
        this.type = threadType;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        writer.name("id").value(this.f5919id);
        writer.name(SessionManager.KEY_NAME).value(this.name);
        writer.name("type").value(this.type.getDesc$bugsnag_android_core_release());
        writer.name("state").value(this.state);
        writer.name("stacktrace");
        writer.beginArray();
        for (Stackframe stackframe : this.stacktrace) {
            writer.value(stackframe);
        }
        writer.endArray();
        if (this.isErrorReportingThread) {
            writer.name("errorReportingThread").value(true);
        }
        writer.endObject();
    }
}
