package com.bugsnag.android;

import kotlin.jvm.internal.d;
/* compiled from: ErrorTypes.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\r\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0004R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/bugsnag/android/ErrorTypes;", "", "detectErrors", "", "(Z)V", "anrs", "ndkCrashes", "unhandledExceptions", "unhandledRejections", "(ZZZZ)V", "getAnrs", "()Z", "setAnrs", "getNdkCrashes", "setNdkCrashes", "getUnhandledExceptions", "setUnhandledExceptions", "getUnhandledRejections", "setUnhandledRejections", "copy", "copy$bugsnag_android_core_release", "equals", "other", "hashCode", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ErrorTypes {
    private boolean anrs;
    private boolean ndkCrashes;
    private boolean unhandledExceptions;
    private boolean unhandledRejections;

    public ErrorTypes() {
        this(false, false, false, false, 15, null);
    }

    public final ErrorTypes copy$bugsnag_android_core_release() {
        return new ErrorTypes(this.anrs, this.ndkCrashes, this.unhandledExceptions, this.unhandledRejections);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ErrorTypes) {
            ErrorTypes errorTypes = (ErrorTypes) obj;
            if (this.anrs == errorTypes.anrs && this.ndkCrashes == errorTypes.ndkCrashes && this.unhandledExceptions == errorTypes.unhandledExceptions && this.unhandledRejections == errorTypes.unhandledRejections) {
                return true;
            }
        }
        return false;
    }

    public final boolean getAnrs() {
        return this.anrs;
    }

    public final boolean getNdkCrashes() {
        return this.ndkCrashes;
    }

    public final boolean getUnhandledExceptions() {
        return this.unhandledExceptions;
    }

    public final boolean getUnhandledRejections() {
        return this.unhandledRejections;
    }

    public int hashCode() {
        int hashCode = Boolean.valueOf(this.ndkCrashes).hashCode();
        int hashCode2 = Boolean.valueOf(this.unhandledExceptions).hashCode();
        return Boolean.valueOf(this.unhandledRejections).hashCode() + ((hashCode2 + ((hashCode + (Boolean.valueOf(this.anrs).hashCode() * 31)) * 31)) * 31);
    }

    public final void setAnrs(boolean z10) {
        this.anrs = z10;
    }

    public final void setNdkCrashes(boolean z10) {
        this.ndkCrashes = z10;
    }

    public final void setUnhandledExceptions(boolean z10) {
        this.unhandledExceptions = z10;
    }

    public final void setUnhandledRejections(boolean z10) {
        this.unhandledRejections = z10;
    }

    public ErrorTypes(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.anrs = z10;
        this.ndkCrashes = z11;
        this.unhandledExceptions = z12;
        this.unhandledRejections = z13;
    }

    public /* synthetic */ ErrorTypes(boolean z10, boolean z11, boolean z12, boolean z13, int i6, d dVar) {
        this((i6 & 1) != 0 ? true : z10, (i6 & 2) != 0 ? true : z11, (i6 & 4) != 0 ? true : z12, (i6 & 8) != 0 ? true : z13);
    }

    public ErrorTypes(boolean z10) {
        this(z10, z10, z10, z10);
    }
}
