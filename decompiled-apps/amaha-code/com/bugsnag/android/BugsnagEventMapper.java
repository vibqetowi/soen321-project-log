package com.bugsnag.android;

import com.bugsnag.android.ThreadType;
import com.bugsnag.android.internal.DateUtils;
import com.bugsnag.android.internal.InternalMetricsImpl;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.k;
import is.e0;
import is.u;
import is.w;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.i;
import ts.a;
import ts.d;
/* compiled from: BugsnagEventMapper.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0000¢\u0006\u0002\b\rJ#\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0000¢\u0006\u0002\b\u0011J#\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0000¢\u0006\u0002\b\u0015J%\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0000¢\u0006\u0002\b\u0019J%\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u0018\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0000¢\u0006\u0002\b\u001cJ)\u0010\u001d\u001a\u00020\u001e2\u001a\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b0 H\u0000¢\u0006\u0002\b!J#\u0010\"\u001a\u00020#2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0000¢\u0006\u0002\b%J-\u0010&\u001a\u00020'2\u0016\u0010(\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010)\u001a\u00020\fH\u0000¢\u0006\u0002\b*J-\u0010+\u001a\u00020,2\u0016\u0010(\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010)\u001a\u00020\fH\u0000¢\u0006\u0002\b-J#\u0010.\u001a\u00020/2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0000¢\u0006\u0002\b1J7\u00102\u001a\u0002032\u0016\u0010(\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0000¢\u0006\u0002\b8J*\u00109\u001a\u0002H:\"\u0006\b\u0000\u0010:\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010;\u001a\u00020\fH\u0082\b¢\u0006\u0002\u0010<J\f\u0010=\u001a\u00020>*\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006?"}, d2 = {"Lcom/bugsnag/android/BugsnagEventMapper;", "", "logger", "Lcom/bugsnag/android/Logger;", "(Lcom/bugsnag/android/Logger;)V", "ndkDateFormatHolder", "com/bugsnag/android/BugsnagEventMapper$ndkDateFormatHolder$1", "Lcom/bugsnag/android/BugsnagEventMapper$ndkDateFormatHolder$1;", "convertAppWithState", "Lcom/bugsnag/android/AppWithState;", "app", "", "", "convertAppWithState$bugsnag_android_core_release", "convertBreadcrumbInternal", "Lcom/bugsnag/android/BreadcrumbInternal;", "breadcrumb", "convertBreadcrumbInternal$bugsnag_android_core_release", "convertDeviceWithState", "Lcom/bugsnag/android/DeviceWithState;", "device", "convertDeviceWithState$bugsnag_android_core_release", "convertError", "Lcom/bugsnag/android/Error;", "error", "convertError$bugsnag_android_core_release", "convertErrorInternal", "Lcom/bugsnag/android/ErrorInternal;", "convertErrorInternal$bugsnag_android_core_release", "convertStacktrace", "Lcom/bugsnag/android/Stacktrace;", "trace", "", "convertStacktrace$bugsnag_android_core_release", "convertThread", "Lcom/bugsnag/android/ThreadInternal;", "thread", "convertThread$bugsnag_android_core_release", "convertToEvent", "Lcom/bugsnag/android/Event;", "map", "apiKey", "convertToEvent$bugsnag_android_core_release", "convertToEventImpl", "Lcom/bugsnag/android/EventInternal;", "convertToEventImpl$bugsnag_android_core_release", "convertUser", "Lcom/bugsnag/android/User;", "user", "convertUser$bugsnag_android_core_release", "deserializeSeverityReason", "Lcom/bugsnag/android/SeverityReason;", "unhandled", "", "severity", "Lcom/bugsnag/android/Severity;", "deserializeSeverityReason$bugsnag_android_core_release", "readEntry", "T", "key", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "toDate", "Ljava/util/Date;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class BugsnagEventMapper {
    private final Logger logger;
    private final BugsnagEventMapper$ndkDateFormatHolder$1 ndkDateFormatHolder;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.bugsnag.android.BugsnagEventMapper$ndkDateFormatHolder$1] */
    public BugsnagEventMapper(Logger logger) {
        i.h(logger, "logger");
        this.logger = logger;
        this.ndkDateFormatHolder = new ThreadLocal<DateFormat>() { // from class: com.bugsnag.android.BugsnagEventMapper$ndkDateFormatHolder$1
            @Override // java.lang.ThreadLocal
            public DateFormat initialValue() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            }
        };
    }

    private final <T> T readEntry(Map<?, ?> map, String str) {
        map.get(str);
        i.p();
        throw null;
    }

    private final Date toDate(String str) {
        try {
            return DateUtils.fromIso8601(str);
        } catch (IllegalArgumentException unused) {
            DateFormat dateFormat = get();
            if (dateFormat != null) {
                Date parse = dateFormat.parse(str);
                if (parse != null) {
                    return parse;
                }
                throw new IllegalArgumentException(c.r("cannot parse date ", str));
            }
            i.o();
            throw null;
        }
    }

    public final AppWithState convertAppWithState$bugsnag_android_core_release(Map<String, ? extends Object> app) {
        Integer num;
        Long l2;
        Long l10;
        i.h(app, "app");
        Object obj = app.get("binaryArch");
        Boolean bool = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = app.get("id");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        Object obj3 = app.get("releaseStage");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str3 = (String) obj3;
        Object obj4 = app.get("version");
        if (!(obj4 instanceof String)) {
            obj4 = null;
        }
        String str4 = (String) obj4;
        Object obj5 = app.get("codeBundleId");
        if (!(obj5 instanceof String)) {
            obj5 = null;
        }
        String str5 = (String) obj5;
        Object obj6 = app.get("buildUUID");
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        String str6 = (String) obj6;
        Object obj7 = app.get("type");
        if (!(obj7 instanceof String)) {
            obj7 = null;
        }
        String str7 = (String) obj7;
        Object obj8 = app.get("versionCode");
        if (!(obj8 instanceof Number)) {
            obj8 = null;
        }
        Number number = (Number) obj8;
        if (number != null) {
            num = Integer.valueOf(number.intValue());
        } else {
            num = null;
        }
        Object obj9 = app.get("duration");
        if (!(obj9 instanceof Number)) {
            obj9 = null;
        }
        Number number2 = (Number) obj9;
        if (number2 != null) {
            l2 = Long.valueOf(number2.longValue());
        } else {
            l2 = null;
        }
        Object obj10 = app.get("durationInForeground");
        if (!(obj10 instanceof Number)) {
            obj10 = null;
        }
        Number number3 = (Number) obj10;
        if (number3 != null) {
            l10 = Long.valueOf(number3.longValue());
        } else {
            l10 = null;
        }
        Object obj11 = app.get("inForeground");
        if (!(obj11 instanceof Boolean)) {
            obj11 = null;
        }
        Boolean bool2 = (Boolean) obj11;
        Object obj12 = app.get("isLaunching");
        if (obj12 instanceof Boolean) {
            bool = obj12;
        }
        return new AppWithState(str, str2, str3, str4, str5, str6, str7, num, l2, l10, bool2, bool);
    }

    public final BreadcrumbInternal convertBreadcrumbInternal$bugsnag_android_core_release(Map<String, ? extends Object> breadcrumb) {
        boolean z10;
        i.h(breadcrumb, "breadcrumb");
        Object obj = breadcrumb.get(SessionManager.KEY_NAME);
        if (obj instanceof String) {
            String str = (String) obj;
            Object obj2 = breadcrumb.get("type");
            if (obj2 instanceof String) {
                BreadcrumbType fromDescriptor$bugsnag_android_core_release = BreadcrumbType.Companion.fromDescriptor$bugsnag_android_core_release((String) obj2);
                if (fromDescriptor$bugsnag_android_core_release == null) {
                    fromDescriptor$bugsnag_android_core_release = BreadcrumbType.MANUAL;
                }
                Object obj3 = breadcrumb.get("metaData");
                if ((obj3 instanceof Map) && (!(obj3 instanceof a) || (obj3 instanceof d))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    obj3 = null;
                }
                Map map = (Map) obj3;
                Object obj4 = breadcrumb.get(ServerValues.NAME_OP_TIMESTAMP);
                if (obj4 instanceof String) {
                    return new BreadcrumbInternal(str, fromDescriptor$bugsnag_android_core_release, map, toDate((String) obj4));
                }
                if (obj4 == null) {
                    throw new IllegalStateException("cannot find json property 'timestamp'");
                }
                throw new IllegalArgumentException(c.o(obj4, "json property 'timestamp' not of expected type, found "));
            } else if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            } else {
                throw new IllegalArgumentException(c.o(obj2, "json property 'type' not of expected type, found "));
            }
        } else if (obj == null) {
            throw new IllegalStateException("cannot find json property 'name'");
        } else {
            throw new IllegalArgumentException(c.o(obj, "json property 'name' not of expected type, found "));
        }
    }

    public final DeviceWithState convertDeviceWithState$bugsnag_android_core_release(Map<String, ? extends Object> device) {
        String[] strArr;
        Long l2;
        LinkedHashMap linkedHashMap;
        Long l10;
        Long l11;
        Date date;
        i.h(device, "device");
        Object obj = device.get("manufacturer");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = device.get("model");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        Object obj3 = device.get("osVersion");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str3 = (String) obj3;
        Object obj4 = device.get("cpuAbi");
        if (!(obj4 instanceof List)) {
            obj4 = null;
        }
        List list = (List) obj4;
        if (list != null) {
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                strArr = (String[]) array;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            strArr = null;
        }
        DeviceBuildInfo deviceBuildInfo = new DeviceBuildInfo(str, str2, str3, null, null, null, null, null, strArr);
        Object obj5 = device.get("jailbroken");
        if (!(obj5 instanceof Boolean)) {
            obj5 = null;
        }
        Boolean bool = (Boolean) obj5;
        Object obj6 = device.get("id");
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        String str4 = (String) obj6;
        Object obj7 = device.get("locale");
        if (!(obj7 instanceof String)) {
            obj7 = null;
        }
        String str5 = (String) obj7;
        Object obj8 = device.get("totalMemory");
        if (!(obj8 instanceof Number)) {
            obj8 = null;
        }
        Number number = (Number) obj8;
        if (number != null) {
            l2 = Long.valueOf(number.longValue());
        } else {
            l2 = null;
        }
        Object obj9 = device.get("runtimeVersions");
        if (!(obj9 instanceof Map)) {
            obj9 = null;
        }
        Map map = (Map) obj9;
        if (map != null) {
            linkedHashMap = e0.z0(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        Object obj10 = device.get("freeDisk");
        if (!(obj10 instanceof Number)) {
            obj10 = null;
        }
        Number number2 = (Number) obj10;
        if (number2 != null) {
            l10 = Long.valueOf(number2.longValue());
        } else {
            l10 = null;
        }
        Object obj11 = device.get("freeMemory");
        if (!(obj11 instanceof Number)) {
            obj11 = null;
        }
        Number number3 = (Number) obj11;
        if (number3 != null) {
            l11 = Long.valueOf(number3.longValue());
        } else {
            l11 = null;
        }
        Object obj12 = device.get("orientation");
        if (!(obj12 instanceof String)) {
            obj12 = null;
        }
        String str6 = (String) obj12;
        Object obj13 = device.get("time");
        if (!(obj13 instanceof String)) {
            obj13 = null;
        }
        String str7 = (String) obj13;
        if (str7 != null) {
            date = toDate(str7);
        } else {
            date = null;
        }
        return new DeviceWithState(deviceBuildInfo, bool, str4, str5, l2, linkedHashMap2, l10, l11, str6, date);
    }

    public final Error convertError$bugsnag_android_core_release(Map<? super String, ? extends Object> error) {
        i.h(error, "error");
        return new Error(convertErrorInternal$bugsnag_android_core_release(error), this.logger);
    }

    public final ErrorInternal convertErrorInternal$bugsnag_android_core_release(Map<? super String, ? extends Object> error) {
        i.h(error, "error");
        Object obj = error.get("errorClass");
        if (obj instanceof String) {
            String str = (String) obj;
            Object obj2 = error.get("message");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str2 = (String) obj2;
            Object obj3 = error.get("type");
            if (obj3 instanceof String) {
                String str3 = (String) obj3;
                ErrorType fromDescriptor = ErrorType.Companion.fromDescriptor(str3);
                if (fromDescriptor != null) {
                    Object obj4 = error.get("stacktrace");
                    if (obj4 instanceof List) {
                        return new ErrorInternal(str, str2, convertStacktrace$bugsnag_android_core_release((List) obj4), fromDescriptor);
                    }
                    if (obj4 == null) {
                        throw new IllegalStateException("cannot find json property 'stacktrace'");
                    }
                    throw new IllegalArgumentException(c.o(obj4, "json property 'stacktrace' not of expected type, found "));
                }
                throw new IllegalArgumentException("unknown ErrorType: '" + str3 + '\'');
            } else if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            } else {
                throw new IllegalArgumentException(c.o(obj3, "json property 'type' not of expected type, found "));
            }
        } else if (obj == null) {
            throw new IllegalStateException("cannot find json property 'errorClass'");
        } else {
            throw new IllegalArgumentException(c.o(obj, "json property 'errorClass' not of expected type, found "));
        }
    }

    public final Stacktrace convertStacktrace$bugsnag_android_core_release(List<? extends Map<String, ? extends Object>> trace) {
        i.h(trace, "trace");
        ArrayList arrayList = new ArrayList(is.i.H1(trace, 10));
        Iterator<T> it = trace.iterator();
        while (it.hasNext()) {
            arrayList.add(new Stackframe((Map) it.next()));
        }
        return new Stacktrace(arrayList);
    }

    public final ThreadInternal convertThread$bugsnag_android_core_release(Map<String, ? extends Object> thread) {
        long j10;
        Stacktrace stacktrace;
        i.h(thread, "thread");
        Object obj = thread.get("id");
        Object obj2 = null;
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            j10 = number.longValue();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        Object obj3 = thread.get(SessionManager.KEY_NAME);
        if (obj3 instanceof String) {
            String str = (String) obj3;
            ThreadType.Companion companion = ThreadType.Companion;
            Object obj4 = thread.get("type");
            if (obj4 instanceof String) {
                ThreadType fromDescriptor$bugsnag_android_core_release = companion.fromDescriptor$bugsnag_android_core_release((String) obj4);
                if (fromDescriptor$bugsnag_android_core_release == null) {
                    fromDescriptor$bugsnag_android_core_release = ThreadType.ANDROID;
                }
                ThreadType threadType = fromDescriptor$bugsnag_android_core_release;
                boolean b10 = i.b(thread.get("errorReportingThread"), Boolean.TRUE);
                Object obj5 = thread.get("state");
                if (obj5 instanceof String) {
                    String str2 = (String) obj5;
                    Object obj6 = thread.get("stacktrace");
                    if (obj6 instanceof List) {
                        obj2 = obj6;
                    }
                    List<? extends Map<String, ? extends Object>> list = (List) obj2;
                    if (list == null || (stacktrace = convertStacktrace$bugsnag_android_core_release(list)) == null) {
                        stacktrace = new Stacktrace(w.f20676u);
                    }
                    return new ThreadInternal(j11, str, threadType, b10, str2, stacktrace);
                } else if (obj5 == null) {
                    throw new IllegalStateException("cannot find json property 'state'");
                } else {
                    throw new IllegalArgumentException(c.o(obj5, "json property 'state' not of expected type, found "));
                }
            } else if (obj4 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            } else {
                throw new IllegalArgumentException(c.o(obj4, "json property 'type' not of expected type, found "));
            }
        } else if (obj3 == null) {
            throw new IllegalStateException("cannot find json property 'name'");
        } else {
            throw new IllegalArgumentException(c.o(obj3, "json property 'name' not of expected type, found "));
        }
    }

    public final Event convertToEvent$bugsnag_android_core_release(Map<? super String, ? extends Object> map, String apiKey) {
        i.h(map, "map");
        i.h(apiKey, "apiKey");
        return new Event(convertToEventImpl$bugsnag_android_core_release(map, apiKey), this.logger);
    }

    public final EventInternal convertToEventImpl$bugsnag_android_core_release(Map<? super String, ? extends Object> map, String apiKey) {
        i.h(map, "map");
        i.h(apiKey, "apiKey");
        EventInternal eventInternal = new EventInternal(apiKey, this.logger, null, null, null, null, null, null, null, null, null, null, null, 8188, null);
        Object obj = map.get("exceptions");
        Object obj2 = null;
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<Map<? super String, ? extends Object>> list = (List) obj;
        if (list != null) {
            List<Error> errors = eventInternal.getErrors();
            for (Map<? super String, ? extends Object> map2 : list) {
                errors.add(new Error(convertErrorInternal$bugsnag_android_core_release(map2), this.logger));
            }
        }
        Object obj3 = map.get("user");
        if (obj3 instanceof Map) {
            eventInternal.setUserImpl$bugsnag_android_core_release(convertUser$bugsnag_android_core_release((Map) obj3));
            Object obj4 = map.get("metaData");
            if (obj4 instanceof Map) {
                for (Map.Entry entry : ((Map) obj4).entrySet()) {
                    eventInternal.addMetadata((String) entry.getKey(), (Map) entry.getValue());
                }
                Object obj5 = map.get("featureFlags");
                if (obj5 instanceof List) {
                    for (Map map3 : (List) obj5) {
                        Object obj6 = map3.get("featureFlag");
                        if (obj6 instanceof String) {
                            String str = (String) obj6;
                            Object obj7 = map3.get("variant");
                            if (!(obj7 instanceof String)) {
                                obj7 = null;
                            }
                            eventInternal.addFeatureFlag(str, (String) obj7);
                        } else if (obj6 == null) {
                            throw new IllegalStateException("cannot find json property 'featureFlag'");
                        } else {
                            throw new IllegalArgumentException(c.o(obj6, "json property 'featureFlag' not of expected type, found "));
                        }
                    }
                    Object obj8 = map.get("breadcrumbs");
                    if (obj8 instanceof List) {
                        List<Breadcrumb> breadcrumbs = eventInternal.getBreadcrumbs();
                        for (Map<String, ? extends Object> map4 : (List) obj8) {
                            breadcrumbs.add(new Breadcrumb(convertBreadcrumbInternal$bugsnag_android_core_release(map4), this.logger));
                        }
                        Object obj9 = map.get("context");
                        if (!(obj9 instanceof String)) {
                            obj9 = null;
                        }
                        eventInternal.setContext((String) obj9);
                        Object obj10 = map.get("groupingHash");
                        if (!(obj10 instanceof String)) {
                            obj10 = null;
                        }
                        eventInternal.setGroupingHash((String) obj10);
                        Object obj11 = map.get("app");
                        if (obj11 instanceof Map) {
                            eventInternal.setApp(convertAppWithState$bugsnag_android_core_release((Map) obj11));
                            Object obj12 = map.get("device");
                            if (obj12 instanceof Map) {
                                eventInternal.setDevice(convertDeviceWithState$bugsnag_android_core_release((Map) obj12));
                                Object obj13 = map.get("session");
                                if (!(obj13 instanceof Map)) {
                                    obj13 = null;
                                }
                                Map map5 = (Map) obj13;
                                if (map5 != null) {
                                    eventInternal.session = new Session(map5, this.logger);
                                    k kVar = k.f19476a;
                                }
                                Object obj14 = map.get("threads");
                                if (!(obj14 instanceof List)) {
                                    obj14 = null;
                                }
                                List<Map<String, ? extends Object>> list2 = (List) obj14;
                                if (list2 != null) {
                                    List<Thread> threads = eventInternal.getThreads();
                                    for (Map<String, ? extends Object> map6 : list2) {
                                        threads.add(new Thread(convertThread$bugsnag_android_core_release(map6), this.logger));
                                    }
                                }
                                Object obj15 = map.get("projectPackages");
                                if (obj15 instanceof List) {
                                    obj2 = obj15;
                                }
                                List list3 = (List) obj2;
                                if (list3 != null) {
                                    eventInternal.setProjectPackages$bugsnag_android_core_release(list3);
                                    k kVar2 = k.f19476a;
                                }
                                Object obj16 = map.get("severity");
                                if (obj16 instanceof String) {
                                    Severity fromDescriptor$bugsnag_android_core_release = Severity.Companion.fromDescriptor$bugsnag_android_core_release((String) obj16);
                                    Object obj17 = map.get("unhandled");
                                    if (obj17 instanceof Boolean) {
                                        eventInternal.updateSeverityReasonInternal$bugsnag_android_core_release(deserializeSeverityReason$bugsnag_android_core_release(map, ((Boolean) obj17).booleanValue(), fromDescriptor$bugsnag_android_core_release));
                                        eventInternal.normalizeStackframeErrorTypes$bugsnag_android_core_release();
                                        eventInternal.setInternalMetrics(new InternalMetricsImpl(c0.c(map.get("usage"))));
                                        return eventInternal;
                                    } else if (obj17 == null) {
                                        throw new IllegalStateException("cannot find json property 'unhandled'");
                                    } else {
                                        throw new IllegalArgumentException(c.o(obj17, "json property 'unhandled' not of expected type, found "));
                                    }
                                } else if (obj16 == null) {
                                    throw new IllegalStateException("cannot find json property 'severity'");
                                } else {
                                    throw new IllegalArgumentException(c.o(obj16, "json property 'severity' not of expected type, found "));
                                }
                            } else if (obj12 == null) {
                                throw new IllegalStateException("cannot find json property 'device'");
                            } else {
                                throw new IllegalArgumentException(c.o(obj12, "json property 'device' not of expected type, found "));
                            }
                        } else if (obj11 == null) {
                            throw new IllegalStateException("cannot find json property 'app'");
                        } else {
                            throw new IllegalArgumentException(c.o(obj11, "json property 'app' not of expected type, found "));
                        }
                    } else if (obj8 == null) {
                        throw new IllegalStateException("cannot find json property 'breadcrumbs'");
                    } else {
                        throw new IllegalArgumentException(c.o(obj8, "json property 'breadcrumbs' not of expected type, found "));
                    }
                } else if (obj5 == null) {
                    throw new IllegalStateException("cannot find json property 'featureFlags'");
                } else {
                    throw new IllegalArgumentException(c.o(obj5, "json property 'featureFlags' not of expected type, found "));
                }
            } else if (obj4 == null) {
                throw new IllegalStateException("cannot find json property 'metaData'");
            } else {
                throw new IllegalArgumentException(c.o(obj4, "json property 'metaData' not of expected type, found "));
            }
        } else if (obj3 == null) {
            throw new IllegalStateException("cannot find json property 'user'");
        } else {
            throw new IllegalArgumentException(c.o(obj3, "json property 'user' not of expected type, found "));
        }
    }

    public final User convertUser$bugsnag_android_core_release(Map<String, ? extends Object> user) {
        i.h(user, "user");
        Object obj = user.get("id");
        String str = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        Object obj2 = user.get(SessionManager.KEY_EMAIL);
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str3 = (String) obj2;
        Object obj3 = user.get(SessionManager.KEY_NAME);
        if (obj3 instanceof String) {
            str = obj3;
        }
        return new User(str2, str3, str);
    }

    public final SeverityReason deserializeSeverityReason$bugsnag_android_core_release(Map<? super String, ? extends Object> map, boolean z10, Severity severity) {
        boolean z11;
        Map.Entry entry;
        String str;
        String str2;
        Set entrySet;
        i.h(map, "map");
        Object obj = map.get("severityReason");
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            Object obj2 = map2.get("unhandledOverridden");
            if (obj2 instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Object obj3 = map2.get("type");
                if (obj3 instanceof String) {
                    String str3 = (String) obj3;
                    boolean z12 = true;
                    if (booleanValue) {
                        if (!z10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = z10;
                    }
                    Object obj4 = map2.get("attributes");
                    if (obj4 != null) {
                        z12 = obj4 instanceof Map;
                    }
                    if (z12) {
                        Map map3 = (Map) obj4;
                        if (map3 != null && (entrySet = map3.entrySet()) != null) {
                            entry = (Map.Entry) u.z2(entrySet);
                        } else {
                            entry = null;
                        }
                        if (entry != null) {
                            str = (String) entry.getValue();
                        } else {
                            str = null;
                        }
                        if (entry != null) {
                            str2 = (String) entry.getKey();
                        } else {
                            str2 = null;
                        }
                        return new SeverityReason(str3, severity, z10, z11, str, str2);
                    } else if (obj4 == null) {
                        throw new IllegalStateException("cannot find json property 'attributes'");
                    } else {
                        throw new IllegalArgumentException(c.o(obj4, "json property 'attributes' not of expected type, found "));
                    }
                } else if (obj3 == null) {
                    throw new IllegalStateException("cannot find json property 'type'");
                } else {
                    throw new IllegalArgumentException(c.o(obj3, "json property 'type' not of expected type, found "));
                }
            } else if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'unhandledOverridden'");
            } else {
                throw new IllegalArgumentException(c.o(obj2, "json property 'unhandledOverridden' not of expected type, found "));
            }
        } else if (obj == null) {
            throw new IllegalStateException("cannot find json property 'severityReason'");
        } else {
            throw new IllegalArgumentException(c.o(obj, "json property 'severityReason' not of expected type, found "));
        }
    }
}
