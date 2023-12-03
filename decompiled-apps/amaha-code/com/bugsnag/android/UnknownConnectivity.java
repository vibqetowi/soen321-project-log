package com.bugsnag.android;
/* compiled from: ConnectivityCompat.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/UnknownConnectivity;", "Lcom/bugsnag/android/Connectivity;", "Lhs/k;", "registerForNetworkChanges", "unregisterForNetworkChanges", "", "hasNetworkConnection", "", "retrieveNetworkAccessState", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class UnknownConnectivity implements Connectivity {
    public static final UnknownConnectivity INSTANCE = new UnknownConnectivity();

    private UnknownConnectivity() {
    }

    @Override // com.bugsnag.android.Connectivity
    public boolean hasNetworkConnection() {
        return true;
    }

    @Override // com.bugsnag.android.Connectivity
    public String retrieveNetworkAccessState() {
        return "unknown";
    }

    @Override // com.bugsnag.android.Connectivity
    public void registerForNetworkChanges() {
    }

    @Override // com.bugsnag.android.Connectivity
    public void unregisterForNetworkChanges() {
    }
}
