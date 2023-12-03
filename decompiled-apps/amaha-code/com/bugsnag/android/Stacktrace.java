package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import gv.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import xs.f;
/* compiled from: Stacktrace.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0018\u0010\u0019B-\b\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u001bJ#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J(\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/Stacktrace;", "Lcom/bugsnag/android/JsonStream$Streamable;", "", "Ljava/lang/StackTraceElement;", "frames", "limitTraceLength", "([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;", "", "Lcom/bugsnag/android/Stackframe;", "el", "", "", "projectPackages", "Lcom/bugsnag/android/Logger;", "logger", "serializeStackframe", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "trace", "Ljava/util/List;", "getTrace", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "stacktrace", "([Ljava/lang/StackTraceElement;Ljava/util/Collection;Lcom/bugsnag/android/Logger;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class Stacktrace implements JsonStream.Streamable {
    public static final Companion Companion = new Companion(null);
    private static final int STACKTRACE_TRIM_LENGTH = 200;
    private final List<Stackframe> trace;

    /* compiled from: Stacktrace.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/Stacktrace$Companion;", "", "()V", "STACKTRACE_TRIM_LENGTH", "", "inProject", "", "className", "", "projectPackages", "", "(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/Boolean;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final Boolean inProject(String className, Collection<String> projectPackages) {
            boolean z10;
            i.h(className, "className");
            i.h(projectPackages, "projectPackages");
            if (!projectPackages.isEmpty()) {
                for (String str : projectPackages) {
                    if (n.H0(className, str)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                return Boolean.TRUE;
            }
            return null;
        }
    }

    public Stacktrace(List<Stackframe> frames) {
        i.h(frames, "frames");
        this.trace = limitTraceLength(frames);
    }

    private final StackTraceElement[] limitTraceLength(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length >= 200) {
            f indices = h.k0(0, 200);
            i.g(indices, "indices");
            return (StackTraceElement[]) (indices.isEmpty() ? is.i.L1(0, 0, stackTraceElementArr) : is.i.L1(Integer.valueOf(indices.f37996u).intValue(), Integer.valueOf(indices.f37997v).intValue() + 1, stackTraceElementArr));
        }
        return stackTraceElementArr;
    }

    private final Stackframe serializeStackframe(StackTraceElement stackTraceElement, Collection<String> collection, Logger logger) {
        boolean z10;
        String methodName;
        try {
            String className = stackTraceElement.getClassName();
            i.c(className, "className");
            if (className.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                methodName = className + "." + stackTraceElement.getMethodName();
            } else {
                methodName = stackTraceElement.getMethodName();
            }
            String str = methodName;
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "Unknown";
            }
            return new Stackframe(str, fileName, Integer.valueOf(stackTraceElement.getLineNumber()), Companion.inProject(className, collection), null, null, 48, null);
        } catch (Exception e10) {
            logger.w("Failed to serialize stacktrace", e10);
            return null;
        }
    }

    public final List<Stackframe> getTrace() {
        return this.trace;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginArray();
        for (Stackframe stackframe : this.trace) {
            writer.value(stackframe);
        }
        writer.endArray();
    }

    public Stacktrace(StackTraceElement[] stacktrace, Collection<String> projectPackages, Logger logger) {
        i.h(stacktrace, "stacktrace");
        i.h(projectPackages, "projectPackages");
        i.h(logger, "logger");
        StackTraceElement[] limitTraceLength = limitTraceLength(stacktrace);
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : limitTraceLength) {
            Stackframe serializeStackframe = serializeStackframe(stackTraceElement, projectPackages, logger);
            if (serializeStackframe != null) {
                arrayList.add(serializeStackframe);
            }
        }
        this.trace = arrayList;
    }

    private final List<Stackframe> limitTraceLength(List<Stackframe> list) {
        return list.size() >= 200 ? list.subList(0, 200) : list;
    }
}
