package com.google.android.play.core.splitinstall.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface SplitInstallSessionStatus {
    public static final int CANCELED = 7;
    public static final int CANCELING = 9;
    public static final int DOWNLOADED = 3;
    public static final int DOWNLOADING = 2;
    public static final int FAILED = 6;
    public static final int INSTALLED = 5;
    public static final int INSTALLING = 4;
    public static final int PENDING = 1;
    public static final int REQUIRES_USER_CONFIRMATION = 8;
    public static final int UNKNOWN = 0;
}
