package com.bugsnag.android;

import ca.a;
import com.bugsnag.android.internal.ImmutableConfig;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.m;
import gv.r;
import is.u;
import is.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: EventFilenameInfo.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0003J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0006\u0010 \u001a\u00020\u001cJ\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Lcom/bugsnag/android/EventFilenameInfo;", "", "apiKey", "", SessionManager.KEY_UUID, ServerValues.NAME_OP_TIMESTAMP, "", "suffix", "errorTypes", "", "Lcom/bugsnag/android/ErrorType;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Set;)V", "getApiKey", "()Ljava/lang/String;", "getErrorTypes", "()Ljava/util/Set;", "getSuffix", "getTimestamp", "()J", "getUuid", "component1", "component2", "component3", "component4", "component5", "copy", "encode", "equals", "", "other", "hashCode", "", "isLaunchCrashReport", "toString", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EventFilenameInfo {
    public static final Companion Companion = new Companion(null);
    private static final String NON_JVM_CRASH = "not-jvm";
    private static final String STARTUP_CRASH = "startupcrash";
    private final String apiKey;
    private final Set<ErrorType> errorTypes;
    private final String suffix;
    private final long timestamp;
    private final String uuid;

    /* compiled from: EventFilenameInfo.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0013J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\bH\u0007JG\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010!\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J4\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bugsnag/android/EventFilenameInfo$Companion;", "", "()V", "NON_JVM_CRASH", "", "STARTUP_CRASH", "findApiKeyInFilename", "file", "Ljava/io/File;", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "findApiKeyInFilename$bugsnag_android_core_release", "findErrorTypesForEvent", "", "Lcom/bugsnag/android/ErrorType;", "obj", "findErrorTypesForEvent$bugsnag_android_core_release", "findErrorTypesInFilename", "eventFile", "findErrorTypesInFilename$bugsnag_android_core_release", "findSuffixForEvent", "launching", "", "findSuffixForEvent$bugsnag_android_core_release", "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/String;", "findSuffixInFilename", "findSuffixInFilename$bugsnag_android_core_release", "findTimestampInFilename", "", "fromEvent", "Lcom/bugsnag/android/EventFilenameInfo;", SessionManager.KEY_UUID, "apiKey", ServerValues.NAME_OP_TIMESTAMP, "isLaunching", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLcom/bugsnag/android/internal/ImmutableConfig;Ljava/lang/Boolean;)Lcom/bugsnag/android/EventFilenameInfo;", "fromFile", "toFilename", "suffix", "errorTypes", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public static /* synthetic */ EventFilenameInfo fromEvent$default(Companion companion, Object obj, String str, String str2, long j10, ImmutableConfig immutableConfig, Boolean bool, int i6, Object obj2) {
            String str3;
            long j11;
            Boolean bool2;
            if ((i6 & 2) != 0) {
                String uuid = UUID.randomUUID().toString();
                i.c(uuid, "UUID.randomUUID().toString()");
                str3 = uuid;
            } else {
                str3 = str;
            }
            if ((i6 & 8) != 0) {
                j11 = System.currentTimeMillis();
            } else {
                j11 = j10;
            }
            if ((i6 & 32) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            return companion.fromEvent(obj, str3, str2, j11, immutableConfig, bool2);
        }

        public final String findApiKeyInFilename$bugsnag_android_core_release(File file, ImmutableConfig config) {
            String str;
            i.h(file, "file");
            i.h(config, "config");
            String name = file.getName();
            i.c(name, "file.name");
            String W0 = r.W0("_startupcrash.json", name);
            int O0 = r.O0(W0, "_", 0, false, 6) + 1;
            int O02 = r.O0(W0, "_", O0, false, 4);
            if (O0 != 0 && O02 != -1 && O02 > O0) {
                str = W0.substring(O0, O02);
                i.f(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                str = null;
            }
            if (str == null) {
                return config.getApiKey();
            }
            return str;
        }

        public final Set<ErrorType> findErrorTypesForEvent$bugsnag_android_core_release(Object obj) {
            i.h(obj, "obj");
            if (obj instanceof Event) {
                return ((Event) obj).getImpl().getErrorTypesFromStackframes$bugsnag_android_core_release();
            }
            return a.l1(ErrorType.C);
        }

        public final Set<ErrorType> findErrorTypesInFilename$bugsnag_android_core_release(File eventFile) {
            i.h(eventFile, "eventFile");
            String name = eventFile.getName();
            i.c(name, "name");
            int R0 = r.R0(name, "_", r.R0(name, "_", 0, 6) - 1, 4);
            int R02 = r.R0(name, "_", R0 - 1, 4) + 1;
            if (R02 < R0) {
                String substring = name.substring(R02, R0);
                i.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                List a12 = r.a1(substring, new String[]{","}, 0, 6);
                ErrorType[] values = ErrorType.values();
                ArrayList arrayList = new ArrayList();
                for (ErrorType errorType : values) {
                    if (a12.contains(errorType.getDesc$bugsnag_android_core_release())) {
                        arrayList.add(errorType);
                    }
                }
                return u.M2(arrayList);
            }
            return y.f20678u;
        }

        public final String findSuffixForEvent$bugsnag_android_core_release(Object obj, Boolean bool) {
            i.h(obj, "obj");
            if (((obj instanceof Event) && i.b(((Event) obj).getApp().isLaunching(), Boolean.TRUE)) || i.b(bool, Boolean.TRUE)) {
                return EventFilenameInfo.STARTUP_CRASH;
            }
            return "";
        }

        public final String findSuffixInFilename$bugsnag_android_core_release(File eventFile) {
            i.h(eventFile, "eventFile");
            String G1 = rs.a.G1(eventFile);
            String substring = G1.substring(r.R0(G1, "_", 0, 6) + 1);
            i.f(substring, "(this as java.lang.String).substring(startIndex)");
            int hashCode = substring.hashCode();
            if (hashCode != -2033965238) {
                if (hashCode == 2127567527 && substring.equals(EventFilenameInfo.NON_JVM_CRASH)) {
                    return substring;
                }
            } else if (substring.equals(EventFilenameInfo.STARTUP_CRASH)) {
                return substring;
            }
            return "";
        }

        public final long findTimestampInFilename(File eventFile) {
            i.h(eventFile, "eventFile");
            Long x02 = m.x0(r.f1(rs.a.G1(eventFile), "_", "-1"));
            if (x02 != null) {
                return x02.longValue();
            }
            return -1L;
        }

        public final EventFilenameInfo fromEvent(Object obj, String str, ImmutableConfig immutableConfig) {
            return fromEvent$default(this, obj, null, str, 0L, immutableConfig, null, 42, null);
        }

        public final EventFilenameInfo fromFile(File file, ImmutableConfig config) {
            i.h(file, "file");
            i.h(config, "config");
            return new EventFilenameInfo(findApiKeyInFilename$bugsnag_android_core_release(file, config), "", findTimestampInFilename(file), findSuffixInFilename$bugsnag_android_core_release(file), findErrorTypesInFilename$bugsnag_android_core_release(file));
        }

        public final String toFilename(String apiKey, String uuid, long j10, String suffix, Set<? extends ErrorType> errorTypes) {
            i.h(apiKey, "apiKey");
            i.h(uuid, "uuid");
            i.h(suffix, "suffix");
            i.h(errorTypes, "errorTypes");
            return j10 + '_' + apiKey + '_' + DeliveryHeadersKt.serializeErrorTypeHeader(errorTypes) + '_' + uuid + '_' + suffix + ".json";
        }

        public final EventFilenameInfo fromEvent(Object obj, String str, String str2, long j10, ImmutableConfig immutableConfig) {
            return fromEvent$default(this, obj, str, str2, j10, immutableConfig, null, 32, null);
        }

        public final EventFilenameInfo fromEvent(Object obj, String str, String str2, ImmutableConfig immutableConfig) {
            return fromEvent$default(this, obj, str, str2, 0L, immutableConfig, null, 40, null);
        }

        public final EventFilenameInfo fromEvent(Object obj, String uuid, String str, long j10, ImmutableConfig config, Boolean bool) {
            i.h(obj, "obj");
            i.h(uuid, "uuid");
            i.h(config, "config");
            if (obj instanceof Event) {
                str = ((Event) obj).getApiKey();
            } else {
                if (str == null || str.length() == 0) {
                    str = config.getApiKey();
                }
            }
            String str2 = str;
            i.c(str2, "when {\n                o…e -> apiKey\n            }");
            return new EventFilenameInfo(str2, uuid, j10, findSuffixForEvent$bugsnag_android_core_release(obj, bool), findErrorTypesForEvent$bugsnag_android_core_release(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventFilenameInfo(String apiKey, String uuid, long j10, String suffix, Set<? extends ErrorType> errorTypes) {
        i.h(apiKey, "apiKey");
        i.h(uuid, "uuid");
        i.h(suffix, "suffix");
        i.h(errorTypes, "errorTypes");
        this.apiKey = apiKey;
        this.uuid = uuid;
        this.timestamp = j10;
        this.suffix = suffix;
        this.errorTypes = errorTypes;
    }

    public static /* synthetic */ EventFilenameInfo copy$default(EventFilenameInfo eventFilenameInfo, String str, String str2, long j10, String str3, Set set, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = eventFilenameInfo.apiKey;
        }
        if ((i6 & 2) != 0) {
            str2 = eventFilenameInfo.uuid;
        }
        String str4 = str2;
        if ((i6 & 4) != 0) {
            j10 = eventFilenameInfo.timestamp;
        }
        long j11 = j10;
        if ((i6 & 8) != 0) {
            str3 = eventFilenameInfo.suffix;
        }
        String str5 = str3;
        Set<ErrorType> set2 = set;
        if ((i6 & 16) != 0) {
            set2 = eventFilenameInfo.errorTypes;
        }
        return eventFilenameInfo.copy(str, str4, j11, str5, set2);
    }

    public static final long findTimestampInFilename(File file) {
        return Companion.findTimestampInFilename(file);
    }

    public static final EventFilenameInfo fromEvent(Object obj, String str, ImmutableConfig immutableConfig) {
        return Companion.fromEvent$default(Companion, obj, null, str, 0L, immutableConfig, null, 42, null);
    }

    public static final EventFilenameInfo fromFile(File file, ImmutableConfig immutableConfig) {
        return Companion.fromFile(file, immutableConfig);
    }

    public final String component1() {
        return this.apiKey;
    }

    public final String component2() {
        return this.uuid;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final String component4() {
        return this.suffix;
    }

    public final Set<ErrorType> component5() {
        return this.errorTypes;
    }

    public final EventFilenameInfo copy(String apiKey, String uuid, long j10, String suffix, Set<? extends ErrorType> errorTypes) {
        i.h(apiKey, "apiKey");
        i.h(uuid, "uuid");
        i.h(suffix, "suffix");
        i.h(errorTypes, "errorTypes");
        return new EventFilenameInfo(apiKey, uuid, j10, suffix, errorTypes);
    }

    public final String encode() {
        return Companion.toFilename(this.apiKey, this.uuid, this.timestamp, this.suffix, this.errorTypes);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EventFilenameInfo) {
                EventFilenameInfo eventFilenameInfo = (EventFilenameInfo) obj;
                if (!i.b(this.apiKey, eventFilenameInfo.apiKey) || !i.b(this.uuid, eventFilenameInfo.uuid) || this.timestamp != eventFilenameInfo.timestamp || !i.b(this.suffix, eventFilenameInfo.suffix) || !i.b(this.errorTypes, eventFilenameInfo.errorTypes)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final Set<ErrorType> getErrorTypes() {
        return this.errorTypes;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int i6;
        int i10;
        int i11;
        String str = this.apiKey;
        int i12 = 0;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = i6 * 31;
        String str2 = this.uuid;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        long j10 = this.timestamp;
        int i14 = (((i13 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str3 = this.suffix;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Set<ErrorType> set = this.errorTypes;
        if (set != null) {
            i12 = set.hashCode();
        }
        return i15 + i12;
    }

    public final boolean isLaunchCrashReport() {
        return i.b(this.suffix, STARTUP_CRASH);
    }

    public String toString() {
        return "EventFilenameInfo(apiKey=" + this.apiKey + ", uuid=" + this.uuid + ", timestamp=" + this.timestamp + ", suffix=" + this.suffix + ", errorTypes=" + this.errorTypes + ")";
    }

    public static final EventFilenameInfo fromEvent(Object obj, String str, String str2, long j10, ImmutableConfig immutableConfig) {
        return Companion.fromEvent$default(Companion, obj, str, str2, j10, immutableConfig, null, 32, null);
    }

    public static final EventFilenameInfo fromEvent(Object obj, String str, String str2, long j10, ImmutableConfig immutableConfig, Boolean bool) {
        return Companion.fromEvent(obj, str, str2, j10, immutableConfig, bool);
    }

    public static final EventFilenameInfo fromEvent(Object obj, String str, String str2, ImmutableConfig immutableConfig) {
        return Companion.fromEvent$default(Companion, obj, str, str2, 0L, immutableConfig, null, 40, null);
    }
}
