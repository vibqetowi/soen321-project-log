package com.bugsnag.android;

import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.m;
import gv.r;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import r1.b0;
/* compiled from: SessionFilenameInfo.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/SessionFilenameInfo;", "", ServerValues.NAME_OP_TIMESTAMP, "", SessionManager.KEY_UUID, "", "(JLjava/lang/String;)V", "getTimestamp", "()J", "getUuid", "()Ljava/lang/String;", "component1", "component2", "copy", "encode", "equals", "", "other", "hashCode", "", "toString", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SessionFilenameInfo {
    public static final Companion Companion = new Companion(null);
    public static final int uuidLength = 36;
    private final long timestamp;
    private final String uuid;

    /* compiled from: SessionFilenameInfo.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bugsnag/android/SessionFilenameInfo$Companion;", "", "()V", "uuidLength", "", "defaultFilename", "", "findTimestampInFilename", "", "file", "Ljava/io/File;", "findUuidInFilename", "fromFile", "Lcom/bugsnag/android/SessionFilenameInfo;", "toFilename", ServerValues.NAME_OP_TIMESTAMP, SessionManager.KEY_UUID, "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        private final String findUuidInFilename(File file) {
            String name = file.getName();
            i.c(name, "file.name");
            String substring = name.substring(0, 35);
            i.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final String defaultFilename() {
            long currentTimeMillis = System.currentTimeMillis();
            String uuid = UUID.randomUUID().toString();
            i.c(uuid, "UUID.randomUUID().toString()");
            return toFilename(currentTimeMillis, uuid);
        }

        public final long findTimestampInFilename(File file) {
            i.h(file, "file");
            String name = file.getName();
            i.c(name, "file.name");
            String name2 = file.getName();
            i.c(name2, "file.name");
            String substring = name.substring(36, r.O0(name2, "_", 0, false, 6));
            i.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Long x02 = m.x0(substring);
            if (x02 != null) {
                return x02.longValue();
            }
            return -1L;
        }

        public final SessionFilenameInfo fromFile(File file) {
            i.h(file, "file");
            return new SessionFilenameInfo(findTimestampInFilename(file), findUuidInFilename(file));
        }

        public final String toFilename(long j10, String uuid) {
            i.h(uuid, "uuid");
            return uuid + j10 + "_v2.json";
        }
    }

    public SessionFilenameInfo(long j10, String uuid) {
        i.h(uuid, "uuid");
        this.timestamp = j10;
        this.uuid = uuid;
    }

    public static /* synthetic */ SessionFilenameInfo copy$default(SessionFilenameInfo sessionFilenameInfo, long j10, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j10 = sessionFilenameInfo.timestamp;
        }
        if ((i6 & 2) != 0) {
            str = sessionFilenameInfo.uuid;
        }
        return sessionFilenameInfo.copy(j10, str);
    }

    public static final String defaultFilename() {
        return Companion.defaultFilename();
    }

    public static final long findTimestampInFilename(File file) {
        return Companion.findTimestampInFilename(file);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.uuid;
    }

    public final SessionFilenameInfo copy(long j10, String uuid) {
        i.h(uuid, "uuid");
        return new SessionFilenameInfo(j10, uuid);
    }

    public final String encode() {
        return Companion.toFilename(this.timestamp, this.uuid);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionFilenameInfo) {
                SessionFilenameInfo sessionFilenameInfo = (SessionFilenameInfo) obj;
                if (this.timestamp != sessionFilenameInfo.timestamp || !i.b(this.uuid, sessionFilenameInfo.uuid)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int i6;
        long j10 = this.timestamp;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.uuid;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return i10 + i6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionFilenameInfo(timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", uuid=");
        return b0.b(sb2, this.uuid, ")");
    }
}
