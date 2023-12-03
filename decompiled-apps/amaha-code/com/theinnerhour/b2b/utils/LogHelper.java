package com.theinnerhour.b2b.utils;

import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Event;
import com.bugsnag.android.OnErrorCallback;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
/* compiled from: LogHelper.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b\r\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b\u000e\u0010\fJ)\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b\u000f\u0010\fJ1\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0014J&\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0014J1\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\"\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0016j\u0002`\u0017J\u0012\u0010\u0013\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0016j\u0002`\u0017J?\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/theinnerhour/b2b/utils/LogHelper;", "", "", "str", "makeLogTag", "Ljava/lang/Class;", "cls", "tag", "", "messages", "Lhs/k;", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "d", "i", "w", "", "t", "(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "e", "Lcom/android/volley/VolleyError;", Constants.NOTIFICATION_URL, "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "level", "log", "(Ljava/lang/String;ILjava/lang/Throwable;[Ljava/lang/Object;)V", "MAX_LOG_TAG_LENGTH", "I", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LogHelper {
    public static final LogHelper INSTANCE = new LogHelper();
    private static final int MAX_LOG_TAG_LENGTH = 23;

    private LogHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e$lambda$0(String tag, Event it) {
        kotlin.jvm.internal.i.g(tag, "$tag");
        kotlin.jvm.internal.i.g(it, "it");
        it.addMetadata("Extras", "TAG", tag);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e$lambda$1(String tag, String messages, Event it) {
        kotlin.jvm.internal.i.g(tag, "$tag");
        kotlin.jvm.internal.i.g(messages, "$messages");
        kotlin.jvm.internal.i.g(it, "it");
        it.addMetadata("Extras", "TAG", tag);
        it.addMetadata("Extras", "Messages", messages);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e$lambda$2(String tag, String messages, String url, Event it) {
        kotlin.jvm.internal.i.g(tag, "$tag");
        kotlin.jvm.internal.i.g(messages, "$messages");
        kotlin.jvm.internal.i.g(url, "$url");
        kotlin.jvm.internal.i.g(it, "it");
        it.addMetadata("Extras", "TAG", tag);
        it.addMetadata("Extras", "Messages", messages);
        it.addMetadata("Extras", "Url", url);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e$lambda$3(String tag, Object[] messages, Event it) {
        kotlin.jvm.internal.i.g(tag, "$tag");
        kotlin.jvm.internal.i.g(messages, "$messages");
        kotlin.jvm.internal.i.g(it, "it");
        it.addMetadata("Extras", "TAG", tag);
        it.addMetadata("Extras", "Messages", messages.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e$lambda$4(String tag, Throwable t3, Event it) {
        kotlin.jvm.internal.i.g(tag, "$tag");
        kotlin.jvm.internal.i.g(t3, "$t");
        kotlin.jvm.internal.i.g(it, "it");
        it.addMetadata("Extras", "TAG", tag);
        if (t3.getMessage() != null) {
            it.addMetadata("Extras", "Messages", t3.getMessage());
            return true;
        }
        it.addMetadata("Extras", "Messages", "");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e$lambda$5(String tag, String url, Event it) {
        kotlin.jvm.internal.i.g(tag, "$tag");
        kotlin.jvm.internal.i.g(url, "$url");
        kotlin.jvm.internal.i.g(it, "it");
        it.addMetadata("Extras", "TAG", tag);
        it.addMetadata("Extras", Constants.NOTIFICATION_URL, url);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e$lambda$6(String tag, String messages, Event it) {
        kotlin.jvm.internal.i.g(tag, "$tag");
        kotlin.jvm.internal.i.g(messages, "$messages");
        kotlin.jvm.internal.i.g(it, "it");
        it.addMetadata("Extras", "TAG", tag);
        it.addMetadata("Extras", "Messages", messages);
        return true;
    }

    public final void i(String tag, Object... messages) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(messages, "messages");
        log(tag, 4, null, Arrays.copyOf(messages, messages.length));
    }

    public final void log(String tag, int i6, Throwable th2, Object... messages) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(messages, "messages");
    }

    public final String makeLogTag(String str) {
        kotlin.jvm.internal.i.g(str, "str");
        int length = str.length();
        int i6 = MAX_LOG_TAG_LENGTH;
        if (length > i6) {
            String substring = str.substring(0, i6 - 1);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public final void v(String tag, Object... messages) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(messages, "messages");
        log(tag, 2, null, Arrays.copyOf(messages, messages.length));
    }

    public final void w(String tag, Object... messages) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(messages, "messages");
        log(tag, 5, null, Arrays.copyOf(messages, messages.length));
    }

    public final void d(String tag, Object... messages) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(messages, "messages");
        log(tag, 3, null, Arrays.copyOf(messages, messages.length));
    }

    public final void e(final String tag, String messages) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(messages, "messages");
        try {
            Boolean CRASH_REPORT_SEND = Constants.CRASH_REPORT_SEND;
            kotlin.jvm.internal.i.f(CRASH_REPORT_SEND, "CRASH_REPORT_SEND");
            if (CRASH_REPORT_SEND.booleanValue()) {
                Bugsnag.notify(new Exception(messages), new OnErrorCallback() { // from class: com.theinnerhour.b2b.utils.i
                    @Override // com.bugsnag.android.OnErrorCallback
                    public final boolean onError(Event event) {
                        boolean e$lambda$0;
                        e$lambda$0 = LogHelper.e$lambda$0(tag, event);
                        return e$lambda$0;
                    }
                });
                jd.e.a().b(new Exception(messages));
            }
            log(tag, 6, null, messages);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void w(String tag, Throwable t3, Object... messages) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(t3, "t");
        kotlin.jvm.internal.i.g(messages, "messages");
        log(tag, 5, t3, Arrays.copyOf(messages, messages.length));
    }

    public final String makeLogTag(Class<?> cls) {
        kotlin.jvm.internal.i.g(cls, "cls");
        return makeLogTag(cls.getSimpleName());
    }

    public final void e(String tag, String messages, VolleyError t3) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(messages, "messages");
        kotlin.jvm.internal.i.g(t3, "t");
        try {
            if (t3 instanceof NoConnectionError) {
                return;
            }
            Boolean CRASH_REPORT_SEND = Constants.CRASH_REPORT_SEND;
            kotlin.jvm.internal.i.f(CRASH_REPORT_SEND, "CRASH_REPORT_SEND");
            if (CRASH_REPORT_SEND.booleanValue()) {
                Bugsnag.notify(t3, new g(tag, messages, 0));
                jd.e.a().b(t3);
            }
            log(tag, 6, t3, messages);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void e(final String tag, final String url, final String messages, VolleyError t3) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(url, "url");
        kotlin.jvm.internal.i.g(messages, "messages");
        kotlin.jvm.internal.i.g(t3, "t");
        try {
            if (t3 instanceof NoConnectionError) {
                return;
            }
            Boolean CRASH_REPORT_SEND = Constants.CRASH_REPORT_SEND;
            kotlin.jvm.internal.i.f(CRASH_REPORT_SEND, "CRASH_REPORT_SEND");
            if (CRASH_REPORT_SEND.booleanValue()) {
                Bugsnag.notify(t3, new OnErrorCallback() { // from class: com.theinnerhour.b2b.utils.j
                    @Override // com.bugsnag.android.OnErrorCallback
                    public final boolean onError(Event event) {
                        boolean e$lambda$2;
                        e$lambda$2 = LogHelper.e$lambda$2(tag, messages, url, event);
                        return e$lambda$2;
                    }
                });
                jd.e.a().b(t3);
            }
            log(tag, 6, t3, messages);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String tag, Throwable t3, Object... messages) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(t3, "t");
        kotlin.jvm.internal.i.g(messages, "messages");
        try {
            if ((t3 instanceof NoConnectionError) || (t3 instanceof CancellationException)) {
                return;
            }
            Boolean CRASH_REPORT_SEND = Constants.CRASH_REPORT_SEND;
            kotlin.jvm.internal.i.f(CRASH_REPORT_SEND, "CRASH_REPORT_SEND");
            if (CRASH_REPORT_SEND.booleanValue()) {
                Bugsnag.notify(t3, new h(tag, messages, 0));
                jd.e.a().b(t3);
            }
            log(tag, 6, t3, Arrays.copyOf(messages, messages.length));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void e(String tag, Throwable t3) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(t3, "t");
        try {
            if ((t3 instanceof NoConnectionError) || (t3 instanceof CancellationException)) {
                return;
            }
            Boolean CRASH_REPORT_SEND = Constants.CRASH_REPORT_SEND;
            kotlin.jvm.internal.i.f(CRASH_REPORT_SEND, "CRASH_REPORT_SEND");
            if (CRASH_REPORT_SEND.booleanValue()) {
                Bugsnag.notify(t3, new h(tag, t3, 1));
                jd.e.a().b(t3);
            }
            log(tag, 6, t3, null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void e(String tag, String url, Throwable t3) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(url, "url");
        kotlin.jvm.internal.i.g(t3, "t");
        try {
            if ((t3 instanceof NoConnectionError) || (t3 instanceof CancellationException)) {
                return;
            }
            Boolean CRASH_REPORT_SEND = Constants.CRASH_REPORT_SEND;
            kotlin.jvm.internal.i.f(CRASH_REPORT_SEND, "CRASH_REPORT_SEND");
            if (CRASH_REPORT_SEND.booleanValue()) {
                Bugsnag.notify(t3, new g(tag, url, 1));
                jd.e.a().b(t3);
            }
            log(tag, 6, t3, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void e(String tag, String messages, Exception t3) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(messages, "messages");
        kotlin.jvm.internal.i.g(t3, "t");
        try {
            if ((t3 instanceof NoConnectionError) || (t3 instanceof CancellationException)) {
                return;
            }
            Boolean CRASH_REPORT_SEND = Constants.CRASH_REPORT_SEND;
            kotlin.jvm.internal.i.f(CRASH_REPORT_SEND, "CRASH_REPORT_SEND");
            if (CRASH_REPORT_SEND.booleanValue()) {
                Bugsnag.notify(t3, new g(tag, messages, 2));
                jd.e.a().b(t3);
            }
            log(tag, 6, t3, messages);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void e(Exception t3) {
        kotlin.jvm.internal.i.g(t3, "t");
        try {
            if ((t3 instanceof NoConnectionError) || (t3 instanceof CancellationException)) {
                return;
            }
            Boolean CRASH_REPORT_SEND = Constants.CRASH_REPORT_SEND;
            kotlin.jvm.internal.i.f(CRASH_REPORT_SEND, "CRASH_REPORT_SEND");
            if (CRASH_REPORT_SEND.booleanValue()) {
                Bugsnag.notify(t3);
                jd.e.a().b(t3);
            }
            log("ih_generic", 6, t3, "exception");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
