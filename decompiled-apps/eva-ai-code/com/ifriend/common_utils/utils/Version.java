package com.ifriend.common_utils.utils;

import com.ifriend.common_utils.extensions.StringKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: Version.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/common_utils/utils/Version;", "", "versionString", "", "(Ljava/lang/String;)V", "major", "", "minor", "patch", "compareTo", "other", "equals", "", "", "hashCode", "Companion", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Version implements Comparable<Version> {
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;
    private final int patch;

    public /* synthetic */ Version(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Version(String str) {
        boolean z;
        boolean z2;
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        if (split$default.size() == 3) {
            List<String> list = split$default;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str2 : list) {
                    if (!StringKt.isNumeric(str2)) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                z = true;
                if (z) {
                    throw new IllegalArgumentException("Version must be in x.x.x format!".toString());
                }
                this.major = Integer.parseInt((String) split$default.get(0));
                this.minor = Integer.parseInt((String) split$default.get(1));
                this.patch = Integer.parseInt((String) split$default.get(2));
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/common_utils/utils/Version$Companion;", "", "()V", "from", "Lcom/ifriend/common_utils/utils/Version;", "versionString", "", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Version from(String versionString) {
            Intrinsics.checkNotNullParameter(versionString, "versionString");
            return new Version(versionString, null);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.major;
        int i2 = other.major;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.minor;
        int i4 = other.minor;
        return i3 != i4 ? i3 - i4 : this.patch - other.patch;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ifriend.common_utils.utils.Version");
            Version version = (Version) obj;
            return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
        }
        return false;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.patch;
    }
}
