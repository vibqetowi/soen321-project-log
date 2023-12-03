package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ErrorInternal.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B-\b\u0001\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\b\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/bugsnag/android/ErrorInternal;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "", "Lcom/bugsnag/android/Stackframe;", "stacktrace", "Ljava/util/List;", "getStacktrace", "()Ljava/util/List;", "", "errorClass", "Ljava/lang/String;", "getErrorClass", "()Ljava/lang/String;", "setErrorClass", "(Ljava/lang/String;)V", "errorMessage", "getErrorMessage", "setErrorMessage", "Lcom/bugsnag/android/ErrorType;", "type", "Lcom/bugsnag/android/ErrorType;", "getType", "()Lcom/bugsnag/android/ErrorType;", "setType", "(Lcom/bugsnag/android/ErrorType;)V", "Lcom/bugsnag/android/Stacktrace;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/Stacktrace;Lcom/bugsnag/android/ErrorType;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ErrorInternal implements JsonStream.Streamable {
    public static final Companion Companion = new Companion(null);
    private String errorClass;
    private String errorMessage;
    private final List<Stackframe> stacktrace;
    private ErrorType type;

    /* compiled from: ErrorInternal.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/ErrorInternal$Companion;", "", "()V", "createError", "", "Lcom/bugsnag/android/Error;", "exc", "", "projectPackages", "", "", "logger", "Lcom/bugsnag/android/Logger;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final List<Error> createError(Throwable exc, Collection<String> projectPackages, Logger logger) {
            i.h(exc, "exc");
            i.h(projectPackages, "projectPackages");
            i.h(logger, "logger");
            List<Throwable> safeUnrollCauses = ThrowableUtils.safeUnrollCauses(exc);
            ArrayList arrayList = new ArrayList();
            for (Throwable th2 : safeUnrollCauses) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                if (stackTrace == null) {
                    stackTrace = new StackTraceElement[0];
                }
                arrayList.add(new Error(new ErrorInternal(th2.getClass().getName(), th2.getLocalizedMessage(), new Stacktrace(stackTrace, projectPackages, logger), null, 8, null), logger));
            }
            return arrayList;
        }
    }

    public ErrorInternal(String str, String str2, Stacktrace stacktrace) {
        this(str, str2, stacktrace, null, 8, null);
    }

    public final String getErrorClass() {
        return this.errorClass;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<Stackframe> getStacktrace() {
        return this.stacktrace;
    }

    public final ErrorType getType() {
        return this.type;
    }

    public final void setErrorClass(String str) {
        i.h(str, "<set-?>");
        this.errorClass = str;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setType(ErrorType errorType) {
        i.h(errorType, "<set-?>");
        this.type = errorType;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        writer.name("errorClass").value(this.errorClass);
        writer.name("message").value(this.errorMessage);
        writer.name("type").value(this.type.getDesc$bugsnag_android_core_release());
        writer.name("stacktrace").value(this.stacktrace);
        writer.endObject();
    }

    public ErrorInternal(String errorClass, String str, Stacktrace stacktrace, ErrorType type) {
        i.h(errorClass, "errorClass");
        i.h(stacktrace, "stacktrace");
        i.h(type, "type");
        this.errorClass = errorClass;
        this.errorMessage = str;
        this.type = type;
        this.stacktrace = stacktrace.getTrace();
    }

    public /* synthetic */ ErrorInternal(String str, String str2, Stacktrace stacktrace, ErrorType errorType, int i6, d dVar) {
        this(str, str2, stacktrace, (i6 & 8) != 0 ? ErrorType.ANDROID : errorType);
    }
}
