package com.bugsnag.android;
/* compiled from: LastRunInfo.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/LastRunInfo;", "", "consecutiveLaunchCrashes", "", "crashed", "", "crashedDuringLaunch", "(IZZ)V", "getConsecutiveLaunchCrashes", "()I", "getCrashed", "()Z", "getCrashedDuringLaunch", "toString", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class LastRunInfo {
    private final int consecutiveLaunchCrashes;
    private final boolean crashed;
    private final boolean crashedDuringLaunch;

    public LastRunInfo(int i6, boolean z10, boolean z11) {
        this.consecutiveLaunchCrashes = i6;
        this.crashed = z10;
        this.crashedDuringLaunch = z11;
    }

    public final int getConsecutiveLaunchCrashes() {
        return this.consecutiveLaunchCrashes;
    }

    public final boolean getCrashed() {
        return this.crashed;
    }

    public final boolean getCrashedDuringLaunch() {
        return this.crashedDuringLaunch;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LastRunInfo(consecutiveLaunchCrashes=");
        sb2.append(this.consecutiveLaunchCrashes);
        sb2.append(", crashed=");
        sb2.append(this.crashed);
        sb2.append(", crashedDuringLaunch=");
        return c.t(sb2, this.crashedDuringLaunch, ')');
    }
}
